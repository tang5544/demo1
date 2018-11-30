

package com.DMUtil;

import java.sql.Connection;
import java.sql.DriverManager;


public class DMUtil 
{
	//private String url = "jdbc:mysql://119.23.59.109:3306/depot?characterEncoding=utf8&useSSL=false&serverTimezone=UTC";
  private String url = "jdbc:mysql://localhost:3306/depot?characterEncoding=utf8&useSSL=false&serverTimezone=UTC";
  private String userName = "root";
  private String userPassword = "";
  private String jdbcName = "com.mysql.cj.jdbc.Driver";
  
  public Connection getCon() throws Exception
  {
	  Class.forName(jdbcName);
	  Connection con = DriverManager.getConnection(url,userName,userPassword);
	  return con;
  }
  
  public void closeCon(Connection con) throws Exception
  {
	  if(con!=null)
	  {
		  con.close();
	  }
  }
  public static void main(String[] args)
  {
	  DMUtil dmutil = new DMUtil();
	  Connection con = null;
	  try 
	  {
		con = dmutil.getCon();
		System.out.println("数据库连接成功！");
	  }
	  catch (Exception e) 
	  {
		e.printStackTrace();
	  }
	  finally
	  {
		try 
		{
			dmutil.closeCon(con);
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
  }
}
