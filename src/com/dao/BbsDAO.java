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
		System.out.println("디에이오 출력 --------------------");
		return n;
	}

}
