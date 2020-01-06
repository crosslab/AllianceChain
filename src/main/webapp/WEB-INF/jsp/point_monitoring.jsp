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
  <title>联盟链管理与监控平台-节点状态监控
  </title>
  <link rel="apple-touch-icon" href="statics/images/ico/apple-icon-120.png">
  <link rel="shortcut icon" type="image/x-icon" href="statics/images/ico/favicon.ico">
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Quicksand:300,400,500,700"
  rel="stylesheet">
  <link href="https://maxcdn.icons8.com/fonts/line-awesome/1.1/css/line-awesome.min.css"
  rel="stylesheet">
  <!-- BEGIN VENDOR CSS-->
  <link rel="stylesheet" type="text/css" href="statics/css/vendors.css">
  <!-- END VENDOR CSS-->
  <!-- BEGIN MODERN CSS-->
  <link rel="stylesheet" type="text/css" href="statics/css/app.css">
  <!-- END MODERN CSS-->
  <!-- BEGIN Page Level CSS-->
  <link rel="stylesheet" type="text/css" href="statics/css/core/menu/menu-types/vertical-menu.css">
  <link rel="stylesheet" type="text/css" href="statics/css/core/colors/palette-gradient.css">
  <link rel="stylesheet" type="text/css" href="statics/vendors/css/cryptocoins/cryptocoins.css">
  <!-- END Page Level CSS-->
  <!-- BEGIN Custom CSS-->
  <link rel="stylesheet" type="text/css" href="statics/css/style.css">
  <!-- END Custom CSS-->
  
  
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
<style type="text/css">
.col-xl-4 {flex: 0 0 25%; max-width:25%;}

.col-5 h4{font-size:14px!important; padding-left:10px;line-height:36px;width:160px;padding-top:6px; text-align:left;font-family:microsoft yahei;}
.col-5 h6{font-size:18px!important; padding-left:20px;line-height:36px;padding-top:6px;}

