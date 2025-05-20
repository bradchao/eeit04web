<%@tag import="java.util.HashMap"%>
<%@ tag dynamic-attributes="product" %>
<%
 	HashMap<String,String> ps = 
 		(HashMap<String,String>)jspContext.getAttribute("product");
	out.print("<tr>");
	out.print("<td>" + ps.get("pname") + "</td>");
	out.print("<td>" + ps.get("price") + "</td>");
	out.print("</tr>");

%>