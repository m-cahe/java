package kr.smhrd.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.model.MyUtil;

@WebServlet("/hs.do")
public class helloStart extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public helloStart() {

	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// �� ���� Ŭ���̾�Ʈ���� �Է� �޾Ƽ� �� �� ������ ������ ���Ͽ� �����Ͻÿ�.
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		int su1 = Integer.parseInt(request.getParameter("su1"));
		int su2 = Integer.parseInt(request.getParameter("su2"));
		MyUtil mu = new MyUtil();
		out.println("<html><body>");
		out.println(su1);
		out.println("����");
		out.println(su2);
		out.println("������ ���� ");
		out.println(mu.hap(su1, su2));
		out.println("<br><a href='su.html'>�ٽ�</a>");
		// ���������� ���� ��ư javascript:history.go(-1)
		out.print("</body></html>");
		out.close();

	}

}
