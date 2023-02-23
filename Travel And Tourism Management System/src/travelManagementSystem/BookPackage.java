package travelManagementSystem;

import java.awt.Choice;
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
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class BookPackage extends JFrame implements ActionListener{

	Choice c1;
	JLabel l11, l12, l13, l14, l15;
	JButton b1, b2, b3;
	JTextField t1;
	
	public BookPackage(String username) {
		setBounds(390, 170, 815, 417);
		setLayout(null);
		getContentPane().setBackground(Color.GRAY);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travelManagementSystem/icons/bookpackage.jpg"));
		Image i2= i1.getImage().getScaledInstance(370, 250, Image.SCALE_DEFAULT);
		ImageIcon i3= new ImageIcon(i2);
		JLabel l9 = new JLabel(i3);
		l9.setBounds(420, 40, 370, 250);
		add(l9);
		
		JLabel l1 = new JLabel("BOOK PACKAGE");
		l1.setBounds(85, 15, 250, 25);
		l1.setFont(new Font("Tu izuku", Font.BOLD, 25));
		add(l1);
		
		JLabel l2 = new JLabel("Username");
		l2.setBounds(20, 65, 140 ,20);
		l2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		add(l2);
		
		l11 = new JLabel();
		l11.setBounds(185, 65, 200, 20);
		l11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		add(l11);
		
		JLabel l3 = new JLabel("Select Package");
		l3.setBounds(20, 100, 140, 20);
		l3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		add(l3);
		
		c1 = new Choice();
		c1.add("GOLD Package");
		c1.add("SILVER Package");
		c1.add("BRONZE Package");
		c1.setBounds(185, 100, 200, 20);
		c1.setBackground(Color.LIGHT_GRAY);
		add(c1);
		
		JLabel l4 = new JLabel("Total Persons");
		l4.setBounds(20, 140, 140 ,20);
		l4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		add(l4);
		
		t1 = new JTextField("1");
		t1.setBounds(185, 140, 200, 20);
		//t1.setBackground(Color.LIGHT_GRAY);
		add(t1);
		
		JLabel l5 = new JLabel("ID Proof:");
		l5.setBounds(20, 180, 140 ,20);
		l5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		add(l5);
		
		l12 = new JLabel();
		l12.setBounds(185, 180, 200, 20);
		l12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		add(l12);
		
		JLabel l6 = new JLabel("Number");
		l6.setBounds(20, 220, 140 ,20);
		l6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		add(l6);
		
		l13 = new JLabel();
		l13.setBounds(185, 220, 200, 20);
		l13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		add(l13);
		
		JLabel l7 = new JLabel("Phone");
		l7.setBounds(20, 260, 140 ,20);
		l7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		add(l7);
		
		l14 = new JLabel();
		l14.setBounds(185, 260, 200, 20);
		l14.setFont(new Font("Tahoma", Font.PLAIN, 20));
		add(l14);
		
		JLabel l8 = new JLabel("Total Price");
		l8.setBounds(20, 295, 140 ,20);
		l8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		add(l8);
		
		l15 = new JLabel();
		l15.setBounds(185, 295, 200, 20);
		l15.setFont(new Font("Tahoma", Font.PLAIN, 20));
		l15.setForeground(Color.BLUE);
		add(l15);
		
									///////////////BUTTONS//////////
		b1= new JButton("Check Package");
		b1.setBounds(35, 340, 125, 25);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE); 
		b1.addActionListener(this);
		add(b1);
		
		b2= new JButton("Book Package");
		b2.setBounds(170, 340, 125, 25);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE); 
		b2.addActionListener(this);
		add(b2);
		
		b3= new JButton("Back");
		b3.setBounds(305, 340, 90, 25);
		b3.setBackground(Color.BLACK);
		b3.setForeground(Color.WHITE); 
		b3.addActionListener(this);
		add(b3);
		
		try {
			Conn c = new Conn();
			ResultSet rs = c.s.executeQuery("select * from Customer where username = '"+username+"'");
			while (rs.next()) {
				l11.setText(rs.getString("username"));
				l12.setText(rs.getString("ID"));
				l13.setText(rs.getString("number"));
				l14.setText(rs.getString("phone"));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public void actionPerformed(ActionEvent ae){
		int cost=0;
		
		if (ae.getSource() == b1) {
			
			String pack = c1.getSelectedItem();
			
			if (pack.equals("GOLD Package"))
			{
				cost =12000;
			} else if (pack.equals("SILVER Package"))
			{
				cost =24000;
			}else if (pack.equals("BRONZE Package"))
			{
				cost =32000;
			}
			int person = Integer.parseInt(t1.getText());	 // we will get total persons
			cost *=person;
			l15.setText("Rs. " +cost);
			
		} else if (ae.getSource() == b2 && cost!=0) {
			try {
				Conn c=  new Conn();
				String sql = "insert into BookPackage values('"+l11.getText()+"', '"+c1.getSelectedItem()+"', '"+t1.getText()+"', '"+l12.getText()+"', '"+l13.getText()+"', '"+l14.getText()+"', '"+l15.getText()+"')";
				c.s.execute(sql);
				JOptionPane.showMessageDialog(null, "Package Booked Successfully");
				this.setVisible(false);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}else if (ae.getSource() == b3) {
			this.setVisible(false);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BookPackage("").setVisible(true);
	}

}
