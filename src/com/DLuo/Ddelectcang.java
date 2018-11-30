package com.DLuo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.DMModel.Cang;
import com.DMModel.User;
import com.DMUtil.StringUtil;
import com.DMView.*;
import com.Dao.*;

public class Ddelectcang {
	public static DepotDao depotdao = new DepotDao();
	public static void fillTable(Cang cang) {
		DefaultTableModel dtm = (DefaultTableModel) deletecang.table.getModel();
		dtm.setRowCount(0);
		Connection con = null;
		try {
			con = deletecang.dmutil.getCon();
			ResultSet rs = deletecang.depot.roomList(con, cang);
			while (rs.next()) {
				Vector v = new Vector();
				v.add(rs.getString("member"));
				v.add(rs.getString("volume"));
				dtm.addRow(v);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				deletecang.dmutil.closeCon(con);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	

	public static void jb_deleteActionPerformed(java.awt.event.ActionEvent evt) {
		int row = deletecang.table.getSelectedRow();
		if(row==-1)
		{
			JOptionPane.showMessageDialog(null, "��ѡ��Ҫɾ��������");
			return ;
		}
		String member = (String) deletecang.table.getValueAt(row, 0);
		int n = JOptionPane.showConfirmDialog(null, "ȷ��Ҫɾ��������¼ô");
		if (n == 0) {
			Connection con = null;
			try {
				con = deletecang.dmutil.getCon();
				Cang cang =new Cang(member);
				int deleteNum=depotdao.roomDelete(con, cang);
				if (deleteNum == 1) {
					JOptionPane.showMessageDialog(null, "ɾ���ɹ�");
					deletecang.roomNum.setText("");
					Ddelectcang.fillTable(new Cang());
				} else {
					JOptionPane.showMessageDialog(null, "ɾ��ʧ��");
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "ɾ��ʧ��");
				e.printStackTrace();
			} finally {
				try {
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}


	public static void jb_searchActionPerformed(java.awt.event.ActionEvent evt) {
		String member = deletecang.roomNum.getText();
		if(member.equals(""))
		{
			JOptionPane.showMessageDialog(null, "�������ѯ�ʣ�");
			return ;
		}
		Cang cang =new Cang(member);
		Ddelectcang.fillTable(cang);
	}
}
