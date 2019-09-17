
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Login extends JFrame  {
    public Login(){
        JFrame j=new JFrame("");
     
        JPanel p1 = new JPanel();
        JLabel jl=new JLabel("Username");
        p1.add(jl);
        JTextField ja=new JTextField(10);
        p1.add(ja);
        JPanel p2=new JPanel();
        JLabel jl1=new JLabel("Password");
        p2.add(jl1);
        JPasswordField ja1=new JPasswordField(8);
         p2.add(ja1);
            
       JPanel p3=new JPanel();
        JButton jb=new JButton("Reset");
        p3.add(jb);
        JButton jb1=new JButton("Login");
        p3.add(jb1);
       j. setLayout(new GridLayout(3,1,5,5));
       j.setVisible(true);
        j.add(p1);
        j.add(p2);
        j.add(p3);
        j.setSize(400,400);
                
 }
   
    public static void main(String a[]){
       new Login();
        
    }
    
    
    
}