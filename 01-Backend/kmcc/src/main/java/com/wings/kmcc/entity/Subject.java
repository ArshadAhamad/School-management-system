package com.wings.kmcc.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="subject")
public class Subject {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="subject_id")	
	private Long subject_id;
	
	@Column(name="subject_name")	
	private String subject_name;

	@ManyToMany(mappedBy = "subjects", fetch = FetchType.EAGER)
	private Set<Grade> grades;

	public Subject() {
		super();
	}

	public Subject(Long subject_id, String subject_name, Set<Grade> grades) {
		super();
		this.subject_id = subject_id;
		this.subject_name = subject_name;
		this.grades = grades;
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

	public Set<Grade> getGrades() {
		return grades;
	}

	public void setGrades(Set<Grade> grades) {
		this.grades = grades;
	}

	@Override
	public String toString() {
		return "Subject [subject_id=" + subject_id + ", subject_name=" + subject_name + ", grades=" + grades + "]";
	}
	
	
	
	

	
}
