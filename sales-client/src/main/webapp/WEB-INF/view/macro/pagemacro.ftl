<!-- 引入图表分析js -->
<#macro flotjs>
       <!-- Flot -->
    <script src="${base}/plugin/flot/jquery.flot.js"></script>
    <script src="${base}/plugin/flot/jquery.flot.tooltip.min.js"></script>
    <script src="${base}/plugin/flot/jquery.flot.spline.js"></script>
    <script src="${base}/plugin/flot/jquery.flot.resize.js"></script>
    <script src="${base}/plugin/flot/jquery.flot.pie.js"></script>
    <!-- Peity -->
    <script src="${base}/plugin/peity/jquery.peity.min.js"></script>
    <!-- Sparkline -->
    <script src="${base}/plugin/sparkline/jquery.sparkline.min.js"></script>
    <!-- ChartJS-->
    <script src="${base}/plugin/chartJs/Chart.min.js"></script>
</#macro>

<!-- 引入地图js -->
<#macro jqVmap>
    <#-- <link href="${base}/assets/jqvmap/jqvmap/jqvmap.css" media="screen" rel="stylesheet" type="text/css" />
	
	<script src="${base}/assets/jqvmap/jqvmap/jquery.vmap.js" type="text/javascript"></script>
    <script src="${base}/assets/jqvmap/jqvmap/maps/jquery.vmap.russia.js" type="text/javascript"></script>
    <script src="${base}/assets/jqvmap/jqvmap/maps/jquery.vmap.world.js" type="text/javascript"></script>
    <script src="${base}/assets/jqvmap/jqvmap/maps/jquery.vmap.europe.js" type="text/javascript"></script>
    <script src="${base}/assets/jqvmap/jqvmap/maps/jquery.vmap.germany.js" type="text/javascript"></script>
    <script src="${base}/assets/jqvmap/jqvmap/maps/jquery.vmap.usa.js" type="text/javascript"></script>
    <script src="${base}/assets/jqvmap/jqvmap/data/jquery.vmap.sampledata.js" type="text/javascript"></script>-->
</#macro>

<!-- 引入表格js -->
<#macro dataTable>
    <script type="text/javascript" src="${base}/assets/data-tables/jquery.dataTables.js"></script>
    <script type="text/javascript" src="${base}/assets/data-tables/DT_bootstrap.js"></script>
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
