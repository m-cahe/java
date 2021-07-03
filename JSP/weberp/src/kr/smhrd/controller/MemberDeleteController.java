package kr.smhrd.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.model.MemberDAO;

/**
 * Servlet implementation class MemberDeleteController
 */
@WebServlet("/memberDelete.do")
public class MemberDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MemberDeleteController() {
		super();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=EUC-KR");
		request.setCharacterEncoding("EUC-KR");
		PrintWriter out = response.getWriter();
		MemberDAO dao = new MemberDAO();
		String num = request.getParameter("num");
		if (dao.memberDelete(num) > 0) {
			response.sendRedirect("/weberp/memberlist.do");
		} else {
			out.println("삭제 실패!!");
		}
	}

}
