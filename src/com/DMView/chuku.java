/*
 * RoomInterFrm.java
 *
 * Created on __DATE__, __TIME__
 */

package com.DMView;




import com.DMUtil.*;
import com.DLuo.*;
import com.Dao.*;



/**
 *
 * @author  __USER__
 */
public class chuku extends javax.swing.JInternalFrame {

	public static DMUtil dmutil = new DMUtil();
	public static GoogsDao googsdao = new GoogsDao();
	
	/** Creates new form RoomInterFrm */
	public chuku() {
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

		jLabel1 = new javax.swing.JLabel();
		dm_huohao = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		dm_canghao = new javax.swing.JTextField();
		jb_add = new javax.swing.JButton();
		jb_reset = new javax.swing.JButton();
		jLabel3 = new javax.swing.JLabel();

		setClosable(true);
		setIconifiable(true);
		setTitle("�������");

		jLabel1.setText("�����ţ�");

		jLabel2.setText("����������");

		jb_add.setIcon(new javax.swing.ImageIcon(
				"D:\\Myelipse\\images4\\add.png")); // NOI18N
		jb_add.setText("����");
		jb_add.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				DChuku.jb_addActionPerformed(evt);
			}
		});

		jb_reset.setIcon(new javax.swing.ImageIcon(
				"D:\\Myelipse\\images4\\reset.png")); // NOI18N
		jb_reset.setText("����");
		jb_reset.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				DChuku.jb_resetActionPerformed(evt);
			}
		});

		jLabel3.setIcon(new javax.swing.ImageIcon(
				"C:\\Documents and Settings\\Administrator\\����\\��������.jpg")); // NOI18N
		//jLabel3.setText("jLabel3");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(22, 22, 22)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jLabel2)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		dm_canghao,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		121,
																		Short.MAX_VALUE))
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jLabel1)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		dm_huohao,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		121,
																		Short.MAX_VALUE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED))
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														layout.createSequentialGroup()
																.addComponent(
																		jb_add)
																.addGap(18, 18,
																		18)
																.addComponent(
																		jb_reset)))
								.addGap(4, 4, 4)
								.addComponent(jLabel3,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										170,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(25, 25, 25)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addGroup(
														layout.createSequentialGroup()
																.addGap(29, 29,
																		29)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						jLabel1)
																				.addComponent(
																						dm_huohao,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addGap(70, 70,
																		70)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						jLabel2)
																				.addComponent(
																						dm_canghao,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																		91,
																		Short.MAX_VALUE)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						jb_reset)
																				.addComponent(
																						jb_add)))
												.addGroup(
														javax.swing.GroupLayout.Alignment.LEADING,
														layout.createSequentialGroup()
																.addGap(27, 27,
																		27)
																.addComponent(
																		jLabel3,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		222,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addContainerGap(40, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents



	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	public static  javax.swing.JTextField dm_canghao;
	public static  javax.swing.JTextField dm_huohao;
	public static  javax.swing.JLabel jLabel1;
	public static  javax.swing.JLabel jLabel2;
	public static  javax.swing.JLabel jLabel3;
	public static  javax.swing.JButton jb_add;
	public static  javax.swing.JButton jb_reset;
	// End of variables declaration//GEN-END:variables

}