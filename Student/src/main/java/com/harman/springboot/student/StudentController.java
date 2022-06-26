package com.harman.springboot.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentController {

		@Autowired
		private StudentService studentservice;
		
	 
		@RequestMapping("/students")
			public List<Student>getAllStudents() {
				return  studentservice.getAllStudents();
				
			}
		@RequestMapping("/students/{studentname}")
		public Student getStudent(@PathVariable String studentname) {
			return studentservice.getStudent(studentname);

		}
		
		@RequestMapping(method = RequestMethod.POST,value="/students")	
		public Student addStudent(@RequestBody Student student) {
			studentservice.addStudent(student);
			return student;
			
		}
		
		@RequestMapping(method=RequestMethod.PUT,value = "/students/{studentname}")
		public Student updateStudent(@RequestBody Student student,@PathVariable  String studentname) {
			studentservice.updateStudent(studentname,student);
			return student;
			
			
		}
		@RequestMapping(method=RequestMethod.DELETE,value = "/students/{studentname}")
		public Student deleteStudent(@PathVariable  String studentname) {
			studentservice.deleteStudent(studentname);
			return null;
		}


}
