package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class multiplication
 */
@WebServlet("/multiplication")
public class multiplication extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public multiplication() {
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
		int dan = Integer.parseInt(request.getParameter("dan"));

		out.print("<html><body><table border=1px>");
		for (int i = 1; i <= 9; i++) {
			out.print("<tr><th>");
			out.print("5*");
			out.print(i);
			out.print("=");
			out.print(5 * i);
			out.print("</th></tr>");
		}

		out.print("</table></body></html>");
	}

}
