package com.noticeboard.study.noticeboard.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.noticeboard.study.noticeboard.dto.NoticeboardDto;

@Repository
public class NoticeboardDaoImpl implements NoticeboardDao{

	String namespace = "com.noticeboard.study.";
	
	@Autowired
	SqlSessionTemplate sqlSession;
	
	@Override
	public List<NoticeboardDto> noticeboardSelectList() {
		// TODO Auto-generated method stub
		return sqlSession.selectList(namespace + "noticeboardSelectList");
	}

}
