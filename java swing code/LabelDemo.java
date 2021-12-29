import javax.swing.*;
import java.awt.*;

public class LabelDemo extends JFrame{
    private ImageIcon icon;
    private Container c;//container er moddhe jframe ta rehke debo c er sathe ja ja chi add korte perbo
    private JLabel userLabel,passLabel;//userLabel or any name can take
    private Font f;

    LabelDemo()//constracter
    {
        initComponents();//method
    }
    //above method description
    public void initComponents()
    {
        c=this.getContentPane();//content pane ta c er moddhe rakhlam
        c.setLayout(null);
        c.setBackground(Color.PINK);

        f=new Font("Arial",Font.BOLD,14);//creating font 14=font size

        userLabel=new JLabel();//7 no line
        userLabel.setText("enter your user name:");
        userLabel.setBounds(50,20,200,50);
        userLabel.setFont(f);// set font
        userLabel.setForeground(Color.RED);//font color change
        userLabel.setOpaque(true);//used to enabel background color 
        userLabel.setBackground(Color.yellow);//changing background color
        c.add (userLabel);//used to print userlabel

        passLabel=new JLabel("enter your password:");//7 multiple j label
        passLabel.setBounds(50,70,200,50);
        passLabel.setFont(f);//set font
        c.add(passLabel);

        


        icon=new ImageIcon(getClass().getResource("favicon-32x32.png")); //imageIcon icon=new imageIcon
       this.setIconImage(icon.getImage());
    }


public static void main(String[]args)
   {
     LabelDemo a=new LabelDemo();
     a.setVisible(true);//to visible app
     a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     a.setBounds(200,50,500,400);
     a.setTitle("nil Ranbow");
    }


}