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
	<pre>
	<c:set var="now" value="<%=new java.util.Date()%>"></c:set>
	\${now }=${now }
	<fmt:formatDate value="${now }"></fmt:formatDate>
	date:
	<fmt:formatDate value="${now }" type="date"></fmt:formatDate>
	time:
	<fmt:formatDate value="${now }" type="time"></fmt:formatDate>
	both:
	<fmt:formatDate value="${now }" type="both"></fmt:formatDate>
	default:
	<fmt:formatDate value="${now }" type="both" dateStyle="default"
			timeStyle="default"></fmt:formatDate>
	short:
	<fmt:formatDate value="${now }" type="both" dateStyle="default"
			timeStyle="default"></fmt:formatDate>
	medium:
	<fmt:formatDate value="${now }" type="both" dateStyle="medium"
			timeStyle="medium"></fmt:formatDate>
	long:
	<fmt:formatDate value="${now }" type="both" dateStyle="long"
			timeStyle="long"></fmt:formatDate>
	full:
	<fmt:formatDate value="${now }" type="both" dateStyle="full"
			timeStyle="full"></fmt:formatDate>

	pattern="yyyy�� MM�� dd�� hh�� mm�� ss��" :
<fmt:formatDate value="${now }" pattern="yyyy�� MM�� dd�� hh�� mm�� ss��" />
</pre>
</body>
</html>