import javax.swing.*;
import java.awt.*;
//import javax.swing.ImageIcon;
//import java.awt.Container;

public class JframeIcon extends JFrame {
   private ImageIcon icon; //to use image anywere
   private Container c; 

    JframeIcon()
    {
        initComponents();//method can be anything a();
    }

    public void initComponents()
    {
        c=this.getContentPane();//c er moddhe contentpane chole echeche
        c.setBackground(Color.red);//c er background change kora hoeche

       icon=new ImageIcon(getClass().getResource("favicon-32x32.png")); //imageIcon icon=new imageIcon
       this.setIconImage(icon.getImage());
    }

	public static void main(String[]args)
	{
        JframeIcon frame=new JframeIcon();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(50,100,400,500);
        frame.setTitle("Nil Ranbow");
       // frame.getContentPane().setBackground(Color.yellow);//chance background

        
    }
}    