</style>
</head>
<body class="vertical-layout vertical-menu 2-columns   menu-expanded fixed-navbar"
data-open="click" data-menu="vertical-menu" data-col="2-columns">
  <!-- fixed-top-->
  <nav class="header-navbar navbar-expand-md navbar navbar-with-menu navbar-without-dd-arrow fixed-top navbar-semi-light bg-info navbar-shadow2">
    <div class="navbar-wrapper">
      <div class="navbar-header">
        <ul class="nav navbar-nav flex-row">
          <li class="nav-item mobile-menu d-md-none mr-auto"><a class="nav-link nav-menu-main menu-toggle hidden-xs" href="#"><i class="ft-menu font-large-1"></i></a></li>
          <li class="nav-item">
            <a class="navbar-brand" href="index.html">
              <img class="brand-logo" alt="modern admin logo" src="statics/images/logo/logo.png">
              <h3 class="brand-text" style="color:#fff!important;font-size:16px;">质量认证区块链平台</h3>
            </a>
          </li>
          <li class="nav-item d-md-none">
            <a class="nav-link open-navbar-container" data-toggle="collapse" data-target="#navbar-mobile"><i class="la la-ellipsis-v"></i></a>
          </li>
        </ul>
      </div>
      <div class="navbar-container content">
        <div class="collapse navbar-collapse" id="navbar-mobile">
          <ul class="nav navbar-nav mr-auto float-left">
            <li class="nav-item d-none d-md-block"><a class="nav-link nav-menu-main menu-toggle hidden-xs" href="#"><i class="ft-menu"></i></a></li>
            <li class="nav-item d-none d-md-block"><a class="nav-link nav-link-expand" href="#"><i class="ficon ft-maximize"></i></a></li>
        
            <li class="nav-item nav-search"><a class="nav-link nav-link-search" href="search-page.html"><i class="ficon ft-search"></i></a>
              <div class="search-input">
                <input class="input" type="text" placeholder="Explore Modern...">
              </div>
            </li>
          </ul>
          <ul class="nav navbar-nav float-right">
            <li class="dropdown dropdown-user nav-item">
              <a class="dropdown-toggle nav-link dropdown-user-link" href="#" data-toggle="dropdown">
                <span class="mr-1">您好,
                  <span class="user-name text-bold-700">丁**</span>
                </span>
                <span class="avatar avatar-online">
                  <img src="statics/images/portrait/small/me.png" alt="avatar"><i></i></span>
              </a>
              <div class="dropdown-menu dropdown-menu-right"><a class="dropdown-item" href="#"><i class="ft-user"></i>个人信息</a>
                <a class="dropdown-item" href="#"><i class="ft-mail"></i> 个人信息</a>
                <a class="dropdown-item" href="#"><i class="ft-check-square"></i>个人信息</a>
                <a class="dropdown-item" href="#"><i class="ft-message-square"></i> 个人信息</a>
                <div class="dropdown-divider"></div><a class="dropdown-item" href="#"><i class="ft-power"></i> 退 出</a>
              </div>
            </li>
            
            <li class="dropdown dropdown-notification nav-item">
              <a class="nav-link nav-link-label" href="#" data-toggle="dropdown"><i class="ficon ft-bell"></i>
                <span class="badge badge-pill badge-default badge-danger badge-default badge-up badge-glow">5</span>
              </a>
              
              <ul class="dropdown-menu dropdown-menu-media dropdown-menu-right">
              <li class="dropdown-menu-header">
                <h6 class="dropdown-header m-0"> <span class="grey darken-2">消息通知</span> </h6>
                <span class="notification-tag badge badge-default badge-danger float-right m-0">5</span> </li>
              <li class="scrollable-container media-list w-100"> <a href="javascript:void(0)">
                <div class="media">
                  <div class="media-left align-self-center" style="padding-right:0.4rem;"><i class="ft-file icon-bg-circle bg-cyan" style="font-size:16px; padding:0.4rem;font-weight:normal;"></i></div>
                  <div class="media-body">
                    <h6 class="media-heading">目前待审核的信息有5条</h6>
                     </div>
                </div>
                </a> <a href="javascript:void(0)">
                <div class="media">
                  <div class="media-left align-self-center" style="padding-right:0.4rem;"><i class="ft-file icon-bg-circle bg-cyan" style="font-size:16px; padding:0.4rem;font-weight:normal;"></i></div>
                  <div class="media-body">
                    <h6 class="media-heading red darken-1">姜**下载了一条证书</h6>
                    </div>
                </div>
                </a> <a href="javascript:void(0)">
                <div class="media">
                  <div class="media-left align-self-center" style="padding-right:0.4rem;"><i class="ft-file icon-bg-circle bg-cyan" style="font-size:16px; padding:0.4rem;font-weight:normal;"></i></div>
                  <div class="media-body">
                    <p class="notification-text font-small-3 text-muted">谭*下载了一条证书</p>
                    <small>
                    </small> </div>
                </div>
                </a> <a href="javascript:void(0)">
                <div class="media">
                  <div class="media-left align-self-center" style="padding-right:0.4rem;"><i class="ft-file icon-bg-circle bg-cyan" style="font-size:16px; padding:0.4rem;font-weight:normal;"></i></div>
                  <div class="media-body">
                    <h6 class="media-heading">张*更新了个人信息资料</h6>
                   </div>
                </div>
                </a> <a href="javascript:void(0)">
                <div class="media">
                  <div class="media-left align-self-center" style="padding-right:0.4rem;"><i class="ft-file icon-bg-circle bg-cyan" style="font-size:16px; padding:0.4rem;font-weight:normal;"></i></div>
                  <div class="media-body">
                    <h6 class="media-heading">高*新注册了个人资料</h6>
                   </div>
                </div>
                </a> </li>
              <li class="dropdown-menu-footer" style="font-size:12px;"><a class="dropdown-item text-muted text-center" href="javascript:void(0)" style="padding-top:10px;">查看所有消息通知</a></li>
            </ul>
            
            </li>
            
          </ul>
        </div>
      </div>
    </div>
  </nav>
  <!-- ////////////////////////////////////////////////////////////////////////////-->
  <div class="main-menu menu-fixed menu-dark menu-accordion    menu-shadow " data-scroll-to-active="true">
  <div class="main-menu-content">
<ul class="navigation navigation-main" id="main-menu-navigation" data-menu="menu-navigation" style="font-family:microsoft yahei;">
<li class="nav-item open"><a href="Request_list.html"><i class="la la-home"></i><span class="menu-title" data-i18n="nav.dash.main">用户审核


