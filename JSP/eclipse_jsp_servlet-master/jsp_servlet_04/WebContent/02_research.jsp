<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="html/css">
b{
font-size : 16pt;}

</style>

</head>
<body>
	<h2>���� ���� ���</h2>
	<%
		request.setCharacterEncoding("EUC-KR");
	String name = request.getParameter("name");
	System.out.println(name);
	out.println("�̸� : <b>" + name + "</b><br>");

	String gender = request.getParameter("gender");
	out.println("���� : ");
	if (gender.equals("male")) {
		out.println("<b>����</b><br>");
	} else {
		out.println("<b>����</b><br>");
	}

	String[] seasonArr = request.getParameterValues("season");
	out.println("����� �����ϴ� ������ ");
	for (String season : seasonArr) {
		int n = Integer.parseInt(season);
		switch (n) {
		case 1:
			out.println("<b>��</b>�Դϴ�.<br>");
			break;
		case 2:
			out.println("<b>����</b>�Դϴ�.<br>");
			break;
		case 3:
			out.println("<b>����</b>�Դϴ�.<br>");
			break;
		case 4:
			out.println("<b>�ܿ�</b>�Դϴ�.<br>");
			break;
		}

	}
	%>
	<br>
	<b><a href='javascript:history.go(-1)'>�ٽ�</a></b>

</body>
</html>