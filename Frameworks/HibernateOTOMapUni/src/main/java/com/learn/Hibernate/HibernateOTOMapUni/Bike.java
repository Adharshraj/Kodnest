package com.learn.Hibernate.HibernateOTOMapUni;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Bike {
	@Id
	int b_engNo;
	String b_brand;
	int b_cost;
	Person p;
	public Bike() {
		
	}
	
}
