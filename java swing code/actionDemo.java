import javax.swing.*;
import java.awt.*;

public class actionDemo extends JFrame{
    private Container c;
    private JTextField tf1,tf2;

    actionDemo()//constracter
    {
        b();//method
    }

    //above method description
    public void b()
    {
        c=this.getContentPane();//c =container
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

       tf1=new JTextField();
       tf1.setBounds(50,50,150,50);
       c.add(tf1);

       tf2=new JTextField();
       tf2.setBounds(50,110,150,50);
       c.add(tf2);

       //action listener
       tf1.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent e)
        {
            String s=tf1.getText();
            JOptionPane.showMessageDialog(null, "tf1="+s);
        }

       });
        
    }


    
public static void main(String[]args)
   {
     actionDemo a=new actionDemo();
     a.setVisible(true);//to visible app
     a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     a.setBounds(200,50,500,400);
     a.setTitle("nil Ranbow");
    }
}
