<%@ page language="java" contentType="application/json; charset=UTF-8"
    pageEncoding="UTF-8" import="tw.brad.apis.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<c:catch var="err">
	<sql:setDataSource
		driver="com.mysql.cj.jdbc.Driver"
		url="jdbc:mysql://localhost/north"
		user="root"
		password="root"
	/>
	<sql:query var="result">
		SELECT * FROM orderdetails od
		JOIN orders o ON (od.OrderID = o.OrderID)
		JOIN products p ON (od.ProductID = p.ProductID)
        JOIN employees e ON (o.EmployeeID = e.EmployeeID)
        JOIN customers c ON (o.CustomerID = c.CustomerID)
		WHERE od.OrderID = ?		
		<sql:param>${param.orderId }</sql:param>	
	</sql:query>
	${BradUtils.order2JSON(result.rows) }
</c:catch>
${err }
