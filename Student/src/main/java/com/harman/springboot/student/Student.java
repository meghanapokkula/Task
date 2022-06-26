package com.harman.springboot.student;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
	@Id
	private String studentname;
	private String dept;
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}

	public Student(String studentname, String dept, int id) {
		super();
		this.studentname = studentname;
		this.dept = dept;
		this.id = id;
	}
	public Student() {
		super();
	}
	

}
