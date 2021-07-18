<%@page import="java.net.URLEncoder"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = null;

	Class.forName("oracle.jdbc.driver.OracleDriver");
	String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
	String db_id = "hr";
	String db_pw = "hr";
	Connection conn = DriverManager.getConnection(db_url, db_id, db_pw);
	String sql = "select * from studymember where id=? and pw=?";
	PreparedStatement psmt = conn.prepareStatement(sql);
	psmt.setString(1, id);
	psmt.setString(2, pw);

	ResultSet rs = psmt.executeQuery();
	if (rs.next()) {
		name = rs.getString(3);
	}
	if (rs != null) {
		rs.close();
	}
	if (psmt != null) {
		psmt.close();
	}
	if (conn != null) {
		conn.close();
	}

	if (name != null) {
		System.out.println("로그인 성공");
		response.sendRedirect("loginSuccess.jsp?name="+URLEncoder.encode(name,"EUT-KR"));
	} else {
		System.out.println("로그인 실패");
		response.sendRedirect("loginFail.jsp");
	}
	%>
</body>
</html>