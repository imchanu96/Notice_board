package com.noticeboard.study.noticeboard.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class NoticeboardDto {

	private int noticeboard_number;
	private String noticeboard_title;
	private String noticeboard_writer;
	private String noticeboard_content;
	private String noticeboard_image;
	private int noticeboard_views;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date noticeboard_create_date;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date noticeboard_modify_date;
	private int user_number;
	private int noticeboard_type_number;
	
	
	public NoticeboardDto() {
		super();
	}


	public NoticeboardDto(int noticeboard_number, String noticeboard_title
			, String noticeboard_writer, String noticeboard_content
			, String noticeboard_image, int noticeboard_views
			, Date noticeboard_create_date, Date noticeboard_modify_date
			, int user_number, int noticeboard_type_number) {
		super();
		this.noticeboard_number = noticeboard_number;
		this.noticeboard_title = noticeboard_title;
		this.noticeboard_writer = noticeboard_writer;
		this.noticeboard_content = noticeboard_content;
		this.noticeboard_image = noticeboard_image;
		this.noticeboard_views = noticeboard_views;
		this.noticeboard_create_date = noticeboard_create_date;
		this.noticeboard_modify_date = noticeboard_modify_date;
		this.user_number = user_number;
		this.noticeboard_type_number = noticeboard_type_number;
	}


	public int getNoticeboard_number() {
		return noticeboard_number;
	}


	public void setNoticeboard_number(int noticeboard_number) {
		this.noticeboard_number = noticeboard_number;
	}


	public String getNoticeboard_title() {
		return noticeboard_title;
	}


	public void setNoticeboard_title(String noticeboard_title) {
		this.noticeboard_title = noticeboard_title;
	}


	public String getNoticeboard_writer() {
		return noticeboard_writer;
	}


	public void setNoticeboard_writer(String noticeboard_writer) {
		this.noticeboard_writer = noticeboard_writer;
	}


	public String getNoticeboard_content() {
		return noticeboard_content;
	}


	public void setNoticeboard_content(String noticeboard_content) {
		this.noticeboard_content = noticeboard_content;
	}


	public String getNoticeboard_image() {
		return noticeboard_image;
	}


	public void setNoticeboard_image(String noticeboard_image) {
		this.noticeboard_image = noticeboard_image;
	}


	public int getNoticeboard_views() {
		return noticeboard_views;
	}


	public void setNoticeboard_views(int noticeboard_views) {
		this.noticeboard_views = noticeboard_views;
	}


	public Date getNoticeboard_create_date() {
		return noticeboard_create_date;
	}


	public void setNoticeboard_create_date(Date noticeboard_create_date) {
		this.noticeboard_create_date = noticeboard_create_date;
	}


	public Date getNoticeboard_modify_date() {
		return noticeboard_modify_date;
	}


	public void setNoticeboard_modify_date(Date noticeboard_modify_date) {
		this.noticeboard_modify_date = noticeboard_modify_date;
	}


	public int getUser_number() {
		return user_number;
	}


	public void setUser_number(int user_number) {
		this.user_number = user_number;
	}


	public int getNoticeboard_type_number() {
		return noticeboard_type_number;
	}


	public void setNoticeboard_type_number(int noticeboard_type_number) {
		this.noticeboard_type_number = noticeboard_type_number;
	}
	
	
	
}
