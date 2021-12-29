//newFrame.java file not working properly so made it
import javax.swing.*;
import java.awt.*;

public class NewFrame1 extends JFrame{
    private Container c;
    private JLabel label;

    NewFrame1()
    {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setBounds(420,50,400,400);
        this.setTitle("new frame");
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        label=new JLabel("hallow everyone welcome to new frame");
        label.setBounds(50,50,250,50);
        c.add(label);
    }

public static void main(String[]args)
   {
     NewFrame1 a=new NewFrame1();
     a.setVisible(true);//to visible app
   }
}