package com.wings.kmcc.entity;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="grade")
public class Grade {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="class_id")	
	private Long class_id;
	
	@Column(name="class_name")	
	private String class_name;
	
	@Column(name="class_section_name")	
	private String class_section_name;
	
	@Column(name="class_status")	
	private String class_status;
	
	@Column(name="class_staff_id")	
	private String classStaffId;
	
	@Column(name="class_staff_name")	
	private String classStaffName;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "grade_subject", 
    	joinColumns = @JoinColumn(name = "c_id", referencedColumnName = "class_id"), 
    	inverseJoinColumns = @JoinColumn(name = "s_id", referencedColumnName = "subject_id")
    )
	private Set<Subject> subjects;

	public Grade() {		
	}

	public Grade(Long class_id, String class_name, String class_section_name, String class_status, String classStaffId,
			String classStaffName, Set<Subject> subjects) {
		super();
		this.class_id = class_id;
		this.class_name = class_name;
		this.class_section_name = class_section_name;
		this.class_status = class_status;
		this.classStaffId = classStaffId;
		this.classStaffName = classStaffName;
		this.subjects = subjects;
	}

	public Long getClass_id() {
		return class_id;
	}

	public void setClass_id(Long class_id) {
		this.class_id = class_id;
	}

	public String getClass_name() {
		return class_name;
	}

	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}

	public String getClass_section_name() {
		return class_section_name;
	}

	public void setClass_section_name(String class_section_name) {
		this.class_section_name = class_section_name;
	}

	public String getClass_status() {
		return class_status;
	}

	public void setClass_status(String class_status) {
		this.class_status = class_status;
	}

	public String getClassStaffId() {
		return classStaffId;
	}

	public void setClassStaffId(String classStaffId) {
		this.classStaffId = classStaffId;
	}

	public String getClassStaffName() {
		return classStaffName;
	}

	public void setClassStaffName(String classStaffName) {
		this.classStaffName = classStaffName;
	}

	public Set<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(Set<Subject> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Grade [class_id=" + class_id + ", class_name=" + class_name + ", class_section_name="
				+ class_section_name + ", class_status=" + class_status + ", classStaffId=" + classStaffId
				+ ", classStaffName=" + classStaffName + ", subjects=" + subjects + "]";
	}
	
	

	
	
}
