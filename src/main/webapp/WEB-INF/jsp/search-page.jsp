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
  <title>联盟链管理与监控平台-搜索
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
  <link rel="stylesheet" type="text/css" href="statics/css/pages/search.css">
  <!-- END Page Level CSS-->
  <!-- BEGIN Custom CSS-->
  <link rel="stylesheet" type="text/css" href="statics/css/style.css">
  <!-- END Custom CSS-->
<style type="text/css">
a.nav-link{color:#fff!important;
}
.col-lg-6 {
    position: relative;
    width: 100%;
    min-height: 1px;
    padding-right: 10px;
    padding-left: 10px;
}



</style>
</head>
<body class="vertical-layout vertical-menu 1-column   menu-expanded fixed-navbar"
data-open="click" data-menu="vertical-menu" data-col="1-column">
  <!-- fixed-top-->
  <nav class="header-navbar navbar-expand-md navbar navbar-with-menu navbar-without-dd-arrow fixed-top navbar-dark navbar-shadow">
    <div class="navbar-wrapper">
      <div class="navbar-header">
        <ul class="nav navbar-nav flex-row">
          <li class="nav-item mobile-menu d-md-none mr-auto"><a class="nav-link nav-menu-main menu-toggle hidden-xs" href="#"><i class="ft-menu font-large-1" style="color:#fff;"></i></a></li>
          <li class="nav-item">
            <a class="navbar-brand" href="index.jsp">
              <img class="brand-logo" alt="modern admin logo" src="statics/images/logo/logo.png">
              <h3 class="brand-text" style="font-weight:normal;font-size:16px;">质量认证区块链平台</h3>
            </a>
          </li>
          <li class="nav-item d-md-none">
            <a class="nav-link open-navbar-container" data-toggle="collapse" data-target="#navbar-mobile"><i class="la la-ellipsis-v"></i></a>
          </li>
        </ul>
      </div>
      <div class="navbar-container">
        <div class="collapse navbar-collapse justify-content-end" id="navbar-mobile">
          <ul class="nav navbar-nav">
            <li class="nav-item"><a class="nav-link mr-2 nav-link-label" href="index.jsp"><i class="ficon ft-arrow-left" style="color:#fff;"></i></a></li>
            <li class="dropdown nav-item">
              <a class="nav-link mr-2 nav-link-label" href="#" data-toggle="dropdown"><i class="ficon ft-settings" style="color:#fff;"></i></a>
            </li>
          </ul>
        </div>
      </div>
    </div>
  </nav>
  <!-- ////////////////////////////////////////////////////////////////////////////-->
  <div class="app-content content">
    <div class="content-wrapper">
      <div class="content-header row">
      </div>
      <div class="content-body">
        <div class="row full-height-vh-with-nav">
          <div class="col-12 d-flex justify-content-center">
            <div class="col-lg-6 col-10">
              <img class="img-fluid mx-auto d-block pb-3 pt-4 width-65-per" style="width:85%!important;" src="statics/images/logo/logo-dark-lg.png"
              alt="联盟链管理与监控平台">
              <fieldset class="form-group position-relative">
                <input type="text" class="form-control form-control-xl input-xl" id="iconLeft1" placeholder="证书编号、机构编号或证书名称...">
               
              </fieldset>
              <div class="row py-2">
                <div class="col-12 text-center">
                  <a href="search-details3.jsp" class="btn btn-primary btn-md" style="font-size:16px;padding-left:30px;padding-right:30px;"><i class="ft-search" style="color:#fff;margin-right:6px;"></i>点击查询</a>
                </div>
              </div>
            
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  <!-- ////////////////////////////////////////////////////////////////////////////-->
  <footer class="footer fixed-bottom footer-dark navbar-border navbar-shadow">
    <p class="clearfix blue-grey lighten-2 text-sm-center mb-0 px-2">
      <span class="float-md-left d-block d-md-inline-block">Copyright &copy; 2019 <a class="text-bold-800 grey darken-2" href="https://themeforest.net/user/pixinvent/portfolio?ref=pixinvent"
        target="_blank">联盟链管理与监控平台 </a>, All rights reserved. </span>
    </p>
  </footer>
  <!-- BEGIN VENDOR JS-->
  <script src="statics/vendors/js/vendors.min.js" type="text/javascript"></script>
  <!-- BEGIN VENDOR JS-->
  <!-- BEGIN PAGE VENDOR JS-->
  <!-- END PAGE VENDOR JS-->
  <!-- BEGIN MODERN JS-->
  <script src="statics/js/core/app-menu.js" type="text/javascript"></script>
  <script src="statics/js/core/app.js" type="text/javascript"></script>
  <script src="statics/js/scripts/customizer.js" type="text/javascript"></script>
  <!-- END MODERN JS-->
  <!-- BEGIN PAGE LEVEL JS-->
  <!-- END PAGE LEVEL JS-->
</body>
</html>