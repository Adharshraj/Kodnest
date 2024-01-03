package com.learn.Spring.SpringPjrt1;

public class Student {
	int Roll_No;
	String Name;
	int Age;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int roll_No, String name, int age) {
		super();
		Roll_No = roll_No;
		Name = name;
		Age = age;
	}
	public int getRoll_No() {
		return Roll_No;
	}
	public void setRoll_No(int roll_No) {
		Roll_No = roll_No;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	@Override
	public String toString() {
		return "Student [Roll_No=" + Roll_No + ", Name=" + Name + ", Age=" + Age + "]";
	}
	

}
