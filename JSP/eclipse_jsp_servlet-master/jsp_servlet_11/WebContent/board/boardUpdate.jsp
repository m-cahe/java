<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/shopping.css">
<script type="text/javascript" src="script/board.js"></script>
</head>
<body>
	<div id="wrap" align="center">

		<h1>�Խñ� ����</h1>
		<form name="frm" method="post" action="BoardServlet">
			<input type="hidden" name="command" value="board_update"> <input
				type="hidden" name="num" value="${board.num}">
			<table>
				<tr>
					<th>�ۼ���</th>
					<td><input type="text" size="12" name="name"
						value="${board.name}">* �ʼ�</td>
				</tr>
				<tr>
					<th>��й�ȣ</th>
					<td><input type="password" name="pass" size="12"> * �ʼ�
						(�Խù� ���� �� ���� �� �ʿ��մϴ�.)</td>
				</tr>
				<tr>
					<th>�̸���</th>
					<td><input type="text" size="40" maxlength="50" name="email"
						value="${board.email}"></td>
				</tr>
				<tr>
					<th>����</th>
					<td><input type="text" size="70" name="title"
						value="${board.title}"></td>
				</tr>
				<tr>
					<th>����</th>
					<td><textarea cols="70" rows="15" name="content">${board.content}</textarea></td>
				</tr>
			</table>
			<br>
			<br> <input type="submit" value="���"
				onclick="return boardCheck()"> <input type="reset"
				value="�ٽ� �ۼ�"> <input type="button" value="���"
				onclick="location.href='BoardServlet?command=board_list'">"
		</form>



	</div>
</body>
</html>