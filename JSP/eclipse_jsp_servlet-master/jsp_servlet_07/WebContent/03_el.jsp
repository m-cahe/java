<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
\${5+2 } : ${5+2 } <br>
\${5/2 } : ${5/2 } <br>
<%--
\${5 div 2 } : ${5 div 2 } <br>
 --%>
\${5 mod 2 } : ${5 mod 2 } <br>
\${5 > 2 } : ${5 > 2 } <br>
\${2 gt 10 } : ${2 gt 10 } <br>
\${(5>2)?5:2 } : ${(5>2)?5:2  } <br>
\${(5>2)||(2<10) } : ${(5>2)||(2<10) } <br>
<%

String input=null;
%>
\${empty input } : ${empty input }<br>
</body>
</html>