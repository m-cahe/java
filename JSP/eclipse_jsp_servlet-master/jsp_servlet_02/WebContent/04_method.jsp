<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="MethodServlet">
		<input type="submit" value="get방식으로 호출하기">
	</form>
	<br>
	<br>
	<form method="post" action="MethodServlet">
		<input type="submit" value="post 방식으로 호출하기">
	</form>
</body>
</html>