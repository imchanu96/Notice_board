package com.noticeboard.study.noticeboard.dto;

public class noticeboard_typeDto {

	private int noticeboard_type_number;
	private String noticeboard_name;
	
	public noticeboard_typeDto() {
		super();
	}

	public noticeboard_typeDto(int noticeboard_type_number, String noticeboard_name) {
		super();
		this.noticeboard_type_number = noticeboard_type_number;
		this.noticeboard_name = noticeboard_name;
	}

	
	public int getNoticeboard_type_number() {
		return noticeboard_type_number;
	}

	public void setNoticeboard_type_number(int noticeboard_type_number) {
		this.noticeboard_type_number = noticeboard_type_number;
	}

	public String getNoticeboard_name() {
		return noticeboard_name;
	}

	public void setNoticeboard_name(String noticeboard_name) {
		this.noticeboard_name = noticeboard_name;
	}
	
	
}
