package travelManagementSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ViewPackage extends JFrame implements ActionListener{

	JButton b1;
	
	public ViewPackage(String username) {
		// TODO Auto-generated constructor stub
		setBounds(348, 168, 850, 439);
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travelManagementSystem/icons/bookedDetails.jpg"));
		Image i2 = i1.getImage().getScaledInstance(419, 380, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel l9 = new JLabel(i3);
		l9.setBounds(415, 20, 419, 380);
		add(l9);
		
		JLabel l1 = new JLabel("VIEW PACKAGE DETAILS");
		l1.setBounds(50, 5, 450, 25);
		l1.setFont(new Font("tu izuku", Font.BOLD, 25));
		add(l1);
		
		JLabel l2 = new JLabel("Username:");
		l2.setBounds(20, 55, 130, 25);
		l2.setFont(new Font("Raleway", Font.PLAIN, 20));
		add(l2);
		
		JLabel l11 = new JLabel();
		l11.setBounds(180, 55, 200 , 25);
		l11.setFont(new Font("Raleway", Font.PLAIN, 20));
		add(l11);
		
		JLabel l3 = new JLabel("Package:");
		l3.setBounds(20, 95, 130, 25);
		l3.setFont(new Font("Raleway", Font.PLAIN, 20));
		add(l3);
		
		JLabel l12 = new JLabel();
		l12.setBounds(180, 95, 200 , 25);
		l12.setFont(new Font("Raleway", Font.PLAIN, 20));
		add(l12);
		
		JLabel l4 = new JLabel("Total Persons:");
		l4.setBounds(20, 135, 130, 25);
		l4.setFont(new Font("Raleway", Font.PLAIN, 20));
		add(l4);
		
		JLabel l13 = new JLabel();
		l13.setBounds(180, 135, 200 , 25);
		l13.setFont(new Font("Raleway", Font.PLAIN, 20));
		add(l13);

		JLabel l5 = new JLabel("ID Proof:");
		l5.setBounds(20, 175, 130, 25);
		l5.setFont(new Font("Raleway", Font.PLAIN, 20));
		add(l5);
		
		JLabel l14 = new JLabel();
		l14.setBounds(180, 175, 200 , 25);
		l14.setFont(new Font("Raleway", Font.PLAIN, 20));
		add(l14);
		
		JLabel l6 = new JLabel("Number:");
		l6.setBounds(20, 215, 130, 25);
		l6.setFont(new Font("Raleway", Font.PLAIN, 20));
		add(l6);
		
		JLabel l15 = new JLabel();
		l15.setBounds(180, 215, 200 , 25);
		l15.setFont(new Font("Raleway", Font.PLAIN, 20));
		add(l15);
		
		JLabel l7 = new JLabel("Phone:");
		l7.setBounds(20, 255, 130, 25);
		l7.setFont(new Font("Raleway", Font.PLAIN, 20));
		add(l7);
		
		JLabel l16 = new JLabel();
		l16.setBounds(180, 255, 200 , 25);
		l16.setFont(new Font("Raleway", Font.PLAIN, 20));
		add(l16);
		
		JLabel l8 = new JLabel("Price:");
		l8.setBounds(20, 295, 130, 25);
		l8.setFont(new Font("Raleway", Font.PLAIN, 20));
		add(l8);
		
		JLabel l17 = new JLabel();
		l17.setBounds(180, 295, 200 , 25);
		l17.setFont(new Font("Raleway", Font.PLAIN, 20));
		add(l17);
		
		b1 = new JButton("Back");
		b1.setBounds(150, 350, 100, 25);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.addActionListener(this);
		add(b1);
		
		try {
			Conn c = new Conn();
			ResultSet rs = c.s.executeQuery("select * from BookPackage where username ='"+username+"'");
			while (rs.next()) {
							//**********  ---->we can also pass name of the column which is in database (or) order no. of column***
									  // |
				l11.setText(rs.getString(1));	
				l12.setText(rs.getString(2));
				l13.setText(rs.getString(3));
				l14.setText(rs.getString(4));
				l15.setText(rs.getString(5));
				l16.setText(rs.getString(6));
				l17.setText(rs.getString(7));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void actionPerformed(ActionEvent ae){
			this.setVisible(false);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ViewPackage("").setVisible(true);
	}

}
