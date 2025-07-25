package com.example.demo.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


@Entity
public class Student {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	    private String name;
	    private String email;
	    private String course;
	    
	    @Temporal(TemporalType.DATE)
	    private Date dob;
	    public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
		public Student(Long id, String name, String email, String course, Date dob) {
			super();
			this.id = id;
			this.name = name;
			this.email = email;
			this.course = course;
			this.dob = dob;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getCourse() {
			return course;
		}

		public void setCourse(String course) {
			this.course = course;
		}

		public Date getDob() {
			return dob;
		}

		public void setDob(Date dob) {
			this.dob = dob;
		}

		
		
		
	    
	    
	    
	    

}
