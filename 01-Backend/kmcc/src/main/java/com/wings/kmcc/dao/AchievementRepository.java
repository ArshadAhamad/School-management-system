package com.wings.kmcc.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import com.wings.kmcc.entity.Achievement;
import com.wings.kmcc.entity.Student;

@CrossOrigin("http://localhost:4200")
public interface AchievementRepository extends JpaRepository<Achievement, Long> {

	Page<Achievement> findByStd(@RequestParam("std") Long id, Pageable pageable );
}
