package com.learn.Spring.SpringPrjt5;

public class Mobile {
	String brand;
	int cost;
	int ramSize;
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mobile(String brand, int cost, int ramSize) {
		super();
		this.brand = brand;
		this.cost = cost;
		this.ramSize = ramSize;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getRamSize() {
		return ramSize;
	}
	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}
	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", cost=" + cost + ", ramSize=" + ramSize + "]";
	}
}
