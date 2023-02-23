package travelManagementSystem;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Payment extends JFrame implements ActionListener{

	JButton b1, b2;
	
	public Payment() {
		setBounds(440, 170, 635, 470);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travelManagementSystem/icons/paytm.jpeg"));
		Image i2 = i1.getImage().getScaledInstance(600, 430, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel l1 = new JLabel(i3);
		l1.setBounds(12, 25, 600, 430);
		add(l1);
		
		b1 = new JButton("Pay");
		b1.setBounds(320, 0, 70, 25);
		b1.addActionListener(this);
		add(b1);
		
		b2 = new JButton("Back");
		b2.setBounds(410, 0, 70, 25);
		b2.addActionListener(this);
		add(b2);
	}
	
	public void actionPerformed(ActionEvent ae){
		
		if (ae.getSource() == b1) {
			this.setVisible(false);
			new Paytm().setVisible(true);
		
		} else if (ae.getSource() == b2) {
			this.setVisible(false);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Payment().setVisible(true);
	}

}
