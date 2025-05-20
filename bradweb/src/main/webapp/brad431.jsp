<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>    

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<c:set var="rpp">23</c:set>
		<c:set var="page">${empty param.page?1:param.page }</c:set>
		<c:set var="prev">${page==1?1:page-1 }</c:set>
		<c:set var="next">${page + 1 }</c:set>
		<c:set var="start">${(page - 1) * rpp }</c:set>
		
		<sql:query var="result" dataSource="jdbc/mysql">
			SELECT * FROM food LIMIT ${start }, ${rpp }
		</sql:query>
	
		<h1>Brad Big Company</h1>
		<hr />
		<a href="?page=${prev }">Prev</a> | <a href="?page=${next }">Next</a>
		<hr />
		<table border="1" width="100%">
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Tel</th>
			</tr>

			<c:forEach items="${result.rows }" var="food">
				<tr>
					<td>${food.id }</td>
					<td>${food.name }</td>
					<td>${food.tel }</td>
				</tr>
			</c:forEach>
			
		</table>
	
	
	
	
		
	</body>
</html>