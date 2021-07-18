<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="member" class="com.saeyan.javabeans.MemberBean"></jsp:useBean>
	<hr>
	자바 빈 객체 생성 후 저장된 정보 출력하기
	<br>
	<br> 이름 :
	<jsp:getProperty name="member" property="name"/>
	<br> 
	아이디 :
	<jsp:getProperty name="member" property="userid"/><br>
	<hr>
	
	자바 빈 객체 생성 후  변경된 정보 출력하기<br>
	
	<jsp:setProperty property="name" name="member" value="전수빈"/>
	<jsp:setProperty property="userid" name="member" value="pinksungbin"/>
	
	이름 :
	<jsp:getProperty name="member" property="name"/>
	<br> 
	아이디 :
	<jsp:getProperty name="member" property="userid"/><br>
	
</body>
</html>