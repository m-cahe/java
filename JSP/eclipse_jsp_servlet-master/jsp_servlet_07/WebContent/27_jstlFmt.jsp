<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<c:set var="now" value="<%=new java.util.Date() %>"></c:set>
	<pre>
	��Ĺ ���� �⺻ ������ : <%=response.getLocale() %>
	<fmt:setLocale value="ko_kr"/>
	������ �ѱ���� ���� �� ������ Ȯ�� : <%=response.getLocale() %>
	currency : <fmt:formatNumber value="10000" type="currency"></fmt:formatNumber>
	day : <fmt:formatDate value="${now }"/> 
	<fmt:setLocale value="ja_JP"/>
	������ �Ϻ���� ���� �� ������ Ȯ�� : <%=response.getLocale() %>
	currency : <fmt:formatNumber value="10000" type="currency"></fmt:formatNumber>
	day : <fmt:formatDate value="${now }"/> 
	<fmt:setLocale value="en_US"/>
	������ ����� ���� �� ������ Ȯ�� : <%=response.getLocale() %>
	currency : <fmt:formatNumber value="10000" type="currency"></fmt:formatNumber>
	day : <fmt:formatDate value="${now }"/> 
	</pre>
</body>
</html>