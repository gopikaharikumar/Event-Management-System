import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Participate extends JFrame{
	Participate(){
		
 JPanel p1=new JPanel();
  

setLayout(null);
 p1.setLayout(new GridLayout(4, 1));
 
 
 JLabel l1 = new JLabel("Event Registration");
 l1.setForeground(Color.blue);
 l1.setFont(new Font("Serif", Font.BOLD, 20));
 p1.add(l1);

  p1.add(new JCheckBox("Event1"));
 p1.add(new JCheckBox("Event2"));
 p1.add(new JCheckBox("Event3"));
 JPanel p2=new JPanel();
JButton b1=new JButton("Submit");
p1.setBounds(10,10,250,200);
p2.setBounds(10,260,95,30);

//b1.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
//b1.setBounds(50, 100,5, 15);
b1.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent ae) {
        dispose();
       ConfirmPg p1=new ConfirmPg();
        p1.setSize(400, 300);
        
        
        p1.setVisible(true);
        
    }
    });

 p2.add(b1);
 add(p1);
 add(p2);
 

}
	public static void main(String[]args) {
		Participate frame=new Participate();

	  frame.setTitle("Participate");

	    frame.setSize(400, 250);

	   frame.setLocationRelativeTo(null); // Center the frame
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    frame.setVisible(true);
	
	}
}
