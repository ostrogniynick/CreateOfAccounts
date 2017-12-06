package org.itstep.view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import net.miginfocom.swing.MigLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import org.itstep.service.CreateOfAccounts;

import javax.swing.JButton;

public class AccountInputWindows extends JFrame {
	private JTextField tfNumderAccound;
	
	public AccountInputWindows(String titel) {
		 this.setTitle("CreatorOfAccount");
		  this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		  this.setLocation(200, 200);
		  this.setSize(609, 220);
		  this.setVisible(true);
		  this.setResizable(false);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u041A\u043E\u043B\u0438\u0447\u0435\u0441\u0442\u0432\u043E \u0441\u043E\u0437\u0434\u0430\u0432\u0430\u0435\u043C\u044B\u0445 \u0430\u043A\u043A\u0430\u0443\u043D\u0442\u043E\u0432");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(12, 31, 263, 59);
		getContentPane().add(lblNewLabel);
		
		tfNumderAccound = new JTextField();
		tfNumderAccound.setBounds(344, 50, 242, 22);
		getContentPane().add(tfNumderAccound);
		tfNumderAccound.setColumns(10);
		
		JButton btnCreateAccount = new JButton("\u0421\u043E\u0437\u0434\u0430\u0442\u044C \u0430\u043A\u043A\u0430\u0443\u0442\u043D");
		btnCreateAccount.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCreateAccount.setBounds(178, 113, 242, 59);
		btnCreateAccount.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			CreateOfAccounts creator = new CreateOfAccounts();
			creator.saveAccount(tfNumderAccound.getText());
			tfNumderAccound.setText("");
		    getContentPane().repaint();
		   }
		});
		  getContentPane().add(btnCreateAccount);
		  
		  JLabel lfinish = new JLabel("");
		  lfinish.setBounds(22, 113, 144, 37);
		  getContentPane().add(lfinish);
		  
		  getContentPane().repaint();

		
	}
}
