import javax.swing.*;
import java.awt.*;
import java.awt.event.*;//actionlistener

public class checkBoxDemo extends JFrame{
    private Container c;
    private JCheckBox checkbox1,checkbox2,checkbox3;//javacheckbox,checkbox,mysqlcheckbox
    private ButtonGroup grp;//button group for jcheckbox
    private Font f;
    private JLabel label;

    checkBoxDemo()//constracter
    {
        b();//method
    }
    //above method description
    public void b()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        grp=new ButtonGroup();//create button group
        f=new Font("Arial",Font.ITALIC+Font.BOLD,18);//create font bold+italic

        //create checkbox1
        checkbox1=new JCheckBox("java");
        checkbox1.setBounds(50,100,100,30);
        //checkbox1.setBackground(Color.pink);
        checkbox1.setFont(f);//set font
        c.add(checkbox1);

        //create checkbox2
       // checkbox2=new JCheckBox("c",true);//select jcheckbox internally by simpley write ",true".type 1
        checkbox2=new JCheckBox("c");
        checkbox2.setBounds(50,130,100,30);
        checkbox2.setBackground(Color.red);//change red to orange
        checkbox2.setFont(f);
       // checkbox2.setSelected(true);//check box selected from the begining= internally.type 2
        c.add(checkbox2);

        //create checkbox3
        checkbox3=new JCheckBox("mysql");
        checkbox3.setBounds(50,160,100,30);
        checkbox3.setBackground(Color.yellow);
        //checkbox3.setFont(f);
        c.add(checkbox3);

//add checkbox to button group.user able to select only one checkbox
        grp.add(checkbox1);
        grp.add(checkbox2);
        grp.add(checkbox3);
  
        //print normal text
        label=new JLabel("you not selcted anything");
        label.setBounds(50,200,300,30);
        label.setFont(f);
        c.add(label);

        //create actionlistener useing class
        Handler handler=new Handler();//create handler

        checkbox1.addActionListener(handler);//adding action listener to checkbox
        checkbox2.addActionListener(handler);
        checkbox3.addActionListener(handler);
    }
    //create actionlistener handler class
   class Handler  implements ActionListener{
      public void actionPerformed(ActionEvent e){//e =obj
        //conditions
        if(checkbox1.isSelected()) //if(e.getSource()==checkbox1)
        {
            label.setText("you selected java");
        }
        else if(checkbox2.isSelected()) //else if(e.getSource()==checkbox2)
        {
            label.setText("you selected c");
        }
        
        else{
            label.setText("you selected mysql");
        }
        
      }
    }


public static void main(String[]args)
   {
     checkBoxDemo a=new checkBoxDemo();
     a.setVisible(true);//to visible app
     a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     a.setBounds(200,100,500,400);
     a.setTitle("check box demo");
    }
}
