<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>


<%!
String str = "안녕하세요!";
int a = 5, b = -5;

public int abs(int n) {
	if (n < 0) {
		n = -n;
	}
	return n;
}



%>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%=str%><br>
<%=a %>의 절대값 : <%= abs(a) %><br>
<%=b %>의 절대값 : <%= abs(b) %><br>
</body>
</html>