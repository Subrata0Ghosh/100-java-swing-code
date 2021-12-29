import javax.swing.*;
import java.awt.*;

public class comboBoxDemo extends JFrame{
    private Container c;
    private JComboBox cb;//declear combobox
    private String[] proLang={"c","c++","java","php","python"};// taking string to show text in combobox
    

    comboBoxDemo()//constracter
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
        //cb.setSelectedIndex(4);// itembox er 4 no index "python" option ta show korbe from the bigining
        cb.setSelectedItem("java");//java item ta select kora thakhbe jcombobox e
        cb.addItem("FortRun");//add item in combobox
        cb.addItem("basic");//add item
        cb.removeItem("FortRun");//remove item in combobox
        cb.removeItemAt(1);//c++ remove from list useing index number
        cb.removeAllItems();//all item removed from list
        c.add(cb);
        
        System.out.println("total item in combobox="+cb.getItemCount());//count item in combobox

    }


    
public static void main(String[]args)
   {
     comboBoxDemo a=new comboBoxDemo();
     a.setVisible(true);//to visible app
     a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     a.setBounds(100,100,500,500);
     a.setTitle("comboBoxDemo");
    }
}
