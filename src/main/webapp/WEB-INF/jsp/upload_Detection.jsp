<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme() + "://"
          + request.getServerName() + ":" + request.getServerPort()
          + path + "/";
%>
<!DOCTYPE html>
<html class="loading" lang="en" data-textdirection="">
<head>
  <base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimal-ui">
<meta name="description" content="Modern admin is super flexible, powerful, clean &amp; modern responsive bootstrap 4 admin template with unlimited possibilities with bitcoin dashboard.">
<meta name="keywords" content="admin template, modern admin template, dashboard template, flat admin template, responsive admin template, web app, crypto dashboard, bitcoin dashboard">
<meta name="author" content="PIXINVENT">
<title>联盟链管理与监控平台-检测检验数据上传</title>
<link rel="apple-touch-icon" href="statics/images/ico/apple-icon-120.png">
<link rel="shortcut icon" type="image/x-icon" href="statics/images/ico/favicon.ico">
<link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Quicksand:300,400,500,700"
  rel="stylesheet">
<link href="https://maxcdn.icons8.com/fonts/line-awesome/1.1/css/line-awesome.min.css"
  rel="stylesheet">
<!-- BEGIN VENDOR CSS-->
<link rel="stylesheet" type="text/css" href="statics/css/vendors.css">
<link rel="stylesheet" type="text/css" href="statics/vendors/css/tables/jsgrid/jsgrid-theme.min.css">
<link rel="stylesheet" type="text/css" href="statics/vendors/css/tables/jsgrid/jsgrid.min.css">
<!-- END VENDOR CSS-->
<!-- BEGIN MODERN CSS-->
<link rel="stylesheet" type="text/css" href="statics/css/app.css">
<!-- END MODERN CSS-->
<!-- BEGIN Page Level CSS-->
<link rel="stylesheet" type="text/css" href="statics/css/core/menu/menu-types/vertical-menu.css">
<link rel="stylesheet" type="text/css" href="statics/css/core/colors/palette-gradient.css">
<!-- END Page Level CSS-->
<!-- BEGIN Custom CSS-->
<link rel="stylesheet" type="text/css" href="statics/css/style.css">
<!-- END Custom CSS-->
 <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Quicksand:300,400,500,700"
  rel="stylesheet">
  <link href="https://maxcdn.icons8.com/fonts/line-awesome/1.1/css/line-awesome.min.css"
  rel="stylesheet">
  <!-- BEGIN VENDOR CSS-->
  <link rel="stylesheet" type="text/css" href="statics/css/vendors.css">
  <link rel="stylesheet" type="text/css" href="statics/vendors/css/ui/jquery-ui.min.css">
  <!-- END VENDOR CSS-->
  <!-- BEGIN MODERN CSS-->
  <link rel="stylesheet" type="text/css" href="statics/css/app.css">
  <!-- END MODERN CSS-->
  <!-- BEGIN Page Level CSS-->
  <link rel="stylesheet" type="text/css" href="statics/css/core/menu/menu-types/vertical-menu.css">
  <link rel="stylesheet" type="text/css" href="statics/css/core/colors/palette-gradient.css">
  <link rel="stylesheet" type="text/css" href="statics/css/plugins/ui/jqueryui.css">
  <!-- END Page Level CSS-->
  <!-- BEGIN Custom CSS-->
  <link rel="stylesheet" type="text/css" href="statics/css/style.css">
  <!-- END Custom CSS-->
<style type="text/css">
body {
	font-family:microsoft yahei!important;
}
@media (min-width: 768px)
.col-md-3 {
    flex: 0 0 25%;
    max-width:18%;
}
.col-md-3 {
    flex: 0 0 25%;
    max-width:19%;
}
.label-control{ line-height:34px;}


