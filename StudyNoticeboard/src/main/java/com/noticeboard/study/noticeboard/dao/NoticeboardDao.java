package com.noticeboard.study.noticeboard.dao;

import java.util.List;

import com.noticeboard.study.noticeboard.dto.NoticeboardDto;

public interface NoticeboardDao {

	List<NoticeboardDto> noticeboardSelectList();

}
