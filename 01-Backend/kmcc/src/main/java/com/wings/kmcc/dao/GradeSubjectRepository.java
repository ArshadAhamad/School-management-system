package com.wings.kmcc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.wings.kmcc.entity.GradeSubject;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "grades-subjects", path="grades-subjects")
public interface GradeSubjectRepository extends JpaRepository<GradeSubject, Long> {

}
