import javax.swing.*;
import java.awt.*;
import java.awt.event.*;//for action listener

public class colorchooserDemo extends JFrame{
    private Container c;
    private JButton bt;

    colorchooserDemo()//constracter
    {
        b();//method
    }

    //above method description
    public void b()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        bt=new JButton("Coose a color");//create btn
        bt.setBounds(100,50,150,50);
        c.add(bt);

        //add action listener to btn
        bt.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){                     //color.red ->hocche initial color in jcolorchooser.
                Color color=JColorChooser.showDialog(null,"select a color",Color.red);//coose color by jcolorchooser
                //showdialog->(null=colorchooser ta screen er center e dhakhabe,colorchooser e hading set,initial color)
                c.setBackground(color);//set color to background
               // bt.setBackground(color);//btn er bg change korar jinno
            }
        });
    }
   
public static void main(String[]args)
   {
     colorchooserDemo a=new colorchooserDemo();
     a.setVisible(true);//to visible app
     a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     a.setBounds(200,100,500,400);
     a.setTitle("colorchooserDemo");
    }
}
