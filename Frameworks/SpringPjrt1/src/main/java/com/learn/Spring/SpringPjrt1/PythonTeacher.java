package com.learn.Spring.SpringPjrt1;

public class PythonTeacher {
	int Teacher_id;
	String Teacher_name;
	public PythonTeacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PythonTeacher(int pTeacher_id, String pTeacher_name) {
		super();
		Teacher_id = pTeacher_id;
		Teacher_name = pTeacher_name;
	}
	public int getTeacher_id() {
		return Teacher_id;
	}
	public void setTeacher_id(int pTeacher_id) {
		Teacher_id = pTeacher_id;
	}
	public String getTeacher_name() {
		return Teacher_name;
	}
	public void setTeacher_name(String pTeacher_name) {
		Teacher_name = pTeacher_name;
	}
	@Override
	public String toString() {
		return "PythonTeacher [Teacher_id=" + Teacher_id + ", Teacher_name=" + Teacher_name + "]";
	}
	
}
