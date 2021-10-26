package com.model;

public class Faculty {
	private int fid;
	private String fname;
	private Course crs;
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public Course getCrs() {
		return crs;
	}
	public void setCrs(Course crs) {
		this.crs = crs;
	}
	@Override
	public String toString() {
		return "Faculty [fid= " + fid + ", fname= " + fname + ", crs= " + crs + "]";
	}
	public Faculty(int fid, String fname, Course crs) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.crs = crs;
	}
	

}
