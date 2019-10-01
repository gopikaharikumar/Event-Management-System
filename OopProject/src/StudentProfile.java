import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentProfile extends JFrame  {
	
	
	StudentProfile()
	{
	    JFrame f=new JFrame("Student Profile");  
	    setLayout(null);
	    
	    f.setSize(400,400);
	    f.setLayout(null);
	    JLabel l1= new JLabel("Roll No:  ");
	    
	    JLabel l2= new JLabel("Name:  ");
	    
	    
	    JLabel l3 = new JLabel("Upcoming Events");
	    l3.setForeground(Color.blue);
	    l3.setFont(new Font("Serif", Font.BOLD, 20));
	   
	    JButton b1=new JButton("Participate");  
	   
	    JButton b2=new JButton("Volunteer"); 
	    JButton b3=new JButton("SignOut");
	    JButton b4=new JButton("DashBoard");
	    
	    l1.setBounds(50,10,95,30);
	    l2.setBounds(50,40,95,30);
	    l3.setBounds(50,100,205,30);
	    
	    b1.setBounds(50,170,150,30);
	    b2.setBounds(50,210,150,30);
	     b3.setBounds(950,10,95,30);
	     b4.setBounds(1050,10,150,30);
	  
	    
	   
	   b1 .addActionListener(new ActionListener() {
		            public void actionPerformed(ActionEvent ae) {
		                f.dispose();
		                Participate c1=new Participate();
		                c1.setSize(400, 300);
		                
		                
		                c1.setVisible(true);
		                
		            }
		            });
	   b2 .addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent ae) {
               f.dispose();
               Volunteer c1=new Volunteer();
               c1.setSize(400, 300);
               
               
               c1.setVisible(true);
               
           }
           });
	   
	   b3 .addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent ae) {
               f.dispose();
               Login c1=new Login();
               c1.setSize(400, 300);
               
               
               c1.setVisible(true);
               
           }
           });
	   
	   b4 .addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent ae) {
               f.dispose();
               DashBoard c1=new DashBoard();
               c1.setSize(400, 300);
               
               
               c1.setVisible(true);
               
           }
           });
	   
	  
	   f.add(b1);  
	   f.add(b2);
	   f.add(b3);
	   f.add(b4);
	   f.add(l1);
	    f.add(l2);
	    f.add(l3);
	   
	   
	   
	    f.setSize(400,400);  
	     
	    f.setVisible(true); 
	   // f.setLocationRelativeTo(null);
	    
	  
	    
	 
	   
	    }
	public static void main(String[] args) {
		new StudentProfile();
	}


}