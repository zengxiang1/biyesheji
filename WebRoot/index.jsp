<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>湖南工学院计算机基础教学网</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" type="text/css" href="Assets/css/reset.css"/>
<script type="text/javascript" src="Assets/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="Assets/js/js_z.js"></script>
<script type="text/javascript" src="Assets/js/main.js"></script>
<link rel="stylesheet" type="text/css" href="Assets/css/thems.css">
<script type="text/javascript">
	
</script>
  </head>
 
 <body>
 <s:debug></s:debug>
<!--头部-->
<div class="head clearfix">
	<div class="logo"><a href=""><img src="Assets/images/logo.png" alt=""/></a></div>
    <div class="tel"><img src="Assets/images/tel.png" alt=""/></div>
</div>
<!--头部-->
<div class="nav_bg">
	<div class="nav_m">
    	<ul class="nav clearfix">
        	<li class="now"><a href="index.html">首页</a></li>
            <li class="line">&nbsp;</li>
            <li><a href="about.html">部门概况</a></li>
            <li class="line">&nbsp;</li>
            <li><a href="service.html">教学管理</a></li>
            <li class="line">&nbsp;</li>
            <li><a href="system.html">信息动态</a></li>
            <li class="line">&nbsp;</li>
            <li><a href="cases.html">教研教改</a></li>
            <li class="line">&nbsp;</li>
            <li><a href="friend.html">教学资源</a></li>
            <li class="line">&nbsp;</li>
            <li><a href="news.html">教学团队</a></li>
        </ul>
    </div>
</div>
<div class="main_bg">
    <!--幻灯片-->
    <div class="banner">
        <div id="inner">
            <div class="hot-event">
                <div class="event-item" style="display: block;">
                    <a target="_blank" href="" class="banner">
                        <img src="Assets/upload/banner.jpg" class="photo" alt="高思" />
                    </a>
                </div>
                <div class="event-item" style="display: none;">
                    <a target="_blank" href="" class="banner">
                        <img src="Assets/upload/banner.jpg" class="photo" alt="高思" />
                    </a>
                </div>
                <div class="event-item" style="display: none;">
                    <a target="_blank" href="" class="banner">
                        <img src="Assets/upload/banner.jpg" class="photo" alt="高思" />
                    </a>
                </div>
                <div class="event-item" style="display: none;">
                    <a target="_blank" href="" class="banner">
                        <img src="Assets/upload/banner.jpg" class="photo" alt="高思" />
                    </a>
                </div>
                <div class="switch-tab">
                    <a href="#" onClick="return false;" class="current">1</a>
                    <a href="#" onClick="return false;">2</a>
                    <a href="#" onClick="return false;">3</a>
                    <a href="#" onClick="return false;">4</a>
                </div>
            </div>
        </div>
        <script type="text/javascript">
            $('#inner').nav({ t: 6000, a: 500 });
        </script>
    </div>
	<!--幻灯片-->
	<div class="main clearfix">
    	<div class="box_a clearfix">
        	<!--咨询服务-->
        	<div class="box_al">
            	<div class="box_h">快速通道</div>
                <ul>
                	<li><a href=""><img src="Assets/images/icon1.png" alt=""/><span>登录学校系统</span></a></li>
                    <li><a href=""><img src="Assets/images/icon2.png" alt=""/><span>供应链流程优化</span></a></li>
                    <li><a href=""><img src="Assets/images/icon3.png" alt=""/><span>供应链系统规划</span></a></li>
                    <li><a href=""><img src="Assets/images/icon4.png" alt=""/><span>供应链系统实施</span></a></li>
                </ul>
            </div>
            <!--咨询服务-->
            <!--产品系统-->
            <div class="box_am">
            	<div class="box_h">
                                                                    学校新闻/News
                    <a href="" class="more">&nbsp;</a>
                </div>
                <div class="box_gd">
                	<div class="maquee">
                        <ul class="news_li">
                        <s:iterator value="list" var="article">
                            <li>
                            	<h5><a href=""><s:property value="#article.shottitles"/></a></h5>
                                <p><s:property value="#article.contents"/></p>
                            </li>
                            </s:iterator>
                        </ul>
                        <ul class="swap"></ul>
                    </div>
                </div>
            </div>
            <!--产品系统-->
            <!--新闻中心-->
            <div class="box_ar">
            	<div class="box_h">新闻中心/<span>News</span><a href="" class="more">&nbsp;</a></div>
                <ul>
                	<li class="one">
                    	<dl class="clearfix">
                        	<dt><a href=""><img src="Assets/upload/pic2.jpg" alt=""/></a></dt>
                            <dd>
                            	<h5><a href="">> 同益实业销售管理咨....</a></h5>
                                <p>1、建立系统化的大客户销售管理、市场管理、团队管理和客户关系  管理方法....</p>
                            </dd>
                        </dl>
                    </li>
                    <li>
                    	<a href=""><p>> 同益实业销售管理咨询项目</p><em>2015-01-01</em></a>
                    </li>
                    <li>
                    	<a href=""><p>> 同益实业销售管理咨询项目</p><em>2015-01-01</em></a>
                    </li>
                    <li>
                    	<a href=""><p>> 同益实业销售管理咨询项目</p><em>2015-01-01</em></a>
                    </li>
                </ul>
            </div>
            <!--新闻中心-->
        </div>
        <div class="box_b">
        	<div class="box_bl">
            	<div class="name">CASE<b>客户案例</b></div>
                <a href="">了解更多+</a>
            </div>
            <div class="box_bm">
            	<ul class=" clearfix">
                	<li><a href=""><img src="Assets/upload/pic1.jpg" alt=""/></a></li>
                    <li><a href=""><img src="Assets/upload/pic1.jpg" alt=""/></a></li>
                    <li><a href=""><img src="Assets/upload/pic1.jpg" alt=""/></a></li>
                    <li><a href=""><img src="Assets/upload/pic1.jpg" alt=""/></a></li>
                </ul>
            </div>
            <div class="box_br">
            	<img src="Assets/upload/code.jpg" alt=""/>
                <p>微信名：高思信息</p>
                <p>微信号：gs-info</p>
                <div class="rf_bg">&nbsp;</div>
            </div>
        </div>
    </div>
