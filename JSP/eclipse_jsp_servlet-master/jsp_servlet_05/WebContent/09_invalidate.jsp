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
session.setAttribute("s_name1","���� ���ǿ� ����� ù��° ���̿���");
session.setAttribute("s_name2","���� ���ǿ� ����� 2��° ���̿���");
session.setAttribute("s_name3","���� ���ǿ� ����� 3��° ���̿���");
out.println("<h3> >> ���ǰ� �����ϱ� �� << <h3>");
Enumeration names;
names=session.getAttributeNames();
while(names.hasMoreElements()){
	String name=names.nextElement().toString();
	String value=session.getAttribute(name).toString();
	out.println(name+" : "+value+"<br>");
	
}


session.invalidate();


out.println("<h3> >> ���ǰ� �����ϱ� �� << <h3>");
out.println("���� ���� ���̵� ��ȿ�ұ��? <br>");
if(request.isRequestedSessionIdValid()){
	out.print("��ȿ�ϴ�");
}
else{
	out.print("�ƴϴ�");
}
%>
</body>
</html>