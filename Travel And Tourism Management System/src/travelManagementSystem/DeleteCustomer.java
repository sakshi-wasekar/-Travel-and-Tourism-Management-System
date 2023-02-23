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
import javax.swing.JOptionPane;

public class DeleteCustomer extends JFrame implements ActionListener{

	JButton b1, b2;
	String username;
	
	DeleteCustomer(String username){
		this.username = username;

		setBounds(450, 180, 660, 440);
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travelManagementSystem/icons/delete.png"));
		Image i2 = i1.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel l20 = new JLabel(i3);
		l20.setBounds(370, 40, 300, 300);
		add(l20);
		
		JLabel heading = new JLabel("DELETE CUSTOMER DETAILS");
		heading.setBounds(60, 0, 370 , 30);
		heading.setForeground(Color.DARK_GRAY);
		heading.setFont(new Font("SERIF", Font.BOLD, 25));
		add(heading);
		
		JLabel l1 = new JLabel("Username:");
		l1.setBounds(15, 50, 100 , 20);
		l1.setFont(new Font("SERIF", Font.PLAIN, 18));
		add(l1);
		
		JLabel l11 = new JLabel();
		l11.setBounds(200, 50, 150 , 22);
		l11.setFont(new Font("SERIF", Font.PLAIN, 18));
		add(l11);
		
		JLabel l2 = new JLabel("Name:");
		l2.setBounds(15, 85, 100 , 20);
		l2.setFont(new Font("SERIF", Font.PLAIN, 18));
		add(l2);
		
		JLabel l12 = new JLabel();
		l12.setBounds(200, 85, 150 , 22);
		l12.setFont(new Font("SERIF", Font.PLAIN, 18));
		add(l12);
		
		JLabel l3 = new JLabel("ID Proof:");
		l3.setBounds(15, 120, 100 , 20);
		l3.setFont(new Font("SERIF", Font.PLAIN, 18));
		add(l3);
		
		JLabel l13 = new JLabel();
		l13.setBounds(200, 120, 150 , 22);
		l13.setFont(new Font("SERIF", Font.PLAIN, 18));
		add(l13);
		
		JLabel l4 = new JLabel("Number:");
		l4.setBounds(15, 155, 100 , 20);
		l4.setFont(new Font("SERIF", Font.PLAIN, 18));
		add(l4);
		
		JLabel l14 = new JLabel();
		l14.setBounds(200, 155, 150 , 22);
		l14.setFont(new Font("SERIF", Font.PLAIN, 18));
		add(l14);
		
		JLabel l5 = new JLabel("Gender:");
		l5.setBounds(15, 190, 100 , 20);
		l5.setFont(new Font("SERIF", Font.PLAIN, 18));
		add(l5);
		
		JLabel l15 = new JLabel();
		l15.setBounds(200, 190, 100 , 22);
		l15.setFont(new Font("SERIF", Font.PLAIN, 18));
		add(l15);
		
		JLabel l6 = new JLabel("Country:");
		l6.setBounds(15, 225, 100 , 20);
		l6.setFont(new Font("SERIF", Font.PLAIN, 18));
		add(l6);
		
		JLabel l16 = new JLabel();
		l16.setBounds(200, 225, 150 , 22);
		l16.setFont(new Font("SERIF", Font.PLAIN, 18));
		add(l16);
		
		JLabel l7 = new JLabel("Address:");
		l7.setBounds(15, 260, 100 , 20);
		l7.setFont(new Font("SERIF", Font.PLAIN, 18));
		add(l7);
		
		JLabel l17 = new JLabel();
		l17.setBounds(200, 260, 150 , 22);
		l17.setFont(new Font("SERIF", Font.PLAIN, 18));
		add(l17);
		
		JLabel l8 = new JLabel("Phone:");
		l8.setBounds(15, 295, 100 , 20);
		l8.setFont(new Font("SERIF", Font.PLAIN, 18));
		add(l8);
		
		JLabel l18 = new JLabel();
		l18.setBounds(200, 295, 100 , 20);
		l18.setFont(new Font("SERIF", Font.PLAIN, 18));
		add(l18);
		
		JLabel l9 = new JLabel("Email:");
		l9.setBounds(15, 330, 100 , 20);
		l9.setFont(new Font("SERIF", Font.PLAIN, 18));
		add(l9);
		
		JLabel l19 = new JLabel();
		l19.setBounds(200, 330, 170 , 22);
		l19.setFont(new Font("SERIF", Font.PLAIN, 18));
		add(l19);
		
		b1= new JButton("Delete");
		b1.setBounds(85, 370, 80, 25);
		b1.setBackground(Color.RED);
		b1.setForeground(Color.WHITE);
		b1.addActionListener(this);
		add(b1);
		
		b2= new JButton("Back");
		b2.setBounds(210, 370, 80, 25);
		b2.setBackground(Color.RED);
		b2.setForeground(Color.WHITE);
		b2.addActionListener(this);
		add(b2);
		
		try {
			Conn c = new Conn();
			ResultSet rs = c.s.executeQuery("select * from Customer where username = '"+username+"'");
			while(rs.next()){
				l11.setText(rs.getString("username"));
				l12.setText(rs.getString("name"));
				l13.setText(rs.getString("ID"));
				l14.setText(rs.getString("number"));
				l15.setText(rs.getString("gender"));
				l16.setText(rs.getString("country"));
				l17.setText(rs.getString("address"));
				l18.setText(rs.getString("phone"));
				l19.setText(rs.getString("email"));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void actionPerformed(ActionEvent ae){
		
		if(ae.getSource() == b1) {
			try {
				Conn c = new Conn();
				c.s.execute("delete from Account where username = '"+username+"'");
				c.s.execute("delete from Customer where username = '"+username+"'");
				c.s.execute("delete from BookPackage where username = '"+username+"'");
				c.s.execute("delete from BookHotel where username = '"+username+"'");
				
				JOptionPane.showMessageDialog(null, "Customer Details Deleted Successfully");
				
				System.exit(0);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		} else if(ae.getSource() == b2) {
			this.setVisible(false);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DeleteCustomer("").setVisible(true);
	}

}
