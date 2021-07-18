<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%!int sum = 0;
	int num = 100;

	public int hap(int num) {
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		return sum;
	}%>
	
	
	<h1>1~<%=num %>까지의 합은</h1>
	<h2><%=hap(num) %></h2>
</body>
</html>