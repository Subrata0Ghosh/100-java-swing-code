import javax.swing.*;
import java.awt.*;
import java.awt.event.*;//for action listener

public class loginFrame extends JFrame {
    private JLabel userLabel, passLabel;
    private JTextField tf;
    private JPasswordField pf;
    private JButton loginButton, clearButton;
    private Container c;
    private Font f;

    loginFrame()// constracter
    {
        b();// method
    }

    public void b()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.orange);

        f=new Font("Arial",Font.BOLD,18);//create font

        userLabel=new JLabel("Username:");//print normal text
        userLabel.setBounds(50,50,150,50);
        userLabel.setFont(f);//add/set font
        c.add(userLabel);

        tf=new JTextField(); //create textfield
        tf.setBounds(170,50,200,50);//textfield location
        tf.setFont(f);//set font of textfield
        c.add(tf);

        passLabel=new JLabel("Password:");//print normal text
        passLabel.setBounds(50,120,150,50);
        passLabel.setFont(f);//add/set font
        c.add(passLabel);

        pf=new JPasswordField();//create password field for password
        pf.setBounds(170,120,200,50);
        pf.setEchoChar('*');//show star as input in password field
        pf.setFont(f);
        c.add(pf);

        loginButton=new JButton("login");//login button
        loginButton.setBounds(170,190,90,50);
        loginButton.setFont(f);
        c.add(loginButton);

        clearButton=new JButton("clear");//clear button
        clearButton.setBounds(280,190,90,50);
        clearButton.setFont(f);
        c.add(clearButton);

   //describe the action in action listener in clearbutton
   clearButton.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e)
    {//work of actionlistener
        tf.setText("");//text field/username er text ta empty korbo jokhon click the button
        pf.setText("");//password field er text ta empty korbo jokhon click the button
    }
});   

//describe the action in action listener in loginbutton
loginButton.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e)
    {//work of actionlistener
        String userName=tf.getText();//text field er theke inputed text ta nabe and store korbe userName e
        String password=pf.getText();//text field er theke inputed password ta nabe and store korbe password e

        if(userName.equals("asis") && password.equals("123"))// username,password chack korbe
        {
            JOptionPane.showMessageDialog(null, "login successfull");
            
            //dialogbox er ok click korar pore NewFrame1.java open hobe
            NewFrame1 frame=new NewFrame1();//create object to go to new frame of newFrame.java
            frame.setVisible(true);//frame visibel korar jonno
            //dispose();//newFrame1.java open hober pore loginFrame ta dispose hobe

        }
          else
        {
            JOptionPane.showMessageDialog(null, "username or password invalid");
        }
    }
});

}
    public static void main(String[] args) {
        loginFrame a = new loginFrame();
        a.setVisible(true);// to visible app
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a.setBounds(200, 50, 500, 400);
        a.setTitle("login");
    }

}
