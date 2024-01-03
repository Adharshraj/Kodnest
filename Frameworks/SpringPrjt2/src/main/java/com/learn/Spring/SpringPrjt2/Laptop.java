package com.learn.Spring.SpringPrjt2;

public class Laptop {
	int SrNo;
	String Brand;
	float Cost;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(int srNo, String brand, float cost) {
		super();
		SrNo = srNo;
		Brand = brand;
		Cost = cost;
	}
	public int getSrNo() {
		return SrNo;
	}
	public void setSrNo(int srNo) {
		SrNo = srNo;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public float getCost() {
		return Cost;
	}
	public void setCost(float cost) {
		Cost = cost;
	}
	@Override
	public String toString() {
		return "Laptop [SrNo=" + SrNo + ", Brand=" + Brand + ", Cost=" + Cost + "]";
	}
	

}
