package com.DLuo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.DMModel.Cang;
import com.DMUtil.StringUtil;
import com.DMView.GoodsDeleteInt;


public class Dgoodsdel {
	
	public static void jb_searchActionPerformed(java.awt.event.ActionEvent evt) {
		String member = GoodsDeleteInt.roomNum.getText();
		Cang cang= new Cang(member);
		fillTable(cang);
	}

	
	public static void fillTable(Cang cang) {
		DefaultTableModel dtm = (DefaultTableModel) GoodsDeleteInt.table.getModel();
		dtm.setRowCount(0);
		Connection con = null;
		try {
			con = GoodsDeleteInt.dmutil.getCon();
			ResultSet rs = GoodsDeleteInt.depotdao.roomList(con, cang);
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
				GoodsDeleteInt.dmutil.closeCon(con);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void jb_deleteActionPerformed(java.awt.event.ActionEvent evt) {
		int row = GoodsDeleteInt.table.getSelectedRow();
		String member = (String) GoodsDeleteInt.table.getValueAt(row, 1);
		if (StringUtil.isEmpty(member)) {
			JOptionPane.showMessageDialog(null, "��ѡ��Ҫɾ���ļ�¼!");
			return;
		}
		int n = JOptionPane.showConfirmDialog(null, "ȷ��Ҫɾ��������¼ô");
		if (n == 0) {
			Connection con = null;
			try {
				con = GoodsDeleteInt.dmutil.getCon();
				Cang room = new Cang(member);
				int deleteNum = GoodsDeleteInt.depotdao.roomDelete(con, room);
				if (deleteNum == 1) {
					JOptionPane.showMessageDialog(null, "ɾ���ɹ�");
					GoodsDeleteInt.roomNum.setText("");
					fillTable(new Cang());
				} else {
					JOptionPane.showMessageDialog(null, "ɾ��ʧ��");
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "ɾ��ʧ��");
				e.printStackTrace();
			} finally {
				try {
					GoodsDeleteInt.dmutil.closeCon(con);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
