<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR" import="kr.smhrd.MyUtil"%>
<%
	MyUtil myutil = new MyUtil();
int sum = myutil.nSum();
%>
<!--
�����߹���� �� 1��� m ��(java�θ�) v ��(jsp) -->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
table {
	width: 20%;
	border: 1px solid #444444;
	border-collapse: collapse;
}

td {
	border: 1px solid #444444;
}
</style>
</head>
<body>
	<table border="1">
		<caption>�� 1 ���</caption>
		<tr>
			<td>1~100������ ����</td>
		<tr>
			<td><%=sum%></td>
	</table>

</body>
</html>