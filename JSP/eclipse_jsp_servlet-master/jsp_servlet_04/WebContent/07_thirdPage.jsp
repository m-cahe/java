<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
�ϳ��� ������ �Ӽ� :
	<%=pageContext.getAttribute("name")%><br> �ϳ��� ��û �Ӽ� :
	<%=request.getAttribute("name")%><br> �ϳ��� ���� �Ӽ� :
	<%=session.getAttribute("name")%><br> �ϳ��� ���ø����̼� �Ӽ� :
	<%=application.getAttribute("name")%><br>
</body>
</html>