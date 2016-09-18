<#import "../macro/pagemacro.ftl" as p>

<div class="wrapper wrapper-content">
	<table id="mycust_table"></table>
</div>
<div id="addcustdiv" class="easyui-window" title="新增客户" 
	data-options="modal:true,closed:true,iconCls:'icon-save',minimizable:false,draggable:false,closable:false" 
	style="width:95%;height:600px;padding:10px;">
</div>	
<script>
	$(function(){
		$('#mycust_table').datagrid({    
		    url:'${base}/cust/ajaxMyCustList',
		    title:'我的客户',
		    fitColumns:true,
		    iconCls:'icon-group',
		    toolbar:[
		    	{text:'新增客户',iconCls: 'icon-user_add',handler: function(){
		    		$('#addcustdiv').window('open');
		    		$('#addcustdiv').window('refresh', '${base}/cust/box/addcust')
		    	}},
		    	{text:'修改客户',iconCls: 'icon-user_edit',handler: function(){alert('帮助按钮')}},
		    	{text:'无效客户',iconCls: 'icon-user_delete',handler: function(){alert('帮助按钮')}},
		    	{text:'客户详情',iconCls: 'icon-user_go',handler: function(){alert('帮助按钮')}},
		    ],
		    striped:true,
		    idField:'id',
		    loadMsg:'加载中...',
		    pagination:true,
		    rownumbers:true,
		    singleSelect:false,
		    checkOnSelect:true,
		    pageNumber:1,
		    pageSize:30,
		    pageList:[10,20,30,40,50],
		    columns:[[    
		        {field:'id',width:100,align:'left',checkbox:true},    
		        {field:'code',title:'客户编号',width:100,align:'center'},    
		        {field:'category',title:'客户类别',width:100,align:'center'},
		        {field:'status',title:'状态',width:100,align:'center'},
		        {field:'origin',title:'来源',width:100,align:'center'},
		        {field:'vip',title:'VIP',width:100,align:'center'} ,
		        {field:'inpool',title:'是否跳公',width:100,align:'center'} ,
		        {field:'isimport',title:'是否导入客',width:100,align:'center'},
		        {field:'remark',title:'备注',align:'center'}       
		    ]]    
		});
	});
</script>
<@p.easyuijs/>
