<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%request.setCharacterEncoding("EUC-KR"); %>
<jsp:useBean id="member" class="com.saeyan.javabeans.MemberBean"/>
<jsp:setProperty name="member" property="*"/>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h2>�Է� �Ϸ�� ȸ�� ����</h2>

		<table>
			<tr>
				<td>�̸�</td>
				<td><jsp:getProperty name="member" property="name"/></td>
			</tr>
			<tr>
				<td>���̵�</td>
				<td><jsp:getProperty name="member" property="userid"/></td>
			</tr>
			<tr>
				<td>����</td>
				<td><jsp:getProperty name="member" property="nickname"/></td>
			</tr>
			<tr>
				<td>��й�ȣ</td>
				<td><jsp:getProperty name="member" property="pwd"/></td>
			</tr>
			<tr>
				<td>�̸���</td>
				<td><jsp:getProperty name="member" property="email"/></td>
			</tr>
			<tr>
				<td>��ȭ��ȣ</td>
				<td><jsp:getProperty name="member" property="phone"/></td>
			</tr>
			


		</table>
</body>
</html>