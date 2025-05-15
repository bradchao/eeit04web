<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<c:set var="x" value="10"></c:set>
		x = ${x }<br />
		<c:set var="x" value="123" scope="request"></c:set>
		x = ${requestScope.x }<br />
		<c:set var="y">777</c:set>
		y = ${y }<br />
		
	</body>
</html>