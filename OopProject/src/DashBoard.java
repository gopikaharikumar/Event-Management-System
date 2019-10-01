import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class DashBoard extends JFrame 
{
	DashBoard()
	{
		setLayout(null);
		JPanel p1=new JPanel();
		
		p1.setLayout(new GridLayout(2,1,5,5));
		
		
		 JLabel l3 = new JLabel("Registered Events");
		    l3.setForeground(Color.blue);
		    l3.setFont(new Font("Serif", Font.BOLD, 20));
		      p1.add(l3);
				
		JPanel p2=new JPanel();
		JButton b1=new JButton("Home");
		
		p2.add(b1);
		p1.setBounds(10,10,250,200);
		p2 .setBounds(1050,10,150,30);
		
		
		
		
		b1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent ae) {
             dispose();
            StudentProfile sp1=new StudentProfile();
             sp1.setSize(400, 300);
             
             
             sp1.setVisible(true);
             
         }
         });
		add(p1);
		add(p2);
	
}
	public static void main(String []args) {
		DashBoard frame=new DashBoard();
		
		 frame.setSize(400, 250);

		    frame.setLocationRelativeTo(null); // Center the frame
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		    frame.setVisible(true);
		
	}
}
