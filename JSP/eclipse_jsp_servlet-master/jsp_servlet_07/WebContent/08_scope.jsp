<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<% 
pageContext.setAttribute("name", "page man");
request.setAttribute("name", "request man");
session.setAttribute("name", "session man");
application.setAttribute("name", "application man");


%>
name : ${name} <hr>
page : ${pageScope.name} <br>
request : ${requestScope.name} <br>
session : ${sessionScope.name} <br>
application : ${applicationScope.name} <br>