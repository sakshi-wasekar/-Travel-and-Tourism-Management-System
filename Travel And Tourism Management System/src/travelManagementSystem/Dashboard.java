package travelManagementSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Dashboard extends JFrame implements ActionListener{

	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13, b14,b15;
		String username;
	
	Dashboard(String username){
		this.username = username;
		
		setExtendedState(MAXIMIZED_BOTH);
		setLayout(null);
		
		JPanel p1 = new JPanel();
		p1.setLayout(null);
		p1.setBounds(0, 0, 1366, 45);
		p1.setBackground(new Color(0, 0, 102));
		add(p1);
		
		JLabel l2 = new JLabel("Dashboard");
		l2.setBounds(60, 10, 150, 30);
		l2.setFont(new Font("Tahoma",Font.BOLD, 20));
		l2.setForeground(Color.WHITE);
		p1.add(l2);
		
		JPanel p2 = new JPanel();
		p2.setBounds(0, 45, 200, 768);
		p2.setLayout(null);
		p2.setBackground(new Color(0,0,102));
		add(p2);
		
		b1 = new JButton("Add Personal Details");
		b1.setBounds(0, 0, 200, 35);
		b1.setBackground(new Color(0,0,102));
		b1.setForeground(Color.WHITE);
		b1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		b1.setMargin(new Insets(0, 0, 0, 30));	// we want to move towards left from right margin 
		b1.addActionListener(this);
		p2.add(b1);
		
		b2 = new JButton("Update Personal Details");
		b2.setBounds(0, 30, 200, 35);
		b2.setBackground(new Color(0,0,102));
		b2.setForeground(Color.WHITE);
		b2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		b2.setMargin(new Insets(0, 0, 0, 5));
		b2.addActionListener(this);
		p2.add(b2);
		
		b3 = new JButton("View Details");
		b3.setBounds(0, 60, 200, 35);
		b3.setBackground(new Color(0,0,102));
		b3.setForeground(Color.WHITE);
		b3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		b3.setMargin(new Insets(0, 0, 0, 80));
		b3.addActionListener(this);
		p2.add(b3);
		
		b4 = new JButton("Delete Personal Details");
		b4.setBounds(0, 90, 200, 35);
		b4.setBackground(new Color(0,0,102));
		b4.setForeground(Color.WHITE);
		b4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		b4.setMargin(new Insets(0, 0, 0, 10));
		b4.addActionListener(this);
		p2.add(b4);
		
		b5 = new JButton("Check Package");
		b5.setBounds(0, 120, 200, 35);
		b5.setBackground(new Color(0,0,102));
		b5.setForeground(Color.WHITE);
		b5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		b5.setMargin(new Insets(0, 0, 0, 60));
		b5.addActionListener(this);
		p2.add(b5);
		
		b6 = new JButton("Book Package");
		b6.setBounds(0, 150, 200, 35);
		b6.setBackground(new Color(0,0,102));
		b6.setForeground(Color.WHITE);
		b6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		b6.setMargin(new Insets(0, 0, 0, 63));
		b6.addActionListener(this);
		p2.add(b6);
		
		b7 = new JButton("View Package");
		b7.setBounds(0, 180, 200, 35);
		b7.setBackground(new Color(0,0,102));
		b7.setForeground(Color.WHITE);
		b7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		b7.setMargin(new Insets(0, 0, 0, 65));
		b7.addActionListener(this);
		p2.add(b7);
		
		b8 = new JButton("View HOTELS");
		b8.setBounds(0, 210, 200, 35);
		b8.setBackground(new Color(0,0,102));
		b8.setForeground(Color.WHITE);
		b8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		b8.setMargin(new Insets(0, 0, 0, 63));
		b8.addActionListener(this);
		p2.add(b8);
		
		b9 = new JButton("Book Hotel");
		b9.setBounds(0, 240, 200, 35);
		b9.setBackground(new Color(0,0,102));
		b9.setForeground(Color.WHITE);
		b9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		b9.setMargin(new Insets(0, 0, 0, 81));
		b9.addActionListener(this);
		p2.add(b9);
		
		b10 = new JButton("View Booked Hotel");
		b10.setBounds(0, 270, 200, 35);
		b10.setBackground(new Color(0,0,102));
		b10.setForeground(Color.WHITE);
		b10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		b10.setMargin(new Insets(0, 0, 0, 32));
		b10.addActionListener(this);
		p2.add(b10);
		
		b11 = new JButton("Destinations");
		b11.setBounds(0, 300, 200, 35);
		b11.setBackground(new Color(0,0,102));
		b11.setForeground(Color.WHITE);
		b11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		b11.setMargin(new Insets(0, 0, 0, 74));
		b11.addActionListener(this);
		p2.add(b11);
		
		b12 = new JButton("Payment");
		b12.setBounds(0, 330, 200, 35);
		b12.setBackground(new Color(0,0,102));
		b12.setForeground(Color.WHITE);
		b12.setFont(new Font("Tahoma", Font.PLAIN, 15));
		b12.setMargin(new Insets(0, 0, 0, 94));
		b12.addActionListener(this);
		p2.add(b12);
		
		b13 = new JButton("Calculator");
		b13.setBounds(0, 360, 200, 35);
		b13.setBackground(new Color(0,0,102));
		b13.setForeground(Color.WHITE);
		b13.setFont(new Font("Tahoma", Font.PLAIN, 15));
		b13.setMargin(new Insets(0, 0, 0, 90));
		b13.addActionListener(this); 	//we tells swing that I want some action on this button click
		p2.add(b13);
		
		b14 = new JButton("Notepad");
		b14.setBounds(0, 390, 200, 35);
		b14.setBackground(new Color(0,0,102));
		b14.setForeground(Color.WHITE);
		b14.setFont(new Font("Tahoma", Font.PLAIN, 15));
		b14.setMargin(new Insets(0, 0, 0, 96));
		b14.addActionListener(this); 
		p2.add(b14);
		
		b15 = new JButton("About");
		b15.setBounds(0, 420, 200, 35);
		b15.setBackground(new Color(0,0,102));
		b15.setForeground(Color.WHITE);
		b15.setFont(new Font("Tahoma", Font.PLAIN, 15));
		b15.setMargin(new Insets(0, 0, 0, 111));
		b15.addActionListener(this);
		p2.add(b15);
	
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travelManagementSystem/icons/home.jpg"));
		Image i2 = i1.getImage().getScaledInstance(1366, 768, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel l1 = new JLabel(i3);
		l1.setBounds(0, 0, 1366, 768);
		add(l1);
		
		JLabel l3 =  new JLabel("Travel And Tourism Management System");
		l3.setBounds(350, 90, 900, 50);
		l3.setFont(new Font("SAN_SERIF", Font.LAYOUT_NO_START_CONTEXT, 45));
		l3.setForeground(Color.BLUE);
		l1.add(l3);
	}
	
	public void actionPerformed(ActionEvent ae){
			if (ae.getSource() == b13) {
				try{
					Runtime.getRuntime().exec("Calc.exe");
				}catch(Exception e){}
			
			}else if(ae.getSource() == b14){
		    	try{
		    		Runtime.getRuntime().exec("Notepad.exe");
		    	}catch(Exception e){}
		    	
			}else if(ae.getSource() == b1){
				new AddCustomer(username).setVisible(true);
			
			}else if(ae.getSource() == b2){
				new UpdateCustomer(username).setVisible(true);
			
			}else if(ae.getSource() == b3){
				new ViewCustomer(username).setVisible(true);
			
			}else if(ae.getSource() == b5){
				new CheckPackage().setVisible(true);
			
			}else if(ae.getSource() == b6){
				new BookPackage(username).setVisible(true);
			
			}else if(ae.getSource() == b7){
				new ViewPackage(username).setVisible(true);
			
			}else if(ae.getSource() == b8){
				new ViewHotels().setVisible(true);
			
			}else if(ae.getSource() == b11){
				new Destination().setVisible(true);
			
			}else if(ae.getSource() == b9){
				new BookHotel(username).setVisible(true);
			
			}else if(ae.getSource() == b10){
				new ViewBookedHotel(username).setVisible(true);
			
			}else if(ae.getSource() == b12){
				new Payment().setVisible(true);
			
			}else if(ae.getSource() == b15){
				new About().setVisible(true);
			
			}else if(ae.getSource() == b4){
				new DeleteCustomer(username).setVisible(true);
			
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Dashboard("").setVisible(true);
	}

}
