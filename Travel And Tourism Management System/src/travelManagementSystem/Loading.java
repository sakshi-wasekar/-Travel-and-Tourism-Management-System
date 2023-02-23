package travelManagementSystem;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class Loading extends JFrame implements Runnable{
	
	JProgressBar p;
	String username;
	
	public void run(){
		for (int i = 1; i <=101; i++)
		{
			int m = p.getMaximum();
			int n = p.getValue();
			if(n<m)
				p.setValue(p.getValue()+1);
			else{
				i =101;
				setVisible(false);
				new Dashboard(username).setVisible(true);
			}
			try {
			Thread.sleep(50);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	Loading(String user){
		username= user;
		Thread t = new Thread(this);
		
		setBounds(300,150, 700, 400);
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		JLabel l1 = new JLabel("Travel And Tourism Application");
		l1.setBounds(46, 45, 600, 40);
		l1.setForeground(Color.BLUE);
		l1.setFont(new Font("Raleway", Font.BOLD, 40));
		add(l1);
		
		p = new JProgressBar();
		p.setBounds(155, 125, 350, 25);
		p.setStringPainted(true);
		add(p);
		
		JLabel l2 = new JLabel("Please wait...");
		l2.setBounds(280, 150, 120, 25);
		l2.setForeground(Color.RED);
		l2.setFont(new Font("SERIF", Font.BOLD, 20));
		add(l2);
		
		JLabel l3 = new JLabel("Welcome "+ username);
		l3.setBounds(25, 330, 200, 17);
		l3.setForeground(Color.RED);
		l3.setFont(new Font("Raleway", Font.BOLD, 20));
		add(l3);
		
		t.start();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Loading("").setVisible(true);
	}

}
