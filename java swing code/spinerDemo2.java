import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;//for change listener

public class spinerDemo2 extends JFrame implements ChangeListener{
    private Container c;
    private JSpinner spinner;//inisialize jspinner
    private JLabel label;
   
    spinerDemo2()//constracter
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

        label=new JLabel();
        label.setBounds(100,200,150,50);
        c.add(label);

        spinner.addChangeListener(this);//add listener to spinner
    }

//after adding changelistener to spinner the work by listener descripsion here
    public void stateChanged(ChangeEvent e){

       String num= spinner.getValue().toString();//get spinner value as obj and transfer value to string.next,store spinner value in num
        int val=Integer.parseInt(num);//string num convert to int,store in val.
        label.setText("Current value:"+val);//print current value

    }


public static void main(String[]args)
   {
     spinerDemo2 a=new spinerDemo2();
     a.setVisible(true);//to visible app
     a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     a.setBounds(100,100,450,450);
     a.setTitle("spiner");
    }
}
