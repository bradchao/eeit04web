<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>     
<%
	String[] names = {"Brad","Eric","Andy","Tony","Mark","Kevin","Peter","Mary","Vivian"};
	pageContext.setAttribute("names", names);
%>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<table border="1" width="100%">
			<tr>
				<th>Name</th>
			</tr>
			<c:forEach var="name" items="${names }">
				<tr>
					<td>${name }</td>
				</tr>
			</c:forEach>
			
		</table>
		
	</body>
</html>