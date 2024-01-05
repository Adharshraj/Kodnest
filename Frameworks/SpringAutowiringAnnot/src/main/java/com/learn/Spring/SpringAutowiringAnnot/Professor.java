package com.learn.Spring.SpringAutowiringAnnot;

public class Professor {
	int prId;
	String prName;
	String prSub;
	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Professor(int prId, String prName, String prSub) {
		super();
		this.prId = prId;
		this.prName = prName;
		this.prSub = prSub;
	}
	public int getPrId() {
		return prId;
	}
	public void setPrId(int prId) {
		this.prId = prId;
	}
	public String getPrName() {
		return prName;
	}
	public void setPrName(String prName) {
		this.prName = prName;
	}
	public String getPrSub() {
		return prSub;
	}
	public void setPrSub(String prSub) {
		this.prSub = prSub;
	}
	@Override
	public String toString() {
		return "Professor [prId=" + prId + ", prName=" + prName + ", prSub=" + prSub + "]";
	}
	

}
