package com.controller.member;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.MemberDTO;
import com.service.MemberService;


@WebServlet("/MemberAddServlet")
public class MemberAddServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String u_id = request.getParameter("u_id");
		String u_pw = request.getParameter("u_pw");
		String u_name = request.getParameter("u_name");
		String u_gender = request.getParameter("u_gender");
		String u_email = request.getParameter("u_email");
				MemberDTO mdto = new MemberDTO(u_id, u_pw, u_name, u_gender, u_email);
		System.out.println(mdto.toString());
		
		MemberService service = new MemberService();
		int n = service.memberAdd(mdto);
		HttpSession session = request.getSession();
		if(n==1){
			session.setAttribute("mesg","회원가입 성공");
			session.setAttribute("mdto", mdto);
			System.out.println("회원가입 성공!");
		}else {
			session.setAttribute("mesg","회원가입 후 진행해주세요.");
		}
		
		PrintWriter out = response.getWriter();
		
		response.sendRedirect("main.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
