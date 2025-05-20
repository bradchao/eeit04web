<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="brad" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>Brad Big Company</h1>
		<hr />
		<brad:test1 /><br />
		<brad:test2 /><br />
		<brad:test3 /><hr />
		<table border="1" width="100%">
			<tr>
				<th>Name</th>
				<th>Price</th>
			</tr>
			<brad:test4 pname="Mouse" price="123" />
			<brad:test4 pname="NB" price="12300" />
			<brad:test4 pname="Camera" price="3000" />
			<brad:test4 pname="iPhone" price="30000" />
			
			
		</body>
		
		
	</body>
</html>