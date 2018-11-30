package com.DLuo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.DMModel.Googs;
import com.DMView.Gaihuo;

public class Dgaihuo {
	public static void jb_searchActionPerformed(java.awt.event.ActionEvent evt) {
		String huohao = Gaihuo.huohao.getText();
		String huoming1 = Gaihuo.huoming1.getText();
		String canghao1 = Gaihuo.canghao1.getText();
		if(huohao.equals("")&&huoming1.equals("")&&canghao1.equals(""))
		{
			JOptionPane.showMessageDialog(null, "�������ѯ��!");
			return ;
		}
		Googs googs;
		googs = new Googs(huohao, huoming1, canghao1);
		fillTable(googs);
		resetValue();
		com.DMView.Gaihuo.f=0;
	}

	
	public static void fillTable(Googs googs) {
		DefaultTableModel dtm = (DefaultTableModel) Gaihuo.table.getModel();
		dtm.setRowCount(0);
		Connection con = null;
		try {
			con = Gaihuo.dmutil.getCon();
			ResultSet rs = Gaihuo.googsdao.GoogsSearch(con, googs);
			while (rs.next()) {
				Vector v = new Vector();
				v.add(rs.getString("serial"));
				v.add(rs.getString("name"));
				v.add(rs.getString("depot"));
				v.add(rs.getString("Shelfid"));
				v.add(rs.getString("amount"));
				v.add(rs.getString("unit_price"));
				dtm.addRow(v);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				Gaihuo.dmutil.closeCon(con);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

	
	public static void jb_modifyActionPerformed(java.awt.event.ActionEvent evt) {
		if(com.DMView.Gaihuo.f==0)
		{
			JOptionPane.showConfirmDialog(null, "����ѡ��Ҫ�޸ĵĻ�����Ϣ���߲�ѯ���޸ģ�");
			return ;
		}
		String huoming = Gaihuo.huoming.getText();
		String canghao = Gaihuo.canghao.getText();
		String huojiahao =Gaihuo.huojia.getText();
		String huohao1 = Gaihuo.huohao1.getText();
		String shuliang = Gaihuo.shuliang.getText();
		String danjia = Gaihuo.danjia.getText();
		if(huoming.equals(""))
		{
			JOptionPane.showConfirmDialog(null, "�������ֲ���Ϊ�գ�");
			return ;
		}
		if(canghao.equals(""))
		{
			JOptionPane.showConfirmDialog(null, "�ֺŲ���Ϊ�գ�");
			return ;
		}
		if(huojiahao.equals(""))
		{
			JOptionPane.showConfirmDialog(null, "���ܺŲ���Ϊ�գ�");
			return ;
		}
		if(huohao1.equals(""))
		{
			JOptionPane.showConfirmDialog(null, "���Ų���Ϊ�գ�");
			return ;
		}
		if(shuliang.equals(""))
		{
			JOptionPane.showConfirmDialog(null, "��������Ϊ�գ�");
			return ;
		}
		if(danjia.equals(""))
		{
			JOptionPane.showConfirmDialog(null, "���۲���Ϊ�գ�");
			return ;
		}
		Googs googs = new Googs(Integer.parseInt(huohao1),Integer.parseInt(canghao),huoming,huojiahao,Integer.parseInt(shuliang),Float.parseFloat(danjia));
	    Connection conn=null;
		int a = JOptionPane.showConfirmDialog(null, "ȷ���޸ģ�");
		try {
			conn = Gaihuo.dmutil.getCon();
			int go = Gaihuo.googsdao.GoogsModify(conn, googs);
			if (a == 0 ) {
				JOptionPane.showMessageDialog(null, "�޸ĳɹ���");
				resetValue();
				com.DMView.Gaihuo.f=0;
				return;
			} else {
				return;
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "�޸�ʧ��!");
			e.printStackTrace();
		}
	}

	public static void resetValue() {
		Gaihuo.huoming.setText("");
		Gaihuo.canghao.setText("");
		Gaihuo.huohao1.setText("");
		Gaihuo.huojia.setText("");
		Gaihuo.shuliang.setText("");
		Gaihuo.danjia.setText("");
	}
	
	public static void tableMousePressed(java.awt.event.MouseEvent evt) {
		int row = Gaihuo.table.getSelectedRow();
		Gaihuo.huohao1.setText(Gaihuo.table.getValueAt(row, 0) + "");
		Gaihuo.huoming.setText(Gaihuo.table.getValueAt(row, 1) + "");
		Gaihuo.canghao.setText(Gaihuo.table.getValueAt(row, 2) + "");
		Gaihuo.huojia.setText(Gaihuo.table.getValueAt(row, 3) + "");
		Gaihuo.shuliang.setText(Gaihuo.table.getValueAt(row, 4) + "");
		Gaihuo.danjia.setText(Gaihuo.table.getValueAt(row, 5) + "");
	}
}
