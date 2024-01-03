package com.learn.Hibernate.HibernateMTM2Mapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Technology {
	@Id
	int T_id;
	String T_name;
	@ManyToMany
	List<SoftwareEng> sfte;
	public Technology() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Technology(int t_id, String t_name, List<SoftwareEng> sfte) {
		super();
		T_id = t_id;
		T_name = t_name;
		this.sfte = sfte;
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
	public List<SoftwareEng> getSfte() {
		return sfte;
	}
	public void setSfte(List<SoftwareEng> sfte) {
		this.sfte = sfte;
	}
	@Override
	public String toString() {
		return "Technology [T_id=" + T_id + ", T_name=" + T_name + ", sfte=" + sfte + "]";
	}

}
