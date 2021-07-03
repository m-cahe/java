<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="kr.smhrd.model.*"%>
<%@ page import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	ArrayList<MemberVO> list = new ArrayList<>();
MemberVO vo1 = new MemberVO();
vo1.setName("손준호");
vo1.setId("aaa");
list.add(vo1);
list.add(vo1);
list.add(vo1);
request.setAttribute("list", list);

/* MemberVO[] mrr = new MemberVO[3];
mrr[0] = new MemberVO();
mrr[0].setName("나길동");
mrr[0].setId("Aaa");
mrr[1] = new MemberVO();
mrr[1].setName("나길동1");
mrr[1].setId("Aaa1");
mrr[2] = new MemberVO();
mrr[2].setName("나길동2");
mrr[2].setId("Aaa2"); */
//request.setAttribute("mrr", mrr);
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<c:forEach var="vo" items="${list}">
			<!-- items 가 getAtrribute와 같다 -->			
			<tr>
				<td>${vo.name }</td>
				<td>${vo.id }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>