<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		<form action="Register" method="get" onsubmit="return checkForm();">
			Account: <input name="account" /><br />
			Password: <input type="password" name="passwd" /><br />
			Name:<input name="cname" /><br />
			<input type="submit" value="Register" />
		</form>
	</body>
</html>