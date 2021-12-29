import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class cardlayoutDemo extends JFrame implements ActionListener{
    private Container c;
    private CardLayout cl;
    private JButton btn1,btn2,btn3,btn4;

    cardlayoutDemo()//constracter
    {
        b();//method
    }

    //above method description
    public void b()
    {
        c=this.getContentPane();
        //c.setLayout(null);
        c.setBackground(Color.ORANGE);
        cl=new CardLayout();//create card layout
        c.setLayout(cl);
        
         //create btn3
         btn1=new JButton("1");
         btn2=new JButton("2");
         btn3=new JButton("3");
         btn4=new JButton("4");
 
         //add btn to container.to print btn
         c.add(btn1,"1st");//C=container
         c.add(btn2,"2nd");
         c.add(btn3,"3rd");
         c.add(btn4,"4th");
         cl.show(c, "3rd");//show 3rd button 1st

         //add action listener to button .
         btn1.addActionListener(this);
         btn2.addActionListener(this);
         btn3.addActionListener(this);
         btn4.addActionListener(this);
         
         }
         public void actionPerformed(ActionEvent e){//cardlayout er moddhe button gulo akterpor akta show korbe.
          // cl.next(c); //1>2>3...btn show
            //cl.previous(c); //1>4>3>2..
            //cl.show(c, "2nd");//2rd button set to show after button 1
        //  cl.first(c);//card layout e 1st je buuton ta container er shathe add hoeche seta dhakhabe
          cl.last(c);//card layout e last e je buuton ta container er shathe add hoeche seta dhakhabe
    }


    
public static void main(String[]args)
   {
     cardlayoutDemo a=new cardlayoutDemo();
     a.setVisible(true);//to visible app
     a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     a.setBounds(100,100,300,300);
     a.setTitle("nil Ranbow");
    }
}
