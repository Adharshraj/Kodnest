package com.learn.Hibernate.HibernateOTM2Mapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Student {
	@Id
	int S_RollNo;
	String S_Name;
	@OneToMany
	List<Laptop> S_Lt;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int s_RollNo, String s_Name, List<Laptop> s_Lt) {
		super();
		S_RollNo = s_RollNo;
		S_Name = s_Name;
		S_Lt = s_Lt;
	}
	public int getS_RollNo() {
		return S_RollNo;
	}
	public void setS_RollNo(int s_RollNo) {
		S_RollNo = s_RollNo;
	}
	public String getS_Name() {
		return S_Name;
	}
	public void setS_Name(String s_Name) {
		S_Name = s_Name;
	}
	public List<Laptop> getS_Lt() {
		return S_Lt;
	}
	public void setS_Lt(List<Laptop> s_Lt) {
		S_Lt = s_Lt;
	}
	@Override
	public String toString() {
		return "Student [S_RollNo=" + S_RollNo + ", S_Name=" + S_Name + ", S_Lt=" + S_Lt + "]";
	}

}
