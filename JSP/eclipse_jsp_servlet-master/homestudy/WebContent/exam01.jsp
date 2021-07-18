<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%!int num1 = 5;
	int num2 = 6;

	public int sum(int num1, int num2) {
		int num3 = num1 + num2;

		return num3;
	}%>
	안녕하세요!!
	<%
		int num3 = 5;
	int num4 = 6;
	System.out.println(num3+num4);
	%>
	<%= num3+num4 %>
</body>
</html>