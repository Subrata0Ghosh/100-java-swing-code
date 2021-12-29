import javax.swing.*;
import java.awt.*;
import java.awt.event.*;//actionlistener

public class actioncomboBox extends JFrame{
    private Container c;
    private JComboBox cb;//declear combobox
    private String[] proLang={"c","c++","java","php","python"};// taking string to show text in combobox
    private JLabel label;// for pint norml text
    private JButton btn;//intialize button
    

    actioncomboBox()//constracter
    {
        b();//method
    }

    //above method description
    public void b()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        cb=new JComboBox(proLang);//create combobox. and pass string in combobox
        cb.setBounds(50,150,100,50);
        cb.setEditable(true);//to edit combobox
        cb.addItem("FortRun");//add item in combobox
        cb.addItem("basic");//add item
        c.add(cb);

        btn=new JButton("save");//create button
        btn.setBounds(50,250,80,50);
        c.add(btn);

        label=new JLabel("you not selected anything"); //create jlabel for print normal text
        label.setBounds(160,150,200,50);
        c.add(label);
//add button to action listener
        btn.addActionListener(new ActionListener(){// or cb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){//e =obj
            String s=cb.getSelectedItem().toString();//combobox er selected item ta paber jonno 'getselecteditem()'
            //jeta pabo seta 'obj' seta ke string e nite hobe 'tostring()' dia
            label.setText("you have selected:"+s);//use label
            }
        });
    }
   
public static void main(String[]args)
    {
      actioncomboBox a=new actioncomboBox();
      a.setVisible(true);//to visible app
      a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      a.setBounds(100,100,500,500);
      a.setTitle("comboBoxDemo");
     }
 }
    