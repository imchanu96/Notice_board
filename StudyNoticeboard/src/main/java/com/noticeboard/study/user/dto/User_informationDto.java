package com.noticeboard.study.user.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class User_informationDto {

	private int user_number;
	private String user_id;
	private String user_password;
	private String user_nickname;
	private String user_email;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date user_create_date;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date user_information_modify_date;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date user_password_modify_date;
	
	public User_informationDto() {
		super();
	}

	public User_informationDto(int user_number, String user_id, String user_password
			, String user_nickname, String user_email,
			Date user_create_date, Date user_information_modify_date
			, Date user_password_modify_date) {
		super();
		this.user_number = user_number;
		this.user_id = user_id;
		this.user_password = user_password;
		this.user_nickname = user_nickname;
		this.user_email = user_email;
		this.user_create_date = user_create_date;
		this.user_information_modify_date = user_information_modify_date;
		this.user_password_modify_date = user_password_modify_date;
	}

	public int getUser_number() {
		return user_number;
	}

	public void setUser_number(int user_number) {
		this.user_number = user_number;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public String getUser_nickname() {
		return user_nickname;
	}

	public void setUser_nickname(String user_nickname) {
		this.user_nickname = user_nickname;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public Date getUser_create_date() {
		return user_create_date;
	}

	public void setUser_create_date(Date user_create_date) {
		this.user_create_date = user_create_date;
	}

	public Date getUser_information_modify_date() {
		return user_information_modify_date;
	}

	public void setUser_information_modify_date(Date user_information_modify_date) {
		this.user_information_modify_date = user_information_modify_date;
	}

	public Date getUser_password_modify_date() {
		return user_password_modify_date;
	}

	public void setUser_password_modify_date(Date user_password_modify_date) {
		this.user_password_modify_date = user_password_modify_date;
	}
	
	
	
	
}
