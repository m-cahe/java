<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<form method="get" action="LoginServlet">
		<label for="userid">아이디 : </label><input type="text" name="id"
			id="userid"><br> <label for="uwerpwd">암 &nbsp;
			호: </label> <input type="password" name="pwd" id="userpwd"><br>
		<input type="submit" value="로그인">

	</form>
</body>
</html>