package kr.smhrd.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.model.MemberDAO;
import kr.smhrd.model.MemberVO;
import kr.smhrd.model.MyUtil;

@WebServlet("/memberInsert.do")
public class MemberInsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MemberInsertController() {
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//파라메터 수집 -> VO
		response.setContentType("text/html;charset=EUC-KR");
		request.setCharacterEncoding("EUC-KR");
//		response.setCharacterEncoding("UTF-8");
//		response.setContentType("text/html; charset=UTF-8");
//		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String tel = request.getParameter("tel");
		String email = request.getParameter("email");
		String addr = request.getParameter("addr");

		MemberVO vo = new MemberVO(id, pw, name, tel, email, addr);
		MemberDAO dao = new MemberDAO();
		if (dao.memberInsert(vo) > 0) {
			response.sendRedirect("/weberp/memberlist.do");
//			out.println("회원가입성공");
//			out.println("<html><body>");
//			out.println(id);
//			out.println("<br>");
//			out.println(pw);
//			out.println("<br>");
//			out.println(name);
//			out.println("<br>");
//			out.println(tel);
//			out.println("<br>");
//			out.println(email);
//			out.println("<br>");
//			out.println(addr);
//			out.println("<br>");
//			out.print("</body></html>");
		} else {
			throw new ServletException("회원가입 실패");
		}
		out.close();

	}

}
