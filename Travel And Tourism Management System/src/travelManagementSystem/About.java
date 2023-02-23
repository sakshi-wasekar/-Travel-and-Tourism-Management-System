package travelManagementSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class About extends JFrame implements ActionListener{

	JButton  b1;
	
	public About() {
		// TODO Auto-generated constructor stub
		setBounds(500, 180, 550, 450);
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		JLabel l1 = new JLabel("Travel and Tourism Management System");
		l1.setBounds(12, 5, 550, 34);
		l1.setFont(new Font("Raleway", Font.PLAIN, 28));
		l1.setForeground(Color.RED);
		add(l1);
		
		String s ="About Project \n \n The objective of the Travel and Tourism Management"+
					"\n System project is to develop a system that automates"+
					"\nthe processes and activities of a travel and tourism"+
					"agency. \n \n The purpose is to design a system using which"+
					"one can perform all operations related to traveling and"+
					"sight-seeing. The system allows one to easily access"+
					"the relevant information and make necessary travel"+
					"arrangements. \n  \n Users can decide about places they"+
					"want to visit and make bookings online for travel and"+
					"accommodation.";
					
		
		TextArea t1= new TextArea(s,10,40,Scrollbar.VERTICAL);
		t1.setEditable(false);
		t1.setBounds(30, 60, 480,300);
		t1.setFont(new Font("SAN-SERIF", Font.PLAIN, 18));
		add(t1);
		
		b1 = new JButton("Back");
		b1.setBounds(220, 378, 90, 25);
		b1.addActionListener(this);
		add(b1);
	}
	
	public void actionPerformed(ActionEvent ae){
		this.setVisible(false);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new About().setVisible(true);
	}

}
