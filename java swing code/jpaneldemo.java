import javax.swing.*;
import java.awt.*;

public class jpaneldemo extends JFrame{
    private Container c;
    private JPanel panel1,panel2;//declear panel
    private JButton btn1,btn2,btn3;
    private JLabel label1;
    jpaneldemo()//constracter
    {
        b();//method
    }

    //above method description
    public void b()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        //create Jlabel to print text/btn anything in jframe
        label1=new JLabel("creation 2 jpanel");
        label1.setBounds(50,20,200,50);
        c.add(label1);

        //create button
        btn1=new JButton("1");
        btn2=new JButton("2");
        btn3=new JButton("3");

        //create panel
        panel1=new JPanel();
        panel1.setBounds(100,100,250,300);
        c.add(panel1);

        //create pane2
        panel2=new JPanel();
        panel2.setBounds(355,100,250,300);
        c.add(panel2);
        
        //add btn to panel
        panel1.add(btn1);
        panel2.add(btn2);
        panel1.add(btn3);
    }


    
public static void main(String[]args)
   {
     jpaneldemo a=new jpaneldemo();
     a.setVisible(true);//to visible app
     a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     a.setBounds(100,100,670,500);
     a.setTitle("jpanel");
    }
}
