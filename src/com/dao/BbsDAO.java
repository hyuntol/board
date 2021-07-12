package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.BbsDTO;

public class BbsDAO {

	public List<BbsDTO> Bbslist(SqlSession session) {
		List<BbsDTO> list = session.selectList("BbsMapper.Bbslist");
		return list;
	}

}
