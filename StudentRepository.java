package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.example.demo.DTO.StudentDTO;


public interface StudentRepository extends CrudRepository<StudentDTO, Integer> {

	StudentDTO findByName(String name);
	public StudentDTO insertStudent(StudentDTO student);
	List<StudentDTO> findAll();
	StudentDTO delete(int id);
	
}
