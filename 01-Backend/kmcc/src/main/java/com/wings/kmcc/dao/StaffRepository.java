package com.wings.kmcc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wings.kmcc.entity.Staff;

@Repository
public interface StaffRepository extends JpaRepository<Staff,Long> {
	
	Staff findByUsernameAndPassword(String username, String password);

}
