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
		for (int i = 0; i < 5; i++) {
	%>
	<font size="<%=i%>">����ȣ~~</font>
	<br>
	<%
		}
	%>
</body>
</html>
<!-- jsp�����伭 (���α׷����� ���)
1.������ import (page taglib include)
2. ��ũ��Ʈ��
3. ���� �޼ҵ� ���鶧
4. ��½� =  ����, �޼ҵ� ȣ�⹮
5. �ּ� <    %  --
+
html css js      jsp
-->
