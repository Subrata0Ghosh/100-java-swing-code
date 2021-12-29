import javax.swing.*;
import java.awt.*;
import java.awt.event.*;//for  listener

public class windowlistenerDemo extends JFrame{
    private Container c;

    windowlistenerDemo()//constracter
    {
        b();//method
    }

    //above method description
    public void b()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

     
        this.addWindowListener(new WindowListener(){//add frame to window listener
            public void windowOpened(WindowEvent e)//
            {
                System.out.println("window Opened");
            }
            public void windowClosing(WindowEvent e)
            {
                System.out.println("window Closing");
            }
            public void windowClosed(WindowEvent e)
            {
                System.out.println("windowClosed");
            }
            public void windowIconified(WindowEvent e)
            {
                System.out.println("window Iconified");
            }
            public void windowDeiconified(WindowEvent e)
            {
                System.out.println("window Deicinified");
            }
            public void windowActivated(WindowEvent e) 
            {
                System.out.println("window Activated");
            }
            public void windowDeactivated(WindowEvent e)// 
            {
                System.out.println("window dectivated");
            }
        });
    }
   
public static void main(String[]args)
   {
     windowlistenerDemo a=new windowlistenerDemo();
     a.setVisible(true);//to visible app
     a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     a.setBounds(100,100,500,500);
     a.setTitle("window listener Demo");
    }
}
