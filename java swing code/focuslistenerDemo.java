import javax.swing.*;
import java.awt.*;
import java.awt.event.*;//for  listener

public class focuslistenerDemo extends JFrame{
    private Container c;
    private JTextArea ta;
    private JButton btn;

    focuslistenerDemo()//constracter
    {
        b();//method
    }

    //above method description
    public void b()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        ta=new JTextArea();//create text area
        ta.setBounds(100,30,200,200);
        c.add(ta);

       btn=new JButton("button");//create button
       btn.setBounds(10,50,80,50) ;
       c.add(btn);

        btn.addFocusListener(new FocusListener(){//add btn with focus listener
            public void focusGained(FocusEvent e)//focusGained
            {
                ta.append("focus gained:\n");//can use settext
            }
            public void focusLost(FocusEvent e)// focusLost
            {
                ta.append("focus lost:\n");
                
            }
            
        });
    }
   
public static void main(String[]args)
   {
     focuslistenerDemo a=new focuslistenerDemo();
     a.setVisible(true);//to visible app
     a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     a.setBounds(100,100,500,400);
     a.setTitle("focus listener Demo");
    }
}
