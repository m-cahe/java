<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<c:forTokens var="city" items="서울. 부산, 대구. 인천" delims=",">
	${city }<br>
	</c:forTokens>
	<hr>
	<c:forTokens var ="city" items="서울. 인천, 부산. 대구" delims=",.">
	${city }<br>
	</c:forTokens>
</body>
</html>