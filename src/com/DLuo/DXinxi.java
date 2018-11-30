package com.DLuo;

import java.sql.Connection;

import javax.swing.JOptionPane;

import com.DMModel.Password;
import com.DMModel.User;
import com.DMView.LoginFrm;
import com.DMView.Xinxi;
import com.DMModel.*;

public class DXinxi {
public static void jb_registActionPerformed(java.awt.event.ActionEvent evt) throws Exception{
	String name =Xinxi.nameTxt.getText();
	String phone=Xinxi.phoneTxt.getText();
	String position=Xinxi.positionTxt.getText();
	String remark=Xinxi.remarkTxt.getText();
	String username = LoginFrm.userNameTxt.getText();
	User user1 = (User) LoginFrm.jcb_choose.getSelectedItem();
	String userright = user1.getUserName();
	String userPassword = new String(LoginFrm.userPasswordTxt.getPassword());
    Xxinxi xinxi =new Xxinxi(name,phone,position,remark,username,userPassword,userright);
    com.DMView.Xinxi.name2=name;
    com.DMView.Xinxi.phone2=phone;
    com.DMView.Xinxi.position2=position;
    com.DMView.Xinxi.remark2=remark;
    if(name.equals("")) {
    	JOptionPane.showMessageDialog(null, "请输入姓名！");
    	return;
    }
    if(phone.equals("")) {
    	JOptionPane.showMessageDialog(null, "请输入电话号！");
    	return;
    }
    if(position.equals("")) {
    	JOptionPane.showMessageDialog(null, "请输入职位！");
    	return;
    }
    if(remark.equals("")) {
    	JOptionPane.showMessageDialog(null, "请输入备注！");
    	return;
    }
    
    Connection conn=null;
	int a = JOptionPane.showConfirmDialog(null, "确定修改？");
		try {
			conn = Xinxi.dmutil.getCon();
	    	Xxinxi xin = Xinxi.xinxidao.updatedata(conn, xinxi);
			if (a == 0) {
				JOptionPane.showMessageDialog(null, "修改成功！");
				resetValue();
			} else {
				JOptionPane.showMessageDialog(null, "修改失败！");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "修改失败！");
			e.printStackTrace();
		}
	}

	private static void resetValue() {
		Xinxi.nameTxt.setText("");
		Xinxi.phoneTxt.setText("");
		Xinxi.positionTxt.setText("");
		Xinxi.remarkTxt.setText("");


	}



}