</div>
<div class="f_bg">
	<ul class="foot_n">
    	<li class="f_a">
        	<dl class="clearfix">
            	<dt>&nbsp;</dt>
                <dd>
                	<p>联系我们</p>
                    <img src="Assets/images/contact.png" alt=""/>
                </dd>
            </dl>
            <div class="f_am">
            	<b>深圳市高思通达信息技术有限公司</b>
                <p>地址：深圳市龙岗区坂田街道雅园路28号荣诚大厦副楼602房</p>
            </div>
            <p>电话：0755-28776686 </p>
            <p>邮箱：ts-info@gaosigroup.com</p>
        </li>
        <li class="f_b">
        	<b class="title">关于高思</b>
            <a href="">公司介绍</a>
            <a href="">价值主张</a>
            <a href="">核心价值观</a>
            <a href="">人才招聘</a>
            <a href="">联系我们</a>
        </li>
        <li class="f_c">
        	<b class="title">咨询服务</b>
            <a href="">供应链规划</a>
            <a href="">供应链流程优化</a>
            <a href="">供应链系统规划</a>
            <a href="">供应链系统实施</a>
        </li>
        <li class="f_d">
        	<b class="title">供应链集成优化系统</b>
            <a href="">高思订单管理系统TS-OMS</a>
            <a href="">高思派车管理系统TS-TMS</a>
            <a href="">高思仓储管理系统TS-WMS</a>
            <a href="">高思费用管理系统TS-BMS</a>
            <a href="">高思客户关系管理系统TS-CRM</a>
            <a href="">高思业务流程管理系统TS-BPM</a>
            <a href="">高思3PL企业管理系统TS-3PL-ERP</a>
            <a href="">高思商业智能TS-BI</a>
        </li>
        <li class="f_e">
        	<b class="title">物流行业传感应用</b>
            <a href="">高思资产管理系统</a>
            <a href="">高思仓储环境监控系统</a>
        </li>
    </ul>
</div>
<div class="bq_bg">
	<div class="bq">Copyright©2015深圳市高思通达信息技术有限公司版权所有 粤ICP备15041633号 <a href="http://www.mycodes.net/" target="_blank">源码之家</a></div>
</div>
</body>
</html>
