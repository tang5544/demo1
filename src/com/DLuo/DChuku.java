package com.DLuo;

import java.sql.Connection;

import javax.swing.JOptionPane;
import com.DMView.*;
import com.DMModel.*;


public class DChuku {
	public static void jb_addActionPerformed(java.awt.event.ActionEvent evt) {
		   
	    
	    String huohao = chuku.dm_huohao.getText();
	    String shuliang = chuku.dm_canghao.getText();
	    if(huohao.equals("")) {
	    	JOptionPane.showMessageDialog(null, "��������ţ�");
	    	return;
	    }
	    if(shuliang.equals("")) {
	    	JOptionPane.showMessageDialog(null, "������������");
	    	return;
	    }
	    
	    Googs googs = new Googs(Integer.parseInt(huohao),Integer.parseInt(shuliang));
	    
	    Connection conn=null;
		int a = JOptionPane.showConfirmDialog(null, "ȷ���޸ģ�");
		
		try {	
			if(a==0) {
						conn = chuku.dmutil.getCon();
				    	int go = chuku.googsdao.Googschu(conn, googs);
						
						if (go == 1 ) {
							JOptionPane.showMessageDialog(null, "����ɹ���");
							resetValue();
						} else if(go==0){
							JOptionPane.showMessageDialog(null, "�����ڴ˻��");
							}
						else if(go==2)
						{
							JOptionPane.showMessageDialog(null, "��ǰ������������Ҫ�����������");
						}
			}
			else 
			{
				
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "����ʧ�ܣ�");
			e.printStackTrace();
		} 	
	}

	public static void resetValue() {
		chuku.dm_canghao.setText("");
		chuku.dm_huohao.setText("");
	}

	public static void jb_resetActionPerformed(java.awt.event.ActionEvent evt) {
		chuku.dm_huohao.setText("");
		chuku.dm_canghao.setText("");
	}
}
