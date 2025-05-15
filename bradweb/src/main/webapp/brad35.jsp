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
		<c:out value="Hello, World"></c:out><br />
		param.x = ${param.x }<br/>
		param.x = <c:out value="${param.x }" default="brad"></c:out><br />
		
		<jsp:useBean id="member" class="tw.brad.apis.Member"></jsp:useBean>
		<c:set target="${member }" property="id">4</c:set>
		<c:set target="${member }" property="account">brad</c:set>
		<c:set target="${member }" property="cname">Brad</c:set>
		${member.id }:${member.account }:${member.cname }<br />
		${member }<hr />
		<c:remove var="member"/>
		${member }<hr />
		
		
		
		
	</body>
</html>





