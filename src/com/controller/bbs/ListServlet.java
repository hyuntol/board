package com.controller.bbs;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.BbsDTO;
import com.service.BbsService;

@WebServlet("/ListServlet")
public class ListServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		BbsService service = new BbsService();

		List<BbsDTO> list = service.Bbslist();
		System.out.println("글 목록 : "+list);
		
		HttpSession session = request.getSession();
		session.setAttribute("list", list);
		
		RequestDispatcher dis = request.getRequestDispatcher("bbs.jsp");
		dis.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
