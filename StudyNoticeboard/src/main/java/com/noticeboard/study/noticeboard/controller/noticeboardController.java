package com.noticeboard.study.noticeboard.controller;


import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class noticeboardController {
	
	private static final Logger log 
	= LoggerFactory.getLogger(noticeboardController.class);

	
	@RequestMapping(value = "/noticeboard/listType.do", method = RequestMethod.GET)
	public String connectListTypeNoticeboard(HttpSession session, Model model) {
		log.info("리스트 형태의 게시판 접속");
		
		return "noticeboard/ListType";
	}
	@RequestMapping(value = "/noticeboard/webMagazineType.do", method = RequestMethod.GET)
	public String connectWebMagazineTypeNoticeboard(HttpSession session, Model model) {
		log.info("웹진 형태의 게시판 접속");
		
		return "noticeboard/WebMagazineType";
	}
	@RequestMapping(value = "/noticeboard/galleryType.do", method = RequestMethod.GET)
	public String connectGalleryTypeNoticeboard(HttpSession session, Model model) {
		log.info("갤러리 형태의 게시판 접속");
		
		return "noticeboard/GalleryType";
	}
	@RequestMapping(value = "/noticeboard/FAQType.do", method = RequestMethod.GET)
	public String connectFAQTypeNoticeboard(HttpSession session, Model model) {
		log.info("FAQ 형태의 게시판 접속");
		
		return "noticeboard/FAQType";
	}
}
