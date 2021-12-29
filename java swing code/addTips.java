import javax.swing.*;
import java.awt.*;

public class addTips extends JFrame{
    private Container c;
    private JLabel userLabel,passLabel;
   

    addTips()//constracter
    {
        b();//method
    }

    //above method description
    public void b()
    {
        c=this.getContentPane();
        c.setLayout(null);

        userLabel=new JLabel();
        userLabel.setText("enter your user name:");
        userLabel.setBounds(50,20,200,50);

        userLabel.setToolTipText("enter name");//adding tips
        c.add(userLabel);

        String s=userLabel.getToolTipText();
        System.out.println(" "+s);

        System.out.println(" "+userLabel.getText());//tips ta kon text er sathe add hoeche janer jonno
        
    }


    
public static void main(String[]args)
   {
     addTips a=new addTips();
     a.setVisible(true);//to visible app
     a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     a.setBounds(200,50,500,400);
     a.setTitle("nil Ranbow");
    }
}