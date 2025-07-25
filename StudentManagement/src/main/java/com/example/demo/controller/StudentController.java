package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;


@RestController
@RequestMapping("/api/students")
@CrossOrigin(origins = "http://localhost:4200")

public class StudentController {
	 @Autowired
	    private StudentService service;

	    @GetMapping
	    public List<Student> getAll() {
	        return service.getAllStudents();
	    }

	    @PostMapping
	    public Student create(@RequestBody Student student) {
	        return service.saveStudent(student);
	    }

	    @DeleteMapping("/{id}")
	    public void delete(@PathVariable Long id) {
	        service.deleteStudent(id);
	    }

}
