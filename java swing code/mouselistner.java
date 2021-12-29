import javax.swing.*;
import java.awt.*;
import java.awt.event.*;//keylistener

public class mouselistner extends JFrame{
    private Container c;
    private JTextField tf;
    private JTextArea ta;
    private JScrollPane scroll;//for scroll

    mouselistner()//constracter
    {
        b();//method
    }

    //above method description
    public void b()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        tf=new JTextField();
        tf.setBounds(20,20,150,50);
        c.add(tf);

        ta=new JTextArea();
        //ta.setBounds(10,80,300,300);//scroll er location dila er ekhane dite hobe na
        //c.add(ta);//eter o dorker nei
        scroll=new JScrollPane(ta);//create scroll and add scroll to text area
        scroll.setBounds(10,80,300,300);//scroll location
        c.add(scroll);//print text area with scroll


        tf.addMouseListener(new MouseListener(){//mouselistener
            public void mouseClicked(MouseEvent e)//mouseTyped
            {
                ta.append("mouse clicked:\n");
            }
            public void mousePressed(MouseEvent e)//mousePressed
            {
                ta.append("mouse pressed:\n");
            }
            public void mouseReleased(MouseEvent e)//mouseReleased
            {
                ta.append("mouse released:\n");
            }
            public void mouseEntered(MouseEvent e)//mouseentered
            {
                ta.append("mouse entered:\n");
            }
            public void mouseExited(MouseEvent e)//mouseexited
            {
                ta.append("mouse exited:\n");
            }
        
        });
    }
 
public static void main(String[]args)
   {
     mouselistner a=new mouselistner();
     a.setVisible(true);//to visible app
     a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     a.setBounds(100,100,500,500);
     a.setTitle("mouse listener");
    }
} 