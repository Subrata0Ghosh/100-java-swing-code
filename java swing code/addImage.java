import javax.swing.*;
import java.awt.*;

public class addImage extends JFrame{
    private Container c;
    private JLabel imageLabel,userLabel;
    private ImageIcon img;

    addImage()//constracter
    {
        b();//method
    }

    //above method description
    public void b()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);//bg color

        img=new ImageIcon(getClass().getResource("new image.png"));
        imageLabel=new JLabel(img);
        imageLabel.setBounds(50,30,img.getIconWidth(),img.getIconHeight());//unknown image width,hight total naber jonno
        c.add(imageLabel);

       /* userLabel=new JLabel();
        userLabel.setText("enter your user name:");
        userLabel.setBounds(80,20,200,500);
        c.add(userLabel);*/
    }


    
public static void main(String[]args)
   {
     addImage a=new addImage();
     a.setVisible(true);//to visible app
     a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     a.setBounds(200,50,500,500);
     a.setTitle("nil Ranbow");
    }
}
