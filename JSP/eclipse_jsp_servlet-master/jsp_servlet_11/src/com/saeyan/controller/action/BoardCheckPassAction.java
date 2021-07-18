package com.saeyan.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saeyan.model.BoardDAO;
import com.saeyan.model.BoardVO;

public class BoardCheckPassAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = null;
		String num = request.getParameter("num");
		String pass = request.getParameter("pass");

		BoardDAO dao = new BoardDAO();
		BoardVO vo = dao.selectOneBoardByNum(num);

		if (vo.getPass().equals(pass)) {
			url = "/board/checkSuccess.jsp";
		} else {
			url = "/board/boardCheckPass.jsp";
			request.setAttribute("message", "��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);

	}

}
