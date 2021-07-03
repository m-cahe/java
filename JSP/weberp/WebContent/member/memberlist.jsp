<%@ page language="java" contentType="text/html; charset=EUC-KR"
   pageEncoding="EUC-KR"%>
<%@ page import="kr.smhrd.model.*"%>
<%@ page import="java.util.*"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!-- 밑에 ${vo.num}이거쓰려면! 필요 -->
<%
   //MemberDAO dao = new MemberDAO();
   //ArrayList<MemberVO> list=dao.memberAIIList();
   //ArrayList<MemberVO> list=(ArrayList<MemberVO>)request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
body {
   font-size: 13px;
}

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

.tg .tg-lqy6 {
   text-align: right;
   vertical-align: top
}

.tg .tg-uog8 {
   border-color: inherit;
   text-align: left;
   text-decoration: underline;
   vertical-align: top
}

.tg .tg-0lax {
   text-align: left;
   vertical-align: top
}
</style>
<script>
   function memberDel(num) {
      //삭제를 누르면 삭제가 되게 하는기능
      //삭제페이지를요청(memberDelete.jsp)
      location.href="memberDelete.do?num="+num;

   }
</script>
</head>
<body>
   <table class="tg">
      <h3>회원리스트</h3>
      <thead>
         <tr bgcolor="skyblue">
            <th class="tg-uog8">번호</th>
            <th class="tg-0lax">아이디</th>
            <th class="tg-0lax">비밀번호</th>
            <th class="tg-0lax">이름</th>
            <th class="tg-0lax">전화번호</th>
            <th class="tg-0lax">이메일</th>
            <th class="tg-0lax">주소</th>
            <th class="tg-0lax">삭제</th>
         </tr>
      </thead>
      <tbody>
      <!-- 여기는 -->
       <c:forEach var="vo" items="${list}"> 
  <tr>
    <td class="tg-0lax">${vo.num}</td>
    <td class="tg-0lax"><a href="/weberp/memberContent.do?num=${vo.num}">${vo.id}</a></td>
    <td class="tg-0lax">${vo.pw}</td>
    <td class="tg-0lax">${vo.name}</td>
    <td class="tg-0lax">${vo.tel}</td>
    <td class="tg-0lax">${vo.email}</td>
    <td class="tg-0lax">${vo.addr}</td>
    <td class="tg-0lax"><input type="button" value="삭제" onclick="memberDel(${vo.num})"/></td>
  </tr>
  </c:forEach>   
         <tr>
            <td class="tg-lqy6" colspan="8"><input type="button"
               value="회원가입" onclick="location.href='member/member.html'" /></td>
         </tr>
      </tbody>
   </table>
</body>
</html>