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
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener {
	JButton b1,b2,b3;
	JTextField t1;
	JPasswordField t2;
	
	Login(){
		setLayout(null);
		setBounds(370, 195, 1366/2, 783/2);
		getContentPane().setBackground(Color.WHITE);
		
		JPanel p1 =  new JPanel();
		p1.setBounds(0, 0, 300,355);
		p1.setBackground(new Color(131, 193, 233));// NOT understood
		p1.setLayout(null);
		add(p1);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travelManagementSystem/icons/login.png"));
		Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);

		JLabel l1 =  new JLabel(i3);
		l1.setBounds(50,120, 200, 200);
		p1.add(l1);
		
		JPanel p2 =  new JPanel();
		p2.setLayout(null);
		p2.setBounds(50, 0, 650, 355);
		add(p2);
		
		JLabel l2 = new JLabel("Username");
		l2.setBounds(300, 30, 200, 25);
		l2.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
		p2.add(l2);
		
		t1 = new JTextField();
		t1.setBounds(300, 60, 255, 25);
		//t1.setBorder(BorderFactory.createEmptyBorder());
		p2.add(t1);
		
		JLabel l3 = new JLabel("Password");
		l3.setBounds(300, 100, 200, 25);
		l3.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
		p2.add(l3);
		
		//JTextField t2 = new JTextField();	
		t2 = new JPasswordField();	//what we are writing in password it should not visible ,instead of letters only dots should visible-> to hide password(letters) we use JPasswordField instead of JTextField
		t2.setBounds(300, 130, 255, 25);
		p2.add(t2);
		
		b1 = new JButton("Login");
		b1.setBounds(300, 200, 75, 25);
		b1.addActionListener(this);
		p2.add(b1);
		
		b2 = new JButton("Sign up");
		b2.setBounds(475,200, 80, 25);
		b2.addActionListener(this);
		p2.add(b2);
		
		b3= new JButton(" Forgot Password?");
		b3.setBounds(350, 255, 145, 25);
		b3.addActionListener(this);
		p2.add(b3);
		
		JLabel l4 = new JLabel("Trouble in Login...");
		l4.setBounds(500, 290, 150, 25);
		l4.setForeground(Color.RED);	// To change font color
		p2.add(l4);
		
	}
	
	public void actionPerformed(ActionEvent ae){
		if (ae.getSource() == b1) {
			try{
				String username = t1.getText();
				String sql= "select * from Account where username = '"+ username+"' AND password = '"+ t2.getText()+"'";
				
				Conn connection = new Conn();
				ResultSet rs =  connection.s.executeQuery(sql);
				if(rs.next()){
					this.setVisible(false);
					new Loading(username).setVisible(true);	//t1.getText().toString() -->username
				}
				else{
					JOptionPane.showMessageDialog(null, "Invalid Login");
				}
			} catch(Exception e){ }
			
		} else if(ae.getSource() == b2){
			this.setVisible(false);
			new Signup().setVisible(true);
			
		}else if(ae.getSource() == b3){
			this.setVisible(false);
			new ForgotPassword().setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		new Login().setVisible(true);;
	}
}