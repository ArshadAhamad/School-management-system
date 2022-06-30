package com.wings.kmcc.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="student")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="std_id")	
	private Long std_id;
	
	@Column(name="std_name")	
	private String std_name;
	
	@Column(name="std_username")	
	private String std_username;
	
	@Column(name="std_password")	
	private String std_password;
	
	@Column(name="std_email_address")	
	private String std_email_address;
	
	@Column(name="std_address")	
	private String std_address;
	
	@Column(name="std_dob")	
	private Date std_dob;
	
	@Column(name="std_image")	
	private String std_image;
	
	@Column(name="std_joined_year")	
	private Date std_joined_year;
	
	@Column(name="std_class_id")	
	private Long std_class_id;
	
	@Column(name="std_father_name")	
	private String std_father_name;
	
	@Column(name="std_father_occupation")	
	private String std_father_occupation;
	
	@Column(name="std_mother_name")	
	private String std_mother_name;
	
	@Column(name="std_mother_occupation")	
	private String std_mother_occupation;
	
	@Column(name="std_contact_number")	
	private String std_contact_number;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="std")
	private Set<Achievement> achievements;
	
	

	public Student() {
		super();
	}

	public Student(Long std_id, String std_name, String std_username, String std_password, String std_email_address,
			String std_address, Date std_dob, String std_image, Date std_joined_year, Long std_class_id,
			String std_father_name, String std_father_occupation, String std_mother_name, String std_mother_occupation,
			String std_contact_number, Set<Achievement> achievements) {
		super();
		this.std_id = std_id;
		this.std_name = std_name;
		this.std_username = std_username;
		this.std_password = std_password;
		this.std_email_address = std_email_address;
		this.std_address = std_address;
		this.std_dob = std_dob;
		this.std_image = std_image;
		this.std_joined_year = std_joined_year;
		this.std_class_id = std_class_id;
		this.std_father_name = std_father_name;
		this.std_father_occupation = std_father_occupation;
		this.std_mother_name = std_mother_name;
		this.std_mother_occupation = std_mother_occupation;
		this.std_contact_number = std_contact_number;
		this.achievements = achievements;
	}

	public Long getStd_id() {
		return std_id;
	}

	public void setStd_id(Long std_id) {
		this.std_id = std_id;
	}

	public String getStd_name() {
		return std_name;
	}

	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}

	public String getStd_username() {
		return std_username;
	}

	public void setStd_username(String std_username) {
		this.std_username = std_username;
	}

	public String getStd_password() {
		return std_password;
	}

	public void setStd_password(String std_password) {
		this.std_password = std_password;
	}

	public String getStd_email_address() {
		return std_email_address;
	}

	public void setStd_email_address(String std_email_address) {
		this.std_email_address = std_email_address;
	}

	public String getStd_address() {
		return std_address;
	}

	public void setStd_address(String std_address) {
		this.std_address = std_address;
	}

	public Date getStd_dob() {
		return std_dob;
	}

	public void setStd_dob(Date std_dob) {
		this.std_dob = std_dob;
	}

	public String getStd_image() {
		return std_image;
	}

	public void setStd_image(String std_image) {
		this.std_image = std_image;
	}

	public Date getStd_joined_year() {
		return std_joined_year;
	}

	public void setStd_joined_year(Date std_joined_year) {
		this.std_joined_year = std_joined_year;
	}

	public Long getStd_class_id() {
		return std_class_id;
	}

	public void setStd_class_id(Long std_class_id) {
		this.std_class_id = std_class_id;
	}

	public String getStd_father_name() {
		return std_father_name;
	}

	public void setStd_father_name(String std_father_name) {
		this.std_father_name = std_father_name;
	}

	public String getStd_father_occupation() {
		return std_father_occupation;
	}

	public void setStd_father_occupation(String std_father_occupation) {
		this.std_father_occupation = std_father_occupation;
	}

	public String getStd_mother_name() {
		return std_mother_name;
	}

	public void setStd_mother_name(String std_mother_name) {
		this.std_mother_name = std_mother_name;
	}

	public String getStd_mother_occupation() {
		return std_mother_occupation;
	}

	public void setStd_mother_occupation(String std_mother_occupation) {
		this.std_mother_occupation = std_mother_occupation;
	}

	public String getStd_contact_number() {
		return std_contact_number;
	}

	public void setStd_contact_number(String std_contact_number) {
		this.std_contact_number = std_contact_number;
	}

	public Set<Achievement> getAchievements() {
		return achievements;
	}

	public void setAchievements(Set<Achievement> achievements) {
		this.achievements = achievements;
	}

	@Override
	public String toString() {
		return "Student [std_id=" + std_id + ", std_name=" + std_name + ", std_username=" + std_username
				+ ", std_password=" + std_password + ", std_email_address=" + std_email_address + ", std_address="
				+ std_address + ", std_dob=" + std_dob + ", std_image=" + std_image + ", std_joined_year="
				+ std_joined_year + ", std_class_id=" + std_class_id + ", std_father_name=" + std_father_name
				+ ", std_father_occupation=" + std_father_occupation + ", std_mother_name=" + std_mother_name
				+ ", std_mother_occupation=" + std_mother_occupation + ", std_contact_number=" + std_contact_number
				+ ", achievements=" + achievements + "]";
	}

	
	
	
	

}
