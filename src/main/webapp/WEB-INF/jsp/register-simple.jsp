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
  <title>联盟链管理与监控平台-注册
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
  <link rel="stylesheet" type="text/css" href="statics/css/pages/login-register.css">
  <!-- END Page Level CSS-->
  <!-- BEGIN Custom CSS-->
  <link rel="stylesheet" type="text/css" href="statics/css/style.css">
  <!-- END Custom CSS-->
  
  
<!--<style type="text/css">
.card {
    position: relative;
    display: flex;
    flex-direction: column;
    min-width: 0;
    word-wrap: break-word;
    background:none;
    background-clip: border-box;
    border:none;
    border-radius: 0rem;box-shadow:none!important;
}
.line-on-side span{background:#f4f5fa;}
</style>-->
<style type="text/css">
.has-icon-left .form-control.input-lg {padding-right: 1.25rem;padding-left: calc(1.0625rem + 2px);}
select.form-control:not([size]):not([multiple]).input-lg, input.form-control.input-lg{height: 2.8rem;}
</style>
</head>
<body class="vertical-layout vertical-menu 1-column   menu-expanded blank-page blank-page"
data-open="click" data-menu="vertical-menu" data-col="1-column">
  <!-- ////////////////////////////////////////////////////////////////////////////-->
  <div class="app-content content">
    <div class="content-wrapper">
      <div class="content-header row">
      </div>
      <div class="content-body">
        <section class="flexbox-container">
          <div class="col-12 d-flex align-items-center justify-content-center">
            <div class="col-md-4 col-10 p-0">
              <div class="card border-grey border-lighten-3 px-2 py-2 m-0">
                <div class="card-header border-0" style="background:none;">
                  <div class="card-title text-center">
                    <img src="statics/images/logo/logo-dark.png" alt="branding logo">
                  </div>
                 <h6 class="card-subtitle line-on-side text-muted text-center font-small-3 pt-2" style="width:45%;margin:0 auto 20px auto;">
                    <span class="font-medium-2" style="padding:0 1.3rem; font-family:'microsoft yahei;">帐户注册</span>
                  </h6>
                </div>
               <!-- <div class="card-content"> <div class="text-bold-600 font-medium-2">
                        帐户注册
                      </div>-->
                     
                  <div class="card-body" style="padding-top:0;">
                    <form class="form-horizontal form-simple" method="post" action="/userregister">
                      <fieldset class="form-group position-relative has-icon-left mb-1">
                        <input type="text" class="form-control form-control-lg input-lg" id="unitno" placeholder="机构编号（营业执照号）" name="unitno">
                        
                      </fieldset>
                      
                         
                      <fieldset class="form-group position-relative has-icon-left mb-1">
                      <select class="hide-search form-control accordion-text form-control form-control-lg input-lg" id="unittype" style="color:#babfc7;padding-left:1.10rem;" name="unittype">
                        <optgroup label=""><option value="">机构类型</option>
                          <option value="1">1-认证机构</option>
                          <option value="2">2-检测检验机构</option>
                            <option value="3">3-政府监管机构</option>
                        </optgroup>
                      </select>  </fieldset>
                  
                      
                       <fieldset class="form-group position-relative has-icon-left mb-1">
                      <select class="hide-search form-control accordion-text form-control form-control-lg input-lg" id="usertype" style="color:#babfc7;padding-left:1.10rem;" name="usertype">
                        <optgroup label=""><option value="">用户类型</option>
                          <option value="1">1-业务员</option>
                          <option value="2">2-审核员</option>
                        </optgroup>
                      </select>  </fieldset>
                      
                           
                       <fieldset class="form-group position-relative has-icon-left mb-1">
                      <select class="hide-search form-control accordion-text form-control form-control-lg input-lg" id="roletype" style="color:#babfc7;padding-left:1.10rem;" name="roletype">
                        <optgroup label=""><option value="">角色类型</option>
                          <option value="1">1-网安中心操作员</option>
                          <option value="2">2-网安中心操作员</option>
                        </optgroup>
                      </select>  </fieldset>
                      
                      
                      
                      <fieldset class="form-group position-relative has-icon-left mb-1">
                        <input type="text" class="form-control form-control-lg input-lg" id="idnumber" name="idnumber" placeholder="身份证号码" required>
                       
                      </fieldset>
                   
                      <fieldset class="form-group position-relative has-icon-left mb-1">
                        <input type="text" class="form-control form-control-lg input-lg" id="name" name="name" placeholder="姓名" required>
                       
                      </fieldset>
                      
                      <fieldset class="form-group position-relative has-icon-left mb-1">
                        <input type="password" class="form-control form-control-lg input-lg" id="password" name="password" placeholder="密 码" required>
                      
                      </fieldset>
                          <fieldset class="form-group position-relative has-icon-left mb-1">
                        <input type="password" class="form-control form-control-lg input-lg" id="password1" name="password1" placeholder="确认密码" required>
                      
                      </fieldset>
                      
                      
                      <input type="submit" class="btn btn-info btn-lg btn-block">
                    </form>
                  </div>
                  <p class="text-center">已经注册过了? <a href="login-simple.jsp" class="card-link">使用已有帐户登录</a></p>
                </div>
              </div>
            </div>

        </section>
    </div>
    </div>
  </div>
  <!-- ////////////////////////////////////////////////////////////////////////////-->
  <!-- BEGIN VENDOR JS-->
  <script src="statics/vendors/js/vendors.min.js" type="text/javascript"></script>
  <!-- BEGIN VENDOR JS-->
  <!-- BEGIN PAGE VENDOR JS-->
  <script src="statics/vendors/js/forms/validation/jqBootstrapValidation.js"
  type="text/javascript"></script>
  <!-- END PAGE VENDOR JS-->
  <!-- BEGIN MODERN JS-->
  <script src="statics/js/core/app-menu.js" type="text/javascript"></script>
  <script src="statics/js/core/app.js" type="text/javascript"></script>
  <!-- END MODERN JS-->
  <!-- BEGIN PAGE LEVEL JS-->
  <script src="statics/js/scripts/forms/form-login-register.js" type="text/javascript"></script>
  <!-- END PAGE LEVEL JS-->
</body>
</html>