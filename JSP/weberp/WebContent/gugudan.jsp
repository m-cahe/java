<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table border='1px'>
		<%
			for (int i = 1; i <= 9; i++) {
			out.print("<tr>");

			for (int j = 2; j <= 9; j++) {
				out.print("<th>");
				out.print(j);
				out.print("*");
				out.print(i);
				out.print("=");
				out.print(i * j);
				out.print("</th>");
			}
			out.print("</tr>");
		}
		%>
	</table>


</body>
</html>