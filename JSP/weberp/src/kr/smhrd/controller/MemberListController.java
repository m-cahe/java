package kr.smhrd.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.model.MemberDAO;
import kr.smhrd.model.MemberVO;

/**
 * Servlet implementation class MemberListController
 */
@WebServlet("/memberlist.do")
public class MemberListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MemberListController() {
	}

//회원리스트 가져오기
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=EUC-KR");
		request.setCharacterEncoding("EUC-KR");
		PrintWriter out = response.getWriter();
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberVO> list = dao.memberAllList();
		// 페이지 전환하는 기술 : 1.redirect 기술,
		// 2. forward 기술
		request.setAttribute("list", list);//객체바인딩
		RequestDispatcher rd = request.getRequestDispatcher("member/memberlist.jsp");
		rd.forward(request, response);
		/*
		 * out.println("<html><body><table border='1'>"); out.println("<tr>");
		 * out.println("<td>번호</td>"); out.println("<td>아이디</td>");
		 * out.println("<td>비밀번호</td>"); out.println("<td>이름</td>");
		 * out.println("<td>전화번호</td>"); out.println("<td>이메일</td>");
		 * out.println("<td>주소</td>"); out.println("<td>삭제</td>"); out.println("</tr>");
		 * for (int i = 0; i < list.size(); i++) { //
		 * out.println("<td><a href='/weberp/memberContent.do?num="+vo.getNum()+"'>" +
		 * vo.getId() + "<a/></td>");
		 * 
		 * out.println("<tr><td>"); out.print(list.get(i).getNum());
		 * out.println("</td><td>");
		 * out.print("<a href='/weberp/membercontent.do?num=");
		 * out.print(list.get(i).getNum()); out.println("'>");
		 * out.println(list.get(i).getId()); out.println("</a></td><td>");
		 * out.print(list.get(i).getPw()); out.println("</td><td>");
		 * out.print(list.get(i).getName()); out.println("</td><td>");
		 * out.print(list.get(i).getTel()); out.println("</td><td>");
		 * out.print(list.get(i).getEmail()); out.println("</td><td>");
		 * out.print(list.get(i).getAddr()); out.println("</td>");
		 * out.println("<td><a href='/web/memberdelete.do?num=");
		 * out.println(list.get(i).getNum()); out.println("'>삭제");
		 * out.println("</a></td>"); //
		 * out.println("<td><a href='/weberp/memberdelete.do?num="+list.get(i).getNum()+
		 * "'>삭제</a></td>"); out.println("</tr>"); }
		 * out.println("<tr><td colspan='7' align='right'>"); out.
		 * println("<input type='button' value='회원가입' onClick=\"location.href='member/member.html'\"/>"
		 * ); out.println("<a href='member/member.html'>회원가입</a>");
		 * out.println("</td></tr>"); out.println("</html></body></table>");
		 */
	}

}
