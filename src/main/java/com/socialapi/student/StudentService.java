package com.socialapi.student;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repository;

	public List<Student> getAllStudents() 
	{	
		List<Student> students = (List<Student>) repository.findAll();
		return students;
	}

	
	public Optional<Student> getStudentById(String id) 
	{
		return repository.findById(id);
	}

	public void addStudent(Student student) 
	{
		repository.save(student);
	}


	public void updateStudent(String id, Student student) 
	{
		repository.save(student);
	}

	public void deleteById(String id) 
	{
		repository.deleteById(id);
	}
}
