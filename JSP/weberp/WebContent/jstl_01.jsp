<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<c:set var="count" value="10" />
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

</head>
<body>
	count=${count }
	<br>
	<c:if test="${count%2==0}">
${count }= 짝수
</c:if>
	<c:if test="${count%2!=0}">
${count }= 홀수
</c:if>


</body>
</html>