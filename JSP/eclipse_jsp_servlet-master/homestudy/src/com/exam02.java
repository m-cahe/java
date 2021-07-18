package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class exam02
 */
@WebServlet("/exam02")
public class exam02 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=EUC-KR");
		PrintWriter out = response.getWriter();
		String ip=request.getRemoteHost();
		if(ip.equals("")) {
			
			out.print("<html>");
			out.print("<body>");
			out.print("�ȳ��ϼ���!!");
			out.print("</body>");
			out.print("</html>");
		}
	}

}
