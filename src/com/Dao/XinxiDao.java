package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.DMModel.*;
import com.DMUtil.*;

public class XinxiDao {
	public Xxinxi updatedata(Connection conn,Xxinxi xinxi) throws
    Exception//修改数据函数
    {
    	Xxinxi currentuser = null;
        String sql = "Update d_user set name=?,phone=?,position=?,remark=? where userName=? and userPassword=? and userright =?";
        PreparedStatement psql = conn.prepareStatement(sql);
        psql.setString(1,xinxi.getname());
        psql.setString(2,xinxi.getphone());
        psql.setString(3,xinxi.getposition());
        psql.setString(4,xinxi.getremark());
        psql.setString(5,xinxi.getuserName());
        psql.setString(6,xinxi.getuserPassword());
        psql.setString(7,xinxi.getuserright());
        psql.executeUpdate();
        psql.close();

	    return currentuser;
	    
	    
    }
}
