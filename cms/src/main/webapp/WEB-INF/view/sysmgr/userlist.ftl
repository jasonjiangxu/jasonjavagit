<#import "../macro/pagemacro.ftl" as p>
<script src="${base}/static/viewjs/sysmgr/usermgr/userlist.js" type="text/javascript"></script>
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
               <!-- 引入表头-->
                <table id="user_table_list" ></table>
                <!-- 编辑输入框 -->
            	<div id="user_add_window">
            		<#include "usermgr/EditUser.ftl"/>
            	</div>
            	<div id="user_look_window" class="easyui-dialog"></div>
            	<div id="user_recycle_window" class="easyui-dialog"></div>
          </div>
       </div>
    </div>