import javax.swing.*;
import java.awt.*;

public class Participate extends JFrame{
	Participate(){
		
 JPanel p1=new JPanel();
  


 p1.setLayout(new GridLayout(7, 1));
 p1.add(new JLabel("Participate"));
 
 p1.add(new JLabel("Event Registration"));
  p1.add(new JCheckBox("VadamValli"));
 p1.add(new JCheckBox("Sundarikku Pottuthodal"));
 p1.add(new JCheckBox("Uriadi"));
JButton b1=new JButton("Submit");
//b1.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
b1.setBounds(50, 100,5, 15);
 p1.add(b1);
 add(p1);
 

}
	public static void main(String[]args) {
		Participate frame=new Participate();

	   //frame.setTitle("Participate");

	    frame.setSize(400, 250);

	   frame.setLocationRelativeTo(null); // Center the frame
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    frame.setVisible(true);
	
	}
}
