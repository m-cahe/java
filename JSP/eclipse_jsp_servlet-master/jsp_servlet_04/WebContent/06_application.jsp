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
String appPath=application.getContextPath();
String filePath=application.getRealPath("06_application.jsp");

%>
�� ���ø����̼��� ���ؽ�Ʈ ��<br>
<b><%=appPath %></b><br>
�� ���ø����̼��� ���� ��� ��<br>
<b><%=filePath %></b><br>
</body>
</html>