package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.StudentDTO;
import com.example.demo.Repository.StudentRepository;


@Service
public class StudentService implements StudentServiceInterface {

	@Autowired
	private StudentRepository repository;

	@Override
	public StudentDTO insertStudent(StudentDTO student) {
		StudentDTO savedStudent = repository.save(student);
		return savedStudent;
	}

	@Override
	public StudentDTO searchByName(String name) {
		StudentDTO findByName = repository.findByName(name);
		return findByName;
	}

	@Override
	public List<StudentDTO> findAll() {
		List<StudentDTO> student=repository.findAll();
		return student;
	}

	

	

}

