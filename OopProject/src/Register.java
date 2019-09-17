import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;




public class Register extends JFrame {
    private float center;
    public Register(){
        JFrame j=new JFrame("LOGIN");
        j.setVisible(true);
        JPanel p1= new JPanel();
        JLabel jl=new JLabel("Username:");
        p1.add(jl);
        JTextField ja=new JTextField(20);
        p1.add(ja);
        JPanel p2=new JPanel();
        
        JLabel jl1=new JLabel("Password:");
        p2.add(jl1);
        JPasswordField ja1=new JPasswordField(8);
        p2.add(ja1);
        JPanel p3=new JPanel();
        JButton b1=new JButton("Clear");
        p3.add(b1);
        JButton jb=new JButton("Register");
        p3.add(jb);
        j.add(p1);
        j.add(p2);
        j.add(p3);
     
     
        
      
        j.setLayout(new GridLayout(3,1,5,5));
        j.setSize(400,400);
                
        

        
        
    }
    public static void main(String a[]){
       new Register();
        
    }
    
    
    
}

