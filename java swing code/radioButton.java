import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class radioButton extends JFrame{
    private Container c;//to change bg color
    private JRadioButton m,f;//m,f is variable of jradiobutton
    private ButtonGroup grp;//create buttongroup variable 
    private Font font;//create font
    private JTextArea ta;//for text area

    radioButton()//constracter
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
        font=new Font("Arial",Font.BOLD,18);//create font

        m=new JRadioButton("male");//create radio button
        m.setBounds(50,50,100,50);
        m.setBackground(Color.orange);//set bg color
        m.setFont(font);//set font
       // m.setSelected(true);// selected from the begining in radiobutton
        c.add(m);

        f=new JRadioButton("female");// create radio button
        f.setBounds(160,50,100,50);
       // f.setEnabled(false);//can't abale to select this radio option
        c.add(f);

        grp.add(m);//use button group
        grp.add(f);

        
        //for create text area
        ta=new JTextArea();
        ta.setBounds(20,110,300,200);
        ta.setFont(font);
        c.add(ta);

//add action listener in jradiobutton
        Handler handler=new Handler();
        m.addActionListener(handler);
        f.addActionListener(handler);
    }
    class Handler implements ActionListener{ //add action listener in jradiobutton
        public void actionPerformed(ActionEvent e){
            //if(e.getSource()==m)
            if(m.isSelected())
            {
                //ta.setText("you selected male");// akh line ei change kore kore print hobe porpor print korar jonno append used in below
                ta.append("you selected male\n");// \n for new line
            }
            else{
               // ta.setText("you selected fmale");
               ta.append("you selected female\n");
            }
        }
    }
  
public static void main(String[]args)
   {
     radioButton a=new radioButton();
     a.setVisible(true);//to visible app
     a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     a.setBounds(200,50,500,400);
     a.setTitle("radio button");
    }
}
