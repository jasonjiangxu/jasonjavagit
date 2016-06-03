<#import "../../macro/pagemacro.ftl" as p>
<div class="row-fluid">
   <div class="span12">
      <!-- BEGIN SAMPLE FORM widget-->   
      <div class="widget">
         <div class="widget-body form">
            <!-- BEGIN FORM-->
            <form id="menuForm" action="#" class="form-horizontal">
            	<input type="hidden"  name="id" id="pkid"/>
               <!-- 通用的错误提示 这里引入即可 -->
            	<@p.alertError />
               <div class="control-group">
               	  <label class="control-label">菜单名称：</label>
               	  <div class="controls">
			         <input type="text"  id="input_name_id" class="{required:true,messages:{required:'菜单名字必须输入'}}" name="name" 
			          onchange="menuFormChange();"/>
			         <font color="red">&nbsp;*&nbsp;</font><span>菜单名称必须输入！</span>
			      </div>
               </div>
               <div class="control-group">
               	  <label class="control-label">菜单编码：</label>
               	  <div class="controls">
			         <input type="text"  id="input_code_id" class="{required:true,messages:{required:'菜单编码必须输入'}}" name="code" 
			          onchange="menuFormChange();"/>
			         <font color="red">&nbsp;*&nbsp;</font><span>菜单编码必须输入！</span>
			      </div>
               </div>
               <div class="control-group">
               	  <label class="control-label">菜单级别：</label>
               	   <div class="controls">
               	   	  <input name="level" type="radio"  checked="checked"  value="1" onchange="changeLevel()">  一级
               	   	  &nbsp; &nbsp;
               	   	  <input name="level" type="radio"    value="2"  onchange="changeLevel()">  二级
               	   </div>
               </div>
               <div class="control-group" id="parent_div">
               	 <label class="control-label">上级菜单</label>
                  <div class="controls">
					<input class="easyui-combobox" type="text" id="parentCode" name="parentCode" />
                  </div>
               </div>
               <div class="control-group">
               		<label class="control-label">URL地址：</label>
               	  <div class="controls">
			          <input type="text"  id="input_url_id" name="url" />
			      </div>
               </div>
               <div class="control-group">
               <label class="control-label">图标：</label>
               	  <div class="controls">
			          <input type="text"  id="input_icon_id" name="icon" />
			      </div>
               </div>
               <div class="control-group">
               <label class="control-label">排序：</label>
               	  <div class="controls">
			          <input type="text"  id="input_sort_id" name="sort" />
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