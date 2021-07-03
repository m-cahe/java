<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<style>

</style>
</head>
<body>
	<table border="1">

		<%
			for (int j = 0; j < 3; j++) {
			out.print("<tr>");
			for (int i = 0; i < 3; i++) {
				out.print("<th>*</th>");
			}
			out.print("</tr>");
		}
		%>


	</table>
</body>
</html>