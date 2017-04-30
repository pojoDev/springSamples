package com.pojodev.dto;

import java.sql.Timestamp;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class UserRegisterForm {

	private String name;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Timestamp timestamp;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
}
