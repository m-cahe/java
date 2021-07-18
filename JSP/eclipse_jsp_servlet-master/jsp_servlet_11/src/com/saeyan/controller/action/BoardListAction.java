package com.saeyan.controller.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saeyan.model.BoardDAO;
import com.saeyan.model.BoardVO;

public class BoardListAction implements Action{
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String url="/board/boardList.jsp";
		BoardDAO dao=new BoardDAO();
		List<BoardVO> boardList=dao.selectAllBoards();
		request.setAttribute("boardList", boardList);
		RequestDispatcher dispatcher= request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
		
		
	}

}