</style>
</head>
<body class="vertical-layout vertical-menu 2-columns   menu-expanded fixed-navbar"
data-open="click" data-menu="vertical-menu" data-col="2-columns">
<!-- fixed-top-->
<nav class="header-navbar navbar-expand-md navbar navbar-with-menu navbar-without-dd-arrow fixed-top navbar-semi-light bg-info navbar-shadow">
  <div class="navbar-wrapper">
    <div class="navbar-header">
      <ul class="nav navbar-nav flex-row">
        <li class="nav-item mobile-menu d-md-none mr-auto"><a class="nav-link nav-menu-main menu-toggle hidden-xs" href="#"><i class="ft-menu font-large-1"></i></a></li>
        <li class="nav-item"> <a class="navbar-brand" href="index.jsp"> <img class="brand-logo" alt="modern admin logo" src="statics/images/logo/logo.png">
          <h3 class="brand-text" style="color:#fff!important;font-size:16px;">质量认证区块链平台</h3>
          </a> </li>
        <li class="nav-item d-md-none"> <a class="nav-link open-navbar-container" data-toggle="collapse" data-target="#navbar-mobile"><i class="la la-ellipsis-v"></i></a> </li>
      </ul>
    </div>
    <div class="navbar-container content">
      <div class="collapse navbar-collapse" id="navbar-mobile">
        <ul class="nav navbar-nav mr-auto float-left">
          <li class="nav-item d-none d-md-block"><a class="nav-link nav-menu-main menu-toggle hidden-xs" href="#"><i class="ft-menu"></i></a></li>
          <li class="nav-item d-none d-md-block"><a class="nav-link nav-link-expand" href="#"><i class="ficon ft-maximize"></i></a></li>
  
          <li class="nav-item nav-search"><a class="nav-link nav-link-search" href="search-page.jsp"><i class="ficon ft-search"></i></a>
            <div class="search-input">
              <input class="input" type="text" placeholder="Explore Modern...">
            </div>
          </li>
        </ul>
        <ul class="nav navbar-nav float-right">
          <li class="dropdown dropdown-user nav-item"> <a class="dropdown-toggle nav-link dropdown-user-link" href="#" data-toggle="dropdown"> <span class="mr-1">您好, <span class="user-name text-bold-700">丁二宝</span> </span> <span class="avatar avatar-online"> <img src="statics/images/portrait/small/me.png" alt="avatar"><i></i></span> </a>
            <div class="dropdown-menu dropdown-menu-right"><a class="dropdown-item" href="#"><i class="ft-user"></i>个人信息</a> <a class="dropdown-item" href="#"><i class="ft-mail"></i> 个人信息</a> <a class="dropdown-item" href="#"><i class="ft-check-square"></i>个人信息</a> <a class="dropdown-item" href="#"><i class="ft-message-square"></i> 个人信息</a>
              <div class="dropdown-divider"></div>
              <a class="dropdown-item" href="#"><i class="ft-power"></i> 退 出</a> </div>
          </li>
          <li class="dropdown dropdown-notification nav-item"> <a class="nav-link nav-link-label" href="#" data-toggle="dropdown"><i class="ficon ft-bell"></i> <span class="badge badge-pill badge-default badge-danger badge-default badge-up badge-glow">5</span> </a>
            <ul class="dropdown-menu dropdown-menu-media dropdown-menu-right">
              <li class="dropdown-menu-header">
                <h6 class="dropdown-header m-0"> <span class="grey darken-2">Notifications</span> </h6>
                <span class="notification-tag badge badge-default badge-danger float-right m-0">5 New</span> </li>
              <li class="scrollable-container media-list w-100"> <a href="javascript:void(0)">
                <div class="media">
                  <div class="media-left align-self-center"><i class="ft-plus-square icon-bg-circle bg-cyan"></i></div>
                  <div class="media-body">
                    <h6 class="media-heading">You have new order!</h6>
                    <p class="notification-text font-small-3 text-muted">Lorem ipsum dolor sit amet, consectetuer elit.</p>
                    <small>
                    <time class="media-meta text-muted" datetime="2015-06-11T18:29:20+08:00">30 minutes ago</time>
                    </small> </div>
                </div>
                </a> <a href="javascript:void(0)">
                <div class="media">
                  <div class="media-left align-self-center"><i class="ft-download-cloud icon-bg-circle bg-red bg-darken-1"></i></div>
                  <div class="media-body">
                    <h6 class="media-heading red darken-1">99% Server load</h6>
                    <p class="notification-text font-small-3 text-muted">Aliquam tincidunt mauris eu risus.</p>
                    <small>
                    <time class="media-meta text-muted" datetime="2015-06-11T18:29:20+08:00">Five hour ago</time>
                    </small> </div>
                </div>
                </a> <a href="javascript:void(0)">
                <div class="media">
                  <div class="media-left align-self-center"><i class="ft-alert-triangle icon-bg-circle bg-yellow bg-darken-3"></i></div>
                  <div class="media-body">
                    <h6 class="media-heading yellow darken-3">Warning notifixation</h6>
                    <p class="notification-text font-small-3 text-muted">Vestibulum auctor dapibus neque.</p>
                    <small>
                    <time class="media-meta text-muted" datetime="2015-06-11T18:29:20+08:00">Today</time>
                    </small> </div>
                </div>
                </a> <a href="javascript:void(0)">
                <div class="media">
                  <div class="media-left align-self-center"><i class="ft-check-circle icon-bg-circle bg-cyan"></i></div>
                  <div class="media-body">
                    <h6 class="media-heading">Complete the task</h6>
                    <small>
                    <time class="media-meta text-muted" datetime="2015-06-11T18:29:20+08:00">Last week</time>
                    </small> </div>
                </div>
                </a> <a href="javascript:void(0)">
                <div class="media">
                  <div class="media-left align-self-center"><i class="ft-file icon-bg-circle bg-teal"></i></div>
                  <div class="media-body">
                    <h6 class="media-heading">Generate monthly report</h6>
                    <small>
                    <time class="media-meta text-muted" datetime="2015-06-11T18:29:20+08:00">Last month</time>
                    </small> </div>
                </div>
                </a> </li>
              <li class="dropdown-menu-footer"><a class="dropdown-item text-muted text-center" href="javascript:void(0)">Read all notifications</a></li>
            </ul>
          </li>
          <li class="dropdown dropdown-notification nav-item"> <a class="nav-link nav-link-label" href="#" data-toggle="dropdown"><i class="ficon ft-mail"> </i></a>
            <ul class="dropdown-menu dropdown-menu-media dropdown-menu-right">
              <li class="dropdown-menu-header">
                <h6 class="dropdown-header m-0"> <span class="grey darken-2">Messages</span> </h6>
                <span class="notification-tag badge badge-default badge-warning float-right m-0">4 New</span> </li>
              <li class="scrollable-container media-list w-100"> <a href="javascript:void(0)">
                <div class="media">
                  <div class="media-left"> <span class="avatar avatar-sm avatar-online rounded-circle"> <img src="statics/images/portrait/small/avatar-s-19.png" alt="avatar"><i></i></span> </div>
                  <div class="media-body">
                    <h6 class="media-heading">Margaret Govan</h6>
                    <p class="notification-text font-small-3 text-muted">I like your portfolio, let's start.</p>
                    <small>
                    <time class="media-meta text-muted" datetime="2015-06-11T18:29:20+08:00">Today</time>
                    </small> </div>
                </div>
                </a> <a href="javascript:void(0)">
                <div class="media">
                  <div class="media-left"> <span class="avatar avatar-sm avatar-busy rounded-circle"> <img src="statics/images/portrait/small/avatar-s-2.png" alt="avatar"><i></i></span> </div>
                  <div class="media-body">
                    <h6 class="media-heading">Bret Lezama</h6>
                    <p class="notification-text font-small-3 text-muted">I have seen your work, there is</p>
                    <small>
                    <time class="media-meta text-muted" datetime="2015-06-11T18:29:20+08:00">Tuesday</time>
                    </small> </div>
                </div>
                </a> <a href="javascript:void(0)">
                <div class="media">
                  <div class="media-left"> <span class="avatar avatar-sm avatar-online rounded-circle"> <img src="statics/images/portrait/small/avatar-s-3.png" alt="avatar"><i></i></span> </div>
                  <div class="media-body">
                    <h6 class="media-heading">Carie Berra</h6>
                    <p class="notification-text font-small-3 text-muted">Can we have call in this week ?</p>
                    <small>
                    <time class="media-meta text-muted" datetime="2015-06-11T18:29:20+08:00">Friday</time>
                    </small> </div>
                </div>
                </a> <a href="javascript:void(0)">
                <div class="media">
                  <div class="media-left"> <span class="avatar avatar-sm avatar-away rounded-circle"> <img src="statics/images/portrait/small/avatar-s-6.png" alt="avatar"><i></i></span> </div>
                  <div class="media-body">
                    <h6 class="media-heading">Eric Alsobrook</h6>
                    <p class="notification-text font-small-3 text-muted">We have project party this saturday.</p>
                    <small>
                    <time class="media-meta text-muted" datetime="2015-06-11T18:29:20+08:00">last month</time>
                    </small> </div>
                </div>
                </a> </li>
              <li class="dropdown-menu-footer"><a class="dropdown-item text-muted text-center" href="javascript:void(0)">Read all messages</a></li>
            </ul>
          </li>
        </ul>
      </div>
    </div>
  </div>
