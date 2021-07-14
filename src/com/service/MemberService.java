package com.service;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.MemberDAO;
import com.dto.MemberDTO;

public class MemberService {

	public int memberAdd(MemberDTO mdto) {
		SqlSession session = MySqlSessionFactory.getSession();
		int n = 0;
		try {
			MemberDAO dao = new MemberDAO();
			n = dao.memberAdd(session, mdto);
			session.commit();
		}finally {
			session.close();
		}
		return n;
	}

	public MemberDTO login(HashMap<String, String> map) {
		SqlSession session = MySqlSessionFactory.getSession();
		MemberDTO dto = null;
		try {
			MemberDAO dao = new MemberDAO();
			dto = dao.login(session, map);
		} finally {
			session.close();
		}
		return dto;
	}
}
