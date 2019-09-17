import java.awt.*;

import javax.swing.*;


public class Volunteer extends JFrame{
	Volunteer(){
		
 JPanel p1=new JPanel();
  


 p1.setLayout(new GridLayout(6, 1));
 p1.add(new JLabel("Volunteer"));
 
 p1.add(new JLabel("Activity"));
  p1.add(new JRadioButton("Arrangement"));
 p1.add(new JRadioButton("Publicity"));
 p1.add(new JRadioButton("Cleaning"));

 p1.add(new JButton("Submit"));
 add(p1);
	}
	public static void main(String[]args) {
		Volunteer frame=new Volunteer();

	   

	    frame.setSize(400, 250);

	    frame.setLocationRelativeTo(null); // Center the frame
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    frame.setVisible(true);
	
	}
}
