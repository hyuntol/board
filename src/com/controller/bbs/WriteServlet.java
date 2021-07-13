package com.controller.bbs;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.BbsDTO;
import com.dto.MemberDTO;
import com.service.BbsService;


@WebServlet("/WriteServlet")
public class WriteServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html; charset=utf-8");
		
		HttpSession session = request.getSession();
		MemberDTO mdto = (MemberDTO) session.getAttribute("login");
		String u_id = mdto.getU_id();
	
		String bbstitle = request.getParameter("bbstitle");
		String bbscontent= request.getParameter("bbscontent");
		
		BbsDTO bdto = new BbsDTO();
		bdto.setBbstitle(bbstitle);
		bdto.setBbscontent(bbscontent);
		bdto.setUserid(u_id);
		
		BbsService service = new BbsService();
		service.writebbs(bdto);
		

		response.sendRedirect("ListServlet");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		doGet(request, response);
	}

}
