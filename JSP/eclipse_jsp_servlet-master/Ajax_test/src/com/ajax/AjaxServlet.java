package com.ajax;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.JsonObject;

/**
 * Servlet implementation class AjaxServlet
 */
@WebServlet("/AjaxServlet")
public class AjaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AjaxServlet() {
		super();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/plain;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String num = request.getParameter("num");
		System.out.println("요청이 들어옴....");
		System.out.println(num);
		/*
		 * out.print(num); out.print("제이쿼리");
		 */

		JsonObject jsonObj = new JsonObject();
		jsonObj.addProperty("num", 1234);
		jsonObj.addProperty("str", "j-query");
		System.out.println(jsonObj.toString());

		String data = "{\"num\":1234, \"str\":\"jquery\" }";
		out.print(data);

	}

}
