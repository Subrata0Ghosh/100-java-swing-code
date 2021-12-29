import javax.swing.*;
import java.awt.*;
import java.awt.event.*;//action listener

public class toggleBtnDemo extends JFrame implements ActionListener{
    private Container c;
    private JLabel label;
    private JToggleButton tb;

    toggleBtnDemo()//constracter
    {
        b();//method
    }

    //above method description
    public void b()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        tb=new JToggleButton("OFF");
        tb.setBounds(50,50,90,90);
        c.add(tb);

        label=new JLabel("HELLO");
       // label.setText();
        label.setBounds(50,150,150,50);
        label.setVisible(false);//visibility off for 1st time
        c.add(label);

        tb.addActionListener(this);
        
    }
    public void actionPerformed(ActionEvent e){
        if(tb.isSelected()){
            tb.setText("ON");
            label.setVisible(true);
        }
        else{
            tb.setText("OFF");
            label.setVisible(false);
        }
    }

public static void main(String[]args)
   {
     toggleBtnDemo a=new toggleBtnDemo();
     a.setVisible(true);//to visible app
     a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     a.setBounds(200,50,500,400);
     a.setTitle("nil Ranbow");
    }
}
