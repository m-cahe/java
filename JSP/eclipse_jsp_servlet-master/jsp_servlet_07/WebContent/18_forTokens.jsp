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
	<c:forTokens var="city" items="����. �λ�, �뱸. ��õ" delims=",">
	${city }<br>
	</c:forTokens>
	<hr>
	<c:forTokens var ="city" items="����. ��õ, �λ�. �뱸" delims=",.">
	${city }<br>
	</c:forTokens>
</body>
</html>