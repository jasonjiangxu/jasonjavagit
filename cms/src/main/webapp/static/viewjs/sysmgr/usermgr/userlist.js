//菜单管理JS
jQuery(document).ready(function() {
	var ctx=getRootPath();//得到根路径
	var tool=[{
		text: '增加',
		iconCls: 'cms-add',
		handler: function() {
			userDialogAdd(ctx);
		}
	},{
		text: '修改',
		iconCls: 'cms-pencil',
		handler: function() {
			userDialogEdit(ctx);
		}
	},{
		text: '删除',
		iconCls: 'cms-close',
		handler: function() {
			userDelete(ctx);
		}
	},'-',{
		text: '查看',
		iconCls: 'cms-find',
		handler: function() {
			userDialogLook(ctx);
		}
	},'-',{
		text: '回收站',
		iconCls: 'cms-recycle',
		handler: function() {
			recycle(ctx);
		}
	}];
	$('#user_table_list').datagrid({
		url:ctx+'/user/findUserList?sid='+Math.random(),
		fitColumns:true,//自适应列宽
		title:'用户表格',
		striped:true,//显示条纹
		idField:'id',
		loadMsg:'数据加载中....',
		iconCls:'cms-list',
		pagination:true,//分页
		rownumbers:true,//行数
		collapsible:true,//是否可折叠的
		columns:[[
		     {field:'id',checkbox:true },
		     {field:'code',title:'工号',width:100},
             {field:'loginName',title:'登录名',width:100},
             {field:'nicName',title:'昵称',width:100},
             {field:'userName',title:'用户名',width:100},
             {field:'sex',title:'性别',width:100},
             {field:'birthDay',title:'生日',width:100},
             {field:'remark',title:'备注',width:100}
		]],
		pageNumber:1,
		pageSize:20,
		pageList:[10,20,30,40,50],
		toolbar:tool,
		queryParams:{
			delFlg:'N'
		}
	});
	
	// 初始化弹出框
	$('#user_add_window').dialog({
		width:'35%',
		top:'20%',
		height:'auto',
		modal:true,
		loadingMessage:'信息加载中...'
	});
	$('#user_add_window').dialog('close');
	$('#user_look_window').dialog('close');
	$('#user_recycle_window').dialog('close');
	
	
	initValidForm($("#userForm"));//初始化验证方法
}); 

//增加
function userDialogAdd(ctx){
	var jobnum=getJobNum(ctx);
	if(jobnum!=""){
		$('#input_loginName_id').val("");
		$('#pkid').val("");
		$('#input_code_id').val(jobnum);
		$('#input_nicName_id').val("");
		$('#input_userName_id').val("");
		$('#input_birthDay_id').val("");
		$('#remark').val("");
		EditDialog(ctx+'/user/mtnAddUser','添加用户','cms-disk');
		$('#user_add_window').dialog('open');
	}
}

//修改
function userDialogEdit(ctx){
	var objs=$('#user_table_list').datagrid('getSelections');
	if(objs.length==0){
		$.messager.alert('温馨提示','请选择要更新的用户！','warning');
	}else if(objs.length>1){
		$.messager.alert('温馨提示','每次更新只能选择一条信息！','warning');
	}else{
		var obj=$('#user_table_list').datagrid('getSelected');
		$('#input_loginName_id').val(obj.loginName);
		$('#pkid').val(obj.id);
		$('#input_code_id').val(obj.code);
		$('#input_nicName_id').val(obj.nicName);
		$('#input_userName_id').val(obj.userName);
		$('#input_birthDay_id').val(obj.birthDay);
		if(obj.sex=='F'){
			$("input[type=radio][name='sex']:eq(1)").attr("checked","checked");
		}
		if(obj.sex=='M'){
			$("input[type=radio][name='sex']:eq(0)").attr("checked","checked");
		}
		$('#remark').val(obj.remark);
		EditDialog(ctx+'/user/mtnUpdateUser','修改用户','cms-edit');
		$('#user_add_window').dialog('open');
	}
}

//查看
function userDialogLook(ctx){
	var objs=$('#user_table_list').datagrid('getSelections');
	if(objs.length==0){
		$.messager.alert('温馨提示','请选择要查看的用户！','warning');
	}else if(objs.length>1){
		$.messager.alert('温馨提示','每次查看只能选择一条信息！','warning');
	}else{
		var obj=$('#user_table_list').datagrid('getSelected');
		$('#user_look_window').dialog({
			width:'35%',
			top:'20%',
			height:'auto',
			modal:true,
			loadingMessage:'信息加载中...',
			title: "查询明细",
			iconCls:"cms-find",
			href:ctx+'/user/box/showQryUser/'+obj.id,
			buttons: [{ 
				text: '关闭', 
				iconCls: 'cms-no', 
				handler: function() {
					$('#user_look_window').dialog('close');
					$('#user_table_list').datagrid('clearSelections');
				} 
			}] 
		});
		$('#user_look_window').dialog('open');
	}
}

//删除
function userDelete(ctx){
	var objs=$('#user_table_list').datagrid('getSelections');
	if(objs.length==0){
		$.messager.alert('温馨提示','请选择要删除的用户！','warning');
	}else{
		var idArr=new Array();
		for (var i = 0; i < objs.length; i++) {
			idArr.push(objs[i].id);
		}
		$.messager.confirm('Confirm','确定要删除所选用户吗？',function(r){
			if (r){
				$.ajax({
				    cache : true,
				    type:'POST',
				    url : ctx+'/user/mtnDelUser',
				    dataType: 'json',
				    data:[{name: 'ids',value: idArr}],
					success: function(data) {
						if(!data.success){
							$.messager.alert('温馨提示',data.message,'warning');
						}
						$('#user_table_list').datagrid('clearSelections');
						$('#user_table_list').datagrid('reload'); 
					},
					error: function(errors) {
						$('#user_table_list').datagrid('reload'); 
					}
				});
			}else{
				$('#user_table_list').datagrid('clearSelections');
			}
		});
	}
}

//打开编辑框
function EditDialog(url,title,icon){
	$('#user_add_window').dialog({
		title: title,
		iconCls:icon,
		buttons: [{ 
			text: '提交', 
			iconCls: 'cms-ok', 
			handler: function() { 
				ajaxFormCommit($("#userForm"),url,'user_add_window','user_table_list');
				$('#user_table_list').datagrid('clearSelections');
			} 
			}, { 
			text: '取消', 
			iconCls: 'cms-no', 
			handler: function() {
				$('#user_add_window').dialog('close');
				$('#user_table_list').datagrid('clearSelections');
			} 
		}] 
	});
}


function userFormChange(){
	validateForm($("#userForm"));
}

//回收站
function recycle(ctx){
	$('#user_recycle_window').dialog({
		width:'35%',
		top:'20%',
		height:'50%',
		modal:true,
		loadingMessage:'信息加载中...',
		title: "回收站",
		href:ctx+'/user/box/recycle/',
		iconCls:"cms-recycle",
		buttons: [{ 
			text: '关闭', 
			iconCls: 'cms-no', 
			handler: function() {
				$('#user_recycle_window').dialog('close');
				$('#user_table_list').datagrid('reload'); 
			} 
		}] 
	});
	$('#user_recycle_window').dialog('open');
}
