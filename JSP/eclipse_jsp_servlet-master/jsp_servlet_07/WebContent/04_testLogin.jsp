<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
����� �Է��� �����Դϴ�.(�������� ���)
���̵� : <%=request.getParameter("id") %>
��й�ȣ : <%=request.getParameter("pwd") %>
<br><Br>
����� �Է��� �����Դϴ�. (EL���)
���̵� :  ${param.id }
��й�ȣ : ${param["pwd"] }
</body>
</html>