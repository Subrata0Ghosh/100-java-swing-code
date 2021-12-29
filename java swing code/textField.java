import javax.swing.*;
import java.awt.*;

public class textField extends JFrame{
    private Container c;
    private JTextField tf1,tf2;//to print text
    private Font f;//change font style

    textField()//constracter
    {
        b();//method
    }

    //above method description
    public void b()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        f=new Font("Arial",Font.ITALIC+Font.BOLD,18);//create font

        tf1=new JTextField("hi");//1st text field
        tf1.setBounds(50,50,200,50);
        tf1.setFont(f);//use font as italic and bold 
        tf1.setForeground(Color.ORANGE);// jtextfield er text color change
        tf1.setBackground(Color.BLACK);// jtextfield er backgroung color change
        tf1.setHorizontalAlignment(JTextField.CENTER);//align text in jtextfild
        c.add(tf1);

        tf2=new JTextField();
        tf2.setBounds(50,110,200,50);
        tf2.setText("enter name");
        c.add(tf2);
        

    }
 public static void main(String[]args)
   {
     textField a=new textField();
     a.setVisible(true);//to visible app
     a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     a.setBounds(200,50,500,500);
     a.setTitle("nil Ranbow");
    }
}    

  