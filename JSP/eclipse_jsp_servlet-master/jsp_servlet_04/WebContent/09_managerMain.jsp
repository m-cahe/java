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
<h1>������ �α��� ����</h1>
<%=URLDecoder.decode(request.getParameter("userName"), "EUC-KR") %>
(<%=request.getParameter("userID") %>)�� ȯ���մϴ�.

</body>
</html>