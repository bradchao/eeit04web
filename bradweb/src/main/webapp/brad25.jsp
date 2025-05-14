<%@page import="tw.brad.apis.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Member member1 = new Member();
	member1.setId(1); member1.setAccount("brad"); member1.setCname("Brad");
%>
<jsp:useBean id="member2" class="tw.brad.apis.Member"></jsp:useBean>
<jsp:setProperty property="id" name="member2" value="2" />
<jsp:setProperty property="account" name="member2" value="peter" />
<jsp:setProperty property="cname" name="member2" value="Peter" />
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		Member1: <%= member1.getId() %>:
				<%= member1.getAccount() %>:
				<%= member1.getCname() %><br />
		Member2: 
			<jsp:getProperty property="id" name="member2"/>:
			<jsp:getProperty property="account" name="member2"/>:
			<jsp:getProperty property="cname" name="member2"/><br />
		Member2:<%= member2.getId() %>:
				<%= member2.getAccount() %>:
				<%= member2.getCname() %><br />
		
		
	</body>
</html>






