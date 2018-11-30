package com.DMModel;

public class Xxinxi {

	String name;
	String phone;
	String position;
	String remark;
	String userName;
	String userPassword;
	String userright;
	
	public Xxinxi() 
    {
		super();
	}
	public Xxinxi(String name,String phone,String position,String remark,String userName,String userPassword,String userright)
	{
		super();
		this.name = name;
		this.phone = phone;
		this.position = position;
		this.remark = remark;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userright = userright;
	}
	public String getname() 
	{
		return name;
	}
	public String getphone() 
	{
		return phone;
	}
	public String getposition() 
	{
		return position;
	}
	public String getremark() 
	{
		return remark;
	}
	public String getuserName() 
	{
		return userName;
	}
	public String getuserPassword() 
	{
		return userPassword;
	}
	public String getuserright() 
	{
		return userright;
	}


}
