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

public class BookHotel extends JFrame  implements ActionListener{

	JTextField t1, t2;
	Choice c1, c2, c3;
	JButton b1, b2, b3;
	JLabel l11, l12, l13, l14,l15;
	
	public BookHotel(String username) {
		setBounds(300, 161, 840, 540);
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setLayout(null);

		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travelManagementSystem/icons/book.jpg"));
		Image i2 = i1.getImage().getScaledInstance(400, 300, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel label = new JLabel(i3);
		label.setBounds(430, 100, 400, 300);
		add(label);
		
		JLabel heading  = new JLabel("BOOK HOTEL");
		heading.setBounds(100, 0, 250,30);
		heading.setFont(new Font("SAN-SERIF", Font.BOLD, 30));
		heading.setForeground(Color.DARK_GRAY);
		add(heading);
		
		JLabel l1 = new JLabel("Username:");
		l1.setBounds(15, 60, 100, 25);
		l1.setFont(new Font("Raleway", Font.PLAIN, 20));
		add(l1);
		
		l11 = new JLabel();
		l11.setBounds(215, 60, 200, 25);
		l11.setFont(new Font("Raleway", Font.PLAIN, 17));
		add(l11);
		
		JLabel l2 = new JLabel("Select Hotel:");
		l2.setBounds(15, 100, 180, 25);
		l2.setFont(new Font("Raleway", Font.PLAIN, 20));
		add(l2);
		
		c1 = new Choice();
		try {
			Conn c = new Conn();
			ResultSet rs = c.s.executeQuery("select * from Hotel");
			while (rs.next()) {
				c1.add(rs.getString("hotelName"));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		c1.setBounds(215, 100, 200, 25);
		c1.setBackground(Color.ORANGE);
		c1.setFont(new Font("Raleway", Font.PLAIN, 17));
		add(c1);
		
		JLabel l3 = new JLabel("Total Persons:");
		l3.setBounds(15, 140, 180, 25);
		l3.setFont(new Font("Raleway", Font.PLAIN, 20));
		add(l3);
		
		t1 = new JTextField();
		t1.setBounds(215, 140, 200, 25);
		t1.setBackground(Color.ORANGE);
		t1.setFont(new Font("Raleway", Font.PLAIN, 17));
		add(t1);
		
		JLabel l4 = new JLabel("No. of Days:");
		l4.setBounds(15, 180, 180, 25);
		l4.setFont(new Font("Raleway", Font.PLAIN, 20));
		add(l4);
		
		t2 = new JTextField();
		t2.setBounds(215, 180, 200, 25);
		t2.setFont(new Font("Raleway", Font.PLAIN, 17));
		t2.setBackground(Color.ORANGE);
		add(t2);
		
		JLabel l5 = new JLabel("AC/Non-AC:");
		l5.setBounds(15, 220, 180, 25);
		l5.setFont(new Font("Raleway", Font.PLAIN, 20));
		add(l5);
		
		c2 = new Choice();
		c2.add("AC");
		c2.add("Non-AC");
		c2.setBounds(215, 220, 200, 25);
		c2.setBackground(Color.ORANGE);
		c2.setFont(new Font("Raleway", Font.PLAIN, 15));
		add(c2);
		
		JLabel l6 = new JLabel("Food Included:");
		l6.setBounds(15, 260, 180, 25);
		l6.setFont(new Font("Raleway", Font.PLAIN, 20));
		add(l6);
		
		c3 = new Choice();
		c3.add("YES");
		c3.add("NO");
		c3.setBounds(215, 260, 200, 25);
		c3.setBackground(Color.ORANGE);
		c3.setFont(new Font("Raleway", Font.PLAIN, 15));
		add(c3);
		
		JLabel l7 = new JLabel("ID:");
		l7.setBounds(15, 300, 180, 25);
		l7.setFont(new Font("Raleway", Font.PLAIN, 20));
		add(l7);
		
		l12 = new JLabel();
		l12.setBounds(215, 300, 200, 25);
		l12.setFont(new Font("Raleway", Font.PLAIN, 17));
		add(l12);

		JLabel l8 = new JLabel("Number:");
		l8.setBounds(15, 340, 180, 25);
		l8.setFont(new Font("Raleway", Font.PLAIN, 20));
		add(l8);
		
		l13 = new JLabel();
		l13.setBounds(215, 340, 200, 25);
		l13.setFont(new Font("Raleway", Font.PLAIN, 17));
		add(l13);
	
		JLabel l9 = new JLabel("Phone:");
		l9.setBounds(15, 380, 180, 25);
		l9.setFont(new Font("Raleway", Font.PLAIN, 20));
		add(l9);
		
		l14 = new JLabel();
		l14.setBounds(215, 380, 200, 25);
		l14.setFont(new Font("Raleway", Font.PLAIN, 17));
		add(l14);
	
		JLabel l10 = new JLabel("Total Price:");
		l10.setBounds(15, 420, 180, 25);
		l10.setFont(new Font("Raleway", Font.PLAIN, 20));
		add(l10);
		
		l15 = new JLabel();
		l15.setBounds(215, 420, 210, 25);
		l15.setFont(new Font("Raleway", Font.PLAIN, 17));
		l15.setForeground(Color.RED);
		add(l15);

		b1 = new JButton("Check Price");
		b1.setBounds(47, 465, 105, 27);
		b1.setBackground(Color.BLUE);
		b1.setForeground(Color.WHITE);
		b1.addActionListener(this);
		add(b1);
		
		b2 = new JButton("Book Hotel");
		b2.setBounds(180, 465, 105, 27);
		b2.setBackground(Color.BLUE);
		b2.setForeground(Color.WHITE);
		b2.addActionListener(this);
		add(b2);
		
		b3 = new JButton("Back");
		b3.setBounds(310, 465, 105, 27);
		b3.setBackground(Color.BLUE);
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
		}
	}
	
	public void actionPerformed(ActionEvent ae){
		if (ae.getSource() == b1) {
			try {
				Conn c = new Conn();
				ResultSet rs = c.s.executeQuery("select * from Hotel where hotelName = '"+c1.getSelectedItem()+"'");
				while (rs.next()) {
					int cost = Integer.parseInt(rs.getString(2));	//cost_per_day--->column name in database
					int AcCharges = Integer.parseInt(rs.getString(3));	//ac_charges--->column name in database
					int foodCharges = Integer.parseInt(rs.getString(4));	// food_charges--->column name in database
					
					int persons =  Integer.parseInt(t1.getText());
					int Days =  Integer.parseInt(t2.getText());
					
					String Ac = c2.getSelectedItem();
					String Food = c3.getSelectedItem();
					
					if ((persons * Days) > 0) {
						int total = 0;
						total += 
								Ac.equals("AC") ? AcCharges:0;		// (or) total += Food.equals("YES") ? foodCharges:0;
						total = total + (Food.equals("YES") ? foodCharges:0);
						total += cost;
						total = total * persons * Days;
						
						l15.setText("Rs."+total+"/-");
					} else {
						l15.setText("Please, Enter Valid Number");
					}
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (ae.getSource() == b2) {
			try {
				Conn c = new Conn();
				c.s.execute("insert into BookHotel values('"+l11.getText()+"', '"+c1.getSelectedItem()+"', '"+t1.getText()+"', '"+t2.getText()+"', '"+c2.getSelectedItem()+"', '"+c3.getSelectedItem()+"','"+l12.getText()+"', '"+l13.getText()+"', '"+l14.getText()+"', '"+l15.getText()+"')");
				
				JOptionPane.showMessageDialog(null, "Hotel Booked Successfully");
				
				this.setVisible(false);
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (ae.getSource() == b3) {
			this.setVisible(false);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BookHotel("").setVisible(true);
	}

}
