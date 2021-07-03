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


	<c:forEach var="num" begin="1" end="5" step="1">
		<font size="${num }">야호~~</font>
		<br>
	</c:forEach>


	<c:choose>
		<c:when test="${param.su%3==0}">
			<span style="color: red;">0</span>
		</c:when>
		<c:when test="${param.su%3==1}">
			<span style="color: orange;">1</span>
		</c:when>
		<c:otherwise>
		나머지는 2
		</c:otherwise>

	</c:choose>








</body>
</html>