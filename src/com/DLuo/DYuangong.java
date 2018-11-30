package com.DLuo;

import com.DMView.GPassword;
import com.DMView.HuowuSearch;
import com.DMView.Xinxi;
import com.DMView.*;

public class DYuangong {
	public static void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {
		Xinxi xi = new Xinxi();
		xi.setVisible(true);
		Yuangong.table.add(xi);
	}

	public static void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
		GPassword mima = new GPassword();
		mima.setVisible(true);
		Yuangong.table.add(mima);
	}

	public static void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {
		HuowuSearch StudentSearch = new HuowuSearch();
		StudentSearch.setVisible(true);
		Yuangong.table.add(StudentSearch);
	}

}
