import javax.swing.*;
import java.awt.*;

public class boxlayoutDemo extends JFrame{
    private Container c;
    private JButton btn1,btn2,btn3,btn4,btn5;
    private BoxLayout bl;

    boxlayoutDemo()//constracter
    {
        b();//method
    }

    //above method description
    public void b()
    {
        c=this.getContentPane();
        c.setBackground(Color.ORANGE);
        //create boxlayout.c=parameter,container
        bl=new BoxLayout(c,BoxLayout.X_AXIS);//use boxlayout
        c.setLayout(bl);

        //create button
        btn1=new JButton("1");
        btn2=new JButton("2");
        btn3=new JButton("3");
        btn4=new JButton("4");
        btn5=new JButton("5");

//add btn to container.to print btn
        c.add(btn1);//C=container
        c.add(btn2);
        //create horigental gap after btn2
        c.add(Box.createHorizontalStrut(10));
        c.add(btn3);
         //create horigental gap after btn3
         c.add(Box.createHorizontalStrut(10));
        c.add(btn4);
        c.add(btn5);

    }
  
public static void main(String[]args)
   {
     boxlayoutDemo a=new boxlayoutDemo();
     a.setVisible(true);//to visible app
     a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     a.setBounds(200,50,500,400);
     a.setTitle("boxlayoutDemo");
    }
}
