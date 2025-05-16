<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>  
<c:catch var="err">
	<sql:setDataSource
		driver="com.mysql.cj.jdbc.Driver"
		url="jdbc:mysql://localhost/brad"
		user="root"
		password="root"
	/>
	<sql:update>
		UPDATE cust SET cname = ?, tel=? WHERE id = ?
		<sql:param>mark</sql:param>
		<sql:param>222</sql:param>
		<sql:param>7</sql:param>	
	</sql:update>    
</c:catch>
${err }