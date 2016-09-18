<#import "../../macro/pagemacro.ftl" as p>
<div class="row-fluid">
   <div class="span12">
      <!-- BEGIN SAMPLE FORM widget-->   
      <div class="widget">
         <div class="widget-body form">
            <!-- BEGIN FORM-->
            <form id="menuForm" action="#" class="form-horizontal">
            	<input type="hidden" value="${tmenu?if_exists.id?if_exists}" name="id" id="pkid"/>
               <!-- 通用的错误提示 这里引入即可 -->
               <div class="row-fluid">
					<div class="span5">
						<div class="control-group">
		               	  <label class="control-label">菜单名称：</label>
		               	  <div class="controls">
		               	  	 ${tmenu?if_exists.name?if_exists}
					      </div>
		               </div>
					</div>
					<div class="span5">
						<div class="control-group">
		               	  <label class="control-label">菜单编码：</label>
		               	  <div class="controls">
					         ${tmenu?if_exists.code?if_exists}
					      </div>
		               </div>
					</div>
				</div>
               <hr>
               <div class="row-fluid">
               		<div class="span5">
					 <div class="control-group">
		               	<label class="control-label">菜单级别：</label>
		               	  <div class="controls">
					         ${tmenu?if_exists.level?if_exists}
					      </div>
		               </div>
		            </div>
					<div class="span5">
					  <div class="control-group">
		               	  <label class="control-label">上级菜单：</label>
		               	  <div class="controls">
					         ${tmenu?if_exists.parentCode?if_exists}
					      </div>
		               </div>
		             </div>
				</div>
				<hr>
				<div class="row-fluid">
					<div class="span5">
					 <div class="control-group">
		               	<label class="control-label">URLd地址：</label>
		               	  <div class="controls">
					         ${tmenu?if_exists.url?if_exists}
					      </div>
		               </div>
		             </div>
					<div class="span5">
					  <div class="control-group">
		               	  <label class="control-label">ICON图标：</label>
		               	  <div class="controls">
					         ${tmenu?if_exists.icon?if_exists}
					      </div>
		               </div>
		             </div>
				</div>
				<hr>
				<div class="row-fluid">
					<div class="span5">
					 <div class="control-group">
		               	<label class="control-label">创建人：</label>
		               	  <div class="controls">
					         ${tmenu?if_exists.createUser?if_exists}
					      </div>
		               </div>
		             </div>
		             <div class="span5">
					 <div class="control-group">
		               	<label class="control-label">创建时间：</label>
		               	  <div class="controls">
		               	    <#if tmenu.createTime??>
					        ${tmenu.createTime?string("yyyy-MM-dd HH:mm:ss")}
					        </#if>
					      </div>
		               </div>
		             </div>
				</div>
				<hr> 
				<div class="row-fluid">
					<div class="span5">
					 <div class="control-group">
		               	<label class="control-label">最近更新人：</label>
		               	  <div class="controls">
					         ${tmenu?if_exists.updateUser?if_exists}
					      </div>
		               </div>
		             </div>
		             <div class="span5">
					 <div class="control-group">
		               	<label class="control-label">近更新时间：</label>
		               	  <div class="controls">
		               	  	 <#if tmenu.updateTime??>
					       	 ${tmenu.updateTime?string("yyyy-MM-dd HH:mm:ss")}
					        </#if>
					      </div>
		               </div>
		             </div>
				</div>
				<hr>
               <div class="control-group">
                  <label class="control-label">备注</label>
                  <div class="controls">
                     ${tmenu?if_exists.remark?if_exists}
                  </div>
               </div>
               <hr>
            </form>
            <!-- END FORM-->           
         </div>
      </div>
      <!-- END SAMPLE FORM widget-->
   </div>
</div>