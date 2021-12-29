import javax.swing.*;
import java.awt.*;
import java.awt.event.*;//keylistener

public class keylistner1 extends JFrame{
    private Container c;
    private JTextField tf;
    private JTextArea ta;

    keylistner1()//constracter
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
        tf.setBounds(50,50,150,50);
        c.add(tf);

        ta=new JTextArea();
        ta.setBounds(10,110,300,300);
        c.add(ta);

        tf.addKeyListener(new KeyListener(){//keylistener
            public void keyTyped(KeyEvent e)//keyTyped
            {
                ta.append("keytyped:"+e.getKeyChar()+"\n");
            }
            public void keyPressed(KeyEvent e)//keyPressed
            {
                ta.append("keypressed:"+e.getKeyChar()+"\n");
            }
            public void keyReleased(KeyEvent e)//keyReleased
            {
                ta.append("keyreleased:"+e.getKeyChar()+"\n");
            }
        });
    }
 
public static void main(String[]args)
   {
     keylistner1 a=new keylistner1();
     a.setVisible(true);//to visible app
     a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     a.setBounds(100,50,500,500);
     a.setTitle("keylistner");
    }
}
