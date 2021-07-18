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
// MQTT Server
String pillcheck =request.getParameter("pillcheck");
System.out.println(pillcheck);
response.getWriter().print("/{\"pilltime\":10, \"pillday\":45}/");
%>
</body>
</html>