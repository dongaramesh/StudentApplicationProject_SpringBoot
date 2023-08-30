package com.example.demo.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.model.student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {
@Autowired
private StudentRepository studentRepository;

public List <student> getAllStudent(){
	return studentRepository.findAll();
}
	public Optional<student> getStudentById(long id){
		return studentRepository.findById(id);
	}
		public student updateStudent(student st, long id) {
			st.setId(id);
			return studentRepository.save(st);
		}
		public student addStudent(student st) {
			return studentRepository.save(st);
		}
		public void deleteStudent(long id) {
			 studentRepository.deleteById(id);
		}
		
		
	
}
