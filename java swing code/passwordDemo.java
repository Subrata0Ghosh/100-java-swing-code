import javax.swing.*;
import java.awt.*;

public class passwordDemo extends JFrame {
    private Container c;
    private JPasswordField pf;//for password field
    private Font f;//for use font

    passwordDemo()// constracter
    {
        b();// method
    }

    public void b() 
    {
        c=this.getContentPane();//c =container
        c.setLayout(null);
        c.setBackground(Color.ORANGE);
//create font
        f=new Font("Arial",Font.BOLD,30);//30=font size

//creating passwordfield
        pf=new JPasswordField();   
        pf.setBounds(50,20,150,50);//password field location
        pf.setEchoChar('*');//password field * show korar jonno
        pf.setFont(f);//use font
        pf.setForeground(Color.GREEN);//change password field text color
        pf.setBackground(Color.BLACK);//change password field bg color
        c.add(pf);//add the password fiend to container to show/print password field

    }

    public static void main(String[] args) {
        passwordDemo a = new passwordDemo();
        a.setVisible(true);// to visible app
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a.setBounds(200, 50, 500, 400);
        a.setTitle("nil Ranbow");
    }
}
