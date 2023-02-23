package travelManagementSystem;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class CheckPackage extends JFrame{

	CheckPackage(){
		setBounds(410, 170, 700, 520);
		
		String[] package1 = {"GOLD PACKAGE", "6 Days and 7 Nights", "Airport Assistance","Half Day City Tour", "Daily Buffet", "Welcome Drinks on Arrival", "English Speaking Guide", "Full Day 3 Island Cruise", "BOOK NOW", "SUMMER SPECIAL", "Rs.12000/-", "package1.jpg"};
		String[] package2 = {"SILVER PACKAGE", "5 Days and 6 Nights", "Toll Free & Entrance Free Tickets", "Meet & Greet at Airport", "Welcome Drinks at Arrival", "Night Safari", "Full Day 3 Island Cruise", "Cruise with Dinner","BOOK NOW", "WINTER SPECIAL", "Rs.24000/-", "package2.jpg"};
		String[] package3 = {"BRONZE PACKAGE", "6 Days and 5 Nights", "Return Airfare", "Free Clubbing, Horse Riding",  "Welcome Drinks on Arrival", "Daily Buffet", "Stay in 5 Star Hotel", "BBQ Dinner", "BOOK NOW", "WINTER SPECIAL", "Rs.32000/-", "package3.jpg"};
		
		JTabbedPane pane= new JTabbedPane();

		JPanel p1= createPackage(package1);
		pane.addTab("Package 1", null, p1);

		JPanel p2= createPackage(package2);
		pane.addTab("Package 2", null,p2);

		JPanel p3= createPackage(package3);
		pane.addTab("Package 3", null, p3);
		
		add(pane, BorderLayout.CENTER);
	}
	
	public JPanel createPackage(String[] pack){
		JPanel p1 = new JPanel();
		p1.setLayout(null);
		p1.setBackground(Color.WHITE);
		
		JLabel l1 = new JLabel(pack[0]);
		l1.setBounds(40, 5, 300, 30);
		l1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		p1.add(l1);
		
		JLabel l2 = new JLabel(pack[1]);
		l2.setBounds(20, 50, 300, 30);
		l2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		l2.setForeground(Color.RED);
		p1.add(l2);
		
		JLabel l3 = new JLabel(pack[2]);
		l3.setBounds(20, 95, 300, 30);
		l3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		l3.setForeground(Color.BLUE);
		p1.add(l3);
		
		JLabel l4 = new JLabel(pack[3]);
		l4.setBounds(20, 145, 300, 30);
		l4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		l4.setForeground(Color.RED);
		p1.add(l4);
		
		JLabel l5 = new JLabel(pack[4]);
		l5.setBounds(20, 195, 300, 30);
		l5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		l5.setForeground(Color.BLUE);
		p1.add(l5);
		
		JLabel l6 = new JLabel(pack[5]);
		l6.setBounds(20, 240, 300, 30);
		l6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		l6.setForeground(Color.RED);
		p1.add(l6);
		
		JLabel l7 = new JLabel(pack[6]);
		l7.setBounds(20, 285, 300, 30);
		l7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		l7.setForeground(Color.BLUE);
		p1.add(l7);
		
		JLabel l8 = new JLabel(pack[7]);
		l8.setBounds(20, 335, 300, 30);
		l8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		l8.setForeground(Color.RED);
		p1.add(l8);
		
		JLabel l9 = new JLabel(pack[8]);
		l9.setBounds(35, 380, 300, 40);
		l9.setFont(new Font("Tahoma", Font.PLAIN, 25));
		l9.setForeground(Color.BLUE);
		p1.add(l9);
		
		JLabel l10 = new JLabel(pack[9]);
		l10.setBounds(250, 420, 300, 30);
		l10.setFont(new Font("Tahoma", Font.PLAIN, 25));
		l10.setForeground(Color.RED);
		p1.add(l10);
		
		JLabel l11 = new JLabel(pack[10]);
		l11.setBounds(550, 420, 300, 30);
		l11.setFont(new Font("Tahoma", Font.PLAIN, 25));
		l11.setForeground(Color.RED);
		p1.add(l11);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travelManagementSystem/icons/"+pack[11]));
		Image i2 =i1.getImage().getScaledInstance(350,350, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel l12 = new JLabel(i3);
		l12.setBounds(350, 50, 300, 350);
		p1.add(l12);
		
		return p1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckPackage().setVisible(true);
	}
}
