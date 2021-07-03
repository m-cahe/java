<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR" import="kr.smhrd.MyUtil"%>
<%
	MyUtil myutil = new MyUtil();
int sum = myutil.nSum();
%>
<!--
웹개발방법론 모델 1방식 m 모델(java로만) v 뷰(jsp) -->
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
		<caption>모델 1 방식</caption>
		<tr>
			<td>1~100까지의 총합</td>
		<tr>
			<td><%=sum%></td>
	</table>

</body>
</html>