package com.ajax;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * Servlet implementation class AjaxServlet2
 */
@WebServlet("/AjaxServlet2")
public class AjaxServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AjaxServlet2() {
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
		response.setContentType("text/plain;charset=UTF-8");
		PrintWriter out = response.getWriter();

		Gson gson = new Gson();
		ArrayList<MemberVO> list = new ArrayList<>();
		list.add(new MemberVO("나예호", 21, "학생"));
		list.add(new MemberVO("김운비", 20, "학생"));
		list.add(new MemberVO("임명진", 25, "조교"));
		list.add(new MemberVO("박수현", 22, "조교"));
		list.add(new MemberVO("박매일", 35, "부장"));

		String list1 = gson.toJson(list);
		System.out.println(list1);
		out.print(list1);
	}

}
