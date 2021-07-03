package kr.smhrd.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.model.MemberDAO;
import kr.smhrd.model.MemberVO;

@WebServlet("/memberupdate.do")
public class MemberUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MemberUpdateController() {
		super();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=EUC-KR");
		request.setCharacterEncoding("EUC-KR");
		MemberDAO dao = new MemberDAO();
		String num1 = request.getParameter("num");
		int num = Integer.parseInt(num1);
		String tel = request.getParameter("tel");
		String email = request.getParameter("email");
		String addr = request.getParameter("addr");
		MemberVO vo = new MemberVO(num, tel, email, addr);
		if (dao.memberUpdate(vo) > 0) {
			response.sendRedirect("/weberp/memberlist.do");
		} else {
			throw new ServletException("½ÇÆÐ");
		}
	}

}
