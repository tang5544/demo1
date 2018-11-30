package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.DMModel.*;
import com.DMUtil.*;
import com.DLuo.*;
import com.Dao.*;
import com.DMView.*;

public class GoogsDao {

  public ResultSet GoogsSearch(Connection con,Googs googs) throws Exception{
	  StringBuffer sb = new StringBuffer("select * from goods_message b,depot_message bt where b.depot=bt.member");
	  if(StringUtil.isNotEmpty(googs.getName())){
		 sb.append(" and b.name like '%"+googs.getName()+"%'"); 
	  }
	  
	  if(googs.getSerial()!=-1){ 
			 sb.append(" and b.serial = '"+googs.getSerial()+"'");
		  }
	  if(googs.getDepot()!=-1){
			 sb.append(" and b.depot = " + googs.getDepot()); 
		  }
	  PreparedStatement pstmt = con.prepareStatement(sb.toString());
	  return pstmt.executeQuery();
  }
  
  //出库
  public int Googschu(Connection con,Googs googs)throws Exception{
	  int f1=0;
	  Googs go=null;
	  String sq =  "select * from goods_message where serial=?";
	  PreparedStatement pst = con.prepareStatement(sq);
	  pst.setInt(1,googs.getSerial());
	  ResultSet rs = pst.executeQuery();
	  int ss = 0;
	  while(rs.next())
	  { 
		  go=new Googs();
		  go.setSerial(rs.getInt("Serial"));
		 ss = rs.getInt("amount");
	  }
	  if(go==null)
	  {
		  f1=0;
	  }
	  else if(go!=null)
	  {
		  System.out.println(ss);
		  if((ss-googs.getAmount())==0)//刚好出库完
		  {
			  String sql = "delete from goods_message where serial=?";
			  PreparedStatement pstmt = con.prepareStatement(sql);
			  pstmt.setInt(1,googs.getSerial());
			  f1= pstmt.executeUpdate();//返回1
		  }
		  else if((ss-googs.getAmount())>0)
		  {
		  String sql = "update goods_message set amount = ? where serial=?";
		  PreparedStatement pstmt = con.prepareStatement(sql);
		  pstmt.setInt(1,ss-googs.getAmount());
		  pstmt.setInt(2,googs.getSerial());
		  f1= pstmt.executeUpdate();//返回1
		  }
		  else if((ss-googs.getAmount())<0)
		  {
			  f1=2;
		  }
	  }
	return f1;

	 
  }
  
  
  
  public int GoogsModify(Connection con,Googs googs)throws Exception{
	  String sql = "update goods_message set depot =? ,name =?, Shelfid = ?, amount = ? , unit_price = ? where serial=?";
	  PreparedStatement pstmt = con.prepareStatement(sql);
	  pstmt.setInt(1,googs.getDepot());
	  pstmt.setString(2,googs.getName());
	  pstmt.setString(3,googs.getShelfid());
	  pstmt.setInt(4,googs.getAmount());
	  pstmt.setFloat(5,googs.getUnit_price());
	  pstmt.setInt(6,googs.getSerial());
	  return pstmt.executeUpdate();  
  }
  
  
  //入库
  
  public int Googsruku(Connection con,Googs googs)throws Exception{
	  int f1=0;
	  Googs go=null;
	  String sq =  "select * from goods_message where serial=?";
	  PreparedStatement pst = con.prepareStatement(sq);
	  pst.setInt(1,googs.getSerial());
	  ResultSet rs = pst.executeQuery();
	  int ss = 0;
	  while(rs.next())
	  { 
		  go=new Googs();
		  go.setSerial(rs.getInt("Serial"));
		 ss = rs.getInt("amount");
	  }
	  if(go==null)//当前没有这个货物
	  {
		String   sql = "INSERT INTO goods_message(serial,depot,name,Shelfid,amount,unit_price) VALUES (?,?,?,?,?,?)";
        PreparedStatement psql = con.prepareStatement(sql);
        psql.setInt(1,googs.getSerial());
        psql.setInt(2,googs.getDepot());
        psql.setString(3,googs.getName());
        psql.setString(4,googs.getShelfid());
        psql.setInt(5,googs.getAmount());
        psql.setFloat(6,googs.getUnit_price());
        f1=psql.executeUpdate();//返回1
	  }
	  else if(go!=null)//有该货物则添加数量
	  {
		  String sql = "update goods_message set amount = ? where serial=?";
		  PreparedStatement pstmt = con.prepareStatement(sql);
		  pstmt.setInt(1,ss+googs.getAmount());
		  pstmt.setInt(2,googs.getSerial());
		  f1= pstmt.executeUpdate();//返回1
	  }
	return f1;

	 
  }
  
  
//  public int GoogsDelete(Connection con,Googs googs) throws Exception{
//	  String sql = "delete from goods_message where name=?";
//	  PreparedStatement pstmt = con.prepareStatement(sql);
//	  pstmt.setString(1,googs.getName()+"");
//	  return pstmt.executeUpdate();
//  }
}
