package com.model;

public class Batch {
	private int bid;
	private String bname;
	private Faculty fclt;
	@Override
	public String toString() {
		return "Batch [bid= " + bid + ", bname= " + bname + ", fclt= " + fclt + "]";
	}
	public Batch(int bid, String bname, Faculty fclt) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.fclt = fclt;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public Faculty getFclt() {
		return fclt;
	}
	public void setFclt(Faculty fclt) {
		this.fclt = fclt;
	}

}
