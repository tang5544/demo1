package com.DMModel;

public class Password {
	String lasttxt;
	String username;
    String userright;
    public Password() 
    {
		super();
	}
    public Password(String lasttxt,String username,String userright) 
    {
		super();
		this.lasttxt = lasttxt;
		this.username = username;
		this.userright=userright;
	}
    public String getuserright()
    {
    	return userright;
    }
//    public void setuserright(String userright)
//    {
//    	this.userright=userright;
//    }
    
    public String getlasttxt() 
    {
		return lasttxt;
	}
//	public void setlasttxt(String lasttxt) 
//	{
//		this.lasttxt = lasttxt;
//	}
	public String getusername()
	{
		return username;
	}
//	public void setusername(String username)
//	{
//		this.username =username;
//	}

}
