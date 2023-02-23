package travelManagementSystem;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Signup extends JFrame implements ActionListener{
	
	JButton b1,b2;
	JTextField t1,t2,t3,t4;
	Choice c1;
	
	Signup(){
		setBounds(300, 195,720,350);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		JPanel p1= new JPanel();
		p1.setBounds(0, 0, 450, 390);
		p1.setBackground(new Color(131, 193, 233));
		p1.setLayout(null);
		add(p1);
		
		JLabel l1 = new JLabel("Username");
		l1.setBounds(25, 20, 100, 25);
		l1.setFont(new Font("Tahoma", Font.BOLD,14
				));
		p1.add(l1);
		
		t1 = new JTextField();
		t1.setBounds(155, 20, 250, 25);
		t1.setBorder(BorderFactory.createEmptyBorder());
		p1.add(t1);
		
		JLabel l2 = new JLabel("Name");
		l2.setBounds(25, 60, 100, 25);
		l2.setFont(new Font("Tahoma", Font.BOLD,14));
		p1.add(l2);
		
		t2 = new JTextField();
		t2.setBounds(155, 60, 250, 25);
		t2.setBorder(BorderFactory.createEmptyBorder());
		p1.add(t2);
		
		JLabel l3 = new JLabel("Password");
		l3.setBounds(25, 100, 100, 25);
		l3.setFont(new Font("Tahoma", Font.BOLD,14));
		p1.add(l3);
		
		t3 = new JTextField();
		t3.setBounds(155, 100, 250, 25);
		t3.setBorder(BorderFactory.createEmptyBorder());
		p1.add(t3);
		
		JLabel l4 = new JLabel("Security Question");
		l4.setBounds(25, 140, 125, 25);
		l4.setFont(new Font("Tahoma", Font.BOLD,14));
		p1.add(l4);
		
		c1= new Choice();
		c1.setBounds(155, 140, 250, 25);
		c1.add("Select your lucky number");
		c1.add("Your Nickname");
		p1.add(c1);
		
		JLabel l5 = new JLabel("Answer");
		l5.setBounds(25, 180, 100, 25);
		l5.setFont(new Font("Tahoma", Font.BOLD,14));
		p1.add(l5);
		
		t4 = new JTextField();
		t4.setBounds(155, 180, 250, 25);
		t4.setBorder(BorderFactory.createEmptyBorder());
		p1.add(t4);
		
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travelManagementSystem/icons/signup.png"));
		//Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
		//ImageIcon i3 = new ImageIcon(i2);
		JLabel l6 = new JLabel(i1);
		l6.setBounds(480, 100, 200, 200);
		add(l6);
		
		b1 = new JButton("Create");
		b1.setBounds(115, 250, 75,35);
		b1.addActionListener(this);
		p1.add(b1);
		
		b2 = new JButton("Back");
		b2.setBounds(255, 250, 75,35);
		b2.addActionListener(this);
		p1.add(b2);
	}
	
	public void actionPerformed(ActionEvent ae){
		if (ae.getSource() == b1) {
			String username = t1.getText();
			String name = t2.getText();
			String password = t3.getText();
			String security = c1.getSelectedItem();
			String answer = t4.getText();
			
			String query = "Insert into Account values('"+username+"', '"+name+"', '"+password+"', '"+security+"', '"+answer+"')";
			try {
				Conn con = new Conn();
				con.s.execute(query);
				JOptionPane.showMessageDialog(null, "Account Created Successfully");
				
				this.setVisible(false);
				new Login().setVisible(true);
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if(ae.getSource() == b2){
			new Login().setVisible(true);
			this.setVisible(false);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Signup().setVisible(true);
	}

}
