package com.wings.kmcc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="exam_time_table")
public class ExamTimeTable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")	
	private Long id;
	
	@Column(name="exam_year")	
	private String examYear;
	
	@Column(name="class_id")	
	private Long classId;
	
	@Column(name="term_name")	
	private String term_name;
	
	@Column(name="class_name")	
	private String class_name;
	
	@Column(name="section_name")	
	private String section_name;
	
	@Column(name="subject_id")	
	private Long subject_id;
	
	@Column(name="subject_name")	
	private String subject_name;
	
	@Column(name="period_time")	
	private String period_time;
	
	@Column(name="period_day")	
	private String period_day;

	public ExamTimeTable() {
		super();
	}

	public ExamTimeTable(Long id, String examYear, Long classId, String term_name, String class_name,
			String section_name, Long subject_id, String subject_name, String period_time, String period_day) {
		super();
		this.id = id;
		this.examYear = examYear;
		this.classId = classId;
		this.term_name = term_name;
		this.class_name = class_name;
		this.section_name = section_name;
		this.subject_id = subject_id;
		this.subject_name = subject_name;
		this.period_time = period_time;
		this.period_day = period_day;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getExamYear() {
		return examYear;
	}

	public void setExamYear(String examYear) {
		this.examYear = examYear;
	}

	public Long getClassId() {
		return classId;
	}

	public void setClassId(Long classId) {
		this.classId = classId;
	}

	public String getTerm_name() {
		return term_name;
	}

	public void setTerm_name(String term_name) {
		this.term_name = term_name;
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
		return "ExamTimeTable [id=" + id + ", examYear=" + examYear + ", classId=" + classId + ", term_name="
				+ term_name + ", class_name=" + class_name + ", section_name=" + section_name + ", subject_id="
				+ subject_id + ", subject_name=" + subject_name + ", period_time=" + period_time + ", period_day="
				+ period_day + "]";
	}
	
	
}
