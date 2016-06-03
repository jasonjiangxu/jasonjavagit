<!-- 导入宏 -->
<#import "macro/chartmacro.ftl" as c>
<#import "macro/pagemacro.ftl" as p>
 			
			<!-- BEGIN PAGE CONTAINER-->
			<div class="container-fluid">
				<!-- BEGIN PAGE CONTENT-->
				<div id="page" class="dashboard">
                    <!--BEGIN NOTIFICATION-->
                    <div class="alert alert-info">
                        <button data-dismiss="alert" class="close">×</button>
                         Welcome to the <strong>Admin Lab</strong> Theme. Please don't forget to check all the pages!
                    </div>
                    <!--END NOTIFICATION-->
                    <!-- BEGIN OVERVIEW STATISTIC BARS-->
                    <div class="row-fluid circle-state-overview">
                        <div class="span2 responsive clearfix" data-tablet="span3" data-desktop="span2">
                            <div class="circle-wrap">
                                <div class="stats-circle turquoise-color">
                                    <i class="icon-user"></i>
                                </div>
                                <p>
                                    <strong>+30</strong>
                                    New Users
                                </p>
                            </div>
                        </div>
                        <div class="span2 responsive" data-tablet="span3" data-desktop="span2">
                            <div class="circle-wrap">
                                <div class="stats-circle red-color">
                                    <i class="icon-tags"></i>
                                </div>
                                <p>
                                    <strong>+970</strong>
                                    Sales
                                </p>
                            </div>
                        </div>
                        <div class="span2 responsive" data-tablet="span3" data-desktop="span2">
                            <div class="circle-wrap">
                                <div class="stats-circle green-color">
                                    <i class="icon-shopping-cart"></i>
                                </div>
                                <p>
                                    <strong>+320</strong>
                                    New Order
                                </p>
                            </div>
                        </div>
                        <div class="span2 responsive" data-tablet="span3" data-desktop="span2">
                            <div class="circle-wrap">
                                <div class="stats-circle gray-color">
                                    <i class="icon-comments-alt"></i>
                                </div>
                                <p>
                                    <strong>+530</strong>
                                    Comments
                                </p>
                            </div>
                        </div>
                        <div class="span2 responsive" data-tablet="span3" data-desktop="span2">
                            <div class="circle-wrap">
                                <div class="stats-circle purple-color">
                                    <i class="icon-eye-open"></i>
                                </div>
                                <p>
                                    <strong>+430</strong>
                                    Unique Visitor
                                </p>
                            </div>
                        </div>
                        <div class="span2 responsive" data-tablet="span3" data-desktop="span2">
                            <div class="circle-wrap">
                                <div class="stats-circle blue-color">
                                    <i class="icon-bar-chart"></i>
                                </div>
                                <p>
                                    <strong>+230</strong>
                                    Updates
                                </p>
                            </div>
                        </div>


                    </div>
                    <!-- END OVERVIEW STATISTIC BARS-->

                    <div class="row-fluid">
                        <div class="span12">
                            <!-- BEGIN MAILBOX PORTLET-->
                            <div class="widget">
                                <div class="widget-title">
                                <h4><i class="icon-envelope"></i> Mailbox</h4>
                                <div class="tools pull-right mtop7 mail-btn">
                                    <div class="btn-group">
                                        <a class="btn btn-small element" data-original-title="Share" href="#" data-toggle="tooltip" data-placement="top">
                                            <i class="icon-share-alt"></i>
                                        </a>

                                        <a class="btn btn-small element" data-original-title="Report" href="#" data-toggle="tooltip" data-placement="top">
                                            <i class="icon-exclamation-sign">
                                            </i>
                                        </a>
                                        <a class="btn btn-small element" data-original-title="Delete" href="#" data-toggle="tooltip" data-placement="top">
                                            <i class="icon-trash">
                                            </i>
                                        </a>
                                    </div>
                                    <div class="btn-group">
                                        <a class="btn btn-small element" data-original-title="Move to" href="#" data-toggle="tooltip" data-placement="top">
                                            <i class="icon-folder-close">
                                            </i>
                                        </a>
                                        <a class="btn btn-small element" data-original-title="Tag" href="#" data-toggle="tooltip" data-placement="top">
                                            <i class="icon-tag">
                                            </i>
                                        </a>
                                    </div>
                                    <div class="btn-group">
                                        <a class="btn btn-small element" data-original-title="Prev" href="#" data-toggle="tooltip" data-placement="top">
                                            <i class="icon-chevron-left">
                                            </i>
                                        </a>
                                        <a class="btn btn-small element" data-original-title="Next" href="#" data-toggle="tooltip" data-placement="top">
                                            <i class="icon-chevron-right">
                                            </i>
                                        </a>
                                    </div>
                                </div>
                            </div>
                                <div class="widget-body">
                                <table class="table table-condensed table-striped table-hover no-margin">
                                    <thead>
                                    <tr>
                                        <th style="width:3%">
                                            <input type="checkbox" class="no-margin">
                                        </th>
                                        <th style="width:17%">
                                            Sent by
                                        </th>
                                        <th class="hidden-phone" style="width:55%">
                                            Subject
                                        </th>
                                        <th class="right-align-text hidden-phone" style="width:12%">
                                            Labels
                                        </th>
                                        <th class="right-align-text hidden-phone" style="width:12%">
                                            Date
                                        </th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <tr>
                                        <td>
                                            <input type="checkbox" class="no-margin">
                                        </td>
                                        <td>
                                            Dulal khan
                                        </td>
                                        <td class="hidden-phone">
                                            <strong>
                                                Senior Creative Designer
                                            </strong>
                                            <small class="info-fade">
                                                Vector Lab
                                            </small>
                                        </td>
                                        <td class="right-align-text hidden-phone">
                                                  <span class="label label label-info">
                                                    Read
                                                  </span>
                                        </td>
                                        <td class="right-align-text hidden-phone">
                                            Yesterday
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <input type="checkbox" class="no-margin">
                                        </td>
                                        <td>
                                            Mosaddek Hossain
                                        </td>
                                        <td class="hidden-phone">
                                            <strong>
                                                Senior UI Engineer
                                            </strong>
                                            <small class="info-fade">
                                                Vector Lab International
                                            </small>
                                        </td>
                                        <td class="right-align-text hidden-phone">
                                                  <span class="label label label-success">
                                                    New
                                                  </span>
                                        </td>
                                        <td class="right-align-text hidden-phone">
                                            Today
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <input type="checkbox" class="no-margin">
                                        </td>
                                        <td>
                                            Sumon Ahmed
                                        </td>
                                        <td class="hidden-phone">
                                            <strong>
                                                Manager
                                            </strong>

                                            <small class="info-fade">
                                                ABC International
                                            </small>
                                        </td>
                                        <td class="right-align-text hidden-phone">
                                                  <span class="label label">
                                                    Imp
                                                  </span>
                                        </td>
                                        <td class="right-align-text hidden-phone">
                                            Yesterday
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <input type="checkbox" class="no-margin">
                                        </td>
                                        <td>
                                            Rafiqul Islam
                                        </td>
                                        <td class="hidden-phone">
                                            <strong>
                                                Verify your email
                                            </strong>

                                            <small class="info-fade">
                                                lorem ipsum dolor imit
                                            </small>
                                        </td>
                                        <td class="right-align-text hidden-phone">
                                                  <span class="label label label-info">
                                                    Read
                                                  </span>
                                        </td>
                                        <td class="right-align-text hidden-phone">
                                            18-04-2013
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <input type="checkbox" class="no-margin">
                                        </td>
                                        <td>
                                            Dkmosa
                                        </td>
                                        <td class="hidden-phone">
                                            <strong>
                                                Statement for January 2012
                                            </strong>
                                            <small class="info-fade">
                                                Director
                                            </small>
                                        </td>
                                        <td class="right-align-text hidden-phone">
                                                  <span class="label label label-success">
                                                    New
                                                  </span>
                                        </td>
                                        <td class="right-align-text hidden-phone">
                                            10-02-2013
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <input type="checkbox" class="no-margin">
                                        </td>
                                        <td>
                                            Mosaddek
                                        </td>
                                        <td class="hidden-phone">
                                            <strong>
                                                You're In!
                                            </strong>
                                            <small class="info-fade">
                                                Frontend developer
                                            </small>
                                        </td>
                                        <td class="right-align-text hidden-phone">
                                                  <span class="label label">
                                                    Imp
                                                  </span>
                                        </td>
                                        <td class="right-align-text hidden-phone">
                                            21-01-2013
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <input type="checkbox" class="no-margin">
                                        </td>
                                        <td>
                                            Dulal khan
                                        </td>
                                        <td class="hidden-phone">
                                            <strong>
                                                Support
                                            </strong>
                                            <small class="info-fade">
                                                XYZ Interactive
                                            </small>
                                        </td>
                                        <td class="right-align-text hidden-phone">
                                                  <span class="label label label-info">
                                                    New
                                                  </span>
                                        </td>
                                        <td class="right-align-text hidden-phone">
                                            19-01-2013
                                        </td>
                                    </tr>
                                    </tbody>
                                </table>
                            </div>
                            </div>
                            <!-- END MAILBOX PORTLET-->
                        </div>
                    </div>
                    <!-- BEGIN OVERVIEW STATISTIC BARS-->
                    <div class="row-fluid metro-overview-cont">
                        <div data-desktop="span2" data-tablet="span4" class="span2 responsive">
                            <div class="metro-overview turquoise-color clearfix">
                                <div class="display">
                                    <i class="icon-group"></i>
                                    <div class="percent">+55%</div>
                                </div>
                                <div class="details">
                                    <div class="numbers">530</div>
                                    <div class="title">New Users</div>
                                </div>
                                <div class="progress progress-info">
                                    <div style="width: 55%" class="bar"></div>
                                </div>
                            </div>
                        </div>
                        <div data-desktop="span2" data-tablet="span4" class="span2 responsive">
                            <div class="metro-overview red-color clearfix">
                                <div class="display">
                                    <i class="icon-tags"></i>
                                    <div class="percent">+36%</div>
                                </div>
                                <div class="details">
                                    <div class="numbers">5440 $</div>
                                    <div class="title">Monthly Sales</div>
                                    <div class="progress progress-warning">
                                        <div style="width: 36%" class="bar"></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div data-desktop="span2" data-tablet="span4" class="span2 responsive">
                            <div class="metro-overview green-color clearfix">
                                <div class="display">
                                    <i class="icon-shopping-cart"></i>
                                    <div class="percent">+46%</div>
                                </div>
                                <div class="details">
                                    <div class="numbers">1000</div>
                                    <div class="title">New Orders</div>
                                    <div class="progress progress-success">
                                        <div style="width: 46%" class="bar"></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div data-desktop="span2" data-tablet="span4 fix-margin" class="span2 responsive">
                            <div class="metro-overview gray-color clearfix">
                                <div class="display">
                                    <i class="icon-comments-alt"></i>
                                    <div class="percent">+26%</div>
                                </div>
                                <div class="details">
                                    <div class="numbers">170</div>
                                    <div class="title">Comments</div>
                                    <div class="progress progress-warning">
                                        <div style="width: 26%" class="bar"></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div data-desktop="span2" data-tablet="span4" class="span2 responsive">
                            <div class="metro-overview purple-color clearfix">
                                <div class="display">
                                    <i class="icon-eye-open"></i>
                                    <div class="percent">+72%</div>
                                </div>
                                <div class="details">
                                    <div class="numbers">1130</div>
                                    <div class="title">Unique Visitor</div>
                                    <div class="progress progress-danger">
                                        <div style="width: 72%" class="bar"></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div data-desktop="span2" data-tablet="span4" class="span2 responsive">
                            <div class="metro-overview blue-color clearfix">
                                <div class="display">
                                    <i class="icon-bar-chart"></i>
                                    <div class="percent">+20%</div>
                                </div>
                                <div class="details">
                                    <div class="numbers">170</div>
                                    <div class="title">Updates</div>
                                    <div class="progress progress-success">
                                        <div style="width: 20%" class="bar"></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- END OVERVIEW STATISTIC BARS-->
					<div class="row-fluid">
						<div class="span8">
							<!-- BEGIN SITE VISITS PORTLET-->
							<div class="widget">
								<div class="widget-title">
									<h4><i class="icon-bar-chart"></i> Line Chart</h4>
									<span class="tools">
									<a href="javascript:;" class="icon-chevron-down"></a>
									<a href="javascript:;" class="icon-remove"></a>
									</span>
								</div>
								<div class="widget-body">
									<div id="site_statistics_loading">
										<img src="${base}/image/loading.gif" alt="loading" />
									</div>
									<div id="site_statistics_content" class="hide">
										<div id="site_statistics" class="chart"></div>
									</div>
								</div>
							</div>
							<!-- END SITE VISITS PORTLET-->
						</div>
                        <div class="span4">
                            <div class="widget">
                                <div class="widget-title">
                                    <h4><i class="icon-book"></i> Active Pages</h4>
									<span class="tools">
									<a href="javascript:;" class="icon-chevron-down"></a>
									<a href="javascript:;" class="icon-remove"></a>
									</span>
                                </div>
                                <div class="widget-body">
                                    <table class="table table-striped">
                                        <thead>
                                        <tr>
                                            <th>Page</th>
                                            <th>Visits</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <tr>
                                            <td>Categories</td>
                                            <td><strong>8790</strong></td>
                                        </tr>
                                        <tr>
                                            <td>Clothing</td>
                                            <td><strong>7052</strong></td>
                                        </tr>
                                        <tr>
                                            <td>About</td>
                                            <td><strong>6577</strong></td>
                                        </tr>
                                        <tr>
                                            <td>Contact Us</td>
                                            <td><strong>5760</strong></td>
                                        </tr>
                                        <tr>
                                            <td>Blog</td>
                                            <td><strong>4876</strong></td>
                                        </tr>
                                        <tr>
                                            <td>Prices</td>
                                            <td><strong>3866</strong></td>
                                        </tr>
                                        <tr>
                                            <td>Information</td>
                                            <td><strong>1876</strong></td>
                                        </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>

					<div class="row-fluid">
                        <div class="span12">
                            <!-- BEGIN SERVER LOAD PORTLET-->
                            <div class="widget">
                                <div class="widget-title">
                                    <h4><i class="icon-umbrella"></i> Live Chart</h4>
									<span class="tools">
									<a href="javascript:;" class="icon-chevron-down"></a>
									<a href="javascript:;" class="icon-remove"></a>
									</span>
                                </div>
                                <div class="widget-body">
                                    <div id="load_statistics_loading">
                                        <img src="${base}/image/loading.gif" alt="loading" />
                                    </div>
                                    <div id="load_statistics_content" class="hide">
                                        <div id="load_statistics" class="chart"></div>
                                        <div class="btn-toolbar no-bottom-space clearfix">
                                            <div class="btn-group" data-toggle="buttons-radio">
                                                <button class="btn btn-mini">Web</button><button class="btn btn-mini">Database</button><button class="btn btn-mini">Static</button>
                                            </div>
                                            <div class="btn-group pull-right" data-toggle="buttons-radio">
                                                <button class="btn btn-mini active">Asia</button><button class="btn btn-mini">
                                                <span class="visible-phone">Eur</span>
                                                <span class="hidden-phone">Europe</span>
                                            </button><button class="btn btn-mini">USA</button>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <!-- END SERVER LOAD PORTLET-->
                        </div>
					</div>

                    <div class="row-fluid">
                        <div class="span12">
                            <!-- BEGIN EXAMPLE TABLE widget-->
                            <div class="widget">
                                <div class="widget-title">
                                    <h4><i class="icon-reorder"></i>Managed Table (filterable)</h4>
                                        <span class="tools">
                                            <a href="javascript:;" class="icon-chevron-down"></a>
                                            <a href="javascript:;" class="icon-remove"></a>
                                        </span>
                                </div>
                                <div class="widget-body">
                                    <table class="table table-striped table-bordered" id="sample_1">
                                        <thead>
                                        <tr>
                                            <th style="width:8px;"><input type="checkbox" class="group-checkable" data-set="#sample_1 .checkboxes" /></th>
                                            <th>Username</th>
                                            <th class="hidden-phone">Email</th>
                                            <th class="hidden-phone">Points</th>
                                            <th class="hidden-phone">Joined</th>
                                            <th class="hidden-phone"></th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                    <tr class="odd gradeX">
                                        <td><input type="checkbox" class="checkboxes" value="1" /></td>
                                        <td>shuxer</td>
                                        <td class="hidden-phone"><a href="mailto:shuxer@gmail.com">shuxer@gmail.com</a></td>
                                        <td class="hidden-phone">120</td>
                                        <td class="center hidden-phone">12 Jan 2012</td>
                                        <td class="hidden-phone"><span class="label label-success">Approved</span></td>
                                    </tr>
                                    <tr class="odd gradeX">
                                        <td><input type="checkbox" class="checkboxes" value="1" /></td>
                                        <td>looper</td>
                                        <td class="hidden-phone"><a href="mailto:looper90@gmail.com">looper90@gmail.com</a></td>
                                        <td class="hidden-phone">120</td>
                                        <td class="center hidden-phone">12.12.2011</td>
                                        <td class="hidden-phone"><span class="label label-warning">Suspended</span></td>
                                    </tr>
                                    <tr class="odd gradeX">
                                        <td><input type="checkbox" class="checkboxes" value="1" /></td>
                                        <td>userwow</td>
                                        <td class="hidden-phone"><a href="mailto:userwow@yahoo.com">userwow@yahoo.com</a></td>
                                        <td class="hidden-phone">20</td>
                                        <td class="center hidden-phone">12.12.2012</td>
                                        <td class="hidden-phone"><span class="label label-success">Approved</span></td>
                                    </tr>
                                    <tr class="odd gradeX">
                                        <td><input type="checkbox" class="checkboxes" value="1" /></td>
                                        <td>user1wow</td>
                                        <td class="hidden-phone"><a href="mailto:userwow@gmail.com">userwow@gmail.com</a></td>
                                        <td class="hidden-phone">20</td>
                                        <td class="center hidden-phone">12.12.2012</td>
                                        <td class="hidden-phone"><span class="label label-inverse">Blocked</span></td>
                                    </tr>
                                    <tr class="odd gradeX">
                                        <td><input type="checkbox" class="checkboxes" value="1" /></td>
                                        <td>restest</td>
                                        <td class="hidden-phone"><a href="mailto:userwow@gmail.com">test@gmail.com</a></td>
                                        <td class="hidden-phone">20</td>
                                        <td class="center hidden-phone">12.12.2012</td>
                                        <td class="hidden-phone"><span class="label label-success">Approved</span></td>
                                    </tr>
                                    <tr class="odd gradeX">
                                        <td><input type="checkbox" class="checkboxes" value="1" /></td>
                                        <td>foopl</td>
                                        <td class="hidden-phone"><a href="mailto:userwow@gmail.com">good@gmail.com</a></td>
                                        <td class="hidden-phone">20</td>
                                        <td class="center hidden-phone">19.11.2010</td>
                                        <td class="hidden-phone"><span class="label label-success">Approved</span></td>
                                    </tr>
                                    <tr class="odd gradeX">
                                        <td><input type="checkbox" class="checkboxes" value="1" /></td>
                                        <td>weep</td>
                                        <td class="hidden-phone"><a href="mailto:userwow@gmail.com">good@gmail.com</a></td>
                                        <td class="hidden-phone">20</td>
                                        <td class="center hidden-phone">19.11.2010</td>
                                        <td class="hidden-phone"><span class="label label-success">Approved</span></td>
                                    </tr>
                                    <tr class="odd gradeX">
                                        <td><input type="checkbox" class="checkboxes" value="1" /></td>
                                        <td>coop</td>
                                        <td class="hidden-phone"><a href="mailto:userwow@gmail.com">good@gmail.com</a></td>
                                        <td class="hidden-phone">20</td>
                                        <td class="center hidden-phone">19.11.2010</td>
                                        <td class="hidden-phone"><span class="label label-success">Approved</span></td>
                                    </tr>
                                    <tr class="odd gradeX">
                                        <td><input type="checkbox" class="checkboxes" value="1" /></td>
                                        <td>pppol</td>
                                        <td class="hidden-phone"><a href="mailto:userwow@gmail.com">good@gmail.com</a></td>
                                        <td class="hidden-phone">20</td>
                                        <td class="center hidden-phone">19.11.2010</td>
                                        <td class="hidden-phone"><span class="label label-success">Approved</span></td>
                                    </tr>
                                    <tr class="odd gradeX">
                                        <td><input type="checkbox" class="checkboxes" value="1" /></td>
                                        <td>test</td>
                                        <td class="hidden-phone"><a href="mailto:userwow@gmail.com">good@gmail.com</a></td>
                                        <td class="hidden-phone">20</td>
                                        <td class="center hidden-phone">19.11.2010</td>
                                        <td class="hidden-phone"><span class="label label-success">Approved</span></td>
                                    </tr>
                                    <tr class="odd gradeX">
                                        <td><input type="checkbox" class="checkboxes" value="1" /></td>
                                        <td>userwow</td>
                                        <td class="hidden-phone"><a href="mailto:userwow@gmail.com">userwow@gmail.com</a></td>
                                        <td class="hidden-phone">20</td>
                                        <td class="center hidden-phone">12.12.2012</td>
                                        <td class="hidden-phone"><span class="label label-inverse">Blocked</span></td>
                                    </tr>
                                    <tr class="odd gradeX">
                                        <td><input type="checkbox" class="checkboxes" value="1" /></td>
                                        <td>test</td>
                                        <td class="hidden-phone"><a href="mailto:userwow@gmail.com">test@gmail.com</a></td>
                                        <td class="hidden-phone">20</td>
                                        <td class="center hidden-phone">12.12.2012</td>
                                        <td class="hidden-phone"><span class="label label-success">Approved</span></td>
                                    </tr>
                                    <tr class="odd gradeX">
                                        <td><input type="checkbox" class="checkboxes" value="1" /></td>
                                        <td>goop</td>
                                        <td class="hidden-phone"><a href="mailto:userwow@gmail.com">good@gmail.com</a></td>
                                        <td class="hidden-phone">20</td>
                                        <td class="center hidden-phone">12.11.2010</td>
                                        <td class="hidden-phone"><span class="label label-success">Approved</span></td>
                                    </tr>
                                    <tr class="odd gradeX">
                                        <td><input type="checkbox" class="checkboxes" value="1" /></td>
                                        <td>weep</td>
                                        <td class="hidden-phone"><a href="mailto:userwow@gmail.com">good@gmail.com</a></td>
                                        <td class="hidden-phone">20</td>
                                        <td class="center hidden-phone">15.11.2011</td>
                                        <td class="hidden-phone"><span class="label label-inverse">Blocked</span></td>
                                    </tr>
                                    <tr class="odd gradeX">
                                        <td><input type="checkbox" class="checkboxes" value="1" /></td>
                                        <td>toopl</td>
                                        <td class="hidden-phone"><a href="mailto:userwow@gmail.com">good@gmail.com</a></td>
                                        <td class="hidden-phone">20</td>
                                        <td class="center hidden-phone">16.11.2010</td>
                                        <td class="hidden-phone"><span class="label label-success">Approved</span></td>
                                    </tr>
                                    <tr class="odd gradeX">
                                        <td><input type="checkbox" class="checkboxes" value="1" /></td>
                                        <td>userwow</td>
                                        <td class="hidden-phone"><a href="mailto:userwow@gmail.com">userwow@gmail.com</a></td>
                                        <td class="hidden-phone">20</td>
                                        <td class="center hidden-phone">9.12.2012</td>
                                        <td class="hidden-phone"><span class="label label-inverse">Blocked</span></td>
                                    </tr>
                                    <tr class="odd gradeX">
                                        <td><input type="checkbox" class="checkboxes" value="1" /></td>
                                        <td>tes21t</td>
                                        <td class="hidden-phone"><a href="mailto:userwow@gmail.com">test@gmail.com</a></td>
                                        <td class="hidden-phone">20</td>
                                        <td class="center hidden-phone">14.12.2012</td>
                                        <td class="hidden-phone"><span class="label label-success">Approved</span></td>
                                    </tr>
                                    <tr class="odd gradeX">
                                        <td><input type="checkbox" class="checkboxes" value="1" /></td>
                                        <td>fop</td>
                                        <td class="hidden-phone"><a href="mailto:userwow@gmail.com">good@gmail.com</a></td>
                                        <td class="hidden-phone">20</td>
                                        <td class="center hidden-phone">13.11.2010</td>
                                        <td class="hidden-phone"><span class="label label-warning">Suspended</span></td>
                                    </tr>
                                    <tr class="odd gradeX">
                                        <td><input type="checkbox" class="checkboxes" value="1" /></td>
                                        <td>kop</td>
                                        <td class="hidden-phone"><a href="mailto:userwow@gmail.com">good@gmail.com</a></td>
                                        <td class="hidden-phone">20</td>
                                        <td class="center hidden-phone">17.11.2010</td>
                                        <td class="hidden-phone"><span class="label label-success">Approved</span></td>
                                    </tr>
                                    <tr class="odd gradeX">
                                        <td><input type="checkbox" class="checkboxes" value="1" /></td>
                                        <td>vopl</td>
                                        <td class="hidden-phone"><a href="mailto:userwow@gmail.com">good@gmail.com</a></td>
                                        <td class="hidden-phone">20</td>
                                        <td class="center hidden-phone">19.11.2010</td>
                                        <td class="hidden-phone"><span class="label label-success">Approved</span></td>
                                    </tr>
                                    <tr class="odd gradeX">
                                        <td><input type="checkbox" class="checkboxes" value="1" /></td>
                                        <td>userwow</td>
                                        <td class="hidden-phone"><a href="mailto:userwow@gmail.com">userwow@gmail.com</a></td>
                                        <td class="hidden-phone">20</td>
                                        <td class="center hidden-phone">12.12.2012</td>
                                        <td class="hidden-phone"><span class="label label-inverse">Blocked</span></td>
                                    </tr>
                                    <tr class="odd gradeX">
                                        <td><input type="checkbox" class="checkboxes" value="1" /></td>
                                        <td>wap</td>
                                        <td class="hidden-phone"><a href="mailto:userwow@gmail.com">test@gmail.com</a></td>
                                        <td class="hidden-phone">20</td>
                                        <td class="center hidden-phone">12.12.2012</td>
                                        <td class="hidden-phone"><span class="label label-success">Approved</span></td>
                                    </tr>
                                    <tr class="odd gradeX">
                                        <td><input type="checkbox" class="checkboxes" value="1" /></td>
                                        <td>test</td>
                                        <td class="hidden-phone"><a href="mailto:userwow@gmail.com">good@gmail.com</a></td>
                                        <td class="hidden-phone">20</td>
                                        <td class="center hidden-phone">19.12.2010</td>
                                        <td class="hidden-phone"><span class="label label-success">Approved</span></td>
                                    </tr>
                                    <tr class="odd gradeX">
                                        <td><input type="checkbox" class="checkboxes" value="1" /></td>
                                        <td>toop</td>
                                        <td class="hidden-phone"><a href="mailto:userwow@gmail.com">good@gmail.com</a></td>
                                        <td class="hidden-phone">20</td>
                                        <td class="center hidden-phone">17.12.2010</td>
                                        <td class="hidden-phone"><span class="label label-success">Approved</span></td>
                                    </tr>
                                    <tr class="odd gradeX">
                                        <td><input type="checkbox" class="checkboxes" value="1" /></td>
                                        <td>weep</td>
                                        <td class="hidden-phone"><a href="mailto:userwow@gmail.com">good@gmail.com</a></td>
                                        <td class="hidden-phone">20</td>
                                        <td class="center hidden-phone">15.11.2011</td>
                                        <td class="hidden-phone"><span class="label label-success">Approved</span></td>
                                    </tr>
                                    </tbody>
                                    </table>
                                </div>
                            </div>
                            <!-- END EXAMPLE TABLE widget-->
                        </div>
                    </div>


					<div class="row-fluid">
						<div class="span7 responsive" data-tablet="span7 fix-margin" data-desktop="span7">
							<!-- BEGIN CALENDAR PORTLET-->
							<div class="widget">
								<div class="widget-title">
									<h4><i class="icon-calendar"></i> Calendar</h4>
									<span class="tools">
									<a href="javascript:;" class="icon-chevron-down"></a>
									<a href="javascript:;" class="icon-remove"></a>
									</span>
								</div>
								<div class="widget-body">
									<div id="calendar" class="has-toolbar"></div>
								</div>
							</div>
							<!-- END CALENDAR PORTLET-->
						</div>
                        <div class="span5">
                            <!-- BEGIN PROGRESS BARS PORTLET-->
                            <div class="widget">
                                <div class="widget-title">
                                    <h4><i class="icon-reorder"></i> Progress Bars</h4>
                                        <span class="tools">
                                        <a href="javascript:;" class="icon-chevron-down"></a>
                                        <a href="javascript:;" class="icon-remove"></a>
                                        </span>
                                </div>
                                <div class="widget-body">
                                    <span class="fc-header-title"><h2>Basic</h2></span>
                                    <div class="progress">
                                        <div style="width: 40%;" class="bar"></div>
                                    </div>
                                    <div class="progress progress-success">
                                        <div style="width: 60%;" class="bar"></div>
                                    </div>
                                    <div class="progress progress-warning">
                                        <div style="width: 80%;" class="bar"></div>
                                    </div>
                                    <div class="progress progress-danger">
                                        <div style="width: 45%;" class="bar"></div>
                                    </div>

                                </div>
                            </div>
                            <!-- END PROGRESS BARS PORTLET-->
                            <!-- BEGIN ALERTS PORTLET-->
                            <div class="widget">
                                <div class="widget-title">
                                    <h4><i class="icon-bell-alt"></i> Alerts</h4>
									<span class="tools">
									<a href="javascript:;" class="icon-chevron-down"></a>
									<a href="javascript:;" class="icon-remove"></a>
									</span>
                                </div>
                                <div class="widget-body">
                                    <div class="alert">
                                        <button class="close" data-dismiss="alert">×</button>
                                        <strong>Warning!</strong> Your monthly traffic is reaching limit.
                                    </div>
                                    <div class="alert alert-success">
                                        <button class="close" data-dismiss="alert">×</button>
                                        <strong>Success!</strong> The page has been added.
                                    </div>
                                    <div class="alert alert-info">
                                        <button class="close" data-dismiss="alert">×</button>
                                        <strong>Info!</strong> You have 198 unread messages.
                                    </div>
                                    <div class="alert alert-error">
                                        <button class="close" data-dismiss="alert">×</button>
                                        <strong>Error!</strong> The daily cronjob has failed.
                                    </div>
                                </div>
                            </div>
                            <!-- END ALERTS PORTLET-->
                        </div>
					</div>
				</div>
				<!-- END PAGE CONTENT-->
			</div>
			<!-- END PAGE CONTAINER-->
<!-- 引入图表js-->
<@p.flotjs/>
