package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.BbsDTO;

public class BbsDAO {

	public List<BbsDTO> Bbslist(SqlSession session) {
		List<BbsDTO> list = session.selectList("BbsMapper.Bbslist");
		return list;
	}

	public int writebbs(SqlSession session, BbsDTO bdto) {
		int n = session.insert("BbsMapper.writebbs",bdto);
		return n;
	}

	public BbsDTO viewbbs(SqlSession session, int bbsnum) {
		BbsDTO dto = session.selectOne("BbsMapper.viewbbs",bbsnum);
		return dto;
	}

	public void updatebbs(SqlSession session, BbsDTO dto) {
		session.update("BbsMapper.updatebbs",dto);
		
	}

	public void deletebbs(SqlSession session, int bbsnum) {
		session.update("BbsMapper.deletebbs",bbsnum);
		
	}

	

	
}
