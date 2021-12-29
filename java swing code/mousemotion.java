import javax.swing.*;
import java.awt.*;
import java.awt.event.*;//for mouse listener

public class mousemotion extends JFrame{
    private Container c;
    private JTextField tf;
    private JTextArea ta;

   mousemotion()//constracter
    {
        b();//method
    }

    //above method description
    public void b()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        ta=new JTextArea();//create text area
        ta.setBounds(10,20,200,200);
        c.add(ta);

        tf=new JTextField();//create txt field
        tf.setBounds(220,20,150,50);
        c.add(tf);

        //add text area with mousemotion listener
        ta.addMouseMotionListener(new MouseMotionListener(){
            public void mouseDragged(MouseEvent e)//mouse dragged method use
            {
                tf.setText("mouse dragged:\n"+e.getX()+" "+e.getY());// append not work with text area so settext
            }                                           //'getx' is for get mouse 'x' axis location
                                                        //'getY' is for get mouse 'y' axis location
            public void mouseMoved(MouseEvent e)//mouse moved method use
            {
                tf.setText("mouse moved:\n"+e.getX()+" "+e.getY());//'getY' is for get mouse 'y' axis location
            }//'getx' is for get mouse 'x' axis location,'getY' is for get mouse 'y' axis location
            
        });
    }
   
public static void main(String[]args)
   {
     mousemotion a=new mousemotion();
     a.setVisible(true);//to visible app
     a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     a.setBounds(100,100,500,400);
     a.setTitle("mouse motion listener");
    }
}
