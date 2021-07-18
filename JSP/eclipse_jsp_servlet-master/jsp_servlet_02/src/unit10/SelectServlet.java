package unit10;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SelectServlet
 */
@WebServlet("/SelectServlet")
public class SelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SelectServlet() {
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

		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		String[] interests = request.getParameterValues("interest");
		String job = request.getParameter("job");
		out.print("<html><body>");

		out.print("����� ������ ���� : <b>");
		out.print(job);
		out.print("</b><hr>����� ������ ���� �о� : <b>");

		if (interests == null) {
			out.println("������ �׸��� �����ϴ�.");
		} else {
			for (String interest : interests) {
				out.print(interest + " ");
			}
		}

		out.println("</b></pre><a href='javascript:history.go(-1)'>�ٽ�</a>");
		out.print("</body></html>");
		out.close();

	}

}
