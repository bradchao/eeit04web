<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//if (request.getMethod().equals("POST")){
		try{
			int max = Integer.parseInt(request.getParameter("max"));
			out.print((int)(Math.random()*max+1));
		}catch(Exception e){
			out.print("ERROR:" +e);
		}
	//}
%>