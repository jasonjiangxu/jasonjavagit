    <!-- END PAGE HEADER-->
    <!-- BEGIN PAGE CONTENT-->
     <div class="row-fluid">
         <div class="span12">
             <div class="space20"></div>
             <div class="space20"></div>
             <div class="widget-body">
                 <div class="error-page" style="min-height: 800px">
                     <img src="${base}/image/500.png" alt="500 error">
                     <h1>
                         <strong>500!</strong> <br/>
                         OOPS! Something went wrong.<br/>
                         <#if ex??>
                         	${ex }
                         </#if>
                     </h1>
                 </div>
             </div>
         </div>
     </div>
    <!-- END PAGE CONTENT-->  