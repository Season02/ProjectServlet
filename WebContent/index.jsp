<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>Hello Hello ~!</title>
	<style type="text/css">
		<%@include file="style.css" %>
	</style>
	<% java.net.InetAddress address = java.net.InetAddress.getLocalHost(); %>
	<% java.lang.String ip = address.getHostAddress(); %>
</head>
<body>
	<div id="header" class="headline">
		<div class="ipPanel">
			<%= address.getHostAddress() %>
			Markup ${pageContext.request.contextPath}/loginServlet
		</div>
	</div>
	<div class="contentPanel">
		<div class="login">
			<form action="http://localhost/ProjectServlet/LoginServlet" method="post">
				<table class="login_tb">
					<caption>Login</caption>
					<tr>
						<td>用户：</td>
						<td><input type="text" name="username" /></td>
					</tr>
					<tr>
						<td>密码：</td>
						<td><input type="password" name="password" /></td>
					</tr>
					<tr>
						<td colspan="2" >
							<input type="submit" value="登录" />
							<input type="reset" value="清除" /> 
						</td>
					</tr>
				</table>		                   
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
			onClick="javascript:window.location='http://<%=address.getHostAddress()%>/ProjectServlet/HelloServlet?user=Season02'" />
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
</body>
</html>