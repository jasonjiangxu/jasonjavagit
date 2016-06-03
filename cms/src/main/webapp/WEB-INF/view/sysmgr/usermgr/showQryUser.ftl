<#import "../../macro/pagemacro.ftl" as p>
<div class="row-fluid">
   <div class="span12">
      <!-- BEGIN SAMPLE FORM widget-->   
      <div class="widget">
         <div class="widget-body form">
            <!-- BEGIN FORM-->
            <form id="userForm" action="#" class="form-horizontal">
            	<input type="hidden" value="${tuser?if_exists.id?if_exists}" name="id" id="pkid"/>
               <!-- 通用的错误提示 这里引入即可 -->
               <div class="row-fluid">
					<div class="span5">
						<div class="control-group">
		               	  <label class="control-label">登录名称：</label>
		               	  <div class="controls">
		               	  	 ${tuser?if_exists.loginName?if_exists}
					      </div>
		               </div>
					</div>
					<div class="span5">
						<div class="control-group">
		               	  <label class="control-label">员工工号：</label>
		               	  <div class="controls">
					         ${tuser?if_exists.code?if_exists}
					      </div>
		               </div>
					</div>
				</div>
               <hr>
               <div class="row-fluid">
               		<div class="span5">
					 <div class="control-group">
		               	<label class="control-label">用户昵称：</label>
		               	  <div class="controls">
					         ${tuser?if_exists.nicName?if_exists}
					      </div>
		               </div>
		            </div>
					<div class="span5">
					  <div class="control-group">
		               	  <label class="control-label">用户名称：</label>
		               	  <div class="controls">
					         ${tuser?if_exists.userName?if_exists}
					      </div>
		               </div>
		             </div>
				</div>
				<hr>
				<div class="row-fluid">
					<div class="span5">
					 <div class="control-group">
		               	<label class="control-label">性别：</label>
		               	  <div class="controls">
					         ${tuser?if_exists.sex?if_exists}
					      </div>
		               </div>
		             </div>
					<div class="span5">
					  <div class="control-group">
		               	  <label class="control-label">生日：</label>
		               	  <div class="controls">
					         ${tuser?if_exists.birthDay?if_exists}
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
					         ${tuser?if_exists.createUser?if_exists}
					      </div>
		               </div>
		             </div>
		             <div class="span5">
					 <div class="control-group">
		               	<label class="control-label">创建时间：</label>
		               	  <div class="controls">
		               	    <#if tuser.createTime??>
					        ${tuser.createTime?string("yyyy-MM-dd HH:mm:ss")}
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
					         ${tuser?if_exists.updateUser?if_exists}
					      </div>
		               </div>
		             </div>
		             <div class="span5">
					 <div class="control-group">
		               	<label class="control-label">近更新时间：</label>
		               	  <div class="controls">
		               	  	 <#if tuser.updateTime??>
					       	 ${tuser.updateTime?string("yyyy-MM-dd HH:mm:ss")}
					        </#if>
					      </div>
		               </div>
		             </div>
				</div>
				<hr>
               <div class="control-group">
                  <label class="control-label">备注</label>
                  <div class="controls">
                     ${tuser?if_exists.remark?if_exists}
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