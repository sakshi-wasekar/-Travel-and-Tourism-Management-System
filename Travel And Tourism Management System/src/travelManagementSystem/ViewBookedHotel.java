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

public class ViewBookedHotel extends JFrame implements ActionListener{

	JButton b1;
	
	public ViewBookedHotel(String username) {
		// TODO Auto-generated constructor stub
		setBounds(348, 165, 869, 440);
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travelManagementSystem/icons/bookedDetails.jpg"));
		Image i2 = i1.getImage().getScaledInstance(429, 380, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel l9 = new JLabel(i3);
		l9.setBounds(424, 20, 429, 380);
		add(l9);
		
		JLabel l1 = new JLabel("VIEW BOOKED HOTEL DETAILS");
		l1.setBounds(30, 0, 450, 25);
		l1.setFont(new Font("tu izuku", Font.BOLD, 25));
		add(l1);
		
		JLabel l2 = new JLabel("Username:");
		l2.setBounds(20, 50, 130, 25);
		l2.setFont(new Font("Raleway", Font.PLAIN, 17));
		add(l2);
		
		JLabel l21 = new JLabel();
		l21.setBounds(180, 50, 200 , 25);
		l21.setFont(new Font("Raleway", Font.PLAIN, 17));
		add(l21);
		
		JLabel l3 = new JLabel("Hotel Name:");
		l3.setBounds(20, 80, 130, 25);
		l3.setFont(new Font("Raleway", Font.PLAIN, 17));
		add(l3);
		
		JLabel l22 = new JLabel();
		l22.setBounds(180, 80, 200 , 25);
		l22.setFont(new Font("Raleway", Font.PLAIN, 17));
		add(l22);
		
		JLabel l4 = new JLabel("Total Persons:");
		l4.setBounds(20, 110, 130, 25);
		l4.setFont(new Font("Raleway", Font.PLAIN, 17));
		add(l4);
		
		JLabel l23 = new JLabel();
		l23.setBounds(180, 110, 200 , 25);
		l23.setFont(new Font("Raleway", Font.PLAIN, 17));
		add(l23);
//**************************************************
		JLabel l10 = new JLabel("No. of Days:");
		l10.setBounds(20, 140, 130, 25);
		l10.setFont(new Font("Raleway", Font.PLAIN, 17));
		add(l10);
		
		JLabel l28 = new JLabel();
		l28.setBounds(180, 140, 200 , 25);
		l28.setFont(new Font("Raleway", Font.PLAIN, 17));
		add(l28);
		
		JLabel l11 = new JLabel("AC / Non-AC:");
		l11.setBounds(20, 170, 130, 25);
		l11.setFont(new Font("Raleway", Font.PLAIN, 17));
		add(l11);
		
		JLabel l29 = new JLabel();
		l29.setBounds(180, 170, 200 , 25);
		l29.setFont(new Font("Raleway", Font.PLAIN, 17));
		add(l29);
		
		JLabel l12 = new JLabel("Food Included:");
		l12.setBounds(20, 200, 130, 25);
		l12.setFont(new Font("Raleway", Font.PLAIN, 17));
		add(l12);
		
		JLabel l30 = new JLabel();
		l30.setBounds(180, 200,200 , 25);
		l30.setFont(new Font("Raleway", Font.PLAIN, 17));
		add(l30);
		///************************************************
		JLabel l5 = new JLabel("ID Proof:");
		l5.setBounds(20, 230, 130, 25);
		l5.setFont(new Font("Raleway", Font.PLAIN, 17));
		add(l5);
		
		JLabel l24 = new JLabel();
		l24.setBounds(180, 230, 200 , 25);
		l24.setFont(new Font("Raleway", Font.PLAIN, 17));
		add(l24);
		
		JLabel l6 = new JLabel("Number:");
		l6.setBounds(20, 260, 130, 25);
		l6.setFont(new Font("Raleway", Font.PLAIN, 17));
		add(l6);
		
		JLabel l25 = new JLabel();
		l25.setBounds(180, 260, 200 , 25);
		l25.setFont(new Font("Raleway", Font.PLAIN, 17));
		add(l25);
		
		JLabel l7 = new JLabel("Phone:");
		l7.setBounds(20, 290, 130, 25);
		l7.setFont(new Font("Raleway", Font.PLAIN, 17));
		add(l7);
		
		JLabel l26 = new JLabel();
		l26.setBounds(180, 290, 200 , 25);
		l26.setFont(new Font("Raleway", Font.PLAIN, 17));
		add(l26);
		
		JLabel l8 = new JLabel("Total Price:");
		l8.setBounds(20, 320, 130, 25);
		l8.setFont(new Font("Raleway", Font.PLAIN, 17));
		add(l8);
		
		JLabel l27 = new JLabel();
		l27.setBounds(180, 320, 200 , 25);
		l27.setFont(new Font("Raleway", Font.PLAIN, 17));
		add(l27);
		//********************************************
		
		
		b1 = new JButton("Back");
		b1.setBounds(150, 365, 100, 25);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.addActionListener(this);
		add(b1);
		
		try {
			Conn c = new Conn();
			ResultSet rs = c.s.executeQuery("select * from BookHotel where username ='"+username+"'");
			while (rs.next()) {
							//**********  ---->we can also pass name of the column which is in database (or) order no. of column***
									  // |
				l21.setText(rs.getString("username"));	
				l22.setText(rs.getString("hotel"));
				l23.setText(rs.getString("persons"));
				l28.setText(rs.getString("days"));
				l29.setText(rs.getString("ac"));
				l30.setText(rs.getString("food"));
				l24.setText(rs.getString("ID"));
				l25.setText(rs.getString("number"));
				l26.setText(rs.getString("phone"));
				l27.setText(rs.getString("cost"));
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
		new ViewBookedHotel("").setVisible(true);
	}

}
