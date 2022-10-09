package com.example.demo.Service;

import java.util.List;

import com.example.demo.DTO.StudentDTO;


public interface StudentServiceInterface {

	StudentDTO insertStudent(StudentDTO student);

	StudentDTO searchByName(String name);
	List<StudentDTO> findAll();
	
	StudentDTO delete(int id);

}