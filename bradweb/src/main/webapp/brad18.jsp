<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String mesg = "";
	String errType = request.getParameter("errType");
	if (errType != null){
		if (errType.equals("1")){
			mesg = "Register Failure";
		}else if (errType.equals("2")){
			mesg = "Account EXIST!";
		}
	}
%>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Register Form</title>
	</head>
	<body>
		<script type="text/javascript">
			function checkForm(){
				
				return true;
			}
		</script>
		<%= mesg %>
		<form action="Register" method="get" onsubmit="return checkForm();">
			Account: <input name="account" /><br />
			Password: <input type="password" name="passwd" /><br />
			Name:<input name="cname" /><br />
			<input type="submit" value="Register" />
		</form>
	</body>
</html>