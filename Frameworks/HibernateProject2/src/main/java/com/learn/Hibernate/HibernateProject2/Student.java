package com.learn.Hibernate.HibernateProject2;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	int Roll_no;
	String Name;
	int Mark;
	public Student() {
		
	}
	public Student(int roll_no, String name, int mark) {
		super();
		Roll_no = roll_no;
		Name = name;
		Mark = mark;
	}
	public int getRoll_no() {
		return Roll_no;
	}
	public void setRoll_no(int roll_no) {
		Roll_no = roll_no;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getMark() {
		return Mark;
	}
	public void setMark(int mark) {
		Mark = mark;
	}
	

}
