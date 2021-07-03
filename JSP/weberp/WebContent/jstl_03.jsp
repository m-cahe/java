<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%
	String[] str = { "사과", "바나나", "오렌지", "포도", "귤" };
request.setAttribute("str", str);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var="f" items="${str}">
${f }<br>

	</c:forEach>
</body>
</html>