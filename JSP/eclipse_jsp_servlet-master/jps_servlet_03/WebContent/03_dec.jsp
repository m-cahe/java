<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%!String str = "�ȳ��ϼ���!";
	int a = 5, b = -5;

	public int abs(int n) {
		if (n < 0) {
			n = -n;
		}
		return n;
	}%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%out.print(str+"<br>");
out.print(a+"�� ���� : "+ abs(a)+"<br>");
out.print(b+"�� ���� : "+ abs(b)+"<br>");
%>
</body>
</html>