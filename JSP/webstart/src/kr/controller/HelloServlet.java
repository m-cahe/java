package kr.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.MyUtil;

//JavaEE(Servlet 구조)
public class HelloServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		// Servlet(Controller)
		// 1.클라이언트의 [요청]을 받는 작업
		// 2.요청에 따른 처리를한다.
		// 비즈니스로직 -> model
		MyUtil mu = new MyUtil();
		int sum = mu.nSum();
		// 3.클라이언트에게 [응답]을 한다
		// Hello Servlet~
		// 프레젠테이션 로직(view) -> jsp 비즈니스 로직 -> model
		// MIME-Type
		// 한글 안깨지게
		res.setContentType("text/html;charset=UTF-8");
		PrintWriter out = res.getWriter();
		out.println("<html><body>");
		out.println("<table border='1'>");
		out.println("<tr><td>");
		out.println("총 합 ");
		out.println("</td><td>");
		out.println(sum);
		out.println("</td></tr></table>");
		out.println("</body></html>");

		// 요청을 어떻게?
		// http://127.0.0.1:8081/web/WEB-INF/classes/kr.controller.HelloServlet
		// http://127.0.0.1:8081/web/

	}
}
