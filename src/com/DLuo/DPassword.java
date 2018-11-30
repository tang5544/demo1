package com.DLuo;

import com.DMModel.*;
import com.DMUtil.*;

import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.DMModel.*;
import com.DMUtil.*;
import com.DLuo.*;
import com.Dao.*;

import jdk.nashorn.internal.ir.Statement;

import com.DMView.*;


public class DPassword {
	public static void jb_searchActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		String username = LoginFrm.userNameTxt.getText();
		User user1 = (User) LoginFrm.jcb_choose.getSelectedItem();
		String userright = user1.getUserName();
		String firtxt = GPassword.roomNumTxt.getText();
		String lasttxt = GPassword.afterNumTxt.getText();
		if(firtxt.equals(""))
		{
			JOptionPane.showMessageDialog(null, "请输入原密码！");
			return ;
		}
		if(lasttxt.equals(""))
		{
			JOptionPane.showMessageDialog(null, "请输入新密码！");
			return ;
		}
		String userPassword = new String(LoginFrm.userPasswordTxt.getPassword());
		Password password = new Password(lasttxt,username,userright); 
    	Connection conn=null;
		int a = JOptionPane.showConfirmDialog(null, "确定修改？");
		if(!firtxt.equals(userPassword)) {
			JOptionPane.showMessageDialog(null, "原密码错误！");
			return;
		}
		try {	
	    	conn = GPassword.dmutil.getCon();
	    	Password pass = GPassword.passworddao.updatedata(conn, password);
			if (a == 0 ) {
				JOptionPane.showMessageDialog(null, "修改成功！");
				com.DMView.GPassword.roomNumTxt.setText("");
				com.DMView.GPassword.afterNumTxt.setText("");
			} else {
				JOptionPane.showMessageDialog(null, "修改失败！");
			}
			} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "修改失败！");
			e.printStackTrace();
		}
	}
	
}

