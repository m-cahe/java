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
		<label for="gender">성별 : </label><input type="radio" name="gender"
			id="gender" value="남자" checked>남자 <input type="radio"
			name="gender" id="gender" value="여자">여자<br> <br> <label
			for="chk_mail">메일 정보 수신 여부 : </label> <input type="radio"
			name="chk_mail" id="chk_mail" value="yes" checked>수신<input
			type="radio" name="chk_mail" id="chk_mail" value="no">거부<br>
		<br>  <label for="content">간단한 가입 인사를 적어주세요 ^O^ </label><br> 
		<textarea id="content" name="content" rows="3" cols="35"></textarea>
		<br> <input type="submit" value="전송">

	</form>
</body>
</html>