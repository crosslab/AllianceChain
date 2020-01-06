<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<!DOCTYPE html>
<html class="loading" lang="en" data-textdirection="ltr">
<head>
    <base href="<%=basePath%>">
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimal-ui">
  <meta name="description" content="Modern admin is super flexible, powerful, clean &amp; modern responsive bootstrap 4 admin template with unlimited possibilities with bitcoin dashboard.">
  <meta name="keywords" content="admin template, modern admin template, dashboard template, flat admin template, responsive admin template, web app, crypto dashboard, bitcoin dashboard">
  <meta name="author" content="PIXINVENT">
  <title>charts
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
  <!-- END Page Level CSS-->
  <!-- BEGIN Custom CSS-->
  <link rel="stylesheet" type="text/css" href="statics/assets/css/style.css">
  <!-- END Custom CSS-->
</head>
<body class="vertical-layout vertical-menu 2-columns   menu-expanded fixed-navbar"
data-open="click" data-menu="vertical-menu" data-col="2-columns" style="padding-top:0;">
 <div class="row" style="width:99%;margin:0 auto 0 1%;"><div class="col-12">

  
      <div class="content-body">
        <!-- Flot line charts section start -->
        <section id="flot-line-charts">  
		<!--first line begin-->
                  <div class="row">
            <div class="col-md-6 col-sm-12">
              <div class="card">
                <div class="card-header">
                  <h4 class="card-title"> Analytics</h4>
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
                  <div class="card-body">
                    <div id="series-types" class="height-400"></div>
                  </div>
                </div>
              </div>
            </div>
            <!-- Tilted Pie Chart -->
            <div class="col-md-6 col-sm-12">
              <div class="card">
                <div class="card-header">
                  <h4 class="card-title">Organization Transactions</h4>
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
                  <div class="card-body">
                    <div id="realtime" class="height-400"></div>
                  </div>
                </div>
              </div>
            </div>
          </div> 
        
          <!-- first line end -->
		  
		  <!--second line begin-->
                  <div class="row">
          
            <div class="col-md-6 col-sm-12">
              <div class="card">
                <div class="card-header">
                  <h4 class="card-title">Activity</h4>
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
                  <div class="card-body">
                    <div id="tracking" class="height-400"></div>
                  </div>
                </div>
              </div>
            </div>
            <!-- Tilted Pie Chart -->
            <div class="col-md-6 col-sm-12">
              <div class="card">
                <div class="card-header">
                  <h4 class="card-title">PeerGraph</h4>
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
                  <div class="card-body">
                    <div id="line-chart" class="height-400"></div>
                  </div>
                </div>
              </div>
            </div>
          </div> 
        
     
       
      </div> </div></div>
    </div>
  </div>


  <script src="statics/vendors/js/vendors.min.js" type="text/javascript"></script>
  <!-- BEGIN VENDOR JS-->
  <!-- BEGIN PAGE VENDOR JS-->
  <script src="statics/vendors/js/charts/flot/jquery.flot.min.js" type="text/javascript"></script>
  <script src="statics/vendors/js/charts/flot/jquery.flot.resize.js" type="text/javascript"></script>
  <script src="statics/vendors/js/charts/flot/jquery.flot.time.js" type="text/javascript"></script>
  <script src="statics/vendors/js/charts/flot/jquery.flot.selection.js"
  type="text/javascript"></script>
  <script src="statics/vendors/js/charts/flot/jquery.flot.symbol.js" type="text/javascript"></script>
  <!-- END PAGE VENDOR JS-->
  <!-- BEGIN MODERN JS-->
  <script src="statics/js/core/app-menu.js" type="text/javascript"></script>
  <script src="statics/js/core/app.js" type="text/javascript"></script>
  <script src="statics/js/scripts/customizer.js" type="text/javascript"></script>
  <!-- END MODERN JS-->
  <!-- BEGIN PAGE LEVEL JS-->
  <script src="statics/js/scripts/charts/flot/line/line.js" type="text/javascript"></script>
  <script src="statics/js/scripts/charts/flot/line/realtime.js" type="text/javascript"></script>
  <script src="statics/js/scripts/charts/flot/line/series-types.js" type="text/javascript"></script>
  <script src="statics/js/scripts/charts/flot/line/symbols.js" type="text/javascript"></script>
  <script src="statics/js/scripts/charts/flot/line/tracking.js" type="text/javascript"></script>
  <script src="statics/js/scripts/charts/flot/line/visitors.js" type="text/javascript"></script>
  <!-- END PAGE LEVEL JS-->
</body>
</html>