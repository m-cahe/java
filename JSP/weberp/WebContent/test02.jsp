<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%!//1���� 10���� �� ���� ���ϴ� �޼ҵ� ���ϱ�
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
			<td>����</td>
			<td><%=sum%></td>
		</tr>

	</table>
</body>
</html>
<!-- java web programming jsp==servlet �ΰ��� ���¸� �ٸ���-->