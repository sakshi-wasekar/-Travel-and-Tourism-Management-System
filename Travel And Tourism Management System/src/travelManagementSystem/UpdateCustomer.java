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
import javax.swing.JTextField;

public class UpdateCustomer extends JFrame implements ActionListener{
	
	JTextField t2,t4,t5,t6,t7,t8,t9;
	JButton b1,b2;
	JLabel l13;
	
	public UpdateCustomer(String username) {
		// TODO Auto-generated constructor stub
		setBounds(400, 163, 680, 478);
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		JLabel l11 = new JLabel("Update Customer Details");
		l11.setBounds(50, 5, 300, 25);
		l11.setFont(new Font("Tahoma", Font.PLAIN, 25));
		l11.setForeground(new Color(70,125,169));
		add(l11);
		
		ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("travelManagementSystem/icons/update.png"));
		Image i2 = i1.getImage().getScaledInstance(200,300, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel l10 = new JLabel(i3);
		l10.setBounds(400, 40, 200,300);
		add(l10);
		
		JLabel l1 = new JLabel("Username : ");
		l1.setBounds(20, 40, 100, 25);
		l1.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(l1);
		
		l13 = new JLabel("Username : ");
		l13.setBounds(180, 40, 160, 25);
		add(l13);
		
		JLabel l2 = new JLabel("ID Proof : ");
		l2.setBounds(20, 80, 100, 25);
		l2.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(l2);
		
		t8= new JTextField();
		t8.setBounds(180, 80, 160, 25);
		add(t8);
		
		JLabel l3 = new JLabel("Number : ");
		l3.setBounds(20, 118, 100, 25);
		l3.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(l3);
		
		t2= new JTextField();
		t2.setBounds(180, 118, 160, 25);
		add(t2);
		
		JLabel l4 = new JLabel("Name : ");
		l4.setBounds(20, 155, 100, 25);
		l4.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(l4);
		
		JLabel l12 = new JLabel();
		l12.setBounds(180, 155, 160, 25);
		add(l12);
		
		JLabel l5 = new JLabel("Gender : ");
		l5.setBounds(20, 195, 100, 25);
		l5.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(l5);
		
		t9= new JTextField();
		t9.setBounds(180, 195, 160, 25);
		add(t9);
		
		JLabel l6 = new JLabel("Country : ");
		l6.setBounds(20, 235, 100, 25);
		l6.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(l6);
		
		t4= new JTextField();
		t4.setBounds(180, 235, 160, 25);
		add(t4);
		
		JLabel l7 = new JLabel("Address : ");
		l7.setBounds(20, 275, 100, 25);
		l7.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(l7);
		
		t5= new JTextField();
		t5.setBounds(180, 275, 160, 25);
		add(t5);
		
		JLabel l8 = new JLabel("Phone : ");		// its datatype is **INT** in SQL
		l8.setBounds(20, 315, 100, 25);
		l8.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(l8);
		
		t6= new JTextField();
		t6.setBounds(180, 315, 160, 25);
		add(t6);
		
		JLabel l9 = new JLabel("Email :");
		l9.setBounds(20, 355, 100, 25);
		l9.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(l9);
		
		t7= new JTextField();
		t7.setBounds(180, 355, 160, 25);
		add(t7);
		
		b1 = new JButton("Update");
		b1.setBounds(35, 399, 100, 25);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.white);
		b1.addActionListener(this);
		add(b1);
		
		b2 = new JButton("Back");
		b2.setBounds(185, 399, 100, 25);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.white);
		b2.addActionListener(this);
		add(b2);
		
		Conn c = new Conn();
		try{
			String query = "select * from Customer where username = '"+username+"'";
			ResultSet rs = c.s.executeQuery(query);
			
			while (rs.next()) {
				l13.setText(rs.getString("username"));
				t2.setText(rs.getString("number"));
				l12.setText(rs.getString("name"));
				t4.setText(rs.getString("country"));
				t5.setText(rs.getString("address"));
				t6.setText(rs.getString("phone"));
				t7.setText(rs.getString("email"));
				t8.setText(rs.getString("ID"));
				t9.setText(rs.getString("gender"));
			}
		}catch(Exception e){ e.printStackTrace();}
	}
	
	public void actionPerformed(ActionEvent ae){
		
			
			if (ae.getSource() == b1) {
				String username = l13.getText();
				String ID = t8.getText();
				String number = t2.getText();
				String radio = t9.getText();
				String country = t4.getText();
				String address = t5.getText();
				String phone = t6.getText();
				String email = t7.getText();
				
				String q =  "update Customer set ID ='"+ID+"', number ='"+number+"', gender ='"+radio+"', country ='"+country+"', address = '"+address+"', phone = "+phone+", email ='"+email+"' where username = '"+username+"'";
				try {
					Conn connection = new Conn();	
					connection.s.executeUpdate(q);
					
					JOptionPane.showMessageDialog(null, "Customer Details Updated Successfully");
					
					this.setVisible(false);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
		}else if (ae.getSource() == b2) {
			this.setVisible(false);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new UpdateCustomer("").setVisible(true);
	}

}
