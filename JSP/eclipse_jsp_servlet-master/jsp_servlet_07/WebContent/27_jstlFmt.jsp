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
	톰캣 서버 기본 로케일 : <%=response.getLocale() %>
	<fmt:setLocale value="ko_kr"/>
	로케일 한국어로 설정 후 로케일 확인 : <%=response.getLocale() %>
	currency : <fmt:formatNumber value="10000" type="currency"></fmt:formatNumber>
	day : <fmt:formatDate value="${now }"/> 
	<fmt:setLocale value="ja_JP"/>
	로케일 일본어로 설정 후 로케일 확인 : <%=response.getLocale() %>
	currency : <fmt:formatNumber value="10000" type="currency"></fmt:formatNumber>
	day : <fmt:formatDate value="${now }"/> 
	<fmt:setLocale value="en_US"/>
	로케일 영어로 설정 후 로케일 확인 : <%=response.getLocale() %>
	currency : <fmt:formatNumber value="10000" type="currency"></fmt:formatNumber>
	day : <fmt:formatDate value="${now }"/> 
	</pre>
</body>
</html>