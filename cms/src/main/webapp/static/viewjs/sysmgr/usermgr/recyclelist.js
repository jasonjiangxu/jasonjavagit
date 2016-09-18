//菜单管理JS
jQuery(document).ready(function() {
	var ctx=getRootPath();//得到根路径
	var tool=[{
		text: '收回',
		iconCls: 'cms-add',
		handler: function() {
			userOption(ctx+'/user/mtnBackUser','确定要收回所选信息吗?');
		}
	},{
		text: '彻底删除',
		iconCls: 'cms-close',
		handler: function() {
			userOption(ctx+'/user/mtnMoveUser','确定要彻底删除所选信息吗?彻底删除后将不能恢复！');
		}
	},'-',{
		text: '清空',
		iconCls: 'cms-recycle',
		handler: function() {
			userEmpty(ctx+'/user/mtnEmptyUser','清空');
		}
	}];
	$('#recycle_table_list').datagrid({
		url:ctx+'/user/findUserList?sid='+Math.random(),
		fitColumns:true,//自适应列宽
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
			delFlg:'Y'
		}
	});
}); 

//回收
function userOption(url,msg){
	var objs=$('#recycle_table_list').datagrid('getSelections');
	if(objs.length==0){
		$.messager.alert('温馨提示','请先选择要操作的信息！','warning');
	}else{
		var idArr=new Array();
		for (var i = 0; i < objs.length; i++) {
			idArr.push(objs[i].id);
		}
		$.messager.confirm('Confirm',msg,function(r){
			if (r){
				$.ajax({
				    cache : true,
				    type:'POST',
				    url : url,
				    dataType: 'json',
				    data:[{name: 'ids',value: idArr}],
					success: function(data) {
						if(!data.success){
							$.messager.alert('温馨提示',data.message,'warning');
						}
						$('#recycle_table_list').datagrid('clearSelections');
						$('#recycle_table_list').datagrid('reload'); 
					},
					error: function(errors) {
						$('#recycle_table_list').datagrid('reload'); 
					}
				});
			}else{
				$('#recycle_table_list').datagrid('clearSelections');
			}
		});
	}
}

//清空
function userEmpty(url,msg){
	$.messager.confirm('Confirm','确定要'+msg+'吗？清空后所有数据将被彻底删除不能恢复！',function(r){
		if (r){
			$.ajax({
			    cache : true,
			    type:'POST',
			    url : url,
			    dataType: 'json',
				success: function(data) {
					if(!data.success){
						$.messager.alert('温馨提示',data.message,'warning');
					}
					$('#recycle_table_list').datagrid('clearSelections');
					$('#recycle_table_list').datagrid('reload'); 
				},
				error: function(errors) {
					$('#recycle_table_list').datagrid('reload'); 
				}
			});
		}else{
			$('#recycle_table_list').datagrid('clearSelections');
		}
	});
}