</span></a>
        
      </li>
      <li class=" nav-item"><a href="#"><i class="la la-television"></i><span class="menu-title" data-i18n="nav.templates.main">用户维护</span></a>
         <ul class="menu-content">         
         <li><a class="menu-item" href="revise-password.html" data-i18n="">密码修改</a> </li>
         <li><a class="menu-item" href="recover-password.html" data-i18n="">忘记密码</a> </li>
        </ul>
      </li>
      
   
      
      
      
   
      <li class="nav-item"><a href="#"><i class="la la-columns"></i><span class="menu-title" data-i18n="nav.page_layouts.main">证书下载</span></a>
        <ul class="menu-content">
          <li><a class="menu-item" href="Certificate_download.html" data-i18n="">证书下载</a> </li>
          
            
         
         
         
        </ul>
      </li>
      <li class=" nav-item"><a href="#"><i class="la la-navicon"></i><span class="menu-title" data-i18n="nav.navbars.main">数据上传
</span></a>
        <ul class="menu-content">
          <li><a class="menu-item" href="#" data-i18n="nav.navbars.nav_light">认证数据上传</a>
          <ul class="menu-content">
              <li><a class="menu-item" href="upload_Certificate_Application.html" data-i18n=""> 证书申请资料上传</a> </li>
              <li><a class="menu-item" href="upload_Document_audit_Application.html" data-i18n="">文件审核资料上传</a> </li>
              <li><a class="menu-item" href="upload_Site_audit.html" data-i18n="">现场审核资料上传</a> </li>
              <li><a class="menu-item" href="upload_Certificate_data.html" data-i18n="">证书数据上传</a> </li>
              
            </ul>
           </li>
           
           
         <li><a class="menu-item" href="" data-i18n="">检测检验数据上传</a>
          <ul class="menu-content">
              <li><a class="menu-item" href="upload_Detection.html" data-i18n=""> 检测检验上传</a> </li>
              <li><a class="menu-item" href="upload_test_run.html" data-i18n="">试运行数据上传</a> </li>
             
              
            </ul>
           </li>  
           
           
           
          
                
           
           
           
           
           
        </ul>
      </li>
    
      <li class=" nav-item"><a href="search-page.html"><i class="la la-arrows-h"></i><span class="menu-title" data-i18n="nav.horz_nav.main">数据查询</span></a> </li>
       <li class="nav-item"><a href="#"><i class="la la-header"></i><span class="menu-title" data-i18n="nav.page_headers.main">平台监控</span></a>
        <ul class="menu-content">
          <li><a class="menu-item" href="Integrated_monitoring.html" data-i18n="">综合监控</a> </li>
          <li class="active"><a class="menu-item" href="point_monitoring.html" data-i18n="">节点状态监控</a> </li>
          <li><a class="menu-item" href="block_monitoring.html" data-i18n="">区块信息监控</a> </li>
          <li><a class="menu-item" href="transactions_monitoring.html" data-i18n="">交易信息实时监控</a> </li>    
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
            <li class="breadcrumb-item"><a href="index.html">首页</a> </li>
            <li class="breadcrumb-item"><a href="index.html">平台监控</a> </li>
            <li class="breadcrumb-item">节点状态监控</li>
          </ol>
        </div>
      </div>
    </div>
  </div>
      <!-- Sorting scenario start -->
      <section id="sorting-scenario">
        <div class="row">
          <div class="col-12">
            <div class="card">
              <div class="card-header">
                <h4 class="card-title" style="margin:20px 0 0 20px; font-family:microsoft yahei;">节点状态监控列表</h4>
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
              <div class="card-content collapse show">
                <div class="card-body card-dashboard "> 
                  <!-- <p>Sorting can be done not only with column header interaction,
                      but also with sort method.</p>--> 
                  
                  <!-- <div id="sorting-table" class="js-shorting"></div>-->
                  
                  <div id="" class="js-shorting jsgrid" style="position: relative; height:600px; width: 100%;">
                    <div class="jsgrid-grid-header jsgrid-header-scrollbar">
                      <table class="jsgrid-table">
                        <tr class="jsgrid-header-row">
                          <th class="jsgrid-header-cell jsgrid-align-center" style="width: 50px;">Number</th>
                          <th class="jsgrid-header-cell jsgrid-align-center" style="width: 90px;">Number of  Tx</th>
                          <th class="jsgrid-header-cell jsgrid-align-center" style="width: 105px;">Data</th>
                          <th class="jsgrid-header-cell jsgrid-align-center" style="width: 105px;">Previous Hash</th>
                          <th class="jsgrid-header-cell jsgrid-align-center" style="width: 200px;">Transactions</th>
                        </tr>
                                 
                      </table>
                    </div>
                    <div class="jsgrid-grid-body" style="height: 463px;">
                      <table class="jsgrid-table">
                        <tbody>
                          <tr class="jsgrid-row">
                            <td class="jsgrid-cell jsgrid-align-center" style="width:50px;">01</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 90px;">1</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 105px;">datadtatufsg6e57</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 105px;">ywuen ueyetstsrvststvst</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 200px;"> datadtatufsg6e57</td>
                          </tr>
                           <tr class="jsgrid-alt-row">
                            <td class="jsgrid-cell jsgrid-align-center" style="width:50px;">01</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 90px;">1</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 105px;">datadtatufsg6e57</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 105px;">ywuen ueyetstsrvststvst</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 200px;"> datadtatufsg6e57</td>
                          </tr> 
						  
						  <tr class="jsgrid-row">
                            <td class="jsgrid-cell jsgrid-align-center" style="width:50px;">01</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 90px;">1</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 105px;">datadtatufsg6e57</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 105px;">ywuen ueyetstsrvststvst</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 200px;"> datadtatufsg6e57</td>
                          </tr>
                           <tr class="jsgrid-alt-row">
                            <td class="jsgrid-cell jsgrid-align-center" style="width:50px;">01</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 90px;">1</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 105px;">datadtatufsg6e57</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 105px;">ywuen ueyetstsrvststvst</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 200px;"> datadtatufsg6e57</td>
                          </tr> <tr class="jsgrid-row">
                            <td class="jsgrid-cell jsgrid-align-center" style="width:50px;">01</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 90px;">1</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 105px;">datadtatufsg6e57</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 105px;">ywuen ueyetstsrvststvst</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 200px;"> datadtatufsg6e57</td>
                          </tr>
                           <tr class="jsgrid-alt-row">
                            <td class="jsgrid-cell jsgrid-align-center" style="width:50px;">01</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 90px;">1</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 105px;">datadtatufsg6e57</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 105px;">ywuen ueyetstsrvststvst</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 200px;"> datadtatufsg6e57</td>
                          </tr> <tr class="jsgrid-row">
                            <td class="jsgrid-cell jsgrid-align-center" style="width:50px;">01</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 90px;">1</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 105px;">datadtatufsg6e57</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 105px;">ywuen ueyetstsrvststvst</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 200px;"> datadtatufsg6e57</td>
                          </tr>
                           <tr class="jsgrid-alt-row">
                            <td class="jsgrid-cell jsgrid-align-center" style="width:50px;">01</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 90px;">1</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 105px;">datadtatufsg6e57</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 105px;">ywuen ueyetstsrvststvst</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 200px;"> datadtatufsg6e57</td>
                          </tr> <tr class="jsgrid-row">
                            <td class="jsgrid-cell jsgrid-align-center" style="width:50px;">01</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 90px;">1</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 105px;">datadtatufsg6e57</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 105px;">ywuen ueyetstsrvststvst</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 200px;"> datadtatufsg6e57</td>
                          </tr>
                           <tr class="jsgrid-alt-row">
                            <td class="jsgrid-cell jsgrid-align-center" style="width:50px;">01</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 90px;">1</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 105px;">datadtatufsg6e57</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 105px;">ywuen ueyetstsrvststvst</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 200px;"> datadtatufsg6e57</td>
                          </tr> <tr class="jsgrid-row">
                            <td class="jsgrid-cell jsgrid-align-center" style="width:50px;">01</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 90px;">1</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 105px;">datadtatufsg6e57</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 105px;">ywuen ueyetstsrvststvst</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 200px;"> datadtatufsg6e57</td>
                          </tr>
                           <tr class="jsgrid-alt-row">
                            <td class="jsgrid-cell jsgrid-align-center" style="width:50px;">01</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 90px;">1</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 105px;">datadtatufsg6e57</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 105px;">ywuen ueyetstsrvststvst</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 200px;"> datadtatufsg6e57</td>
                          </tr> <tr class="jsgrid-row">
                            <td class="jsgrid-cell jsgrid-align-center" style="width:50px;">01</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 90px;">1</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 105px;">datadtatufsg6e57</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 105px;">ywuen ueyetstsrvststvst</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 200px;"> datadtatufsg6e57</td>
                          </tr>
                           <tr class="jsgrid-alt-row">
                            <td class="jsgrid-cell jsgrid-align-center" style="width:50px;">01</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 90px;">1</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 105px;">datadtatufsg6e57</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 105px;">ywuen ueyetstsrvststvst</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 200px;"> datadtatufsg6e57</td>
                          </tr> <tr class="jsgrid-row">
                            <td class="jsgrid-cell jsgrid-align-center" style="width:50px;">01</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 90px;">1</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 105px;">datadtatufsg6e57</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 105px;">ywuen ueyetstsrvststvst</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 200px;"> datadtatufsg6e57</td>
                          </tr>
                           <tr class="jsgrid-alt-row">
                            <td class="jsgrid-cell jsgrid-align-center" style="width:50px;">01</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 90px;">1</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 105px;">datadtatufsg6e57</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 105px;">ywuen ueyetstsrvststvst</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 200px;"> datadtatufsg6e57</td>
                          </tr> <tr class="jsgrid-row">
                            <td class="jsgrid-cell jsgrid-align-center" style="width:50px;">01</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 90px;">1</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 105px;">datadtatufsg6e57</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 105px;">ywuen ueyetstsrvststvst</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 200px;"> datadtatufsg6e57</td>
                          </tr>
                           <tr class="jsgrid-alt-row">
                            <td class="jsgrid-cell jsgrid-align-center" style="width:50px;">01</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 90px;">1</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 105px;">datadtatufsg6e57</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 105px;">ywuen ueyetstsrvststvst</td>
                            <td class="jsgrid-cell jsgrid-align-center" style="width: 200px;"> datadtatufsg6e57</td>
                          </tr> 
                          
                          
                          
                          
                          
                          
                          
                          
                        </tbody>
                      </table>
                    </div>
                    <div class="jsgrid-pager-container" style="display: none;"></div>
                    <div class="jsgrid-load-shader" style="display: none; position: absolute; top: 0px; right: 0px; bottom: 0px; left: 0px; z-index: 1000;"></div>
                    <div class="jsgrid-load-panel" style="display: none; position: absolute; top: 50%; left: 50%; z-index: 1000;">Please, wait...</div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </section>
      <!-- Sorting scenario end --> 
    </div>
  </div>
  <!-- ////////////////////////////////////////////////////////////////////////////-->
  <footer class="footer footer-static footer-light navbar-border navbar-shadow">
    <p class="clearfix blue-grey lighten-2 text-sm-center mb-0 px-2">
      <span class="float-md-left d-block d-md-inline-block">Copyright &copy; 2019 <a class="text-bold-800 grey darken-2" href="index.html" target="_blank">中科启信 </a>, All rights reserved. </span>
    
    </p>
  </footer>
  <!-- BEGIN VENDOR JS-->
  <script src="statics/vendors/js/vendors.min.js" type="text/javascript"></script>
  <!-- BEGIN VENDOR JS-->
  <!-- BEGIN PAGE VENDOR JS-->
  <script src="statics/vendors/js/charts/chart.min.js" type="text/javascript"></script>
  <script src="statics/vendors/js/charts/echarts/echarts.js" type="text/javascript"></script>
  <!-- END PAGE VENDOR JS-->
  <!-- BEGIN MODERN JS-->
  <script src="statics/js/core/app-menu.js" type="text/javascript"></script>
  <script src="statics/js/core/app.js" type="text/javascript"></script>
  <script src="statics/js/scripts/customizer.js" type="text/javascript"></script>
  <!-- END MODERN JS-->
  <!-- BEGIN PAGE LEVEL JS-->
  <script src="statics/js/scripts/pages/dashboard-crypto.js" type="text/javascript"></script>
<script src="statics/js/core/app-menu.js" type="text/javascript"></script> 
<script src="statics/js/core/app.js" type="text/javascript"></script> 
<script src="statics/js/scripts/customizer.js" type="text/javascript"></script> 
<!-- END MODERN JS--> 
<!-- BEGIN PAGE LEVEL JS--> 
<script src="statics/js/scripts/tables/jsgrid/jsgrid.js" type="text/javascript"></script> 
<!-- END PAGE LEVEL JS-->
</body>
</html>