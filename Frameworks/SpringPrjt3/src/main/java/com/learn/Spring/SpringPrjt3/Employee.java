package com.learn.Spring.SpringPrjt3;

import java.util.*;

public class Employee {
List<String> Technology;
Set<String> Project;
Map<String,String> Company;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(List<String> technology, Set<String> project, Map<String, String> company) {
	super();
	Technology = technology;
	Project = project;
	Company = company;
}
public List<String> getTechnology() {
	return Technology;
}
public void setTechnology(List<String> technology) {
	Technology = technology;
}
public Set<String> getProject() {
	return Project;
}
public void setProject(Set<String> project) {
	Project = project;
}
public Map<String, String> getCompany() {
	return Company;
}
public void setCompany(Map<String, String> company) {
	Company = company;
}
@Override
public String toString() {
	return "Employee [Technology=" + Technology + ", Project=" + Project + ", Company=" + Company + "]";
}

}
