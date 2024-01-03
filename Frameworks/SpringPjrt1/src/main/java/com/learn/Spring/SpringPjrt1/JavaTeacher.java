package com.learn.Spring.SpringPjrt1;

public class JavaTeacher {
	int Teacher_id;
	String Teacher_name;
	public JavaTeacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JavaTeacher(int teacher_id, String teacher_name) {
		super();
		Teacher_id = teacher_id;
		Teacher_name = teacher_name;
	}
	public int getTeacher_id() {
		return Teacher_id;
	}
	public void setTeacher_id(int teacher_id) {
		Teacher_id = teacher_id;
	}
	public String getTeacher_name() {
		return Teacher_name;
	}
	public void setTeacher_name(String teacher_name) {
		Teacher_name = teacher_name;
	}
	@Override
	public String toString() {
		return "JavaTeacher [Teacher_id=" + Teacher_id + ", Teacher_name=" + Teacher_name + "]";
	}
	

}
