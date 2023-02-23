package travelManagementSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class AddCustomer extends JFrame implements ActionListener{
	
	JTextField t1,t2,t3,t4,t5,t6,t7;
	JComboBox c1;
	JButton b1,b2;
	JRadioButton r1, r2;
	
	public AddCustomer(String username) {
		// TODO Auto-generated constructor stub
		setBounds(400, 167, 745, 470);
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("travelManagementSystem/icons/newcustomer.jpg"));
		Image i2 = i1.getImage().getScaledInstance(400,500, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel l10 = new JLabel(i3);
		l10.setBounds(340, 5, 400, 500);
		add(l10);
		
		JLabel l1 = new JLabel("Username : ");
		l1.setBounds(20, 25, 100, 25);
		l1.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(l1);
		
		t1= new JTextField();
		t1.setBounds(180, 25, 160, 25);
		add(t1);
		
		JLabel l2 = new JLabel("ID Proof : ");
		l2.setBounds(20, 65, 100, 25);
		l2.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(l2);
		
		c1 = new JComboBox(new String[] {"Aadhar Card", "Driving License", "Passport", "Pan Card" });	// its takes string array
		c1.setBounds(180, 65, 160, 25);
		add(c1);
		
		JLabel l3 = new JLabel("Number : ");
		l3.setBounds(20, 100, 100, 25);
		l3.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(l3);
		
		t2= new JTextField();
		t2.setBounds(180, 100, 160, 25);
		add(t2);
		
		JLabel l4 = new JLabel("Name : ");
		l4.setBounds(20, 135, 100, 25);
		l4.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(l4);
		
		t3= new JTextField();
		t3.setBounds(180, 135, 160, 25);
		add(t3);
		
		JLabel l5 = new JLabel("Gender : ");
		l5.setBounds(20, 180, 100, 25);
		l5.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(l5);
		
		r1 = new JRadioButton("Male");
		r1.setBounds(180, 180, 70, 25);
		r1.setBackground(Color.WHITE);
		add(r1);
		
		r2 = new JRadioButton("Female");
		r2.setBounds(270, 180, 70, 25);
		r2.setBackground(Color.WHITE);
		add(r2);
		
		JLabel l6 = new JLabel("Country : ");
		l6.setBounds(20, 220, 100, 25);
		l6.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(l6);
		
		t4= new JTextField();
		t4.setBounds(180, 220, 160, 25);
		add(t4);
		
		JLabel l7 = new JLabel("Address : ");
		l7.setBounds(20, 260, 100, 25);
		l7.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(l7);
		
		t5= new JTextField();
		t5.setBounds(180, 260, 160, 25);
		add(t5);
		
		JLabel l8 = new JLabel("Phone : ");		// its datatype is **INT** in SQL
		l8.setBounds(20, 300, 100, 25);
		l8.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(l8);
		
		t6= new JTextField();
		t6.setBounds(180, 300, 160, 25);
		add(t6);
		
		JLabel l9 = new JLabel("Email :");
		l9.setBounds(20, 340, 100, 25);
		l9.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(l9);
		
		t7= new JTextField();
		t7.setBounds(180, 340, 160, 25);
		add(t7);
		
		b1 = new JButton("Add");
		b1.setBounds(35, 390, 100, 25);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.white);
		b1.addActionListener(this);
		add(b1);
		
		b2 = new JButton("Back");
		b2.setBounds(185, 390, 100, 25);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.white);
		b2.addActionListener(this);
		add(b2);
		
		Conn c = new Conn();
		try{
			String query = "select * from Account where username = '"+username+"'";
			ResultSet rs = c.s.executeQuery(query);
			
			while (rs.next()) {
				t1.setText(rs.getString("username"));
				t3.setText(rs.getString("name"));
			}
		}catch(Exception e){ e.printStackTrace();}
	}
	
	public void actionPerformed(ActionEvent ae){
		
			
		if (ae.getSource() == b1) {
			try {
				Conn connection = new Conn();	
				
				String username = t1.getText();
				String ID = (String)c1.getSelectedItem();
				String number = t2.getText();
				String name = t3.getText();
				String radio =null;
				if (r1.isSelected()) {
					radio ="Male";
				}else if(r2.isSelected()){
					radio ="Female";
				}
				String country = t4.getText();
				String address = t5.getText();
				String phone = t6.getText();
				String email = t7.getText();
				
				String q =  "insert into Customer values ('"+username+"', '"+ ID+"','"+number+"', '"+name+"', '"+radio+"', '"+country+"', '"+address+"', '"+phone+"', '"+email+"')";
				connection.s.executeUpdate(q);
				
				JOptionPane.showMessageDialog(null, "Customer Details Added Successfully");
				
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
		new AddCustomer("").setVisible(true);
	}

}
