<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="java.net.URLEncoder"%>
<%
	String userID = request.getParameter("userID");
String userPwd = request.getParameter("userPwd");
String loginCheck = request.getParameter("loginCheck");
if (loginCheck.equals("user")) {
%>
<jsp:forward page="09_userMain.jsp">
	<jsp:param value='<%=URLEncoder.encode("傈绊按", "EUC-KR")%>'
		name="userName" />

</jsp:forward>

<%
	} else {
%>

<jsp:forward page="09_managerMain.jsp">
	<jsp:param value='<%=URLEncoder.encode("己包府", "EUC-KR")%>'
		name="userName" />
</jsp:forward>






<%
	}
%>