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

public class ViewCustomer extends JFrame implements ActionListener{
	
	JButton b1;

	public ViewCustomer(String username) {
		// TODO Auto-generated constructor stub
		setBounds(400, 160, 730, 480);
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("travelManagementSystem/icons/viewall.jpg"));
		Image i2 = i1.getImage().getScaledInstance(600,200, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel l10 = new JLabel(i3);
		l10.setBounds(0, 265, 600,200);
		add(l10);
		
		ImageIcon i4= new ImageIcon(ClassLoader.getSystemResource("travelManagementSystem/icons/viewall.jpg"));
		Image i5 = i4.getImage().getScaledInstance(600,200, Image.SCALE_DEFAULT);
		ImageIcon i6 = new ImageIcon(i5);
		JLabel l20 = new JLabel(i3);
		l20.setBounds(580, 265, 600,200);
		add(l20);
		
		JLabel l1 = new JLabel("Username : ");
		l1.setBounds(60, 20, 100, 25);
		l1.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(l1);
		
		JLabel l11 = new JLabel();
		l11.setBounds(190, 20, 100, 25);
		l11.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(l11);
		
		JLabel l2 = new JLabel("ID Proof : ");
		l2.setBounds(60, 70, 100, 25);
		l2.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(l2);
		
		JLabel l12 = new JLabel();
		l12.setBounds(190, 70, 150, 25);
		l12.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(l12);
		
		JLabel l3 = new JLabel("Number : ");
		l3.setBounds(60, 120, 100, 25);
		l3.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(l3);
		
		JLabel l13 = new JLabel();
		l13.setBounds(190, 120, 100, 25);
		l13.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(l13);
		
		JLabel l4 = new JLabel("Name : ");
		l4.setBounds(60, 170, 100, 25);
		l4.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(l4);
		
		JLabel l14 = new JLabel();
		l14.setBounds(190, 170, 100, 25);
		l14.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(l14);
		
		JLabel l5 = new JLabel("Gender : ");
		l5.setBounds(60, 225, 100, 25);
		l5.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(l5);
		
		JLabel l15 = new JLabel();
		l15.setBounds(190, 225, 100, 25);
		l15.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(l15);
							
		JLabel l6 = new JLabel("Country : ");
		l6.setBounds(400, 20, 100, 25);
		l6.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(l6);
		
		JLabel l16 = new JLabel();
		l16.setBounds(540, 20, 100, 25);
		l16.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(l16);
		
		JLabel l7 = new JLabel("Address : ");
		l7.setBounds(400,69, 100, 25);
		l7.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(l7);
		
		JLabel l17 = new JLabel();
		l17.setBounds(540, 69, 100, 25);
		l17.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(l17);
		
		JLabel l8 = new JLabel("Phone : ");		// its datatype is **INT** in SQL
		l8.setBounds(400, 119, 100, 25);
		l8.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(l8);
		
		JLabel l18 = new JLabel();
		l18.setBounds(540, 119, 100, 25);
		l18.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(l18);
		
		JLabel l9 = new JLabel("Email :");
		l9.setBounds(400, 169, 100, 25);
		l9.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(l9);
		
		JLabel l19 = new JLabel();
		l19.setBounds(540, 169,220 , 25);
		l19.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(l19);
		
		b1 = new JButton("Back");
		b1.setBounds(280, 250, 100, 25);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.white);
		b1.addActionListener(this);
		add(b1);
		
		Conn c = new Conn();
		try{
			String query = "select * from Customer where username = '"+username+"'";
			ResultSet rs = c.s.executeQuery(query);
			
			while (rs.next()) {
				l11.setText(rs.getString("username"));
				l12.setText(rs.getString("ID"));
				l13.setText(rs.getString("number"));
				l14.setText(rs.getString("name"));
				l15.setText(rs.getString("gender"));
				l16.setText(rs.getString("country"));
				l17.setText(rs.getString("address"));
				l18.setText(rs.getString("phone"));
				l19.setText(rs.getString("email"));
			}
		}catch(Exception e){ e.printStackTrace();}
	}
	
	public void actionPerformed(ActionEvent ae){
		
			
		 if (ae.getSource() == b1) {
			this.setVisible(false);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ViewCustomer("").setVisible(true);
	}

}
