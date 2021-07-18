<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%
	int age = Integer.parseInt(request.getParameter("age"));
if (age <= 19) {
%>



<script type="text/javascript">
	alert("19미만이므로 입장 불가능")
	history.go(-1)
</script>
<%
	} else {
//저장함
request.setAttribute("name", "성윤정");
RequestDispatcher dispatcher = request.getRequestDispatcher("05_forwardResult.jsp");
dispatcher.forward(request, response);

}
%>