package com.DMModel;

public class User {
	String id;
    String userName;
    String userPassword;
    String userright;
    String name;
    String position;
    String phone;
    String remark;
    public User() 
    {
		super();
	}
    public User(String userName, String userPassword,String userright) 
    {
		super();
		this.userName = userName;
		this.userPassword = userPassword;
		this.userright=userright;
	}
    public User(String userName, String userPassword,String userright,String name,String position) 
    {
		super();
		this.userName = userName;
		this.userPassword = userPassword;
		this.userright=userright;
		this.name = name;
		this.position =position;
	}
    public User(String userName) {
    	super();
    	this.userName = userName;
    }
	
    
    public void setUserName(String userName) 
	{
		this.userName = userName;
	}
	public String getUserName() 
	{
		return userName;
	}
   
	
	public String getuserright()
    {
    	return userright;
    }
    public void setuserright(String userright)
    {
    	this.userright=userright;
    }
    
    
    
    public String getId() 
    {
		return id;
	}
	public void setId(String id) 
	{
		this.id = id;
	}

	
	
	public String getname() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	
	
	
	public String getposition() 
	{
		return position;
	}
	public void setPosition(String position) 
	{
		this.position = position;
	}
	
	public String getPhone() 
	{
		return phone;
	}
	public void setPhone(String phone) 
	{
		this.phone = phone;
	}
	
	
	public String getRemark() 
	{
		return remark;
	}
	public void setRemark(String remark) 
	{
		this.remark = remark;
	}
	
	
	
	public String getUserPassword() 
	{
		return userPassword;
	}
	public void setUserPassword(String userPassword) 
	{
		this.userPassword = userPassword;
	}
@Override
	public String toString() 
	{
		return this.getUserName();
	}
  
}
