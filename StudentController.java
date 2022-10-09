package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.StudentDTO;
import com.example.demo.Response.StudentResponse;
import com.example.demo.Service.StudentService;


@RestController
public class StudentController {

	@Autowired
	private StudentService service;

	@PostMapping("/insert")
	private ResponseEntity<StudentResponse> insertStudent(@RequestBody StudentDTO student) {
		StudentDTO insertedStudent = service.insertStudent(student);
		return new ResponseEntity<StudentResponse>(new StudentResponse("OK", "Student inserted", insertedStudent, null),
				HttpStatus.ACCEPTED);
	}

	@GetMapping("/searchByName")
	private ResponseEntity<StudentResponse> searchByName(@RequestBody StudentDTO student) {
		StudentDTO searchByName = service.searchByName(student.getName());
		return new ResponseEntity<StudentResponse>(new StudentResponse("OK", "Student inserted", searchByName, null),
				HttpStatus.ACCEPTED);
	}
    
	@GetMapping("/findAll")
	private ResponseEntity<StudentResponse> findAll(){
		List<StudentDTO> student=service.findAll();
		return new ResponseEntity<StudentResponse>(new StudentResponse("OK", "Student inserted", null, student),
				HttpStatus.ACCEPTED);
		
	}
	
	
	
}
