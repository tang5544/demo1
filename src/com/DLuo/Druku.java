package com.DLuo;

import java.sql.Connection;

import javax.swing.JOptionPane;

import com.DMModel.*;
import com.DMView.*;


public class Druku {
	public static void jb_addActionPerformed(java.awt.event.ActionEvent evt) {
		
		String huohao = ruku.huohaoTxt.getText();
		String huoming = ruku.huomingTxt.getText();
		String canghao = ruku.canghaoTxt.getText();
		String jiahao = ruku.jiahaoTxt.getText();
		String shuliang = ruku.shuliangTxt.getText();
		String danjia = ruku.beizhuTxt.getText();
		if(huohao.equals("")) {
	    	JOptionPane.showMessageDialog(null, "��������ţ�");
	    	return;
	    }
	    if(shuliang.equals("")) {
	    	JOptionPane.showMessageDialog(null, "������������");
	    	return;
	    }
	    if(huoming.equals("")) {
	    	JOptionPane.showMessageDialog(null, "�����������");
	    	return;
	    }
	    if(canghao.equals("")) {
	    	JOptionPane.showMessageDialog(null, "������ֺţ�");
	    	return;
	    }
	    if(jiahao.equals("")) {
	    	JOptionPane.showMessageDialog(null, "��������ܺţ�");
	    	return;
	    }
	    if(danjia.equals("")) {
	    	JOptionPane.showMessageDialog(null, "�����뵥�ۣ�");
	    	return;
	    }
		Googs googs = new Googs(Integer.parseInt(huohao),Integer.parseInt(canghao),huoming,jiahao,Integer.parseInt(shuliang),Float.parseFloat(danjia));
		Connection conn=null;
		int a = JOptionPane.showConfirmDialog(null, "ȷ����");
		try {
			 if(a==0)
			 {
					conn = ruku.dmutil.getCon();
					int go = ruku.googs.Googsruku(conn, googs);
					if (go == 1) {
						JOptionPane.showMessageDialog(null, "�Ǽǳɹ���");
						resetValue();
					} else {
						JOptionPane.showMessageDialog(null, "�Ǽ�ʧ�ܣ�");
					}
			 }
			 else
			 {
				 
			 }
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "�Ǽ�ʧ�ܣ�");
			e.printStackTrace();
		}
	}

	public static void resetValue() {
		ruku.huohaoTxt.setText("");
		ruku.huomingTxt.setText("");
		ruku.canghaoTxt.setText("");
		ruku.jiahaoTxt.setText("");
		ruku.shuliangTxt.setText("");
		ruku.beizhuTxt.setText("");

	}
	public static void jb_resetActionPerformed(java.awt.event.ActionEvent evt)  {
		ruku.huohaoTxt.setText("");
		ruku.huomingTxt.setText("");
		ruku.canghaoTxt.setText("");
		ruku.jiahaoTxt.setText("");
		ruku.shuliangTxt.setText("");
		ruku.beizhuTxt.setText("");
	}
}