<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<form method="get" action="RadioServlet">
		<label for="gender">���� : </label><input type="radio" name="gender"
			id="gender" value="����" checked>���� <input type="radio"
			name="gender" id="gender" value="����">����<br> <br> <label
			for="chk_mail">���� ���� ���� ���� : </label> <input type="radio"
			name="chk_mail" id="chk_mail" value="yes" checked>����<input
			type="radio" name="chk_mail" id="chk_mail" value="no">�ź�<br>
		<br>  <label for="content">������ ���� �λ縦 �����ּ��� ^O^ </label><br> 
		<textarea id="content" name="content" rows="3" cols="35"></textarea>
		<br> <input type="submit" value="����">

	</form>
</body>
</html>