</nav>
<div class="main-menu menu-fixed menu-dark menu-accordion    menu-shadow " data-scroll-to-active="true">
  <div class="main-menu-content">
<ul class="navigation navigation-main" id="main-menu-navigation" data-menu="menu-navigation" style="font-family:microsoft yahei;">
<li class="nav-item"><a href="Request_list.jsp"><i class="la la-home"></i><span class="menu-title" data-i18n="nav.dash.main">用户审核


</span></a>
        
      </li>
      <li class=" nav-item"><a href="#"><i class="la la-television"></i><span class="menu-title" data-i18n="nav.templates.main">用户维护</span></a>
         <ul class="menu-content">         
         <li><a class="menu-item" href="revise-password.jsp" data-i18n="">密码修改</a> </li>
         <li><a class="menu-item" href="recover-password.jsp" data-i18n="">忘记密码</a> </li>
        </ul>
      </li>
       <li class=" nav-item"><a href="#"><i class="la la-television"></i><span class="menu-title" data-i18n="nav.templates.main">用户注销</span></a>
         <ul class="menu-content">         
         <li></li>
          
        </ul>
      </li>
   
      
      
      
   
      <li class="nav-item"><a href="#"><i class="la la-columns"></i><span class="menu-title" data-i18n="nav.page_layouts.main">证书下载</span></a>
        <ul class="menu-content">
          <li><a class="menu-item" href="Certificate_download.jsp" data-i18n="">证书下载</a> </li>
          <li><a class="menu-item" href="#" data-i18n="">证书管理</a> </li>
            
         
         
         
        </ul>
      </li>
      <li class=" nav-item"><a href="#"><i class="la la-navicon"></i><span class="menu-title" data-i18n="nav.navbars.main">数据上传
