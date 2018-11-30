package com.Dao;
import java.sql.*;

import com.DMModel.Password;
import com.DMModel.User;
import com.DMUtil.*;
import com.DMModel.*;
public class PasswordDao {
	  
    public Password updatedata(Connection conn,Password password) throws
    Exception//修改数据函数
    {

        	Password currentuser = null;
            String sql = "update d_user set userPassword = ? where userName = ? and userright = ?";
            PreparedStatement psql = conn.prepareStatement(sql);
            psql.setString(1,password.getlasttxt());
            psql.setString(2, password.getusername());
            psql.setString(3, password.getuserright());
            psql.executeUpdate();
            psql.close();

    	    return currentuser;
    }
    

    
//    public static  void main(String []args) throws Exception {
//    	
//    }

}