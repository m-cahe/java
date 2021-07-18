<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>데이터 전송</h1>

	<!-- <form action="test" method="GET"> -->
	<form action="http://172.30.1.49:8081/receive">
		<input type="text" name="num1"> + 
		<input type="text" name="num2">  
		<input type="submit" value="전송">
	</form>
</body>
</html>