import javax.swing.*;
import java.awt.*;
import java.awt.event.*;//actionlistener

public class listenertype3 extends JFrame implements ActionListener{//1st impliment listener
    private Container c;
    private JButton button1,button2,button3;//inisilize button
    
    listenertype3()//constracter
    {
        b();//method
    }

    //above method description
    public void b()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        //create and edit button
        button1=new JButton("red");
        button1.setBounds(50,50,100,50);
        c.add(button1);

        button2=new JButton("green");
        button2.setBounds(50,110,100,50);
        c.add(button2);
        
        button3=new JButton("blue");
        button3.setBounds(50,170,100,50);
        c.add(button3);

        //add actionlistener to button 3rd process
        button1.addActionListener(this);//this= paramiter
        button2.addActionListener(this);
        button3.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e){//2nd override methods.button click korle 1st e er moddhe ashbe
        //idendify 1st which button is clicked
        if(e.getSource()==button1)//button1 clik korle action ki hobe
        {
            c.setBackground(Color.RED);//jframe bg color red hobe
            //button1.setBackground(Color.RED);//button bg color red hobe
        }
        else if(e.getSource()==button2)//button2 click korle action ki hobe
        {
            c.setBackground(Color.GREEN);
        }
        else if(e.getSource()==button3)//button3 clik korle action ki hobe
        {
            c.setBackground(Color.BLUE);
        }
    }
    
public static void main(String[]args)
   {
     listenertype3 a=new listenertype3();
     a.setVisible(true);//to visible app
     a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     a.setBounds(100,100,600,500);
     a.setTitle("Action listener type 3");
    }
}
