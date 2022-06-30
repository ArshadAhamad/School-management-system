package com.wings.kmcc.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.wings.kmcc.exception.ResourceNotFoundException;
import com.wings.kmcc.dao.StaffRepository;
import com.wings.kmcc.entity.Staff;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")

public class StaffController {
	
	@Autowired
	private StaffRepository staffRepository;
	//private StaffRepository staffSubjects;
	
	
	// get all staffs
	@GetMapping("/staffs")
	public List<Staff> getAllStaffs(){
		return staffRepository.findAll();
	}		
	
	// create staffs rest api
	@PostMapping("/staffs")
	public Staff createStaff(@RequestBody Staff staff) {
		return staffRepository.save(staff);
	}
		
		// get staffs by id rest api
		@GetMapping("/staffs/{id}")
		public ResponseEntity<Staff> getStaffById(@PathVariable Long id) {
			Staff staff = staffRepository.findById(id)
					.orElseThrow(() -> new ResourceNotFoundException("Staff not exist with id :" + id));
			return ResponseEntity.ok(staff);
		}
		
		
		// update staffs rest api
		
		@PutMapping("/staffs/{id}")
		public ResponseEntity<Staff> updatestaffs(@PathVariable Long id, @RequestBody Staff staffDetails){
			Staff staff = staffRepository.findById(id)
					.orElseThrow(() -> new ResourceNotFoundException("Staff not exist with id :" + id));
			
			staff.setFirstName(staffDetails.getFirstName());
			staff.setLastName(staffDetails.getLastName());
			staff.setEmailId(staffDetails.getEmailId());
			staff.setNic(staffDetails.getNic());
			staff.setAddress(staffDetails.getAddress());
			staff.setSubject(staffDetails.getSubject());
			staff.setDepartmentId(staffDetails.getDepartmentId());
			staff.setDob(staffDetails.getDob());
			staff.setGender(staffDetails.getGender());
			staff.setDob(staffDetails.getDob());
			staff.setPhoneNumber(staffDetails.getPhoneNumber());
			staff.setGuardianName(staffDetails.getGuardianName());
			staff.setGuardianMobile(staffDetails.getGuardianMobile());
			staff.setImage(staffDetails.getImage());
			staff.setMaritalStatus(staffDetails.getMaritalStatus());
			staff.setJobRole(staffDetails.getJobRole());
			staff.setQualification(staffDetails.getQualification());
			
			
			Staff updatedStaff = staffRepository.save(staff);
			return ResponseEntity.ok(updatedStaff);
		}
		
		// delete employee rest api
		@DeleteMapping("/staffs/{id}")
		public ResponseEntity<Map<String, Boolean>> deleteStaff(@PathVariable Long id){
			Staff staff = staffRepository.findById(id)
					.orElseThrow(() -> new ResourceNotFoundException("Staff not exist with id :" + id));
			
			staffRepository.delete(staff);
			Map<String, Boolean> response = new HashMap<>();
			response.put("deleted", Boolean.TRUE);
			return ResponseEntity.ok(response);
		}
		/*
		// get all staffs
	@GetMapping("/subjects")
	public List<Subject> getAllSubjects(){
		return staffRepository.findAll();
	}
		
		*/

}
