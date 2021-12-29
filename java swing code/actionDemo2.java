import javax.swing.*;
import java.awt.*;
import java.awt.event.*;//ActionEvent;
//import java.awt.event.ActionListener;

public class actionDemo2 extends JFrame {
    private Container c;
    private JTextField tf1, tf2;

    actionDemo2()// constracter
    {
        b();// method
    }

    // above method description
    public void b() {
        c = this.getContentPane();// c =container
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        tf1 = new JTextField();
        tf1.setBounds(50, 50, 150, 50);
        c.add(tf1);

        tf2 = new JTextField();
        tf2.setBounds(50, 110, 150, 50);
        c.add(tf2);

        Handler h = new Handler();
        tf1.addActionListener(h);
        tf2.addActionListener(h);

    }

    class Handler implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == tf1) {
                String s = tf1.getText();// text fild e ki text ache sei text ta "s" e store korlam
                if (s.isEmpty())// textfield empty hoi
                {
                    JOptionPane.showMessageDialog(null, "please enter text");
                } else {
                    JOptionPane.showMessageDialog(null, "tf1=" + s);// s ta print
                }
            } else {
                String s = tf2.getText();// text fild e ki text ache sei text ta "s" e store korlam
                if (s.isEmpty())// textfield empty hoi
                {
                    JOptionPane.showMessageDialog(null, "please enter text");
                } else {
                    JOptionPane.showMessageDialog(null, "tf2=" + s);// s ta print
                }
            }

        }

    }

    public static void main(String[] args) {
        actionDemo2 a = new actionDemo2();
        a.setVisible(true);// to visible app
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a.setBounds(200, 50, 500, 400);
        a.setTitle("nil Ranbow");
    }
}
