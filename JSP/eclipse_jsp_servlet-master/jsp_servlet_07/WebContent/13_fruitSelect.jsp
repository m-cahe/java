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
<c:choose>
	<c:when test="${param.fruit==1 }">
		<span style="color: red;">���</span>
	</c:when>
	<c:when test="${param.fruit==2 }">
		<span style="color: green;">�޷�</span>
	</c:when>
	<c:when test="${param.fruit==3 }">
		<span style="color: blue;">�ٳ���</span>
	</c:when>
	</c:choose>
</body>
</html>