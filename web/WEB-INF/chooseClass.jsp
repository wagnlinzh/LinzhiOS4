<%@ page contentType="text/html; charset=UTF-8" language="java" errorPage="" %>
<!DOCTYPE html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title></title>
	<!-- Bootstrap core CSS -->
  <link href="dist/css/bootstrap.min.css" rel="stylesheet">
  

  <!-- Bootstrap theme -->
  <link href="dist/css/bootstrap-theme.min.css" rel="stylesheet">

  <!-- semantic CSS -->
  <link href="dist/css/semantic.min.css" rel="stylesheet">

  <!-- simplemodal CSS -->
  <link type='text/css' href='dist/css/basic.css' rel='stylesheet' />
  <link type='text/css' href='dist/css/box.css' rel='stylesheet' />

  <!--DIY-->

  <link href="dist/css/theme.css" rel="stylesheet">
</head>
<body>
	

    <!-- Fixed navbar -->
    <nav class="navbar navbar-inverse">
        <div class="container">
          <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".navbar-collapse">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="indexJsp.action">Wanglinzhizhi OS</a>
          </div>
          <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
              <li><a href="indexJsp.action">主 页</a></li>
              <li><a href="checkGradeJsp.action">成绩查询</a></li>
              <li class="active"><a href="chooseClassJsp.action">选课系统</a></li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">更 多<span class="caret"></span></a>
                <ul class="dropdown-menu" role="menu">
                  <li><a href="account.html">用户信息</a></li>
                  <li><a href="contact.html">Contact</a></li>
                  <li><a href="about.html">About</a></li>
                  <li class="divider"></li>
                  <li class="dropdown-header">系统相关</li>
                  <li><a href="#">bug报告</a></li>
                  <li><a href="#">Email to us</a></li>
                  <li><a href="signout.action">Sign out</a></li>

                </ul>
              </li>
            </ul>
          </div><!--/.nav-collapse -->
        </div>
    </nav>

    <div class="container theme-showcase" role="main">

       <!-- Main jumbotron for a primary marketing message or call to action -->
        <div class="jumbotron">
          <h1>选课系统</h1>
          <p>这是选课系统，通过本系统进行选课操作，并提交.</p>
        </div>

        <div class="page-header">
          <h1>Weeks</h1>
        </div>
        
        <!-- 课程格子 -->
        <div class="ui celled grid"><!-- 7row 8column -->
          <!-- 第一行，thead --><!-- 星期几 -->
          <div class="eight column row" id="head">
            <div class="column"> </div>
            <div class="column">Monday</div>
            <div class="column">Tuesday</div>
            <div class="column">Wenday</div>
            <div class="column">Thursday</div>
            <div class="column">Friday</div>
            <div class="column">Saturday</div>
            <div class="column">Sunday</div>
          </div>
          
          <!-- 第一节课 --><!-- tbody 第一行 -->
          <div class="eight column row">
            <div class="column"><i class="tag icon"></i>Morning</div>
            
            <div class="column" id="1_1"><a href='class.html' class='open-basic-ifr'><div class='ui blue basic button'>尚未选课</div></a></div>       
            <div class="column" id="2_1"></div>
            <div class="column" id="testClass"></div>
            <div class="column">概率论</div>
            <div class="column">政治</div>
            <div class="column">高等数学</div>
            <div class="column">线性代数</div>
          </div>

          <!-- 上午 第二节课 -->
          <div class="eight column row">
            <div class="column"><i class="tag icon"></i>Morning </div>



            <div class="column"></div>
            <div class="column"></div>
            <div class="column"></div>
            <div class="column"></div>  
            <div class="column">数据结构 </div>
            <div class="column">计算机组成原理</div>
            <div class="column">计算机网络</div>  
          </div>

          <!--下午 第一节课 -->
          <div class="eight column row">
            <div class="column"><i class="tag icon"></i>Afternoon </div>
            <div class="column">高等数学</div>
            <div class="column">线性代数</div>
            <div class="column">概率论</div>
            <div class="column">政治</div>
            <div class="column">数据结构 </div>
            <div class="column">计算机组成原理</div>
            <div class="column">计算机网络</div>
          </div>


          <!--下午 第二节课 -->
          <div class="eight column row">
            <div class="column"><i class="tag icon"></i>Afternoon </div>
            <div class="column"></div>
            <div class="column"></div>
            <div class="column"></div>
            <div class="column"></div>
            <div class="column"></div>
            <div class="column"></div>
            <div class="column"></div>
          </div>

          <!-- 晚上 第一节课 -->
          <div class="eight column row">
            <div class="column"><i class="tag icon"></i>Evening </div>
            <div class="column">高等数学</div>
            <div class="column">线性代数</div>
            <div class="column">概率论</div>
            <div class="column">政治</div>
            <div class="column">数据结构 </div>
            <div class="column">计算机组成原理</div>
            <div class="column">计算机网络</div>
          </div>

          
          <!-- 晚上 第二节课 -->
          <div class="eight column row">
            <div class="column"><i class="tag icon"></i>Evening </div>
            <div class="column"></div>
            <div class="column"></div>
            <div class="column"></div>
            <div class="column"></div>
            <div class="column"></div>
            <div class="column"></div>
            <div class="column"></div>
          </div>
        </div>	

    </div><!-- main end -->

    <!-- 弹出内容 -->
    <div id="ifr-dialog" >
      <!-- iframe弹出层 [[ -->  
      <iframe frameborder="0" scrolling="yes" id="ifr-dialog-container" src="javascript::" class="box-iframe"></iframe>
      您选择的课程是+$className
      <a href="#" class="simplemodal-close"><div class="ui blue button">确认并关闭</div></a>

      <!-- iframe弹出层 ]] -->
    </div>


    <footer class="footer">
      <div class="container">
        <p class="text-muted">copyright 2014-2015 wanglinzhizhi.</p>
      </div>
    </footer>

    
	  <!--add jquery-->
    <script src="dist/js/jquery-2.1.3.js"></script>


    <script src="dist/js/bootstrap.min.js"></script>

    <!-- SimpleModal and Basic JS files -->
    <script type='text/javascript' src='dist/js/jquery.simplemodal.js'></script>
   
        
    <!--  为选课的空的格子里填入尚未选课的按钮;-->
    <script type="text/javascript">
      $(function(){
        //为选课的空的格子里填入尚未选课的按钮;
        for (var i = 1; i < 56; i++) {
          var $unit=$(".column:not('.eight.column.row'):eq("+i+")");
          if ($unit.text()=="") {
              $unit.append("<a href='classHtml.action' class='open-basic-ifr'><div class='ui blue basic button'>尚未选课</div></a>");
          };
        };
      });
    </script>
    
    <!--simplemoadal  -->
    <script type='text/javascript'>
        ;
        jQuery(function ($) {
          /* 提示框 */
          $('.open-basic-ifr').click(function (e) {
            showIframe("classHtml.action","ifr-dialog-content");
            return false;
          });
        });

        /*showIframe */
        function showIframe(src , id){
          $("#ifr-dialog-container").attr("src",src);
          $('#ifr-dialog').modal({
            "opacity":70,
            "overlayClose":true,
            "containerId":id,
            onClose:function(){
              alert("onCLose()函数，todo something，");
              // var $className=$.get("class.html",$className);
              // alert($className);
              $.modal.close();
            }}); //id=ifr-dialog-content
        }  
    </script>
   

    <script type="text/javascript">
      $(function(){
        var $Btn=$(".ui.blue.basic.button");
        $Btn.click(function(e){
            $(this).replaceWith("<a href='classHtml.action' class='open-basic-ifr'><div class='ui blue basic button'>$className</div></a>");//$className not finish;
        })
      })
    </script>
      
  
</body>
</html>
