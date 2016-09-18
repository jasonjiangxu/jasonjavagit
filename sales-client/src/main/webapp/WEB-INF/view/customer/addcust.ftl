 <#import "../macro/pagemacro.ftl" as p>
<div class="wrapper wrapper-content animated fadeInRight">
<div class="row">
                <div class="col-lg-12">
                    <div class="ibox">
                        <div class="ibox-content">
                            <form id="form" action="#" class="wizard-big">
                                <h1>基本信息</h1>
                                <fieldset>
                                    <div class="row">
                                        <div class="col-lg-6">
                                            <div class="form-group">
                                                <label class="col-sm-2">客户编号<em>*</em></label>
                                    			<div class="col-sm-10">
                                    				<input type="email" placeholder="客户编号" class="form-control" value="C0001"> 
                                    				<span class="help-block m-b-none">这里是自动生成,不需要输入.</span>
                                    			</div>
                                            </div>
                                        </div>
                                        <div class="col-lg-6">
                                            <div class="form-group">
                                                <label class="col-lg-2 control-label">客户编号<em>*</em></label>
                                    			<div class="col-lg-10">
                                    				<input type="email" placeholder="客户编号" class="form-control" value="C0001"> 
                                    				<span class="help-block m-b-none">这里是自动生成,不需要输入.</span>
                                    			</div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-lg-6">
                                            <div class="form-group">
                                                <label class="col-lg-2 control-label">客户编号<em>*</em></label>
                                    			<div class="col-lg-10">
                                    				<input type="email" placeholder="客户编号" class="form-control" value="C0001"> 
                                    				<span class="help-block m-b-none">这里是自动生成,不需要输入.</span>
                                    			</div>
                                            </div>
                                        </div>
                                        <div class="col-lg-6">
                                            <div class="form-group">
                                                <label class="col-lg-2 control-label">客户编号<em>*</em></label>
                                    			<div class="col-lg-10">
                                    				<input type="email" placeholder="客户编号" class="form-control" value="C0001"> 
                                    				<span class="help-block m-b-none">这里是自动生成,不需要输入.</span>
                                    			</div>
                                            </div>
                                        </div>
                                    </div>
                                </fieldset>
                                <h1>联系人信息</h1>
                                <fieldset>
                                    <div class="row">
                                        <div class="col-lg-6">
                                            <div class="form-group">
                                                <label>First name *</label>
                                                <input id="name" name="name" type="text" class="form-control required">
                                            </div>
                                            <div class="form-group">
                                                <label>Last name *</label>
                                                <input id="surname" name="surname" type="text" class="form-control required">
                                            </div>
                                        </div>
                                        <div class="col-lg-6">
                                            <div class="form-group">
                                                <label>Email *</label>
                                                <input id="email" name="email" type="text" class="form-control required email">
                                            </div>
                                            <div class="form-group">
                                                <label>Address *</label>
                                                <input id="address" name="address" type="text" class="form-control">
                                            </div>
                                        </div>
                                    </div>
                                </fieldset>

                                <h1>需求信息</h1>
                                <fieldset>
                                    <div class="text-center" style="margin-top: 120px">
                                        <h2>You did it Man :-)</h2>
                                    </div>
                                </fieldset>

                                <h1>完成</h1>
                                <fieldset>
                                    <h2>Terms and Conditions</h2>
                                    <input id="acceptTerms" name="acceptTerms" type="checkbox" class="required"> <label for="acceptTerms">I agree with the Terms and Conditions.</label>
                                </fieldset>
                            </form>
                        </div>
                    </div>
                    </div>

                </div>
            </div>
    </div>
    <@p.stepsjs/>
    <script>
        $(document).ready(function(){
            $("#wizard").steps();
            $("#form").steps({
                bodyTag: "fieldset",
                onStepChanging: function (event, currentIndex, newIndex)
                {
                    if (currentIndex > newIndex)
                    {
                        return true;
                    }

                    // Forbid suppressing "Warning" step if the user is to young
                    if (newIndex === 3 && Number($("#age").val()) < 18)
                    {
                        return false;
                    }

                    var form = $(this);

                    // Clean up if user went backward before
                    if (currentIndex < newIndex)
                    {
                        // To remove error styles
                        $(".body:eq(" + newIndex + ") label.error", form).remove();
                        $(".body:eq(" + newIndex + ") .error", form).removeClass("error");
                    }

                    return true;
                },
                onStepChanged: function (event, currentIndex, priorIndex)
                {
                    // Suppress (skip) "Warning" step if the user is old enough.
                    if (currentIndex === 2 && Number($("#age").val()) >= 18)
                    {
                        $(this).steps("next");
                    }

                    // Suppress (skip) "Warning" step if the user is old enough and wants to the previous step.
                    if (currentIndex === 2 && priorIndex === 3)
                    {
                        $(this).steps("previous");
                    }
                },
                onFinishing: function (event, currentIndex)
                {
                    var form = $(this);
                    return true;
                },
                onFinished: function (event, currentIndex)
                {
                    var form = $(this);
                    form.submit();
                }
            })
       });
    </script>