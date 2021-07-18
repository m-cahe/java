<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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

		<h1>�Խñ� �󼼺���</h1>
		<table>

			<tr>
				<th>�ۼ���</th>
				<td>${board.name}</td>
				<th>�̸���</th>
				<td>${board.email}</td>
			</tr>
			<tr>
				<th>�ۼ���</th>
				<td><fmt:formatDate value="${board.writedate}" /></td>
				<th>��ȸ��</th>
				<td>${board.readcount}</td>
			</tr>
			<tr>
				<th>����</th>
				<td colspan="3"><pre>${board.content}</pre></td>
			</tr>
		</table>
		<br>
		<br> <input type="button" value="�Խñ� ����"
			onclick="open_win('BoardServlet?command=board_check_pass_form&num=${board.num}', 'update')">
		<input type="button" value="�Խñ� ����"
			onclick="open_win('BoardServlet?command=board_check_pass_form&num=${board.num}', 'delete')">
		<input type="button" value="�Խñ� ����Ʈ"
			onclick="location.href='BoardServlet?command=board_list'"> <input
			type="button" value="�Խñ� ���"
			onclick="location.href='BoardServlet?command=board_write_form'">

	</div>
</body>
</html>