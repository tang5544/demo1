package com.DLuo;

import com.DMView.*;

public class DGuanliyuan {

	public static  void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {
		deletecang cang = new deletecang();
		cang.setVisible(true);
		Guanliyuan.table.add(cang);
	}

	public static void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
		newcang cang = new newcang();
		cang.setVisible(true);
		Guanliyuan.table.add(cang);
	}
	
	public static void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {
		GoodsSearch roomSearch = new GoodsSearch();
		roomSearch.setVisible(true);
		Guanliyuan.table.add(roomSearch);
	}
	
	public static void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {
		Xinxi xi = new Xinxi();
		xi.setVisible(true);
		Guanliyuan.table.add(xi);
	}

	public static void enterActionPerformed(java.awt.event.ActionEvent evt) {
		Gaihuo xi = new Gaihuo();
		com.DMView.Gaihuo.f=0;
		xi.setVisible(true);
		Guanliyuan.table.add(xi);
	}



	public static void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {
		ruku ru= new ruku();
		ru.setVisible(true);
		Guanliyuan.table.add(ru);
	}

	public static void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {
		GPassword mima = new GPassword();
		mima.setVisible(true);
		Guanliyuan.table.add(mima);
	}

	public static void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
		 chuku room = new chuku();
	 		room.setVisible(true);
	 		Guanliyuan.table.add(room);
	}

	public static void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {
		HuowuSearch Search = new HuowuSearch();
		Search.setVisible(true);
		Guanliyuan.table.add(Search);
	}
	
	public static void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {
		NewZhanghao nz =  new NewZhanghao();
		nz.setVisible(true);
		Guanliyuan.table.add(nz);
	}
	
	public static void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {
		DeleteZhanghao dz =  new DeleteZhanghao();
		dz.setVisible(true);
		Guanliyuan.table.add(dz);
	}
     
}
