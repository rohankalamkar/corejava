package com.model;

public class Account {
	private int accountnumber;
	private String name;
	private String address ;
	private String pan;
	private double balance;
	public int getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		String a = "Account Holder Name : "+getName();
		String b = "\nAccount Number : "+getAccountnumber();
		String c = "\nAccount Holder Address : "+getAddress();
		String d = "\nAccount Holder Pan Card Details : "+getPan();
		String e = "\nAccount Holder Balance in Rs. : "+getBalance();
		String fin=a+b+c+d+e;
		return fin;
	}
	

}
