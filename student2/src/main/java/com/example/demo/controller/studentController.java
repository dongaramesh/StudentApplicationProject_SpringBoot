package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.student;
import com.example.demo.service.StudentService;

@RestController
public class studentController {

	@Autowired
	private StudentService studentService;
	@GetMapping("/getAllstudent")
	public List<student> getAllstudent() {
    return studentService.getAllStudent();
	}
	@PostMapping("/addStudent")
	public student createstudent(@RequestBody student st) {
     return studentService.addStudent(st);
	}
	@PutMapping("/updation/{id}")
	public student updateStudent(@RequestBody student st, @PathVariable long id) {
		student st1 = studentService.updateStudent(st, id);
		return st1;
	}
    @DeleteMapping("/delete/{id}")
	public void deleteStudent(@PathVariable long id) {
		studentService.deleteStudent(id);
	}
}
