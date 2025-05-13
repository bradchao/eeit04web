<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String name = request.getParameter("name");
	if (name == null) name = "World";
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<div>Hello, <% out.print(name); %></div>
		<div>Lottery: <% out.print((int)(Math.random()*49+1)); %></div>
		<div>Lottery: <%= (int)(Math.random()*49+1) %></div>
		<hr />
		<%
			TreeSet<Integer> set = new TreeSet<>();
			while (set.size() < 6){
				set.add((int)(Math.random()*49+1));
			}
			out.print(set);
		%>
	</body>
</html>