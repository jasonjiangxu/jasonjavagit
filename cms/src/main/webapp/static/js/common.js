/**
 * 页面初始化加载
 */
jQuery(document).ready(function() {
	// initiate layout and plugins
	App.setMainPage(false);
	App.init();
});
function handleIntro() {
}

/**
 * 初始化表单验证
 * @param form
 */
function initValidForm(form) {
	$(form).validate({
		errorElement : "em",
		highlight : function(element) {
			$(element).css('border-color', 'red');
		},
		success : function(label) {
			element = $('#errorTextId').attr('errorElementId');
			$('#' + element).css('border-color', '');
		},
		errorPlacement : function(error, element) {
			$('#errorTextId').attr('errorElementId', $(element).attr("id"));
		}
	});
}

function validateForm(form){
	var result=false;
	if (form.valid()) {
		$('#alert-error-id').removeClass("alert-error");
		$('#alert-error-id').addClass("alert-success");
		$('#errorTextId').html("<em>恭喜你可以提交了</em>");
		result=true;
	} else {
		$('#alert-error-id').removeClass("alert-success");
		$('#alert-error-id').addClass("alert-error");
		$('#errorTextId').html("<em>您的表单输入项有误，请仔细检查核对后再提交！</em>");
		result=false;
	}
	return result;
}

function ajaxFormCommit(form,url,dialogId,table){
	if (validateForm(form)) {
		$('#alert-error-id').removeClass("alert-success");
		$('#alert-error-id').addClass("alert-error");
		$.ajax({
		    cache : true,
		    type:'POST',
		    url: url,
		    dataType: 'json',
		    data:form.serialize(),
			success: function(data) {
				if(data.success){
					$('#'+dialogId).dialog('close');
					$('#'+table).datagrid('reload');
				}else{
					$('#errorTextId').html("<em>"+data.message+"</em>");
				}
			},
			error: function(errors) {
				$('#errorTextId').html("<em>保存失败！</em>");
			}
		});	
	} else {
		return;
	}
}

//js获取项目根路径，如： http://localhost:8083/cms
function getRootPath(){
    //获取当前网址，如： http://localhost:8083/cms/share/meun.jsp
    //var curWwwPath=window.document.location.href;
    //获取主机地址之后的目录，如： cms/share/meun.jsp
    var pathName=window.document.location.pathname;
    //var pos=curWwwPath.indexOf(pathName);
    //获取主机地址，如： http://localhost:8083
    //var localhostPaht=curWwwPath.substring(0,pos);
    //获取带"/"的项目名，如：/cms
    var projectName=pathName.substring(0,pathName.substr(1).indexOf('/')+1);
    return projectName;
}

function refresh(){
	var pathName=window.document.location.pathname;
	window.location.href=pathName;
}

//得到新的工号
function getJobNum(ctx){
	var jobnum="";
	$.ajax({
	    cache : true,
	    type:'POST',
	    url: ctx+"/user/initJobCode",
	    dataType: 'json',
	    async: false,
		success: function(data) {
			jobnum=data.message;
		},
		error: function(errors) {
			$.messager.alert('温馨提示','工号获取出错！','error');
		}
	});	
	return jobnum;
}