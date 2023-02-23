package travelManagementSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ForgotPassword extends JFrame implements ActionListener{
	
	JTextField t1,t2,t3,t4,t5;
	JButton b1,b2,b3;
	
	ForgotPassword(){
		setBounds(350, 150, 750, 320);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("travelManagementSystem/icons/forgotpassword.jpg"));
		Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel l6 = new JLabel(i3);
		l6.setBounds(520, 70, 200, 200);
		add(l6);
		
		JPanel p = new JPanel();
		p.setBounds(20, 20, 475, 250);
		p.setLayout(null);
		add(p);
		
		JLabel l1= new JLabel("Username");
		l1.setBounds(20, 15, 100, 25);
		l1.setFont(new Font("Tahoma", Font.BOLD, 15));
		p.add(l1);
		
		t1 = new JTextField();
		t1.setBounds(199, 15, 150, 25);
		t1.setBorder(BorderFactory.createEmptyBorder());
		p.add(t1);
		
		b1 = new JButton("Search");
		b1.setBounds(370, 15, 75, 25);
		b1.setBackground(Color.GRAY);
		b1.setForeground(Color.WHITE);
		b1.addActionListener(this);
		p.add(b1);
		
		JLabel l2= new JLabel("Name");
		l2.setBounds(20, 50, 100, 25);
		l2.setFont(new Font("Tahoma", Font.BOLD, 15));
		p.add(l2);
		
		t2 = new JTextField();
		t2.setBounds(199, 50, 150, 25);
		t2.setBorder(BorderFactory.createEmptyBorder());
		p.add(t2);
		
		JLabel l3= new JLabel("Your Security Question");
		l3.setBounds(20, 85, 200, 25);
		l3.setFont(new Font("Tahoma", Font.BOLD, 15));
		p.add(l3);
		
		t3 = new JTextField();
		t3.setBounds(199, 85, 200, 25);
		t3.setBorder(BorderFactory.createEmptyBorder());
		p.add(t3);
		
		JLabel l4= new JLabel("Answer");
		l4.setBounds(20, 120, 100, 25);
		l4.setFont(new Font("Tahoma", Font.BOLD, 15));
		p.add(l4);
		
		t4 = new JTextField();
		t4.setBounds(199, 120, 150, 25);
		t4.setBorder(BorderFactory.createEmptyBorder());
		p.add(t4);
		
		b2 = new JButton("Retrieve");
		b2.setBounds(370, 120, 85, 25);
		b2.setBackground(Color.GRAY);
		b2.setForeground(Color.WHITE);
		b2.addActionListener(this);
		p.add(b2);
		
		JLabel l5= new JLabel("password");
		l5.setBounds(20, 155, 155, 25);
		l5.setFont(new Font("Tahoma", Font.BOLD, 15));
		p.add(l5);
		
		t5 = new JTextField();
		t5.setBounds(199, 155, 155, 25);
		t5.setBorder(BorderFactory.createEmptyBorder());
		p.add(t5);
		
		b3 = new JButton("Back");
		b3.setBounds(120, 200, 70, 25);
		b3.setBackground(Color.GRAY);
		b3.setForeground(Color.WHITE);
		b3.addActionListener(this);
		p.add(b3);
	}
	
	public void actionPerformed(ActionEvent ae){
		Conn connection = new Conn();
		ResultSet  rs;
		if(ae.getSource() == b1){
			String sql = "select * from Account where username = '"+ t1.getText()+"'";
			//boolean found=false;
			
			try{
				rs = connection.s.executeQuery(sql);
				while (rs.next()) {
				
					if (rs.getString("username").equals(t1.getText().toString())){
					   t2.setText(rs.getString("name"));	
					   t3.setText(rs.getString("security"));	
					 
					   break;
					}
					else{
						JOptionPane.showMessageDialog(null, "Invalid username");
					}
				}
			}
			catch(Exception e){
			}
		}else if(ae.getSource() == b2){
			
			String sql = "select * from Account where answer = '"+ t4.getText()+"' AND username= '"+t1.getText()+"'";
			try{
				rs = connection.s.executeQuery(sql);
				while (rs.next()) {
				
					if (rs.getString("answer").equals(t4.getText().toString())){
					   t5.setText(rs.getString("password"));	
					 
					   break;
					   
					}/*else{
						JOptionPane.showMessageDialog(null, "Oops, Invalid answer!");
					}*/
				}
			}catch(Exception e){
			}
		
		} else if(ae.getSource() == b3){
			this.setVisible(false);
			new Login().setVisible(true);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ForgotPassword().setVisible(true);
	}

}
