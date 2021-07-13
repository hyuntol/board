package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.BbsDAO;
import com.dto.BbsDTO;

public class BbsService {

	public List<BbsDTO> Bbslist() {
		SqlSession session = MySqlSessionFactory.getSession();
		List<BbsDTO> list = null;
		try {
			BbsDAO dao = new BbsDAO();
			list = dao.Bbslist(session);
		} finally {
			session.close();
		}
		return list;
	}

	public int writebbs(BbsDTO bdto) {
		SqlSession session = MySqlSessionFactory.getSession();
		int n = 0;
		try {
			BbsDAO dao = new BbsDAO();
			n = dao.writebbs(session, bdto);
			session.commit();
		} finally {
			session.close();
		}
		return n;
	}

}