</span></a>
        <ul class="menu-content">
          <li><a class="menu-item" href="#" data-i18n="nav.navbars.nav_light">认证数据上传</a>
          <ul class="menu-content">
              <li><a class="menu-item" href="upload_Certificate_Application.jsp" data-i18n=""> 证书申请资料上传</a> </li>
              <li><a class="menu-item" href="upload_Document_audit_Application.jsp" data-i18n="">文件审核资料上传</a> </li>
              <li><a class="menu-item" href="upload_Site_audit.jsp" data-i18n="">现场审核资料上传</a> </li>
              <li><a class="menu-item" href="upload_Certificate_data.jsp" data-i18n="">证书数据上传</a> </li>
              
            </ul>
           </li>
           
           
         <li><a class="menu-item" href="" data-i18n="">检测检验数据上传</a>
          <ul class="menu-content">
              <li class="active"><a class="menu-item" href="upload_Detection.jsp" data-i18n=""> 检测检验上传</a> </li>
              <li><a class="menu-item" href="upload_test_run.jsp" data-i18n="">试运行数据上传</a> </li>
             
              
            </ul>
           </li>  
           
           
           
          
         <li><a class="menu-item" href="" data-i18n="">监管数据上传</a>
          <ul class="menu-content">
              <li> </li>
             
              
            </ul>
           </li>       
           
           
           
           
           
        </ul>
      </li>
      <li class="nav-item"><a href="#"><i class="la la-arrows-v"></i><span class="menu-title" data-i18n="nav.vertical_nav.main">数据校验</span></a>
        <ul class="menu-content">
          <li><a class="menu-item" href="#" data-i18n="">用户权限校验</a>
            
          </li>
          <li class="nav-item"><a class="menu-item" href="" data-i18n="">数据完整性、保密性校验</a> </li>
         
        </ul>
      </li>
      <li class=" nav-item"><a href="search-page.jsp"><i class="la la-arrows-h"></i><span class="menu-title" data-i18n="nav.horz_nav.main">数据查询</span></a> </li>
      <li class="nav-item"><a href="#"><i class="la la-header"></i><span class="menu-title" data-i18n="nav.page_headers.main">平台监控</span></a>
        <ul class="menu-content">
          <li><a class="menu-item" href="" data-i18n="">综合监控</a> </li>
          <li><a class="menu-item" href="" data-i18n="">节点状态监控</a> </li>
          <li><a class="menu-item" href="" data-i18n="">区块信息监控</a> </li>
          <li><a class="menu-item" href="" data-i18n="">交易信息实时监控</a> </li>        
          
          
        
        </ul>
      </li>
    </ul>
  </div>
