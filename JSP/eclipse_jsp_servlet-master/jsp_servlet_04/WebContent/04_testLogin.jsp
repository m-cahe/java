<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="java.net.URLEncoder"%>
<%
	String id = "pinksung";
String pwd = "1234";
String name = "¼ºÀ±Á¤";

request.setCharacterEncoding("EUC-KR");

if (id.equals(request.getParameter("id")) && pwd.equals(request.getParameter("pwd"))) {

	response.sendRedirect("04_main.jsp?name=" + URLEncoder.encode(name, "EUC-KR"));

} else {
	response.sendRedirect("04_loginForm.jsp");
}
%>