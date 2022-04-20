package io.curd.student;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.Data;


@Entity
public class Student {
	
	
	@Id
	private String id;
	private String name;
	private String marks;
	
	public Student() {
		
	}
	public Student(String id, String name, String marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMarks() {
		return marks;
	}
	public void setMarks(String marks) {
		this.marks = marks;
	}
	
	

}
