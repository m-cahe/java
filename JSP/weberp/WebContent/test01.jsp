<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		for (int i = 0; i < 5; i++) {
	%>
	<font size="<%=i%>">손준호~~</font>
	<br>
	<%
		}
	%>
</body>
</html>
<!-- jsp구성요서 (프로그래밍적 요소)
1.지시자 import (page taglib include)
2. 스크립트릿
3. 선언문 메소드 만들때
4. 출력식 =  변수, 메소드 호출문
5. 주석 <    %  --
+
html css js      jsp
-->
