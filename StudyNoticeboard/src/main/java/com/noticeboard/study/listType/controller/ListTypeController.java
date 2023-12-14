package com.noticeboard.study.listType.controller;


import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ListTypeController {
	
	private static final Logger log 
	= LoggerFactory.getLogger(ListTypeController.class);

	
	@RequestMapping(value = "/NoticeBoard_listType.do", method = RequestMethod.GET)
	public String login(HttpSession session, Model model) {
		log.info("리스트 형태의 게시판 접속");
		
		return "Noticeboard_listType";
	}
}
