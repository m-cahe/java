package kr.smhrd.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.model.MemberDAO;
import kr.smhrd.model.MemberVO;

@WebServlet("/memberContent.do")
public class MemberContentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MemberContentController() {
		super();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		 * response.setContentType("text/html;charset=EUC-KR");
		 * request.setCharacterEncoding("EUC-KR"); PrintWriter out =
		 * response.getWriter();
		 */
		MemberDAO dao = new MemberDAO();
		int num = Integer.parseInt(request.getParameter("num"));
		MemberVO vo = dao.memberContent(num);
		
		request.setAttribute("vo", vo);//��ü���ε�
		RequestDispatcher rd = request.getRequestDispatcher("member/memberContent.jsp");
		rd.forward(request, response);
		
		
		/*
		 * if (vo != null) { out.println("<html>"); out.println("<body>");
		 * out.println("�󼼺���");
		 * out.println("<form action='/weberp/memberupdate.do' method='post'>");
		 * out.println("<input type='hidden' name='num' value='" + vo.getNum() + "'>");
		 * out.println("<table border='1'>"); out.println("<tr>");
		 * out.println("<td>��ȣ</td>"); out.println("<td>" + vo.getNum() + "</td>");
		 * out.println("</tr>"); out.println("<tr>"); out.println("<td>���̵�</td>");
		 * out.println("<td>" + vo.getId() + "</td>"); out.println("</tr>");
		 * out.println("<tr>"); out.println("<td>��й�ȣ</td>"); out.println("<td>" +
		 * vo.getPw() + "</td>"); out.println("</tr>"); out.println("<tr>");
		 * out.println("<td>�̸�</td>"); out.println("<td>" + vo.getName() + "</td>");
		 * out.println("</tr>"); out.println("<tr>"); out.println("<td>��ȭ��ȣ</td>");
		 * out.println("<td><input type='text' name='tel' value='" + vo.getTel() +
		 * "'/></td>"); out.println("</tr>"); out.println("<tr>");
		 * out.println("<td>�̸���</td>");
		 * out.println("<td><input type='text' name='email' value='" + vo.getEmail() +
		 * "'/></td>"); out.println("</tr>"); out.println("<tr>");
		 * out.println("<td>�ּ�</td>");
		 * out.println("<td><input type='text' size='50' name='addr' value='" +
		 * vo.getAddr() + "'/></td>"); out.println("</tr>"); out.println("<tr>");
		 * out.println("<td colspan='2' align='center'>");
		 * out.println("<input type='submit' value='�����ϱ�'/>");
		 * out.println("<input type='reset' value='���'/>");
		 * out.println("<a href='/weberp/memberList.do'>����Ʈ��</a>");
		 * out.println("</td>"); out.println("</tr>"); out.println("</table>");
		 * out.println("</form>"); out.println("</body>"); out.println("</html>"); }
		 * else {
		 * 
		 * }
		 */

	}

}
