package com.learn.Hibernate.HibernateOTMMapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Technology {
	@Id
	int T_id;
	String T_name;
	public Technology() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Technology(int t_id, String t_name) {
		super();
		T_id = t_id;
		T_name = t_name;
	}
	public int getT_id() {
		return T_id;
	}
	public void setT_id(int t_id) {
		T_id = t_id;
	}
	public String getT_name() {
		return T_name;
	}
	public void setT_name(String t_name) {
		T_name = t_name;
	}
	@Override
	public String toString() {
		return "Technology [T_id=" + T_id + ", T_name=" + T_name + "]";
	}

}
