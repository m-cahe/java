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
	�ڹ� �� ��ü ���� �� ����� ���� ����ϱ�
	<br>
	<br> �̸� :
	<jsp:getProperty name="member" property="name"/>
	<br> 
	���̵� :
	<jsp:getProperty name="member" property="userid"/><br>
	<hr>
	
	�ڹ� �� ��ü ���� ��  ����� ���� ����ϱ�<br>
	
	<jsp:setProperty property="name" name="member" value="������"/>
	<jsp:setProperty property="userid" name="member" value="pinksungbin"/>
	
	�̸� :
	<jsp:getProperty name="member" property="name"/>
	<br> 
	���̵� :
	<jsp:getProperty name="member" property="userid"/><br>
	
</body>
</html>