<!-- 引入图表分析js -->
<#macro flotjs>
       <!-- Flot -->
    <script src="${base}/plugin/flot/jquery.flot.js"></script>
    <script src="${base}/plugin/flot/jquery.flot.tooltip.min.js"></script>
    <script src="${base}/plugin/flot/jquery.flot.spline.js"></script>
    <script src="${base}/plugin/flot/jquery.flot.resize.js"></script>
    <script src="${base}/plugin/flot/jquery.flot.pie.js"></script>
    <script src="${base}/plugin/flot/jquery.flot.symbol.js"></script>
    <script src="${base}/plugin/flot/jquery.flot.time.js"></script>
    <!-- Peity -->
    <script src="${base}/plugin/peity/jquery.peity.min.js"></script>
    <!-- Sparkline -->
    <script src="${base}/plugin/sparkline/jquery.sparkline.min.js"></script>
    <!-- ChartJS-->
    <script src="${base}/plugin/chartJs/Chart.min.js"></script>
    
    <script src="${base}/plugin/easypiechart/jquery.easypiechart.js"></script>
</#macro>

<!-- 引入Easyuijs -->
<#macro easyuijs>
	 <link href="${base}/plugin/easyui/themes/gray/easyui.css" rel="stylesheet"/>
	 <link href="${base}/plugin/easyui/themes/icon.css" rel="stylesheet"/>
	 <link href="${base}/plugin/easyui/themes/color.css" rel="stylesheet"/>
	
	<script src="${base}/plugin/easyui/jquery.easyui.min.js"></script>
	<script src="${base}/plugin/easyui/locale/easyui-lang-zh_CN.js"></script>
</#macro>

<#macro stepsjs>
	<link href="${base}/plugin/steps/jquery.steps.css" rel="stylesheet">
	<script src="${base}/plugin/steps/jquery.steps.min.js"></script>
</#macro>

<!-- 消息通知 -->
<#macro messageBox>
	 <h2>欢迎使用</h2>
    <small>你有42条信息6个通知.</small>
    <ul class="list-group clear-list m-t">
        <li class="list-group-item fist-item">
            <span class="pull-right">
               	 上午09:00
            </span>
            <span class="label label-success">1</span>请联系我
        </li>
        <li class="list-group-item">
            <span class="pull-right">
                	下午10:16
            </span>
            <span class="label label-info">2</span> 签订合同
        </li>
        <li class="list-group-item">
            <span class="pull-right">
                	晚上08:22
            </span>
            <span class="label label-primary">3</span> 开会
        </li>
        <li class="list-group-item">
            <span class="pull-right">
               	 晚上11:06
            </span>
            <span class="label label-default">4</span>写工作报告
        </li>
        <li class="list-group-item">
            <span class="pull-right">
               	 晚上12:00
            </span>
            <span class="label label-primary">5</span>下班回家睡觉
        </li>
    </ul>
</#macro>

<!-- 分页查询 -->
<#macro paging url pageobj>
       <div class="pagination pagination-right">
			<ul>
				<#if (pageobj.currentPage<=1)>
					<li><span><i class="icon-fast-backward"></i></span></li>
					<li><span><i class="icon-step-backward"></i></span></li>
				<#else>
					<li><a href="${base}/${url}/1"><i class="icon-fast-backward"></i></a></li>
					<li><a href="${base}/${url}/${pageobj.currentPage-1}"><i class="icon-step-backward"></i></a></li>
				</#if>
				
				<#if (pageobj.totalPage>1)>
				<#list 1..pageobj.totalPage as page>
					<#if (pageobj.currentPage=page)>
						<li class="active"><a href="${base}/${url}/${page}">${page}</a></li>
					<#else>
						<li><a href="${base}/${url}/${page}">${page}</a></li>
					</#if>
				</#list>
				<#else>
					<li class="active"><a href="${base}/${url}/1">1</a></li>
				</#if>
				
				<#if (pageobj.currentPage>=pageobj.totalPage)>
					<li><span><i class="icon-step-forward"></i></span></li>
					<li><span><i class="icon-fast-forward"></i></span></li>
				<#else>
					<li><a href="${base}/${url}/${pageobj.currentPage+1}"><i class="icon-step-forward"></i></a></li>
					<li><a href="${base}/${url}/${pageobj.totalPage}"><i class="icon-fast-forward"></i></a></li>
				</#if>
				
				<li><a href="${base}/${url}/${pageobj.currentPage}"><i class="icon-refresh"></i></a></li>
				<li><span style="width: 100px;">&nbsp;</span></li>
				<li><a href="#">当前显示  第${pageobj.start+1}-${pageobj.end}条记录   共${pageobj.totalProperty}条记录</a></li>
			</ul>
		</div>
