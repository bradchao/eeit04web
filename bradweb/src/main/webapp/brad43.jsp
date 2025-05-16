<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>    
<sql:setDataSource
	driver="com.mysql.cj.jdbc.Driver"
	url="jdbc:mysql://localhost/brad"
	user="root"
	password="root"
/>   
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>Brad Big Company</h1>
		<hr />
		<a href="">Prev</a> | <a href="">Next</a>
		<hr />
		<table border="1" width="100%">
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Tel</th>
			</tr>

		
			<tr>
				<td>1</th>
				<td>Brad</th>
				<td>123</th>
			</tr>
			
		</table>
	
	
	
	
		
	</body>
</html>