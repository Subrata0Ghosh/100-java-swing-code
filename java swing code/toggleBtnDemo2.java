import javax.swing.*;
import java.awt.*;
import java.awt.event.*;//action listener

public class toggleBtnDemo2 extends JFrame implements ActionListener{
    private Container c;
    private JLabel label;
    private JToggleButton tb;
    private ImageIcon onicon,officon;

    toggleBtnDemo2()//constracter
    {
        b();//method
    }

    //above method description
    public void b()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        onicon=new ImageIcon("C:/Users/sukde/OneDrive/Desktop/java swing/clear button.png");//image gulo nia asher jonno
        officon=new ImageIcon("C:/Users/sukde/OneDrive/Desktop/java swing/off.png");


        tb=new JToggleButton(officon);//officon ta dekhabe
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
           // tb.setText("ON");
           tb.setIcon(onicon);
            label.setVisible(true);
        }
        else{
            //tb.setText("OFF");
            tb.setIcon(officon);
            label.setVisible(false);
        }
    }

public static void main(String[]args)
   {
     toggleBtnDemo2 a=new toggleBtnDemo2();
     a.setVisible(true);//to visible app
     a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     a.setBounds(200,50,500,400);
     a.setTitle("nil Ranbow");
    }
}
