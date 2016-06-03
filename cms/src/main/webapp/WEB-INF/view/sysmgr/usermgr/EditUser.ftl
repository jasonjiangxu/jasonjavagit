<#import "../../macro/pagemacro.ftl" as p>
<div class="row-fluid">
   <div class="span12">
      <!-- BEGIN SAMPLE FORM widget-->   
      <div class="widget">
         <div class="widget-body form">
            <!-- BEGIN FORM-->
            <form id="userForm" action="#" class="form-horizontal">
            	<input type="hidden"  name="id" id="pkid"/>
            	<input type="hidden"  name="password.pwd" id="pwd_id" value="111111"/>
               <!-- 通用的错误提示 这里引入即可 -->
            	<@p.alertError />
               <div class="control-group">
               	  <label class="control-label">登录名：</label>
               	  <div class="controls">
			         <input type="text"  id="input_loginName_id" class="{required:true,messages:{required:'登录名字必须输入'}}" name="loginName" 
			          onchange="userFormChange();"/>
			         <font color="red">&nbsp;*&nbsp;</font><span>登录名称必须输入！</span>
			      </div>
               </div>
               <div class="control-group">
               	  <label class="control-label">员工工号：</label>
               	  <div class="controls">
			         <input type="text"  id="input_code_id" class="{required:true,messages:{required:'工号必须输入'}}" name="code"  readOnly="readOnly"/>
			         <font color="red">&nbsp;*&nbsp;</font><span>工号必须输入！</span>
			      </div>
               </div>
               <div class="control-group">
               	  <label class="control-label">昵称：</label>
               	  <div class="controls">
			         <input type="text"  id="input_nicName_id"  name="nicName"  />
			      </div>
               </div>
               <div class="control-group">
               	  <label class="control-label">姓名：</label>
               	  <div class="controls">
			         <input type="text"  id="input_userName_id"  name="userName"  />
			      </div>
               </div>
               <div class="control-group">
               	  <label class="control-label">性别：</label>
               	   <div class="controls">
               	   	  <input name="sex" type="radio"    value="M" >  男
               	   	  &nbsp; &nbsp;
               	   	  <input name="sex" type="radio"    value="F" >  女
               	   </div>
               </div>
               <div class="control-group">
               	  <label class="control-label">生日：</label>
               	  <div class="controls">
			         <input type="text" class="easyui-datebox" id="input_birthDay_id"  name="birthDay"  />
			      </div>
               </div>
               <div class="control-group">
                  <label class="control-label">备注</label>
                  <div class="controls">
                     <textarea class="span8 " rows="3" name="remark" id="remark"></textarea>
                  </div>
               </div>
            </form>
            <!-- END FORM-->           
         </div>
      </div>
      <!-- END SAMPLE FORM widget-->
   </div>
</div>