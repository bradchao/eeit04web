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
<sql:query var="rs">
	SELECT * FROM gift LIMIT 10
</sql:query>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		資料比數: ${rs.rowCount }<hr />
		
		<table border="1" width="100%">
			<tr>
				<th>Name</th>
			</tr>
			<c:forEach items="${rs.rows }" var="gift">
				<tr>
					<td>${gift.name }</td>
				</tr>
			</c:forEach>
			
		</table>		
		
		
	</body>
</html>