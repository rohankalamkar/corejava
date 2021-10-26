package com.model;

public class Student {
	private int sid;
	private String sname;
	private Batch btc;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Batch getBtc() {
		return btc;
	}
	public void setBtc(Batch btc) {
		this.btc = btc;
	}
	@Override
	public String toString() {
		return "Student [sid= " + sid + ", sname= " + sname + ", btc= " + btc + "]";
	}
	public Student(int sid, String sname, Batch btc) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.btc = btc;
	}
	

}
