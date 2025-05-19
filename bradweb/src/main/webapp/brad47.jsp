<%@ page language="java" contentType="application/json; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		SELECT * FROM `orderdetails` od
		JOIN orders o ON (od.OrderID = o.OrderID)
		JOIN products p ON (od.ProductID = p.ProductID)
		WHERE od.OrderID = ?	
		<sql:param>${param.orderId }</sql:param>	
	</sql:query>
	{
		"Customer": 123,
		"Employee": 456,
		"details": [
			{
				"pname": "aaa",
				"price": 123,
				"qty": 44
			},
			{
				"pname": "aaa",
				"price": 123,
				"qty": 44
			}
		]
	}
</c:catch>
${err }
