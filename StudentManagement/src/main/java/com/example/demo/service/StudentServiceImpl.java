package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService {
	
	 @Autowired
	    private StudentRepository repository;

	@Override
	public List<Student> getAllStudents() {
		 return repository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		 return repository.save(student);
	}

	@Override
	public void deleteStudent(Long id) {
		 repository.deleteById(id);

	}

}
