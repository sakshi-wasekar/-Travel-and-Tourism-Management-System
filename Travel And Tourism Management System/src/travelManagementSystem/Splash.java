package travelManagementSystem;

import java.awt.Image;

import javax.swing.ImageIcon;	// ImageIcon-> AWT
import javax.swing.JFrame;		// javax-> javaextended package
import javax.swing.JLabel;

public class Splash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SplashFrame frame  =  new SplashFrame();
		frame.setVisible(true);
		int x=(1366)/2; //calculate center of screen
		int y=(738)/2;
		for(int i=100; i<=700; i++){
			//frame.setLocation(583,195 );
			frame.setLocation(x-i/2,y- (int)((float) i*0.33));
			frame.setSize(i,(int)((float)i*0.66));
		    try {
				Thread.sleep(1);
			} catch (Exception e) {	// TODO: handle exception}
				}
			}
		//frame.setLocation(x,y);
		//frame.setSize(700,466);	
		frame.setVisible(true);
	}
	}
	
class SplashFrame extends JFrame implements Runnable{
	SplashFrame(){
		// ClassLoader->if we want to take any image from system
		ImageIcon i1 =  new ImageIcon(ClassLoader.getSystemResource("travelManagementSystem/icons/splash.jpg"));
		Image i2 = i1.getImage().getScaledInstance(700,466, Image.SCALE_DEFAULT);
		ImageIcon i3 =  new ImageIcon(i2);
		JLabel l1 = new JLabel(i3);
		add(l1);
		
		setUndecorated(true);
		Thread t1 = new Thread(this);
		t1.start();
	}
    public void run(){
    	try {
			Thread.sleep(7000);
			this.setVisible(false);
			
			new Login().setVisible(true);
		} catch (Exception e) {
			// TODO: handle exception
		}
    }
  
	}

