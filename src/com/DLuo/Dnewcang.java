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
	    	JOptionPane.showMessageDialog(null, "������������");
	    	return;
	    }
	    if(newcang.dm_huohao.getText().equals("")) {
	    	JOptionPane.showMessageDialog(null, "������绰�ţ�");
	    	return;
	    }
    
	    Connection conn=null;
		int a = JOptionPane.showConfirmDialog(null, "ȷ���޸ģ�");	
		
		try {
			conn = newcang.dmutil.getCon();
			Cang can = newcang.newcangDao.updatedata(conn, cang);
			if (a == 0) {
				JOptionPane.showMessageDialog(null, "��ӳɹ���");
				resetValue();
			} else {
				JOptionPane.showMessageDialog(null, "���ʧ�ܣ�");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "���ʧ�ܣ�");
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
