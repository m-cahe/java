<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="java.util.Enumeration"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h3>session information method</h3>
	<%
		String id_str = session.getId();
	long lasttime = session.getLastAccessedTime();
	long createdtime = session.getCreationTime();
	long time_used = (lasttime - createdtime) / 60000;
	int inactive = session.getMaxInactiveInterval() / 60;
	boolean b_new = session.isNew();
	%>
[1]세션 ID [ <%=session.getId() %>]입니다. <br><hr>
[2]당신이 웹 사이트에 ㅁ머문 시간은 <%= time_used %>입니다. <br><hr>
[3] 세션의 유효시간은 <%= inactive %>입니다. <br><hr>
[4] 세션이 새로만들어졌나요? <br>
<%
if(b_new){
	out.println("OK");
}
else{
	out.println("NO");
}



%>
</body>
</html>