</div>
<div class="app-content content">
  <div class="content-wrapper">
    <div class="content-header row">
      <div class="content-header-left col-md-6 col-12 mb-2">
        <div class="row breadcrumbs-top">
          <div class="breadcrumb-wrapper col-12">
            <ol class="breadcrumb" style="font-family:microsoft yahei;">
              <li class="breadcrumb-item"><a href="index.jsp">首页</a> </li>
              <li class="breadcrumb-item"><a href="index.jsp">数据上传</a> </li>
              <li class="breadcrumb-item"><a href="index.jsp">检测检验数据上传</a> </li>
              <li class="breadcrumb-item">检测检验数据上传</li>
              
              
              
              
            </ol>
          </div>
        </div>
      </div>
    </div>
    <div class="content-body"> 
      
      <!-- 证书数据上传 start -->
      <section id="sorting-scenario">
        <div class="row">
            <div class="col-md-12">
              <div class="card">
                <div class="card-header">
                  <h4 class="card-title" id="horz-layout-icons" style="margin:20px 0 0 20px; font-family:microsoft yahei;">检测检验数据上传</h4>
                  <a class="heading-elements-toggle"><i class="la la-ellipsis-v font-medium-3"></i></a>
                  <div class="heading-elements">
                    <ul class="list-inline mb-0">
                      <li><a data-action="collapse"><i class="ft-minus"></i></a></li>
                      <li><a data-action="reload"><i class="ft-rotate-cw"></i></a></li>
                      <li><a data-action="expand"><i class="ft-maximize"></i></a></li>
                      <li><a data-action="close"><i class="ft-x"></i></a></li>
                    </ul>
                  </div>
                </div>
                <div class="card-content collpase show" style="padding-bottom:4rem;">
                  <div class="card-body">
                    <div class="card-text">
                      <p></p>
                    </div>
                    <form:form class="form form-horizontal" method="post" action="/uploadDetectionData" modelAttribute="detectionData">
                      <div class="form-body">
                        <div class="form-group row">
                          <label class="col-md-3 label-control" for="timesheetinput1">委托人单位编号</label>
                          <div class="col-md-9">
                            <div class="position-relative has-icon-left">
                              <form:input type="text" id="unitID" class="form-control" placeholder="委托人单位编号"
                              name="委托人单位编号" path="agencyManNum"/>
                              <div class="form-control-position">
                                <i class="ft-edit"></i>
                              </div>
                            </div>
                          </div>
                        </div>
                        <div class="form-group row">
                          <label class="col-md-3 label-control" for="timesheetinput2">委托人单位名称</label>
                          <div class="col-md-9">
                            <div class="position-relative has-icon-left">
                              <form:input type="text" id="unitName" class="form-control" placeholder="委托人单位名称" name="委托人单位名称" path="agencyManName"/>
                              <div class="form-control-position">
                                <i class="la la-briefcase"></i>
                              </div>
                            </div>
                          </div>
                        </div>
                        
                        
                        
                       
                        
                        <div class="form-group row">
                          <label class="col-md-3 label-control">交易平台名称</label>
                          <div class="col-md-9">
                            <div class="position-relative has-icon-left">
                              <form:input type="text" id="platformName" class="form-control" placeholder="交易平台名称"
                              name="交易平台名称" path="tradePlateformName"/>
                              <div class="form-control-position">
                                <i class="ft-pie-chart"></i>
                              </div>
                            </div>
                          </div>
                        </div>
                        
                       
                        
                        <div class="form-group row">
                          <label class="col-md-3 label-control">交易平台版本</label>
                          <div class="col-md-9">
                            <div class="position-relative has-icon-left">
                              <form:input type="text" id="conclusion" class="form-control" placeholder="交易平台版本"
                              name="交易平台版本" path="getTradePlateformVersion"/>
                              <div class="form-control-position">
                                <i class="ft-minus-square"></i>
                              </div>
                            </div>
                          </div>
                        </div>
                         <div class="form-group row">
                          <label class="col-md-3 label-control">检测机构编号</label>
                          <div class="col-md-9">
                            <div class="position-relative has-icon-left">
                              <form:input type="text" id="testUnitID" class="form-control" placeholder="检测机构编号"
                              name="检测机构编号" path="checkAgencyNum"/>
                              <div class="form-control-position">
                                <i class="ft-map-pin"></i>
                              </div>
                            </div>
                          </div>
                        </div>
                          
                        <div class="form-group row">
                          <label class="col-md-3 label-control">检测机构名称</label>
                          <div class="col-md-9">
                            <div class="position-relative has-icon-left">
                              <form:input type="text" id="unitName" class="form-control" placeholder="检测机构名称"
                              name="检测机构名称" path="checkAgencyName"/>
                              <div class="form-control-position">
                                <i class="ft-user"></i>
                              </div>
                            </div>
                          </div>
                        </div>
                        
                         <div class="form-group row">
                          <label class="col-md-3 label-control">检测报告结论</label>
                          <div class="col-md-9">
                            <div class="position-relative has-icon-left">
                              <form:input type="text" id="conclusion" class="form-control" placeholder="检测报告结论"
                              name="检测报告结论" path="checkResult"/>
                              <div class="form-control-position">
                                <i class="ft-edit-2"></i>
                              </div>
                            </div>
                          </div>
                        </div> 
                         
                         
                         
                         
                         
                         
                         
                         
                         
                         
                         <div class="form-group row">
                          <label class="col-md-3 label-control">检测时间</label>
                          <div class="col-md-9">
                            <div class="position-relative has-icon-left">
                               <form:input type="text" id="testTime" class="form-control dp-for-alternate"  placeholder="检测时间"
                              name="检测时间" path="checkTime"/>
                              <div class="form-control-position">
                                <i class="ft-clock"></i>
                              </div>
                            </div>
                          </div>
                        </div>
                         
                         
                        
                     
                     
                    </div>
                       
                       <div class="form-group row">
                          <label class="col-md-3 label-control" for="timesheetinput2">检测人证件号码</label>
                          <div class="col-md-9">
                            <div class="position-relative has-icon-left">
                              <form:input type="text" id="testingPersonID" class="form-control" placeholder="检测人证件号码" name="检测人证件号码" path="checkManId"/>
                              <div class="form-control-position">
                                <i class="la la-briefcase"></i>
                              </div>
                            </div>
                          </div>
                        </div>
                        
                        
                        
                        
                        <div class="form-group row">
                          <label class="col-md-3 label-control">检测人姓名</label>
                          <div class="col-md-9">
                            <div class="position-relative has-icon-left">
                              <form:input type="text" id="testingPersonName" class="form-control" placeholder="检测人姓名"
                              name="检测人姓名" path="checkManName"/>
                              <div class="form-control-position">
                                <i class="ft-user"></i>
                              </div>
                            </div>
                          </div>
                        </div>
                       
                       
              
                       
                          <div class="form-group row">
                          <label class="col-md-3 label-control">私钥加密后的数据摘要</label>
                          <div class="col-md-9">
                            <div class="position-relative has-icon-left">
                              <form:input type="text" id="encryptedSummary" class="form-control" placeholder="私钥加密后的数据摘要"
                              name="私钥加密后的数据摘要" path="privateKeyDataAbastrat"/>
                              <div class="form-control-position">
                                <i class="ft-layout"></i>
                              </div>
                            </div>
                          </div>
                        </div>  
                       
                       
                        
                        <div class="form-group row">
                          <label class="col-md-3 label-control">数据上传人证件号码</label>
                          <div class="col-md-9">
                            <div class="position-relative has-icon-left">
                              <form:input type="text" id="postPersonID" class="form-control" placeholder="数据上传人证件号码"
                              name="数据上传人证件号码" path="uploadManId"/>
                              <div class="form-control-position">
                                <i class="ft-credit-card"></i>
                              </div>
                            </div>
                          </div>
                        </div>
                        <div class="form-group row">
                          <label class="col-md-3 label-control">数据上传人证件姓名</label>
                          <div class="col-md-9">
                            <div class="position-relative has-icon-left">
                              <form:input type="text" id="postPersonName" class="form-control" placeholder="数据上传人证件姓名"
                              name="数据上传人证件姓名" path="getUploadManName"/>
                              <div class="form-control-position">
                                <i class="ft-user"></i>
                              </div>
                            </div>
                          </div>
                        </div>
                        

                        
                      </div>
                      <div class="form-actions right"> <input value="保存" type="submit" class="btn btn-primary mr-1" style="margin:0 0 0 214px;padding-left:40px; padding-right:40px;">

                        <button type="button" class="btn btn-warning" style="padding-left:40px; padding-right:40px;">
                           取 消
                        </button>
                     
                      </div>
                  </form:form>
                  </div>
                </div>
              </div>
            </div></section>
          </div>
      
      <!-- 文件审核资料上传 end --> 
      
    </div>
  </div>
