
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Signup extends JFrame  {
    public Signup(){
        JFrame j=new JFrame("");
     
        JPanel p1 = new JPanel();
        JLabel jl=new JLabel("	Enter Username");
        p1.add(jl);
        JTextField ja=new JTextField(10);
        p1.add(ja);
        JPanel p2=new JPanel();
        JLabel jl1=new JLabel(" Enter Password");
        p2.add(jl1);
        JPasswordField ja1=new JPasswordField(8);
         p2.add(ja1);
         
         JPanel p4=new JPanel();
         JLabel jl2=new JLabel(" Confirm Password");
         p4.add(jl2);
         JPasswordField ja2=new JPasswordField(8);
          p4.add(ja2);
            
       JPanel p3=new JPanel();
        JButton jb=new JButton("Reset");
        p3.add(jb);
        JButton jb1=new JButton("SignUp ");
        p3.add(jb1);
        
        p1.setBounds(450,50,250,40);
        p2.setBounds(450,150,250,40);
        p4.setBounds(450,250,250,40);
        p3.setBounds(450,350,250,40);
        
        
       j. setLayout(null);
       j.setVisible(true);
       
       jb1 .addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent ae) {
               j.dispose();
              
               StudentProfile s1=new StudentProfile();
               s1.setSize(400, 300);
               
               
               s1.setVisible(true);
               
           }
           });
       
       jb .addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent ae) {
               j.dispose();
              
               Signup s1=new Signup();
               s1.setSize(400, 300);
               
               
               s1.setVisible(true);
               
           }
           });
       
       
        j.add(p1);
        j.add(p2);
        j.add(p4);
        j.add(p3);
        
        j.setSize(400,400);
                
 }
   
    public static void main(String a[]){
       new Signup();
        
    }
    
    
    
}