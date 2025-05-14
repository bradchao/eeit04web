<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// ${} : Expression Language: EL
%>
<jsp:useBean id="member" class="tw.brad.apis.Member"></jsp:useBean>
<jsp:setProperty property="account" name="member" value="${param.account }" />
<jsp:setProperty property="cname" name="member" value="${param.cname }" />
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		Member: 
			<jsp:getProperty property="id" name="member"/>:
			<jsp:getProperty property="account" name="member"/>:
			<jsp:getProperty property="cname" name="member"/><br />
		Member:
			<%= member.getId() %>:
			<%= member.getAccount() %>:
			<%= member.getCname() %><br />
		${member }
		<hr />
		${Math.random() }<br />
		${Math.PI }
		
				
	</body>
</html>