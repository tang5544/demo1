/*
 * RoomSearchInterFrm.java
 *
 * Created on __DATE__, __TIME__
 */

package com.DMView;
import java.sql.Connection;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.DMModel.*;
import com.DMUtil.*;
import com.DLuo.*;
import com.Dao.*;
import com.DMView.*;
import com.DLuo.DPassword;

/**
 *
 * @author  __USER__
 */
public class GPassword extends javax.swing.JInternalFrame {
	public static DMUtil dmutil = new DMUtil();
	public static PasswordDao passworddao = new PasswordDao();


	/** Creates new form RoomSearchInterFrm */
	public GPassword() {
		initComponents();
		this.setLocation(200, 50);
	}



	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();  //��ǩ
		roomNumTxt = new javax.swing.JPasswordField(); //�ı���
		jLabel2 = new javax.swing.JLabel();   //��ǩ
		afterNumTxt = new javax.swing.JPasswordField();   //�ı���
		jb_yes = new javax.swing.JButton();  //��Ŧ
		new javax.swing.JTable();

		setClosable(true);
		setIconifiable(true);
		setTitle("�����޸�");

		jLabel1.setText("ԭ���룺");
		jLabel2.setText("�޸ĺ����룺");

		jb_yes.setText("ȷ��");
		jb_yes.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					DPassword.jb_searchActionPerformed(evt);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});


		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addGap(46, 46,
																		46)
																.addComponent(
																		jLabel1)
																.addGap(28, 28,
																		28)
																.addComponent(
																		roomNumTxt,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		132,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(18, 18,
																		18)
																.addComponent(
																		jLabel2)
																.addGap(28, 28,
																		28)
																.addComponent(
																		afterNumTxt,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		132,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(18, 18,
																		18)
																.addComponent(
																		jb_yes)))
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(23, 23, 23)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jb_yes)
												.addComponent(
														roomNumTxt,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel1)
												.addComponent(
														afterNumTxt,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel2))
								.addGap(18, 18, 18)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents


		
		
		


	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	public static javax.swing.JLabel jLabel1;
	public static javax.swing.JLabel jLabel2;
	public static javax.swing.JButton jb_yes;
	public static javax.swing.JPasswordField roomNumTxt;
	public static javax.swing.JPasswordField afterNumTxt;
	//public static javax.swing.JPasswordField userPasswordTxt

}