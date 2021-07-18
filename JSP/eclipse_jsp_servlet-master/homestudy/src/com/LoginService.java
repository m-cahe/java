package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginService
 */
@WebServlet("/loginservice")
public class LoginService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=EUC-KR");
		request.setCharacterEncoding("EUC-KR");
		PrintWriter out = response.getWriter();
		String name1 = request.getParameter("name1");
		System.out.println(name1);
		System.out.println("¾È³çÇÏ¼¼¤Ë¤·");
		
		out.print("<html><body>");
		out.print(name1 + "´Ô È¯¿µÇÕ´Ï´Ù.");
		out.print("</html></body>");
	}

}
