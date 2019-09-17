import javax.swing.*;
import java.awt.*;



public class StudentProfile {
	
	
	public static void main(String []args) 
	{
	    JFrame f=new JFrame("Student Profile");  
	   
	    JLabel l1= new JLabel("Roll No:  ");
	    l1.setBounds(0,10,95,30);
	    JLabel l2= new JLabel("Name:  ");
	    l2.setBounds(0,40,95,30);
	    JLabel l3=new JLabel("UPCOMING EVENTS");
	    l3.setBounds(0,60,95,30);
	    JButton b1=new JButton("Event1");  
	    b1.setBounds(0,400,150,30);
	    JButton b2=new JButton("Event2"); 
	    b2.setBounds(0,450,150,30);
	   
	   
	  
	   f.add(b1);  
	   f.add(b2);
	   f.add(l1);
	    f.add(l2);
	    f.add(l3);
	   
	   
	    f.setSize(400,400);  
	     
	    f.setVisible(true); 
	    f.setLocationRelativeTo(null);
	    
	  
	    
	 
	   
	    }
}