</#macro>

<!-- 表头 -->
<#macro divtitle title icon="">
       <div class="widget-title">
           <h4><i class="${icon?if_exists} active"></i>${title?if_exists}</h4>
           <span class="tools">
           <a href="javascript:;" class="icon-chevron-down"></a>
           </span>                    
        </div>
</#macro>

<!-- 表格样式01 -->
<#macro mytable_style01 tlist blist>
	<table class="table table-striped table-bordered table-hover " id="nopage_checkbox">
        <thead>
            <tr>
                <th style="width:8px;"><input type="checkbox" class="group-checkable" data-set="#nopage_checkbox .checkboxes" /></th>
                <#list tlist as column>
                <th><#list column?keys as itemKey>${column[itemKey]}</#list></th>
                </#list>
            </tr>
        </thead>
        <tbody>
        	<#if blist??>
        		<#list blist as item>
            		<tr class="odd gradeX">
                        <td><input type="checkbox" class="checkboxes" value="1" /></td>
                        <#list tlist as column>
		               	 <td><#list column?keys as itemKey>${item[itemKey]}</#list></td>
		                </#list>
                    </tr>
        		</#list>
        	</#if>
         </tbody>
    </table>
</#macro>

<!-- 单选按钮组 -->
<#macro radioGroup label rlist fieldName  function="">
	  <#if label?if_exists!="">
	      <label class="control-label">${label}：</label>
	  </#if>
      <div class="controls">
	<#list rlist as column>
    	<#list column?keys as itemKey>
		    <label class="radio">
		     	<input type="radio" id="radio_${fieldName}${itemKey}_id" name="${fieldName}" value="${itemKey}" 
		     	<#if (function!="")> onchange="${function}"</#if>/>${column[itemKey]}
		     </label>
	     </#list>
    </#list>
    </div>
</#macro>

<!-- Error错误提示 -->
<#macro alertError>
       <div  id="alert-error-id" class="alert alert-error">
			<strong>温馨提示：</strong><span id="errorTextId">红色*号标记的为必填项</span>
		</div>
</#macro>

<!-- 表单INPUT输入框 -->
<#macro form_input fieldName value="" label="" validClass="" defaultError="" readOnly="" changeFunction="">
	  <#if label?if_exists!="">
	      <label class="control-label">${label}：</label>
	  </#if>
      <div class="controls">
         <input type="text" style="width:375px;" id="input_${fieldName}_id" class="${validClass}" name="${fieldName}" value="${value}"
         <#if readOnly=="true">readOnly="readOnly" disabled="disabled"</#if>
         <#if (changeFunction!="")> onchange="${changeFunction}"</#if>
         />
         <#if validClass?if_exists!="">
         	 <#if defaultError?if_exists!="">
         		 <#assign errmsg= defaultError/>
         	<#else>
         	   <#assign errmsg="输入项目不能为空！"/>
         	 </#if>
	         <font color="red">&nbsp;*&nbsp;</font><span>${errmsg}</span>
         </#if>
      </div>
</#macro>
