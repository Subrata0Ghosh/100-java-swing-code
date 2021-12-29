import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class buttonAction extends JFrame{
    private Container c;
    private JTextField tf;// for show text
    private JButton bt;
    

    buttonAction()//constracter
    {
        b();//method
    }

    //above method description
    public void b()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);
        
        tf=new JTextField();//create jtext field
        tf.setBounds(50,50,150,50);//text field size
        c.add(tf);//add to container

        bt=new JButton("clear");//create button
        bt.setBounds(50,110,80,50);//button size
        c.add(bt);//add to container

//describe the action in action listener 
        bt.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {//work of actionlistener
                tf.setText(" ");//text field er text ta empty korbo jokhon click the button
            }
        });
  
    }
   
public static void main(String[]args)
   {
     buttonAction a=new buttonAction();
     a.setVisible(true);//to visible app
     a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     a.setBounds(200,50,500,400);
     a.setTitle("jbutton action listener");
    }
}
