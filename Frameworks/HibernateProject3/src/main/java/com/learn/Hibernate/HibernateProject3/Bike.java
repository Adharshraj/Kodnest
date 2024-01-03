package com.learn.Hibernate.HibernateProject3;

import javax.persistence.*;

@Entity
public class Bike {
	@Id
	int b_engNo;
	String b_brand;
	int b_cost;
	public Bike() {
		
	}
	public Bike(int b_engNo, String b_brand, int b_cost) {
		super();
		this.b_engNo = b_engNo;
		this.b_brand = b_brand;
		this.b_cost = b_cost;
	}
	public int getB_engNo() {
		return b_engNo;
	}
	public void setB_engNo(int b_engNo) {
		this.b_engNo = b_engNo;
	}
	public String getB_brand() {
		return b_brand;
	}
	public void setB_brand(String b_brand) {
		this.b_brand = b_brand;
	}
	public int getB_cost() {
		return b_cost;
	}
	public void setB_cost(int b_cost) {
		this.b_cost = b_cost;
	}
	
}
