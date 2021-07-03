<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%!//1부터 10까지 총 합을 구하는 메소드 구하기
	public int hap() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		return sum;
	}%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>


	<%
		int sum = hap();
	
	%>
	<table border='1'>

		<tr>
			<td>총합</td>
			<td><%=sum%></td>
		</tr>

	</table>
</body>
</html>
<!-- java web programming jsp==servlet 두개의 형태만 다르다-->