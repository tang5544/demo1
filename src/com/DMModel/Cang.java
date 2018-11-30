package com.DMModel;

public class Cang {
	String member;
	String volume;
	
	public Cang() {
		super();
	}
	
	public Cang(String member) {
		super();
		this.member = member;
	}
	
	public Cang(String member,String volume) {
		this.member = member;
		this.volume = volume;
	}
	
	public String getmember() {
		return member;
	}
	
	public void setvolume(String volume) {
		this.volume = volume;
	}
	
	public void setmember(String member) {
		this.member = member;
	}
	public String getvolume() {
		return volume;
	}
	public String toString() {
		return this.getmember();
	}
	  

}
