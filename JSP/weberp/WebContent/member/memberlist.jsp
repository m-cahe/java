<%@ page language="java" contentType="text/html; charset=EUC-KR"
   pageEncoding="EUC-KR"%>
<%@ page import="kr.smhrd.model.*"%>
<%@ page import="java.util.*"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!-- �ؿ� ${vo.num}�̰ž�����! �ʿ� -->
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
      //������ ������ ������ �ǰ� �ϴ±��
      //��������������û(memberDelete.jsp)
      location.href="memberDelete.do?num="+num;

   }
</script>
</head>
<body>
   <table class="tg">
      <h3>ȸ������Ʈ</h3>
      <thead>
         <tr bgcolor="skyblue">
            <th class="tg-uog8">��ȣ</th>
            <th class="tg-0lax">���̵�</th>
            <th class="tg-0lax">��й�ȣ</th>
            <th class="tg-0lax">�̸�</th>
            <th class="tg-0lax">��ȭ��ȣ</th>
            <th class="tg-0lax">�̸���</th>
            <th class="tg-0lax">�ּ�</th>
            <th class="tg-0lax">����</th>
         </tr>
      </thead>
      <tbody>
      <!-- ����� -->
       <c:forEach var="vo" items="${list}"> 
  <tr>
    <td class="tg-0lax">${vo.num}</td>
    <td class="tg-0lax"><a href="/weberp/memberContent.do?num=${vo.num}">${vo.id}</a></td>
    <td class="tg-0lax">${vo.pw}</td>
    <td class="tg-0lax">${vo.name}</td>
    <td class="tg-0lax">${vo.tel}</td>
    <td class="tg-0lax">${vo.email}</td>
    <td class="tg-0lax">${vo.addr}</td>
    <td class="tg-0lax"><input type="button" value="����" onclick="memberDel(${vo.num})"/></td>
  </tr>
  </c:forEach>   
         <tr>
            <td class="tg-lqy6" colspan="8"><input type="button"
               value="ȸ������" onclick="location.href='member/member.html'" /></td>
         </tr>
      </tbody>
   </table>
</body>
</html>