package com.noticeboard.study.noticeboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.noticeboard.study.noticeboard.dao.NoticeboardDao;
import com.noticeboard.study.noticeboard.dto.NoticeboardDto;

@Service
public class NoticeboardServiceImpl implements NoticeboardService{

	@Autowired
	NoticeboardDao noticeboardDao;
	
	@Override
	public List<NoticeboardDto> noticeboardSelectList() {
		// TODO Auto-generated method stub
		return noticeboardDao.noticeboardSelectList();
	}

}
