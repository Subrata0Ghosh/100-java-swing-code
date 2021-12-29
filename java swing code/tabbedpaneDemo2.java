import javax.swing.*;
import java.awt.*;

public class tabbedpaneDemo2 extends JFrame{
    private Container c;
    private JTabbedPane tp;
    private JPanel panel1,panel2,panel3;
    private JLabel label1,label2,label3;
    private ImageIcon icon1,icon2;//to add icon 

    tabbedpaneDemo2()//constracter
    {
        b();//method
    }

    //above method description
    public void b()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);
        
        tp=new JTabbedPane();//create tabbedpane.show tabbedpane in top

        //tp=new JTabbedPane(JTabbedPane.BOTTOM);//create tabbedpane.show tabbedpane in bottom
        tp.setTabPlacement(JTabbedPane.LEFT);//show tabbedpane in bottom
        tp.setBounds(50,50,300,300);
        c.add(tp);

        //create and get home icon .import image icon from folder
        icon1=new ImageIcon("C:/Users/sukde/OneDrive/Desktop/java swing/favicon-32x32.png");
        icon2=new ImageIcon("C:/Users/sukde/OneDrive/Desktop/java swing/favicon-32x32.png");

        //create label
        label1=new JLabel("this is label 1");
        label2=new JLabel("this is label 2");
        label3=new JLabel("this is label 3");

        //create jpanel and add bg color and add label
        panel1=new JPanel();
        panel1.add(label1);
        panel1.setBackground(Color.pink);//bg for panel1

        panel2=new JPanel();
        panel2.add(label2);
        panel2.setBackground(Color.orange);

        panel3=new JPanel();
        panel3.setBackground(Color.green);
        panel3.add(label3);

        //add panel to tabbedpane
        tp.addTab("home",icon1,panel1,"hello,panel1 tab");//add icon,tooltiptext to tabbed pane
        tp.addTab("help",icon2,panel2,"help");
        tp.addTab("edit",panel3);
    }
  
public static void main(String[]args)
   {
     tabbedpaneDemo2 a=new tabbedpaneDemo2();
     a.setVisible(true);//to visible app
     a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     a.setBounds(100,100,450,450);
     a.setTitle("tabbedpaneDemo");
    }
}
