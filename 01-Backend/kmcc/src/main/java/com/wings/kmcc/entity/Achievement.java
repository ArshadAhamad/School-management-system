package com.wings.kmcc.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="achievement")
public class Achievement {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="a_id")	
	private Long a_id;
	
	@Column(name="a_title")	
	private String a_title;
	
	@Column(name="a_description")	
	private String a_description;
	
	@Column(name="a_date")	
	private Date a_date;
	
//	@ManyToOne
//	@JoinColumn(name="std_id", nullable=true)
//	private Student std;
	@Column(name="std_id")	
	private Long std;
	
	@Column(name="std_name")	
	private String std_name;
	
	@Column(name="a_image")	
	private String a_image;
	
	@Column(name="a_status")	
	private String a_status;

	public Achievement() {
		super();
	}

	public Achievement(Long a_id, String a_title, String a_description, Date a_date, Long std, String std_name,
			String a_image, String a_status) {
		super();
		this.a_id = a_id;
		this.a_title = a_title;
		this.a_description = a_description;
		this.a_date = a_date;
		this.std = std;
		this.std_name = std_name;
		this.a_image = a_image;
		this.a_status = a_status;
	}

	public Long getA_id() {
		return a_id;
	}

	public void setA_id(Long a_id) {
		this.a_id = a_id;
	}

	public String getA_title() {
		return a_title;
	}

	public void setA_title(String a_title) {
		this.a_title = a_title;
	}

	public String getA_description() {
		return a_description;
	}

	public void setA_description(String a_description) {
		this.a_description = a_description;
	}

	public Date getA_date() {
		return a_date;
	}

	public void setA_date(Date a_date) {
		this.a_date = a_date;
	}

	public Long getStd() {
		return std;
	}

	public void setStd(Long std) {
		this.std = std;
	}

	public String getStd_name() {
		return std_name;
	}

	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}

	public String getA_image() {
		return a_image;
	}

	public void setA_image(String a_image) {
		this.a_image = a_image;
	}

	public String getA_status() {
		return a_status;
	}

	public void setA_status(String a_status) {
		this.a_status = a_status;
	}

	@Override
	public String toString() {
		return "Achievement [a_id=" + a_id + ", a_title=" + a_title + ", a_description=" + a_description + ", a_date="
				+ a_date + ", std=" + std + ", std_name=" + std_name + ", a_image=" + a_image + ", a_status=" + a_status
				+ "]";
	}


	
	
}
