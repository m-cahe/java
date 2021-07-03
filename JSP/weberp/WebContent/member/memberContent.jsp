<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="kr.smhrd.model.*"%>
<%
	//int num = Integer.parseInt(request.getParameter("num"));
/* 
MemberDAO dao = new MemberDAO();
MemberVO vo = dao.memberContent(num); */
//MemberVO vo=(MemberVO)request.getAttribute("vo");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
.tg {
	border-collapse: collapse;
	border-spacing: 0;
}

.tg td {
	border-color: black;
	border-style: solid;
	border-width: 1px;
	font-family: Arial, sans-serif;
	font-size: 14px;
	overflow: hidden;
	padding: 10px 5px;
	word-break: normal;
}

.tg th {
	border-color: black;
	border-style: solid;
	border-width: 1px;
	font-family: Arial, sans-serif;
	font-size: 14px;
	font-weight: normal;
	overflow: hidden;
	padding: 10px 5px;
	word-break: normal;
}

.tg .tg-baqh {
	text-align: center;
	vertical-align: top
}

.tg .tg-adx7 {
	background-color: #ffcc67;
	text-align: center;
	vertical-align: top
}

.tg .tg-0lax {
	text-align: left;
	vertical-align: top
}
</style>
</head>

<body>
	<h1>${vo.name}의 상세보기 페이지(jstl+el)
	</h1>
	<form action='/weberp/memberupdate.do' method='post'>
		<input type='hidden' name='num' value="${vo.name}">
		<table class="tg" style="table-layout: fixed; width: 474px">
			<colgroup>
				<col style="width: 94px">
				<col style="width: 380px">
			</colgroup>
			<thead>
				<tr>
					<th class="tg-adx7">번호</th>
					<th class="tg-0lax">${vo.num}</th>
				</tr>
			</thead>
			<tbody>



				<tr>
					<td class="tg-adx7">아이디</td>
					<td class="tg-0lax">${vo.id}</td>
				</tr>
				<tr>
					<td class="tg-adx7">비밀번호</td>
					<td class="tg-0lax">${vo.pw}</td>
				</tr>
				<tr>
					<td class="tg-adx7">이름</td>
					<td class="tg-0lax">${vo.name}</td>
				</tr>
				<tr>
					<td class="tg-adx7">전화번호</td>
					<td class="tg-0lax"><input type='text' name='tel'
						value='${vo.tel}' /></td>
				</tr>
				<tr>
					<td class="tg-adx7">이메일</td>
					<td class="tg-0lax"><input type='text' name='email'
						value='${vo.email}' /></td>
				</tr>
				<tr>
					<td class="tg-adx7">주소</td>
					<td class="tg-0lax"><input type='text' name='addr'
						value='${vo.addr}' /></td>
				</tr>

				<tr>
					<td class="tg-baqh" colspan="2"><input type='submit'
						value='수정하기' /><input type='reset' value='취소' /><input
						type='button' value='리스트' onclick="location.href='/weberp/memberlist.do'" /></td>
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>