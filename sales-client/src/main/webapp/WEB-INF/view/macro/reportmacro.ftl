<!-- 收入报表 -->
<#macro salesReport>
	 <div class="flot-chart dashboard-chart">
        <div class="flot-chart-content" id="flot-dashboard-chart"></div>
    </div>
    <div class="row text-left">
        <div class="col-xs-4">
            <div class=" m-l-md">
            <span class="h4 font-bold m-t block">$ 406,100</span>
            <small class="text-muted m-b block">销售市场营销报告</small>
            </div>
        </div>
        <div class="col-xs-4">
            <span class="h4 font-bold m-t block">$ 150,401</span>
            <small class="text-muted m-b block">年度销售收入</small>
        </div>
        <div class="col-xs-4">
            <span class="h4 font-bold m-t block">$ 16,822</span>
            <small class="text-muted m-b block">半年收入利润率</small>
        </div>
    </div>
</#macro>

<!-- 成交报表 -->
<#macro dealReport>
<div class="ibox float-e-margins">
                            <div class="ibox-title">
                                <h5>成交统计</h5>
                                <div class="pull-right">
                                    <div class="btn-group">
                                        <button type="button" class="btn btn-xs btn-white active">今天</button>
                                        <button type="button" class="btn btn-xs btn-white">本月</button>
                                        <button type="button" class="btn btn-xs btn-white">年度</button>
                                    </div>
                                </div>
                            </div>
                            <div class="ibox-content">
                                <div class="row">
                                <div class="col-lg-9">
                                    <div class="flot-chart">
                                        <div class="flot-chart-content" id="flot-dashboard-chartmy"></div>
                                    </div>
                                </div>
                                <div class="col-lg-3">
                                    <ul class="stat-list">
                                        <li>
                                            <h2 class="no-margins">2,346</h2>
                                            <small>Total orders in period</small>
                                            <div class="stat-percent">48% <i class="fa fa-level-up text-navy"></i></div>
                                            <div class="progress progress-mini">
                                                <div style="width: 48%;" class="progress-bar"></div>
                                            </div>
                                        </li>
                                        <li>
                                            <h2 class="no-margins ">4,422</h2>
                                            <small>Orders in last month</small>
                                            <div class="stat-percent">60% <i class="fa fa-level-down text-navy"></i></div>
                                            <div class="progress progress-mini">
                                                <div style="width: 60%;" class="progress-bar"></div>
                                            </div>
                                        </li>
                                        <li>
                                            <h2 class="no-margins ">9,180</h2>
                                            <small>Monthly income from orders</small>
                                            <div class="stat-percent">22% <i class="fa fa-bolt text-navy"></i></div>
                                            <div class="progress progress-mini">
                                                <div style="width: 22%;" class="progress-bar"></div>
                                            </div>
                                        </li>
                                        </ul>
                                    </div>
                                </div>
                                </div>

                            </div>
</#macro>

<!-- 新增报表 -->
<#macro newaddReport>
				<div class="col-sm-3">
                        <div class="ibox float-e-margins">
                            <div class="ibox-title">
                                <span class="label label-success pull-right">九月份</span>
                                <h5>新增客户</h5>
                            </div>
                            <div class="ibox-content">
                                <h1 class="no-margins">1200</h1>
                                <div class="stat-percent font-bold text-success">98% <i class="fa fa-bolt"></i></div>
                                <small>新增总数</small>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-3">
                        <div class="ibox float-e-margins">
                            <div class="ibox-title">
                                <span class="label label-info pull-right">九月份</span>
                                <h5>新曾委托</h5>
                            </div>
                            <div class="ibox-content">
                                <h1 class="no-margins">275,800</h1>
                                <div class="stat-percent font-bold text-info">20% <i class="fa fa-level-up"></i></div>
                                <small>新曾委托</small>
                            </div>
                        </div>
                    </div>
                     <div class="col-sm-3">
                        <div class="ibox float-e-margins">
                            <div class="ibox-title">
                                <span class="label label-info pull-right">九月份</span>
                                <h5>新曾委托</h5>
                            </div>
                            <div class="ibox-content">
                                <h1 class="no-margins">275,800</h1>
                                <div class="stat-percent font-bold text-info">20% <i class="fa fa-level-up"></i></div>
                                <small>新曾委托</small>
                            </div>
                        </div>
                    </div>
                     <div class="col-sm-3">
                        <div class="ibox float-e-margins">
                            <div class="ibox-title">
                                <span class="label label-info pull-right">九月份</span>
                                <h5>新曾委托</h5>
                            </div>
                            <div class="ibox-content">
                                <h1 class="no-margins">275,800</h1>
                                <div class="stat-percent font-bold text-info">20% <i class="fa fa-level-up"></i></div>
                                <small>新曾委托</small>
                            </div>
                        </div>
                    </div>

</#macro>
