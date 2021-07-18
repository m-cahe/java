<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ page import="java.util.Enumeration" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
session.setAttribute("s_name1","저는 세션에 저장된 첫번째 값이에요");
session.setAttribute("s_name2","저는 세션에 저장된 2번째 값이에요");
session.setAttribute("s_name3","저는 세션에 저장된 3번째 값이에요");
out.println("<h3> >> 세션값 삭제하기 전 << <h3>");
Enumeration names;
names=session.getAttributeNames();
while(names.hasMoreElements()){
	String name=names.nextElement().toString();
	String value=session.getAttribute(name).toString();
	out.println(name+" : "+value+"<br>");
	
}


session.invalidate();


out.println("<h3> >> 세션값 삭제하기 후 << <h3>");
out.println("과연 세션 아이디가 유효할까요? <br>");
if(request.isRequestedSessionIdValid()){
	out.print("유효하다");
}
else{
	out.print("아니다");
}
%>
</body>
</html>