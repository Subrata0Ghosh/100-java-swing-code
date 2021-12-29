import javax.swing.*;
import java.awt.*;

public class spinerDemo extends JFrame{
    private Container c;
    private JSpinner spinner;//inisialize jspinner
   
    spinerDemo()//constracter
    {
        b();//method
    }

    //above method description
    public void b()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);

        SpinnerNumberModel value=new SpinnerNumberModel(10,0,30,1);
//(10=inisial value,min value,max value,1=koto khor kore barbe & kombe)
        
        spinner=new JSpinner(value);//create spinner and pass 'value' in spinner
        spinner.setBounds(100,100,70,50);
        c.add(spinner);
   
    }

public static void main(String[]args)
   {
     spinerDemo a=new spinerDemo();
     a.setVisible(true);//to visible app
     a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     a.setBounds(100,100,450,450);
     a.setTitle("spiner");
    }
}
