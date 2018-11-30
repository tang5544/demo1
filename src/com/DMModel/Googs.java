package com.DMModel;

public class Googs {
  int serial=-1;
  int depot=-1;
  int amount;
  float unit_price;
  String name;
  String Shelfid;
  
  
public Googs(String name) {
	super();
	this.name = name;
}
public Googs(int serial,  int depot, String name,String Shelfid,int amount, float unit_price) {
	super();
	this.serial = serial;
	this.depot = depot;
	this.name = name;
	this.Shelfid = Shelfid;
	this.amount = amount;
	this.unit_price = unit_price;
}
public Googs(String name,  String Shelfid, float unit_price,
		int depot, int amount) {
	super();
	this.name = name;
	this.Shelfid = Shelfid;
	this.unit_price = unit_price;
	this.depot = depot;
	this.amount = amount;
}
public Googs() {
	super();
}


public Googs(String serial,String name, String depot) {
	super();
	this.name = name;
		
	if(serial.equals(""))
		System.out.println(this.serial);
	else
	{
		this.serial=Integer.parseInt(serial);
	}
	if(depot.equals(""))
		System.out.println(this.depot);
	else
	{
		this. depot =Integer.parseInt(depot);
	}
	
}


public Googs(String name, int depot) {
	super();
	this.name = name;
	this. depot =  depot;
}
public Googs(int serial,String name) {
	super();
	this.name = name;
	this.serial =serial;
}

public Googs(int serial,int amount) {
	super();
	this.serial = serial;
	this.amount = amount;
}


public int getSerial() {
	return serial;
}
public void setSerial(int serial) {
	this.serial = serial;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getShelfid() {
	return Shelfid;
}
public void setShelfid(String Shelfid) {
	this.Shelfid = Shelfid;
}
public float getUnit_price() {
	return unit_price;
}
public void setUnit_price(float unit_price) {
	this.unit_price = unit_price;
}

public int getDepot() {
	return depot;
}
public void setDepot(int depot) {
	this.depot = depot;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}

  
}
