package com.bookmybim.user.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_credentials")
public class UserCredentials {
 
	@Id
	@Column(name="user_credentials")
	private int userCredentialsId;
	
	@Column(name="user_name")
	private String userName;
		
	@Column(name="password")
	private String password;
	
	@Column(name="create_date")
	private Date createDate;
	
	@Column(name="modified_date")
	private Date modifiedDate;
	
	@Column(name="user_id")
	private int userId;

	public int getUserCredentialsId() {
		return userCredentialsId;
	}

	public void setUserCredentialsId(int userCredentialsId) {
		this.userCredentialsId = userCredentialsId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	
	
	
	
}
