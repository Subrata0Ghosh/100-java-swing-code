import javax.swing.*;
import javax.swing.plaf.basic.BasicComboBoxUI.ComboBoxLayoutManager;

import java.awt.*;

public class borderlayoutDemo extends JFrame{
    private Container c;
    private JButton btn1,btn2,btn3,btn4,btn5;
    private BorderLayout blayout;//declear border layout

    borderlayoutDemo()//constracter
    {
        b();//method
    }

    //above method description
    public void b()
    {
        c=this.getContentPane();
       //border layout use korchi thi setlayout null hobena

    //  blayout=new BorderLayout();  //create border layout//default constracter
        blayout=new BorderLayout(10,20);//20=VERTICAL AND 10=HORIZENTAL GAP .type3
       /* blayout.setHgap(10);
        blayout.setVgap(20);*/ //type2
        c.setLayout(blayout);//border layout use korchi thi setlayout 'null' hobena
        
        //create button
        btn1=new JButton("1");
        btn2=new JButton("2");
        btn3=new JButton("3");
        btn4=new JButton("4");
        btn5=new JButton("5");

        //btn1 ta borderlayout er north e add korchi
        c.add(btn1,BorderLayout.NORTH);//C=container
        //btn2 ta borderlayout er WEST e add korchi
        c.add(btn2,BorderLayout.WEST);
        c.add(btn3,BorderLayout.CENTER);
        c.add(btn4,BorderLayout.EAST);
        c.add(btn5,BorderLayout.SOUTH);
        
    }


    
public static void main(String[]args)
   {
     borderlayoutDemo a=new borderlayoutDemo();
     a.setVisible(true);//to visible app
     a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     a.setBounds(100,100,500,500);
     a.setTitle("border layout Demo");
    }
}
