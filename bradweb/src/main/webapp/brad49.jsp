<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Object obj = session.getAttribute("mytest");
	if (obj == null) response.sendError(HttpServletResponse.SC_FORBIDDEN, "get out here");
%>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		Lottery2: ${mytest.lottery }<br />
		
	</body>
</html>