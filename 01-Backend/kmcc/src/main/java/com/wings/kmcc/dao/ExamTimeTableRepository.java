package com.wings.kmcc.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import com.wings.kmcc.entity.ExamTimeTable;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "etimeTables", path="etimeTables")
public interface ExamTimeTableRepository extends JpaRepository<ExamTimeTable, Long>  {

//	//Query Method
//		// behind the scenes   // SELECT * FROM Product WHERE category_id =?
		Page<ExamTimeTable> findByClassId(@RequestParam("classId") Long id, Pageable pageable );
		
//		Page<ClassTimeTable> findByStaffId(@RequestParam("staffId") Long id, Pageable pageable );
//		
//		// SELECT * FROM product WHERE name LIKE CONCAT(%,name,%);
//		Page<ClassTimeTable> findByNameContaining(@RequestParam("class_name") String class_name, Pageable pageable);
}
