import javax.swing.*;
import java.awt.*;

public class jtableDemo extends JFrame{
    private Container c;
    private JLabel label;
    private Font font;
    private JTable table;//initialize table
    private JScrollPane scroll;

    private String[] cols={"id","name","cgpa"};//inisialize string type data for coloum
    private String[][] rows={//2d array for row

            {"101","anishul","3094"},
            {"102","anis","3095"},
            {"103","shul","3096"},
            {"104","ishul","3097"},

            {"101","anishul","3094"},
            {"102","anis","3095"},
            {"103","shul","3096"},
            {"104","ishul","3097"},

            {"101","anishul","3094"},
            {"102","anis","3095"},
            {"103","shul","3096"},
            {"104","ishul","3097"},


    };

    jtableDemo()//constracter
    {
        b();//method
    }

    //above method description
    public void b()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        font=new Font("Arial",Font.BOLD,22);//create font

        label=new JLabel();
        label.setText("Student Details");
        label.setBounds(250,20,200,50);
        label.setFont(font);//set font
        c.add(label);
        
        //create table
        table=new JTable(rows,cols);
        table.setSelectionBackground(Color.pink);
       // table.setEnabled(false);//table edit jate na kora jei

        scroll=new JScrollPane(table);
        scroll.setBounds(30,80,600,150);
        c.add(scroll);
    }
   
public static void main(String[]args)
   {
     jtableDemo a=new jtableDemo();
     a.setVisible(true);//to visible app
     a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     a.setBounds(100,100,750,450);
     a.setTitle("jtableDemo");
    }
}
