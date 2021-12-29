import javax.swing.*;
import java.awt.*;

public class gridlayoutDemo extends JFrame{
    private Container c;
    private GridLayout gl;
    private JButton btn1,btn2,btn3,btn4;

    gridlayoutDemo()//constracter
    {
        b();//method
    }

    //above method description
    public void b()
    {
        c=this.getContentPane();
        //c.setLayout(null);
        c.setBackground(Color.ORANGE);
        gl=new GridLayout(2,2,5,5);//create gridLayout.{2=no of row,2=cloum,5=horigental & vertical gap}
        c.setLayout(gl);

        //create btn
        btn1=new JButton("1");
        btn2=new JButton("2");
        btn3=new JButton("3");
        btn4=new JButton("4");

        //add btn to container.to print btn
        c.add(btn1);//C=container
        c.add(btn2);
        c.add(btn3);
        c.add(btn4);
        
    }
   
public static void main(String[]args)
   {
     gridlayoutDemo a=new gridlayoutDemo();
     a.setVisible(true);//to visible app
     a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     a.setBounds(200,50,500,400);
     a.setTitle("nil Ranbow");
    }
}
 