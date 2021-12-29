import javax.swing.*;//importing all swing package/pkg
import java.awt.*;

public class buttonImage extends JFrame {
    private Container c;// container is a total page where we can write,create design any thing can do
    private JButton btn1, btn2;
    private Font f;//initialize font
    private Cursor cu;//initialize cursor
    private ImageIcon img1,img2;// inicialize/create obj of jbutton image

    buttonImage()// constracter
    {
        b();// method
    }

    // above method description
    public void b() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);
//creating font        
        f=new Font("Arial",Font.BOLD,20);
//creating cursor
        cu=new Cursor(Cursor.HAND_CURSOR);
//create image
        img1=new ImageIcon(getClass().getResource("login button.png"));        
        img2=new ImageIcon(getClass().getResource("clear button.png"));

 // creating btn1
        btn1 = new JButton(img1);
        btn1.setBounds(100, 50, 100, 50);
        btn1.setFont(f);//use font
        
        //set curser default to hand type
        btn1.setCursor(cu);
        c.add(btn1);

 // creating btn2
        btn2 = new JButton(img2);
        btn2.setBounds(210,50, 500, 196);
        btn2.setFont(f);//use font
        c.add(btn2);

    }

    public static void main(String[] args) {
        buttonImage a = new buttonImage();
        a.setVisible(true);// to visible app
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a.setBounds(200, 50, 500, 400);
        a.setTitle("nil Ranbow");
    }
}
