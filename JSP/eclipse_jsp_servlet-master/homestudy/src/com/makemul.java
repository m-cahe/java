package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class makemul
 */
@WebServlet("/makemul")
public class makemul extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public makemul() {
		super();
		// TODO Auto-generated constructor stub
	}

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
		int start = Integer.parseInt(request.getParameter("start"));
		int end = Integer.parseInt(request.getParameter("end"));
		String color = request.getParameter("color");
		out.print("<html><body><table border='1px' bgcolor="+color+">");
		for (int i = start; i <= end; i++) {
			out.print("<tr>");
			for (int j = 1; j <= 9; j++) {
				out.print("<th>");
				out.print(i);
				out.print("*");
				out.print(j);
				out.print("=");
				out.print(i * j);
				out.print("</th>");
			}
			out.print("</tr>");
		}

		out.print("</table></body></html>");
	}

}
