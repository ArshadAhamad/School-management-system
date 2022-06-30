package com.wings.kmcc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="class_time_table")
public class ClassTimeTable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")	
	private Long id;
	
	@Column(name="class_year")	
	private String class_year;
	
	@Column(name="class_id")	
	private Long classId;
	
//	@OneToOne
//	@JoinColumn(name="class_id", nullable=false)
//	@Column(name="class_id")
//	private Grade class_id;
	
	@Column(name="class_name")	
	private String class_name;
	
	@Column(name="section_name")	
	private String section_name;
	
	@Column(name="subject_id")	
	private Long subject_id;
	
	@Column(name="subject_name")	
	private String subject_name;
	
	@Column(name="staff_id")	
	private Long staffId;
	
	@Column(name="staff_name")	
	private String staff_name;
	
	@Column(name="period_time")	
	private String period_time;
	
	@Column(name="period_day")	
	private String period_day;

	public ClassTimeTable() {
		super();
	}

	public ClassTimeTable(Long id, String class_year, Long class_id, String class_name, String section_name,
			Long subject_id, String subject_name, Long staff_id, String staff_name, String period_time,
			String period_day) {
		super();
		this.id = id;
		this.class_year = class_year;
		this.classId = class_id;
		this.class_name = class_name;
		this.section_name = section_name;
		this.subject_id = subject_id;
		this.subject_name = subject_name;
		this.staffId = staff_id;
		this.staff_name = staff_name;
		this.period_time = period_time;
		this.period_day = period_day;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getClass_year() {
		return class_year;
	}

	public void setClass_year(String class_year) {
		this.class_year = class_year;
	}

	public Long getClass_id() {
		return classId;
	}

	public void setClass_id(Long class_id) {
		this.classId = class_id;
	}

	public String getClass_name() {
		return class_name;
	}

	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}

	public String getSection_name() {
		return section_name;
	}

	public void setSection_name(String section_name) {
		this.section_name = section_name;
	}

	public Long getSubject_id() {
		return subject_id;
	}

	public void setSubject_id(Long subject_id) {
		this.subject_id = subject_id;
	}

	public String getSubject_name() {
		return subject_name;
	}

	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}

	public Long getStaff_id() {
		return staffId;
	}

	public void setStaff_id(Long staff_id) {
		this.staffId = staff_id;
	}

	public String getStaff_name() {
		return staff_name;
	}

	public void setStaff_name(String staff_name) {
		this.staff_name = staff_name;
	}

	public String getPeriod_time() {
		return period_time;
	}

	public void setPeriod_time(String period_time) {
		this.period_time = period_time;
	}

	public String getPeriod_day() {
		return period_day;
	}

	public void setPeriod_day(String period_day) {
		this.period_day = period_day;
	}

	@Override
	public String toString() {
		return "ClassTimeTable [id=" + id + ", class_year=" + class_year + ", class_id=" + classId + ", class_name="
				+ class_name + ", section_name=" + section_name + ", subject_id=" + subject_id + ", subject_name="
				+ subject_name + ", staff_id=" + staffId + ", staff_name=" + staff_name + ", period_time="
				+ period_time + ", period_day=" + period_day + "]";
	}
	
	
	
}
