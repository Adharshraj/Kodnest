package com.learn.Hibernate.HibernateOTM2Mapping;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Laptop {
	@Id
	int L_srNo;
	String L_Brand;
	@OneToOne
	Student L_st;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(int l_srNo, String l_Brand, Student l_st) {
		super();
		L_srNo = l_srNo;
		L_Brand = l_Brand;
		L_st = l_st;
	}
	public int getL_srNo() {
		return L_srNo;
	}
	public void setL_srNo(int l_srNo) {
		L_srNo = l_srNo;
	}
	public String getL_Brand() {
		return L_Brand;
	}
	public void setL_Brand(String l_Brand) {
		L_Brand = l_Brand;
	}
	public Student getL_st() {
		return L_st;
	}
	public void setL_st (Student l_st) {
		L_st = l_st;
	}
	@Override
	public String toString() {
		return "Laptop [L_srNo=" + L_srNo + ", L_Brand=" + L_Brand + ", L_st=" + L_st + "]";
	}

}