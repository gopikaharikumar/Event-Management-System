import java.awt.*;
import javax.swing.*;

public class ConfirmPg extends JFrame {
ConfirmPg(){
	JPanel p1=new JPanel();
	p1.setLayout(new BorderLayout(5,5));
	 p1.add(new JLabel("Successfully Registered!!"), BorderLayout.NORTH);
	 p1.add(new JLabel("Thank You and Have a nice time!!"), BorderLayout.CENTER);
	 add(p1);
}
	public static void main(String []args) {
		ConfirmPg frame=new ConfirmPg();
		
		 frame.setSize(400, 250);

		    frame.setLocationRelativeTo(null); // Center the frame
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		    frame.setVisible(true);
		
	}
}
