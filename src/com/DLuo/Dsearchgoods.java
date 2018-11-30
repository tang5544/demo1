package com.DLuo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import com.DMModel.Cang;
import com.DMView.*;

public class Dsearchgoods {
	public static  void fillTable(Cang cang) {
		DefaultTableModel dtm = (DefaultTableModel) GoodsSearch.table.getModel();
		dtm.setRowCount(0);
		Connection con = null;
		try {
			con = GoodsSearch.dmutil.getCon();
			ResultSet rs = GoodsSearch.depotdao.roomList(con, cang);
			while (rs.next()) {
				Vector v = new Vector();
//				v.add(rs.getString(""));
				v.add(rs.getString("member"));
				v.add(rs.getString("volume"));
				dtm.addRow(v);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				GoodsSearch.dmutil.closeCon(con);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void jb_searchActionPerformed(java.awt.event.ActionEvent evt) {
		String member = GoodsSearch.roomNumTxt.getText();
		Cang cang = new Cang(member);
		fillTable(cang);
	}

}
