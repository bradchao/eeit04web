<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//if (request.getMethod().equals("GET")) response.sendError(403);

%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		Method: ${pageContext.request.method }<br />
		Account: ${param.account }<br />
		Locale: ${pageContext.request.locale }<br />
		Language: ${pageContext.request.locale.displayLanguage }<br />
		Language: ${pageContext.request.locale.language }<br />
		Habits: <br />
		1. ${paramValues.habit[0] }<br>
		2. ${paramValues.habit[1] }<br>
		3. ${paramValues.habit[2] }<br>
		4. ${paramValues.habit[3] }<br>
		5. ${paramValues.habit[4] }<br>
		6. ${paramValues.habit[5] }<br>
		
		
	</body>
</html>