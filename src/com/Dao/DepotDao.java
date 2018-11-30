package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.DMModel.Cang;

import com.DMUtil.StringUtil;


public class DepotDao {
  //��������
	public Cang updatedata(Connection conn,Cang cang) throws
    Exception//�޸����ݺ���
    {
    	Cang currentuser = null;
        String sql = "INSERT INTO depot_message(member,volume) VALUES (?,?)";
        PreparedStatement psql = conn.prepareStatement(sql);
        psql.setString(1,cang.getvolume());
        psql.setString(2,cang.getmember());
        psql.executeUpdate();
        psql.close();

	    return currentuser;
	    
  } 
  //��ѯ���֣������ֺţ�
	  public ResultSet roomList(Connection con,Cang cang) throws Exception{
		  StringBuffer sb =new StringBuffer("select * from depot_message");
		  if(StringUtil.isNotEmpty(cang.getmember())){
			  String member =cang.getmember();
			   sb.append(" and member like '%"+ cang.getmember()+"%'");
		  }
		  PreparedStatement pstmt = con.prepareStatement(sb.toString().replaceFirst("and", "where"));
		  return pstmt.executeQuery();
	  }
//ɾ���ֿ�
	  public int roomDelete(Connection con ,Cang cang)throws Exception{
		  String sql = "delete from depot_message where member =?";
		  PreparedStatement pstmt = con.prepareStatement(sql);
		  pstmt.setString(1,cang.getmember());
		  return pstmt.executeUpdate();
	  }
	}
