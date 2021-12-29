import javax.swing.*;
import javax.swing.ImageIcon;

class JframeIcon extends JFrame {
   private ImageIcon icon; 


    JframeIcon()
    {
        initComponents();//method can be anything a();
    }
    public void initComponents();
    {
       icon=new ImageIcon(getClass().getResource("favicon-32x32.png")); //imageIcon icon=new imageIcon
       this.setIconImage(icon.getImage());
    }

	public static void main(String[]args)
	{
        JframeIcon frame=new JframeIcon();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(50,100,400,500);
        frame.setTitle("this is title");
    }
}    