</div>
<!-- ////////////////////////////////////////////////////////////////////////////-->
<footer class="footer footer-static footer-light navbar-border navbar-shadow">
  <p class="clearfix blue-grey lighten-2 text-sm-center mb-0 px-2"> <span class="float-md-left d-block d-md-inline-block">Copyright &copy; 2018 <a class="text-bold-800 grey darken-2" href="index.jsp"
        target="_blank">联盟链管理与监控平台 </a>, All rights reserved. </span> </p>
</footer>
<!-- BEGIN VENDOR JS--> 
<script src="statics/vendors/js/vendors.min.js" type="text/javascript"></script> 
<!-- BEGIN VENDOR JS--> 
<!-- BEGIN PAGE VENDOR JS--> 
<script src="statics/vendors/js/tables/jsgrid/jsgrid.min.js" type="text/javascript"></script> 
<script src="statics/vendors/js/tables/jsgrid/griddata.js" type="text/javascript"></script> 
<!-- END PAGE VENDOR JS--> 
<!-- BEGIN MODERN JS--> 
<script src="statics/js/core/app-menu.js" type="text/javascript"></script> 
<script src="statics/js/core/app.js" type="text/javascript"></script> 
<script src="statics/js/scripts/customizer.js" type="text/javascript"></script> 
<!-- END MODERN JS--> 
<!-- BEGIN PAGE LEVEL JS--> 
<script src="statics/js/scripts/tables/jsgrid/jsgrid.js" type="text/javascript"></script> 
<!-- END PAGE LEVEL JS-->

<!-- BEGIN VENDOR JS-->
  <script src="statics/vendors/js/vendors.min.js" type="text/javascript"></script>
  <!-- BEGIN VENDOR JS-->
  <!-- BEGIN PAGE VENDOR JS-->
  <script src="statics/js/core/libraries/jquery_ui/jquery-ui.min.js" type="text/javascript"></script>
  <!-- END PAGE VENDOR JS-->
  <!-- BEGIN MODERN JS-->
 <!-- <script src="statics/js/core/app-menu.js" type="text/javascript"></script>
  <script src="statics/js/core/app.js" type="text/javascript"></script>
  <script src="statics/js/scripts/customizer.js" type="text/javascript"></script>-->
  <!-- END MODERN JS-->
  <!-- BEGIN PAGE LEVEL JS-->
  <script src="statics/js/scripts/ui/jquery-ui/date-pickers.js" type="text/javascript"></script>
  <!-- END PAGE LEVEL JS-->
</body>
</html>