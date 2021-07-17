package com.controller.bbs;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.BbsDTO;
import com.service.BbsService;

@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("update");

		request.setCharacterEncoding("utf-8");
		
		int bbsnum = Integer.parseInt(request.getParameter("bbsnum"));
		String bbstitle = request.getParameter("bbstitle");
		String bbscontent = request.getParameter("bbscontent");
		

		BbsDTO dto = new BbsDTO();
		dto.setBbstitle(bbstitle);
		dto.setBbscontent(bbscontent);
		dto.setBbsnum(bbsnum);

		BbsService service = new BbsService();
		service.updatebbs(dto);

		response.sendRedirect("ListServlet");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
