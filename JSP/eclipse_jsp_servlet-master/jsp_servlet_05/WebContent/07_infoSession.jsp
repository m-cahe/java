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
[1]���� ID [ <%=session.getId() %>]�Դϴ�. <br><hr>
[2]����� �� ����Ʈ�� ���ӹ� �ð��� <%= time_used %>�Դϴ�. <br><hr>
[3] ������ ��ȿ�ð��� <%= inactive %>�Դϴ�. <br><hr>
[4] ������ ���θ����������? <br>
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