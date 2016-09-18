//菜单管理JS
jQuery(document).ready(function() {
	var ctx=getRootPath();//得到根路径
	var tool=[{
		text: '增加',
		iconCls: 'cms-add',
		handler: function() {
			menuDialogAdd(ctx);
		}
	},{
		text: '修改',
		iconCls: 'cms-pencil',
		handler: function() {
			menuDialogEdit(ctx);
		}
	},{
		text: '删除',
		iconCls: 'cms-close',
		handler: function() {
			menuDelete(ctx);
		}
	},'-',{
		text: '查看',
		iconCls: 'cms-find',
		handler: function() {
			menuDialogLook(ctx);
		}
	}];
	$('#menu_table_list').treegrid({
		url:ctx+'/menu/findMenuList?sid='+Math.random(),
		fitColumns:true,//自适应列宽
		title:'菜单表格',
		striped:true,//显示条纹
		idField:'id',
		treeField: 'name',
		loadMsg:'数据加载中....',
		iconCls:'cms-list',
		pagination:true,//分页
		rownumbers:true,//行数
		collapsible:true,//是否可折叠的
		columns:[[
             {field:'name',title:'菜单名称',width:100},
             {field:'code',title:'菜单编码',width:100},
             {field:'parentCode',title:'上级菜单',width:100},
             {field:'level',title:'菜单级别',width:30},
             {field:'url',title:'URL地址',width:100},
             {field:'icon',title:'图标',width:50},
             {field:'sort',title:'排序',width:30},
             {field:'remark',title:'备注',width:100}
		]],
		toolbar:tool,
		queryParams:{
			delFlg:'N'
		}
	});
	
	// 初始化弹出框
	$('#menu_add_window').dialog({
		width:'35%',
		top:'20%',
		height:'auto',
		modal:true,
		loadingMessage:'信息加载中...'
	});
	$('#menu_add_window').dialog('close');
	$('#menu_look_window').dialog('close');
	
	
	if($('input[name="level"]:checked').val()==2){
    	$('#parent_div').show();//默认隐藏下拉框
    }else{
    	$('#parent_div').hide();
    }
	initValidForm($("#menuForm"));//初始化验证方法
	
	//父菜单下拉框
	$('#parentCode').combobox({
		url: ctx+'/menu/findAllParentMenu?sid='+Math.random(),
		valueField: 'code',
		textField: 'name'
	});
}); 

//增加
function menuDialogAdd(ctx){
	$('#input_name_id').val("");
	$('#pkid').val("");
	$('#input_code_id').val("");
	$("input[type=radio][name='level']:eq(0)").attr("checked","checked");
	$('#parent_div').hide();
	$('#input_url_id').val("");
	$('#input_sort_id').val("");
	$('#input_icon_id').val("");
	$('#parentCode').combobox('setValue', "");
	$('#remark').val("");
	EditDialog(ctx+'/menu/mtnAddMenu','添加菜单','cms-disk');
	$('#menu_add_window').dialog('open');
	
}

//修改
function menuDialogEdit(ctx){
	var objs=$('#menu_table_list').datagrid('getSelections');
	if(objs.length==0){
		$.messager.alert('温馨提示','请选择要更新的菜单！','warning');
	}else if(objs.length>1){
		$.messager.alert('温馨提示','每次更新只能选择一条信息！','warning');
	}else{
		var obj=$('#menu_table_list').datagrid('getSelected');
		$('#input_name_id').val(obj.name);
		$('#pkid').val(obj.id);
		$('#input_code_id').val(obj.code);
		if(obj.level==2){
			$("input[type=radio][name='level']:eq(1)").attr("checked","checked");
			$('#parent_div').show();
			$('#parentCode').combobox('setValue', obj.parentCode);
		}else{
			$("input[type=radio][name='level']:eq(0)").attr("checked","checked");
			$('#parent_div').hide();
			$('#parentCode').combobox('setValue', "");
		}
		$('#input_url_id').val(obj.url);
		$('#input_icon_id').val(obj.icon);
		$('#input_sort_id').val(obj.sort);
		$('#remark').val(obj.remark);
		EditDialog(ctx+'/menu/mtnUpdateMenu','修改菜单','cms-edit');
		$('#menu_add_window').dialog('open');
	}
}

//查看
function menuDialogLook(ctx){
	var objs=$('#menu_table_list').datagrid('getSelections');
	if(objs.length==0){
		$.messager.alert('温馨提示','请选择要查看的菜单！','warning');
	}else if(objs.length>1){
		$.messager.alert('温馨提示','每次查看只能选择一条信息！','warning');
	}else{
		var obj=$('#menu_table_list').datagrid('getSelected');
		$('#menu_look_window').dialog({
			width:'35%',
			top:'20%',
			height:'auto',
			modal:true,
			loadingMessage:'信息加载中...',
			title: "查询明细",
			iconCls:"cms-find",
			href:ctx+'/menu/box/showQryMenu/'+obj.id,
			buttons: [{ 
				text: '关闭', 
				iconCls: 'cms-no', 
				handler: function() {
					$('#menu_look_window').dialog('close');
				} 
			}] 
		});
		$('#menu_look_window').dialog('open');
	}
}

//删除
function menuDelete(ctx){
	var objs=$('#menu_table_list').datagrid('getSelections');
	if(objs.length==0){
		$.messager.alert('温馨提示','请选择要删除的菜单！','warning');
	}else{
		var idArr=new Array();
		for (var i = 0; i < objs.length; i++) {
			idArr.push(objs[i].id);
		}
		$.messager.confirm('Confirm','确定要删除所选菜单吗？',function(r){
			if (r){
				$.ajax({
				    cache : true,
				    type:'POST',
				    url : ctx+'/menu/mtnDelMenus',
				    dataType: 'json',
				    data:[{name: 'ids',value: idArr}],
					success: function(data) {
						if(!data.success){
							$.messager.alert('温馨提示',data.message,'warning');
						}
						$('#menu_table_list').datagrid('clearSelections');
						$('#menu_table_list').datagrid('reload'); 
					},
					error: function(errors) {
						$('#menu_table_list').datagrid('reload'); 
					}
				});
			}else{
				$('#menu_table_list').datagrid('clearSelections');
			}
		});
	}
}

//打开编辑框
function EditDialog(url,title,icon){
	$('#menu_add_window').dialog({
		title: title,
		iconCls:icon,
		buttons: [{ 
			text: '提交', 
			iconCls: 'cms-ok', 
			handler: function() { 
				ajaxFormCommit($("#menuForm"),url,'menu_add_window','menu_table_list');
				$('#menu_table_list').datagrid('clearSelections');
			} 
			}, { 
			text: '取消', 
			iconCls: 'cms-no', 
			handler: function() {
				$('#menu_add_window').dialog('close');
				$('#menu_table_list').datagrid('clearSelections');
			} 
		}] 
	});
}


function menuFormChange(){
	validateForm($("#menuForm"));
}

//单选按钮选择事件
function changeLevel(){
	if($("input[type=radio][name='level']:checked").val()=="1"){
		//隐藏下拉框
		$('#parent_div').hide();
	}else{
		//显示下拉框 
		$('#parent_div').show();
	}
}

