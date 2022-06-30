package com.wings.kmcc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


	
@Entity
@Table(name = "staff")
public class Staff {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		
		@Column(name = "first_name")
		private String firstName;

		@Column(name = "last_name")
		private String lastName;
		
		@Column(name = "email_id")
		private String emailId;
		
		@Column(name = "subject")
		private String subject;
		
		@Column(name = "nic")
		private String nic;
		
		@Column(name = "address")
		private String address;
		
		@Column(name = "email_idepartment_id")
		private String departmentId;
		
		@Column(name = "dob")
		private String dob;
		
		@Column(name = "gender")
		private String gender;
		
		@Column(name = "phone_number")
		private String phoneNumber;
		
		@Column(name = "guardian_name")
		private String guardianName;
		
		@Column(name = "guardian_mobile")
		private String guardianMobile;
		
		@Column(name = "image")
		private String image;
		
		@Column(name = "marital_status")
		private String maritalStatus;
		
		@Column(name = "job_role")
		private String jobRole;
		
		@Column(name = "qualification")
		private String qualification;
		
		@Column(name = "username")
		private String username;

		@Column(name = "password")
		private String password;
		
		
		
		

		public Staff() {}
		
		public Staff(String firstName, String lastName, String emailId, String subject, String nic, String address, String departmentId,
				String dob, String gender, String phoneNumber, String guardianName, String guardianMobile, String image,
				String maritalStatus, String jobRole, String qualification) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.emailId = emailId;
			this.subject = subject;
			this.nic = nic;
			this.address = address;
			this.departmentId = departmentId;
			this.dob = dob;
			this.gender = gender;
			this.phoneNumber = phoneNumber;
			this.guardianName = guardianName;
			this.guardianMobile = guardianMobile;
			this.image = image;
			this.maritalStatus = maritalStatus;
			this.jobRole = jobRole;
			this.qualification = qualification;
		}
		

		public Staff(long id, String username, String password) {
			super();
			this.id = id;
			this.username = username;
			this.password = password;
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getEmailId() {
			return emailId;
		}

		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}

		public String getNic() {
			return nic;
		}

		public void setNic(String nic) {
			this.nic = nic;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getDepartmentId() {
			return departmentId;
		}

		public void setDepartmentId(String departmentId) {
			this.departmentId = departmentId;
		}

		public String getDob() {
			return dob;
		}

		public void setDob(String dob) {
			this.dob = dob;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getGuardianName() {
			return guardianName;
		}

		public void setGuardianName(String guardianName) {
			this.guardianName = guardianName;
		}

		public String getGuardianMobile() {
			return guardianMobile;
		}

		public void setGuardianMobile(String guardianMobile) {
			this.guardianMobile = guardianMobile;
		}

		public String getImage() {
			return image;
		}

		public void setImage(String image) {
			this.image = image;
		}

		public String getMaritalStatus() {
			return maritalStatus;
		}

		public void setMaritalStatus(String maritalStatus) {
			this.maritalStatus = maritalStatus;
		}

		public String getJobRole() {
			return jobRole;
		}

		public void setJobRole(String jobRole) {
			this.jobRole = jobRole;
		}

		public String getQualification() {
			return qualification;
		}

		public void setQualification(String qualification) {
			this.qualification = qualification;
		}

		public String getSubject() {
			return subject;
		}

		public void setSubject(String subject) {
			this.subject = subject;
		}

		public String getUsernamee() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
		
		


				
	}

		
