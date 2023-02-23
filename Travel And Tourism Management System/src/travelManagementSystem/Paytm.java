package travelManagementSystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class Paytm extends JFrame implements ActionListener{

	Paytm(){
		
		setBounds(460, 170, 619, 430);
	
		JEditorPane editor = new JEditorPane();
		editor.setEditable(false);
		try{
			editor.setPage("https://paytm.com/credit-card-bill-payment");
		}
		catch(Exception e){
			editor.setContentType("text/html");
			editor.setText("<html>Could not load, Error 404</html>");
		}
		add(editor);
		
		JButton l1= new JButton("Back");
		l1.setBounds(450,10, 70, 25);
		l1.addActionListener(this);
		editor.add(l1);
		
		JScrollPane js = new JScrollPane(editor);
		getContentPane().add(js);
	}
	
	public void actionPerformed(ActionEvent ae){
		this.setVisible(false);
		new Payment().setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Paytm().setVisible(true);
	}

}
