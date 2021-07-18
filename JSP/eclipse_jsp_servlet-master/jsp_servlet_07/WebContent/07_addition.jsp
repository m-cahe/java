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
int num1= (Integer)request.getAttribute("num1");
int num2= (Integer)request.getAttribute("num2");

%>
<%= num1 %>+<%=num2 %>=<%= num1+num2 %><br><br>

${num1 }+${num2 }=${num1+num2 }
</body>
</html>