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
//1. 쿠키 객체 생성
Cookie c=new Cookie("id", "pinksung");
//2. 유효기간 설정
c.setMaxAge(365*24*60*60);
//3. 클라이언트에 쿠키 전송
response.addCookie(c);
//4. 쿠키를 생성하여 클라이언트에 전송
response.addCookie(new Cookie("pwd","test1234"));
response.addCookie(new Cookie("age","20"));

%>
z쿠키설정
</body>
</html>