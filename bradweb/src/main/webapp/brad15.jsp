<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<table border='1' width='100%'>
			<tr>
				<td>
				<%
					for (int i=1; i<=9; i++){
						int r = 2 * i;
						out.println(String.format("2 x %d = %d<br />",i, r));
					}
				%>
				</td>
				<td>
					2 x 1 = 2<br />
					2 x 1 = 2<br />
					2 x 1 = 2<br />
					2 x 1 = 2<br />
				</td>
				<td>
					2 x 1 = 2<br />
					2 x 1 = 2<br />
					2 x 1 = 2<br />
					2 x 1 = 2<br />
				</td>
				<td>
					2 x 1 = 2<br />
					2 x 1 = 2<br />
					2 x 1 = 2<br />
					2 x 1 = 2<br />
				</td>
			</tr>
		
			<tr>
				<td>
					2 x 1 = 2<br />
					2 x 1 = 2<br />
					2 x 1 = 2<br />
					2 x 1 = 2<br />
				</td>
				<td>
					2 x 1 = 2<br />
					2 x 1 = 2<br />
					2 x 1 = 2<br />
					2 x 1 = 2<br />
				</td>
				<td>
					2 x 1 = 2<br />
					2 x 1 = 2<br />
					2 x 1 = 2<br />
					2 x 1 = 2<br />
				</td>
				<td>
					2 x 1 = 2<br />
					2 x 1 = 2<br />
					2 x 1 = 2<br />
					2 x 1 = 2<br />
				</td>
			</tr>		
		
		</table>
	</body>
</html>