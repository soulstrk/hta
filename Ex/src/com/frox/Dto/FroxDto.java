package com.frox.Dto;

import java.sql.Date;

public class FroxDto {
	private String id;
	private String pwd;
	private String name;
	private String birth;
	private String gender;
	private String phone;
	private Date joinDate;
	
	public FroxDto() {
		// TODO Auto-generated constructor stub
	}
	
	public FroxDto(String id, String pwd, String name, String birth, String gender, String phone, Date joinDate) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.birth = birth;
		this.gender = gender;
		this.phone = phone;
		this.joinDate = joinDate;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	
	
}
