import javax.swing.*;//importing all swing package/pkg
import java.awt.*;

public class buttonDemo extends JFrame {
    private Container c;// container is a total page where we can write,create design any thing can do
    private JButton btn1, btn2;
    private Font f;//initialize font
    private Cursor cu;//initialize cursor

    buttonDemo()// constracter
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

 // creating btn1
        btn1 = new JButton("submit");
        btn1.setBounds(100, 50, 100, 50);
        btn1.setFont(f);//use font
        //change font and bg color
        btn1.setForeground(Color.green);
        btn1.setBackground(Color.black);
        //set curser default to hand type
        btn1.setCursor(cu);
        c.add(btn1);

 // creating btn2
        btn2 = new JButton("clear");
        btn2.setBounds(210,50, 100, 50);
        btn2.setFont(f);//use font
        c.add(btn2);

    }

    public static void main(String[] args) {
        buttonDemo a = new buttonDemo();
        a.setVisible(true);// to visible app
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a.setBounds(200, 50, 500, 400);
        a.setTitle("nil Ranbow");
    }
}
