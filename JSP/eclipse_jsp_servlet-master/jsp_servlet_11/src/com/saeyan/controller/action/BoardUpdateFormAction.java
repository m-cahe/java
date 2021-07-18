package com.saeyan.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saeyan.model.BoardDAO;
import com.saeyan.model.BoardVO;


public class BoardUpdateFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String url="/board/boardUpdate.jsp";
		
		String num=request.getParameter("num");
		
		BoardDAO dao=new BoardDAO();
		
		dao.updateReadCount(num);
		
		BoardVO vo= dao.selectOneBoardByNum(num);
		
		request.setAttribute("board", vo);
		
		
		RequestDispatcher dispatcher= request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	
		
	}

}
