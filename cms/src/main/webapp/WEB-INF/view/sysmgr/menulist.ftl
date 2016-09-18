<#import "../macro/pagemacro.ftl" as p>
<script src="${base}/static/viewjs/sysmgr/menumgr/menulist.js" type="text/javascript"></script>
<div class="row-fluid">
       <div class="span12"> 
       	 <div class="widget">
               <!-- 查询条件-->
                <@p.divtitle title="查询条件" icon="icon-search"/>
                <div class="widget-body">
	                	这里输入查询条件暂时备注
                </div>
          </div>
          <div class="widget">
          			<!-- 表格 -->
                	<table id="menu_table_list" ></table>
                	<!-- 编辑输入框 -->
                	<div id="menu_add_window">
                		<#include "menumgr/EditMenu.ftl"/>
                	</div>
                	<div id="menu_look_window" class="easyui-dialog"></div>
          </div>
       </div>
    </div>