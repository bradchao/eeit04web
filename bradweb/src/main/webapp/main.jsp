<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:if test="${empty member.account }">
	<c:redirect url="login.html"></c:redirect>
</c:if>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>Main Page</h1>
		<div>Welcome, ${member.cname }</div>
		<hr />
		<a href="logout.jsp">Logout</a>
	</body>
</html>