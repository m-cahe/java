<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<script type="text/javascript">
		if (window.name == "update") {
			window.opener.parent.location.href = "BoardServlet?command=board_update_form&num=${param.num}";
		} else if (window.name == 'delete') {
			alert('�����Ǿ����ϴ�.');
			window.opener.parent.location.href = "BoardServlet?command=board_delete&num=${param.num}";
		}
		window.close();
	</script>
</body>
</html>