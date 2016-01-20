<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>Hello Hello ~!</title>
	<style type="text/css">
		<%@include file="/css/style.css" %>
	</style>
	<script src="/ProjectServlet/js/roll.js"></script>
	<% java.net.InetAddress address = java.net.InetAddress.getLocalHost(); %>
	<% java.lang.String ip = address.getHostAddress(); %>
</head>
<body>
	<div class="contentPanel">		
		<div class="login">
			<div class="caption">帐号登陆</div>
			<form action="LoginServlet" method="post">
				<input id="username" name="username" placeholder="请输入帐号" class="user-name" type="text">
				<input id="password" name="password" placeholder="请输入密码" class="pass-word" type="password" autocomplete="off">
				<div class="error-mess">
					<span class="error-icon"></span><span id="error-message">帐户名或登录密码不正确，请重新输入</span>
				</div>
				<input class="logging" type="submit" value="登录" />
        	</form>
		</div>
    	<div class="area1" >   	
        	<table class="test_tb" >
            	<tr>
                	<td><label> String here! </label></td>
                    <td><input type="text" id="put" /></td>
                </tr>
                <tr>
                	<td colspan="2">
	                	<button type="button" onClick="lookout()">Get!</button>
	                    <button onclick="getElementById("demo").innerHTML=Date()">The time is?</button>
                    </td>
                </tr>
            </table>
            <input value="servlet" type="button" 
			onClick="javascript:window.location='HelloServlet?user=Season02'" />
			<h2>
			Hello finally meet you!
			</h2>
        </div>
    </div>
    
    <div class="displayPanel">
    	<div class="timer" >
	    	<% java.util.Date d = new java.util.Date(); %>
			Today`s date is <%= d.toString() %>
    	</div>
    </div>
	<div id="header" class="headline">
		<div class="ipPanel">
			<%= address.getHostAddress() %>
			${pageContext.request.contextPath}
		</div>
	</div>
	<script src="/ProjectServlet/js/jquery.min.js" ></script>
	<script src="/ProjectServlet/js/index.js" ></script>
</body>
</html>