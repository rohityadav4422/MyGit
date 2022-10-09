package com.example.demo.Response;


import java.util.List;

import com.example.demo.DTO.StudentDTO;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StudentResponse {

	public StudentResponse(String msg2, String description2, StudentDTO insertedStudent, Object list2) {
		// TODO Auto-generated constructor stub
	}

	private String msg;
	
	private String description;
	
	private StudentDTO student;
	
	private List<StudentDTO> list;
}

