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
<%
String[] movieList={"Ÿ��Ÿ��", "�ó׸� õ��", "Ȥ�� Ż��", "ŷ��"};
pageContext.setAttribute("movieList", movieList);


%>
<c:forEach var="movie" items="${movieList }">
${movie }<br>
</c:forEach>
</body>
</html>