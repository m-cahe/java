<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="member" class="com.saeyan.javabeans.MemberBean" />


자바 빈 객체 생성 후 저장된 정보 출력하기 <br><br>
 이름 : <%=member.getName() %> <br>
 아이디 : <%=member.getUserid() %> <br>
 <hr>
 
  정보 변경한 후 변경된 정보 출력하기 <br><br>
  <%	member.setName("전수빈");
  	member.setUserid("pinksubin");
  %>
 이름 : <%=member.getName() %> <br>
 아이디 : <%=member.getUserid() %> <br>
  


</body>
</html>