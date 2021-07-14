package com.controller.bbs;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.BbsDTO;
import com.service.BbsService;

@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int bbsnum = Integer.parseInt(request.getParameter("bbsnum"));
		System.out.println(bbsnum);
		
		BbsService service = new BbsService();
		BbsDTO view = service.viewbbs(bbsnum);
		
		HttpSession session = request.getSession();
		session.setAttribute("view", view);
		
		response.sendRedirect("view.jsp");
			
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
