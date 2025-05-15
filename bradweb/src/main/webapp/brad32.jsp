<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		Name: ${pageScope.myname }<br />
		Name: ${requestScope.myname }<br />
		Name: ${sessionScope.myname }<br />
		Name: ${applicationScope.myname }<br />
	</body>
</html>






