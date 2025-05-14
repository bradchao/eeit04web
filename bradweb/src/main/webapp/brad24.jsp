<%@page import="tw.brad.apis.Bike"%>
<%
	String name = (String)request.getAttribute("name");
	Bike bike = (Bike)request.getAttribute("bike");
%>
<div>I am brad24</div>
Name: <%= name %><br />
Bike speed: <%= bike.getSpeed() %><br />
Bike: <%= bike %>
