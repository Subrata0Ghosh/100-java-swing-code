import javax.swing.*;
import java.awt.*;

public class addImagetext extends JFrame{
    private Container c;
    private JLabel imageLabel;
    private ImageIcon img;

    addImagetext()//constracter
    {
        b();//method
    }

    //above method description
    public void b()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.orange);//bg color

        img=new ImageIcon(getClass().getResource("favicon-32x32.png"));
        imageLabel=new JLabel("NilRanbow",img,JLabel.RIGHT);
        imageLabel.setBounds(50,50,250,50);//LABEL location and size
        c.add(imageLabel);

       
    }


    
public static void main(String[]args)
   {
     addImagetext a=new addImagetext();
     a.setVisible(true);//to visible app
     a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     a.setBounds(200,50,500,500);
     a.setTitle("nil Ranbow");
    }
}
