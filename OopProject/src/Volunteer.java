import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Volunteer extends JFrame{
	Volunteer(){
		
 JPanel p1=new JPanel();
  
 setLayout(null);

 p1.setLayout(new GridLayout(5, 1));
 

 JLabel l3 = new JLabel("Volunteering Activities");
 l3.setForeground(Color.blue);
 l3.setFont(new Font("Serif", Font.BOLD, 20));
 p1.add(l3);
  p1.add(new JRadioButton("Arrangement"));
 p1.add(new JRadioButton("Publicity"));
 p1.add(new JRadioButton("Cleaning"));
 
 JPanel p2=new JPanel();
JButton b1=new JButton("Submit");
p1.setBounds(10,10,300,300);
p2.setBounds(10,350,95,30);
b1.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent ae) {
        dispose();
       ConfirmPg c1=new ConfirmPg();
         c1.setSize(400, 300);
      c1.setVisible(true);
        
    }
    });

 p2.add(b1);
 add(p1);
 add(p2);
 
	}
	public static void main(String[]args) {
		Volunteer frame=new Volunteer();

	   
        frame.setTitle("Volunteer");
	    frame.setSize(400, 250);

	   // frame.setLocationRelativeTo(null); // Center the frame
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    frame.setVisible(true);
	
	}
}
