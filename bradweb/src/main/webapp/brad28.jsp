<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="tw.brad.apis.*" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<form>
			<input name="x" value="${param.x }" />
			<select>
				<option value="1">+</option>
				<option value="2">-</option>
				<option value="3">x</option>
				<option value="4">/</option>
			</select>
			<input name="y" value="${param.y }" />
			<input type="submit" value="=" />
			<span>${BradUtils.calc(param.x, param.y) }</span>
		</form>
	</body>
</html>