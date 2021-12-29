import javax.swing.*;
import java.awt.*;

public class tabbedpaneDemo extends JFrame{
    private Container c;
    private JTabbedPane tp;
    private JPanel panel1,panel2,panel3;
    private JLabel label1,label2,label3;

    tabbedpaneDemo()//constracter
    {
        b();//method
    }

    //above method description
    public void b()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);
        
        tp=new JTabbedPane();//create tabbedpane
        tp.setBounds(50,50,300,300);
        c.add(tp);

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
        tp.addTab("home",panel1);
        tp.addTab("help",panel2);
        tp.addTab("edit",panel3);
    }
  
public static void main(String[]args)
   {
     tabbedpaneDemo a=new tabbedpaneDemo();
     a.setVisible(true);//to visible app
     a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     a.setBounds(100,100,450,450);
     a.setTitle("tabbedpaneDemo");
    }
}
