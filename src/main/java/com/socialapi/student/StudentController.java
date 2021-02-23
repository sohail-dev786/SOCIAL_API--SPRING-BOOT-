package com.socialapi.student;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	
	@Autowired
	StudentService studentService;
	
	
	@RequestMapping(value = "/students",method = RequestMethod.GET)
	public List<Student> getAllStudents()
{	
//		List<Student> students=studentService.getAllStudents();
//		model.addAttribute("students", students);
		return studentService.getAllStudents();
	}
	
	@RequestMapping(value="/students/{id}",method = RequestMethod.GET)
	public Optional<Student> getStudentByID(@PathVariable String id)
	{
		return studentService.getStudentById(id);
		
	}
	
	@RequestMapping(value = "/students",method = RequestMethod.POST)
	public void addStudent(@RequestBody Student student)
	{
		studentService.addStudent(student);
	}
	
	@RequestMapping(value = "/students/{id}",method = RequestMethod.PUT)
	public void updateStudent(@PathVariable String id,@RequestBody Student student)
	{
		studentService.updateStudent(id, student);
		
	}
	
	@RequestMapping(value = "/students/{id}",method = RequestMethod.DELETE)
	public void deleteStudent(@PathVariable String id)
	{
		studentService.deleteById(id);
	}
	
	
}
