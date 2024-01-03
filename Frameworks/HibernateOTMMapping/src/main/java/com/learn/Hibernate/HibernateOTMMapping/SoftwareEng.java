package com.learn.Hibernate.HibernateOTMMapping;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class SoftwareEng {
	@Id
	int id;
	String name;
	int age;
	@OneToMany
	
	ArrayList<Technology> tech;
	public SoftwareEng() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public SoftwareEng(int id, String name, int age, ArrayList<Technology> tech) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.tech = tech;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public ArrayList<Technology> getTech() {
		return tech;
	}

	public void setTech(ArrayList<Technology> tech) {
		this.tech = tech;
	}

	@Override
	public String toString() {
		return "SoftwareEng [id=" + id + ", name=" + name + ", age=" + age + ", tech=" + tech + "]";
	}

	
	

}
