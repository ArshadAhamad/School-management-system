package com.wings.kmcc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="grade_subject")
public class GradeSubject {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="gs_id")	
	private Long id;
	
	@Column(name="c_id")	
	private Long classId;
	
	@Column(name="s_id")	
	private Long subjectId;

	public GradeSubject() {
		super();
	}

	public GradeSubject(Long id, Long classId, Long subjectId) {
		super();
		this.id = id;
		this.classId = classId;
		this.subjectId = subjectId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getClassId() {
		return classId;
	}

	public void setClassId(Long classId) {
		this.classId = classId;
	}

	public Long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}

	@Override
	public String toString() {
		return "GradeSubject [id=" + id + ", classId=" + classId + ", subjectId=" + subjectId + "]";
	}
	
	
}
