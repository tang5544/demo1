package com.DLuo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.DMModel.Googs;
import com.DMView.HuowuSearch;

public class DHuowu {
	public static void fillTable(Googs googs) {
		DefaultTableModel dtm = (DefaultTableModel) HuowuSearch.table.getModel();
		dtm.setRowCount(0);
		Connection con = null;
		try {
			con = HuowuSearch.dmutil.getCon();
			ResultSet rs = HuowuSearch.goosdao.GoogsSearch(con, googs);
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
				HuowuSearch.dmutil.closeCon(con);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void jb_searchActionPerformed(java.awt.event.ActionEvent evt) {
		String serial= HuowuSearch.huohaoTxt.getText();
		String name =HuowuSearch. nameTxt.getText();
		String depot = HuowuSearch.cangNoTxt.getText();
		Googs googs;
		if(serial.equals("")&&name.equals("")&&depot.equals(""))
			JOptionPane.showMessageDialog(null, "«Î ‰»Î≤È—Ø¥ £°");
		else
		{
			googs = new Googs(serial, name,depot);
			fillTable(googs);
		}
	}
}
