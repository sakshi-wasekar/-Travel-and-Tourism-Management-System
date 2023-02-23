package travelManagementSystem;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Destination extends JFrame implements Runnable{

	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	JLabel[] label = {l1,l2,l3,l4,l5,l6,l7,l8,l9,l10};
	
	public void run(){
		try {
			for (int i = 0; i <=9; i++) {
				label[i].setVisible(true);
				Thread.sleep(3000);
				label[i].setVisible(false);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	Destination(){
		setBounds(420, 167, 685, 540);
		setLayout(null);
		
		ImageIcon i1, i2, i3, i4, i5, i6, i7, i8, i9, i10;
		ImageIcon[] imageicon ={i1=null, i2=null, i3=null, i4=null, i5=null, i6=null, i7=null, i8=null, i9=null, i10=null};
		
		
		Image j1, j2, j3, j4, j5, j6, j7, j8, j9, j10;
		Image[] image = {j1=null, j2=null, j3=null, j4=null, j5=null, j6=null, j7=null, j8=null, j9=null, j10=null};
		
		ImageIcon i11, i12, i13, i14, i15, i16, i17, i18, i19, i20;
		ImageIcon[] iimageicon = {i11=null, i12=null, i13=null, i14=null, i15=null, i16=null, i17=null, i18=null, i19=null, i20=null};
		
		
		for (int i = 0; i <=9; i++) {
			imageicon[i] = new ImageIcon(ClassLoader.getSystemResource("travelManagementSystem/icons/dest"+(i+1)+".jpg"));
			image[i] = imageicon[i].getImage().getScaledInstance(685, 500, Image.SCALE_DEFAULT);
			iimageicon[i] = new ImageIcon(image[i]);
			label[i] = new JLabel(iimageicon[i]);
			label[i].setBounds(0, 0, 685, 505);
			add(label[i]);
		}
	
		Thread t = new Thread(this);
		t.start();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Destination().setVisible(true);
		
	}

}

