import javax.swing.*;
import java.awt.*;

public class printText extends JFrame{
    private Container c;
    private JLabel userLabel,passLabel;

    printText()//constracter
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
        userLabel.setText("enter your user name:");
        userLabel.setBounds(50,20,200,50);
        c.add(userLabel);
        
    }
   
public static void main(String[]args)
   {
     printText a=new printText();
     a.setVisible(true);//to visible app
     a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     a.setBounds(200,50,500,400);
     a.setTitle("nil Ranbow");
    }
}
