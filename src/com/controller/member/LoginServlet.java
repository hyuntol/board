package com.controller.member;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.MemberDTO;
import com.service.MemberService;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String u_id = request.getParameter("u_id");
		String u_pw = request.getParameter("u_pw");

		HashMap<String, String> map = new HashMap<>();
		map.put("u_id", u_id);
		map.put("u_pw", u_pw);
		MemberService service = new MemberService();
		MemberDTO login = service.login(map);
		String nextPage = null;
		HttpSession session = request.getSession();
		
		if(login != null) {
		nextPage = "main";
		session.setAttribute("login", login);
		System.out.println("로그인 성공  " + login);
		}else{
			nextPage = "LoginUIServlet";
		}
		
			response.sendRedirect(nextPage);	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		doGet(request, response);
	}

}
