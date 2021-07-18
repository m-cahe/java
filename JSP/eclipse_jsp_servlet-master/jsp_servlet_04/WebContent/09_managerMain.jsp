<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ page import="java.net.URLDecoder" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
<h1>관리자 로그인 성공</h1>
<%=URLDecoder.decode(request.getParameter("userName"), "EUC-KR") %>
(<%=request.getParameter("userID") %>)님 환영합니다.

</body>
</html>