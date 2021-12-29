import javax.swing.*;
import java.awt.*;

public class newFrame extends JFrame{
    private Container c;
    private JLabel userLabel;

    newFrame()//constracter
    {
        b();//method
    }

    //above method description
    public void b()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        userLabel=new JLabel();
        userLabel.setText("enter your user name:welcome to new frame");
        userLabel.setBounds(50,50,250,50);
        c.add(userLabel);
        
    }


    
public static void main(String[]args)
   {
     newFrame a=new newFrame();
     a.setVisible(true);//to visible app
     a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     a.setBounds(420,50,400,400);
     a.setTitle("newframe");
    }
}
