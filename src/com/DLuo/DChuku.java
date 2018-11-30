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
	    	JOptionPane.showMessageDialog(null, "请输入货号！");
	    	return;
	    }
	    if(shuliang.equals("")) {
	    	JOptionPane.showMessageDialog(null, "请输入容量！");
	    	return;
	    }
	    
	    Googs googs = new Googs(Integer.parseInt(huohao),Integer.parseInt(shuliang));
	    
	    Connection conn=null;
		int a = JOptionPane.showConfirmDialog(null, "确定修改？");
		
		try {	
			if(a==0) {
						conn = chuku.dmutil.getCon();
				    	int go = chuku.googsdao.Googschu(conn, googs);
						
						if (go == 1 ) {
							JOptionPane.showMessageDialog(null, "出库成功！");
							resetValue();
						} else if(go==0){
							JOptionPane.showMessageDialog(null, "不存在此货物！");
							}
						else if(go==2)
						{
							JOptionPane.showMessageDialog(null, "当前货物数量少于要出库的数量！");
						}
			}
			else 
			{
				
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "出库失败！");
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
