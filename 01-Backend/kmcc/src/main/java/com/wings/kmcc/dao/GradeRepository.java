package com.wings.kmcc.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import com.wings.kmcc.entity.ExamTimeTable;
import com.wings.kmcc.entity.Grade;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "grades", path="grades")
public interface GradeRepository extends JpaRepository<Grade, Long> {
		

//	Page<Grade> findAll(Pageable pageable );
}
