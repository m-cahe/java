<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
당신이 입력한 정보입니다.(고전적인 방식)
아이디 : <%=request.getParameter("id") %>
비밀번호 : <%=request.getParameter("pwd") %>
<br><Br>
당신이 입력한 정보입니다. (EL방식)
아이디 :  ${param.id }
비밀번호 : ${param["pwd"] }
</body>
</html>