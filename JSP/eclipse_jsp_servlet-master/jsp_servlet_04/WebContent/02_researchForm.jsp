<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<h2>��������</h2>
	<form action="02_research.jsp" method="post">

		<table>
			<tr>
				<td>�̸� :</td>
				<td><input type="text" name="name" size="20"></td>
			</tr>
			<tr>
				<td>���� :</td>
				<td><input type="radio" name="gender" value="male"
					checked="checked">���� <input type="radio"
					name="gender" value="female">����</td>
			</tr>
			<tr>

				<td>�����ϴ� ���� :</td>
				<td><input type="checkbox" name="season" value="1"> �� <input
					type="checkbox" name="season" value="2" checked="checked">
					���� <input type="checkbox" name="season" value="3"> ���� <input
					type="checkbox" name="season" value="4"> �ܿ�
				<td>
			</tr>
			<tr align="center">
				<td><input type="submit" value="����"></td>
				<td><input type="reset" value="���"></td>
			</tr>

		</table>


	</form>


</body>
</html>