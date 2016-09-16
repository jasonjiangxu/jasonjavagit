 <#import "macro/pagemacro.ftl" as p>
 <#import "macro/reportmacro.ftl" as r>
	         <div class="wrapper wrapper-content">
		        <div class="row  border-bottom white-bg dashboard-header">
		            <div class="col-sm-3">
		                <@p.messageBox/><#--消息提醒-->
		            </div>
		            <div class="col-sm-9">
		                <@r.salesReport/><#--销售报表-->
		            </div>
		    	</div>
		        <div class="row">
		            	<@r.newaddReport/><#--新增报表-->
		        </div>
		        <div class="row">
		            <div class="col-sm-12">
		                <@r.dealReport/><#--成交报表-->
		             </div>
		        </div>
	        </div>
     
     <@p.flotjs/>
     <script src="${base}/view/index.js?v=1.1"></script>
	 
	  
	  