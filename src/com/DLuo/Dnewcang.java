package com.DLuo;

import java.sql.Connection;

import javax.swing.JOptionPane;

import com.DMModel.User;
import com.DMModel.Xxinxi;
import com.DMView.*;
import com.DMModel.*;

public class Dnewcang {
	public static void jb_addActionPerformed(java.awt.event.ActionEvent evt) {
		
		String member = newcang.dm_canghao.getText();
		String volume = newcang.dm_huohao.getText();

	    Cang cang =new Cang(member,volume);
	    if(newcang.dm_canghao.getText().equals("")) {
	    	JOptionPane.showMessageDialog(null, "请输入姓名！");
	    	return;
	    }
	    if(newcang.dm_huohao.getText().equals("")) {
	    	JOptionPane.showMessageDialog(null, "请输入电话号！");
	    	return;
	    }
    
	    Connection conn=null;
		int a = JOptionPane.showConfirmDialog(null, "确定修改？");	
		
		try {
			conn = newcang.dmutil.getCon();
			Cang can = newcang.newcangDao.updatedata(conn, cang);
			if (a == 0) {
				JOptionPane.showMessageDialog(null, "添加成功！");
				resetValue();
			} else {
				JOptionPane.showMessageDialog(null, "添加失败！");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "添加失败！");
			e.printStackTrace();
		} 	
	}

	public static void resetValue() {
		newcang.dm_canghao.setText("");
		newcang.dm_huohao.setText("");
	}

	 public static void jb_resetActionPerformed(java.awt.event.ActionEvent evt) {
		newcang.dm_huohao.setText("");
		newcang.dm_canghao.setText("");
	}
}
