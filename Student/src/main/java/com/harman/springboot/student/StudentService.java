package com.harman.springboot.student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	@Autowired
	/*private List<Course> students = new ArrayList<>(
			Arrays.asList(new Course(1, "Meghana", "EEE"), new Course(2, "Sahana", "ECE")));

	public List<Course> getAllStudents() {
		return students;
	}

	public Course getStudent(String name) {
		return students.stream().filter(t -> t.getName().equals(name)).findFirst().get();
	}

	public void addStudent(Course student) {
		students.add(student);
	}

	public void updateStudent(String name, Course student) {
		for (int i = 0; i < students.size(); i++) {
			Course t = students.get(i);
			if (t.getName().equals(name)) {
				students.set(i, student);
				return;
			}
		}

	}

	public void deleteStudent(String name) {
		students.removeIf(t -> t.getName().equals(name));
	}
*/
	private StudentRepository studentRepository;
	
    public List<Student> getAllStudents() {
    	List<Student> students = new ArrayList<>();
    	studentRepository.findAll().forEach(students::add);
		return students;
    }
    
    public Student getStudent(String studentname) {
		return studentRepository.findOne(studentname);
    }
    
    public void addStudent(Student student) {
    	studentRepository.save(student);
    }
    
    public void updateStudent(String studentname, Student student) {
    	studentRepository.save(student);
    }
    
	public void deleteStudent(String studentname) {
		studentRepository.delete(studentname);
	}

}
