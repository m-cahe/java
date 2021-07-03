package kr.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.MyUtil;

//JavaEE(Servlet ����)
public class HelloServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		// Servlet(Controller)
		// 1.Ŭ���̾�Ʈ�� [��û]�� �޴� �۾�
		// 2.��û�� ���� ó�����Ѵ�.
		// ����Ͻ����� -> model
		MyUtil mu = new MyUtil();
		int sum = mu.nSum();
		// 3.Ŭ���̾�Ʈ���� [����]�� �Ѵ�
		// Hello Servlet~
		// ���������̼� ����(view) -> jsp ����Ͻ� ���� -> model
		// MIME-Type
		// �ѱ� �ȱ�����
		res.setContentType("text/html;charset=UTF-8");
		PrintWriter out = res.getWriter();
		out.println("<html><body>");
		out.println("<table border='1'>");
		out.println("<tr><td>");
		out.println("�� �� ");
		out.println("</td><td>");
		out.println(sum);
		out.println("</td></tr></table>");
		out.println("</body></html>");

		// ��û�� ���?
		// http://127.0.0.1:8081/web/WEB-INF/classes/kr.controller.HelloServlet
		// http://127.0.0.1:8081/web/

	}
}
