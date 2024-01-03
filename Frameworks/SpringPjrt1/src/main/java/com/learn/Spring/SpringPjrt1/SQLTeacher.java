package com.learn.Spring.SpringPjrt1;

public class SQLTeacher {
	int Teacher_id;
	String Teacher_name;
	public SQLTeacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SQLTeacher(int sTeacher_id, String sTeacher_name) {
		super();
		Teacher_id = sTeacher_id;
		Teacher_name = sTeacher_name;
	}
	public int getTeacher_id() {
		return Teacher_id;
	}
	public void setTeacher_id(int sTeacher_id) {
		Teacher_id = sTeacher_id;
	}
	public String getTeacher_name() {
		return Teacher_name;
	}
	public void setTeacher_name(String sTeacher_name) {
		Teacher_name = sTeacher_name;
	}
	@Override
	public String toString() {
		return "SQLTeacher [Teacher_id=" + Teacher_id + ", Teacher_name=" + Teacher_name + "]";
	}
	
}
