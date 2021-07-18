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
		int answer = 0;
	int num1 = Integer.parseInt(request.getParameter("num1"));
	int num2 = Integer.parseInt(request.getParameter("num2"));
	String select = request.getParameter("select");
	if (select.equals("+")) {
		answer = num1 + num2;
	} else if (select.equals("-")) {
		answer = num1 - num2;
	} else if (select.equals("*")) {
		answer = num1 * num2;
	} else if (select.equals("/")) {
		answer = num1 / num2;
	}
	%>
	<h1><%=num1%>
		<%=select%>
		<%=num2%>
		=
		<%=answer%></h1>
</body>
</html>