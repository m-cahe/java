<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>Flask�κ��� ������ ������ ��������</h1>
	<%
		String data = request.getParameter("data");
		System.out.println(data);
		out.print(data);
		
	%>
</body>
</html>