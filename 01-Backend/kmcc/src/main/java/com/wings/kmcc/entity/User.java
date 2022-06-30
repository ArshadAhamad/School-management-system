package com.wings.kmcc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_data")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="u_id")	
	private Long uId;
	
	@Column(name="u_email")	
	private String u_email;
	
	@Column(name="u_username")	
	private String u_username;
	
	@Column(name="u_password")	
	private String u_password;
	
	@Column(name="u_role")	
	private String u_role;
	
	@Column(name="u_status")	
	private String u_status;
	
	@Column(name="student_id")	
	private Long studentId;
	
	@Column(name="staff_id")	
	private Long staffId;	
	
	
	public User() {
		super();
	}


	public User(Long uId, String u_email, String u_username, String u_password, String u_role, String u_status,
			Long studentId, Long staffId) {
		super();
		this.uId = uId;
		this.u_email = u_email;
		this.u_username = u_username;
		this.u_password = u_password;
		this.u_role = u_role;
		this.u_status = u_status;
		this.studentId = studentId;
		this.staffId = staffId;
	}


	public Long getuId() {
		return uId;
	}


	public void setuId(Long uId) {
		this.uId = uId;
	}


	public String getU_email() {
		return u_email;
	}


	public void setU_email(String u_email) {
		this.u_email = u_email;
	}


	public String getU_username() {
		return u_username;
	}


	public void setU_username(String u_username) {
		this.u_username = u_username;
	}


	public String getU_password() {
		return u_password;
	}


	public void setU_password(String u_password) {
		this.u_password = u_password;
	}


	public String getU_role() {
		return u_role;
	}


	public void setU_role(String u_role) {
		this.u_role = u_role;
	}


	public String getU_status() {
		return u_status;
	}


	public void setU_status(String u_status) {
		this.u_status = u_status;
	}


	public Long getStudentId() {
		return studentId;
	}


	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}


	public Long getStaffId() {
		return staffId;
	}


	public void setStaffId(Long staffId) {
		this.staffId = staffId;
	}


	@Override
	public String toString() {
		return "User [uId=" + uId + ", u_email=" + u_email + ", u_username=" + u_username + ", u_password=" + u_password
				+ ", u_role=" + u_role + ", u_status=" + u_status + ", studentId=" + studentId + ", staffId=" + staffId
				+ "]";
	}
	
	
}
