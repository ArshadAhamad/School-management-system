package com.wings.kmcc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.wings.kmcc.entity.Subject;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "subjects", path="subjects")
public interface SubjectRepository extends JpaRepository<Subject, Long>  {

}
