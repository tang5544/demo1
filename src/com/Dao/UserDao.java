package com.Dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.DMModel.*;
import com.DMUtil.*;
import com.DLuo.*;
import com.Dao.*;
import com.DMView.*;

public class UserDao {
  public User Login(Connection con,User user) throws 
  Exception
  {
	  User currentuser = null;
	  String sql =  "select * from d_user where userName=? and userPassword=? and userright=?";
	  PreparedStatement pstmt = con.prepareStatement(sql);
	  pstmt.setString(1,user.getUserName());
	  pstmt.setString(2,user.getUserPassword());
	  pstmt.setString(3,user.getuserright());
	  //System.out.println(user.getuserright());
	  ResultSet rs = pstmt.executeQuery();
	  while(rs.next())
	  { 
		 currentuser = new User();
		 currentuser.setUserName(rs.getString("userName"));
		 currentuser.setUserPassword(rs.getString("userPassword"));  
		 currentuser.setuserright(rs.getString("userright"));
		 currentuser.setName(rs.getString("name"));
		 currentuser.setPhone(rs.getString("phone"));
		 currentuser.setPosition(rs.getString("position"));
		 currentuser.setRemark(rs.getString("remark"));
	  }
	return currentuser;
  }
  
  
  public ResultSet userList(Connection con, User user) throws Exception{
	  StringBuffer sb =new StringBuffer("select * from d_user");
	  if(StringUtil.isNotEmpty(user.getUserName())){
		  String member =user.getUserName();
		   sb.append(" and userName like '%"+ user.getUserName()+"%'");
	  }
	  PreparedStatement pstmt = con.prepareStatement(sb.toString().replaceFirst("and", "where"));
	  return pstmt.executeQuery();
  }

  public int userDelete(Connection con ,User user)throws Exception{
	  String sql = "delete from d_user where userName =?";
	  PreparedStatement pstmt = con.prepareStatement(sql);
	  pstmt.setString(1,user.getUserName());
	  return pstmt.executeUpdate();
  }
  
  
	public User updatedata(Connection conn,User user) throws
    Exception//修改数据函数
    {
    	User currentuser = null;
        String sql = "INSERT INTO d_user(userName,userPassword,userright,name,position) VALUES (?,?,?,?,?)";
        PreparedStatement psql = conn.prepareStatement(sql);
        psql.setString(1,user.getUserName());
        psql.setString(2,user.getUserPassword());
        psql.setString(3, user.getuserright());
        psql.setString(4, user.getname());
        psql.setString(5, user.getposition());
        psql.executeUpdate();
        psql.close();

	    return currentuser;
	    
  } 
}
