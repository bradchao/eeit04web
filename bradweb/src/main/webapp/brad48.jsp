<%@page import="tw.brad.apis.MyTest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	MyTest obj = new MyTest();
	session.setAttribute("mytest", obj);
	session.setMaxInactiveInterval(10);
	
%>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	Lottery: ${mytest.lottery }<br />
	<%
		obj.setLottery(1000);
	
	%>
		
	</body>
</html>