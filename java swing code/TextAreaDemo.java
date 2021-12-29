import javax.swing.*;
import java.awt.*;

public class TextAreaDemo extends JFrame{
    private Container c;
    private JTextArea ta;
    private Font f;
    private JScrollPane sp;

    TextAreaDemo()//constracter
    {
        b();//method
    }
    //above method description
    public void b()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        f=new Font("Arial",Font.BOLD,18);//create font

        ta=new JTextArea("hi");//create text area
       // ta.setBounds(50,50,300,200);
        ta.setFont(f);//use font
        //ta.setForeground(Color.yellow);//for change font and bg color
        //ta.setBackground(Color.pink);
        //ta.setLineWrap(true);//line wise wrap 
        //ta.setWrapStyleWord(true);//text wise wrap
       // c.add(ta);

       // sp=new JScrollPane(ta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);//scroll pane create AND SHOW ALWAYS
        sp=new JScrollPane(ta,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        //show scrollbae ass needed
        sp.setBounds(50,50,300,200);
        c.add(sp);
        
    } 
public static void main(String[]args)
   {
     TextAreaDemo a=new TextAreaDemo();
     a.setVisible(true);//to visible app
     a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     a.setBounds(200,50,500,400);
     a.setTitle("jtextarea");
    }
}
