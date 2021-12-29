import javax.swing.*;

class Jframe2 extends JFrame {
	public static void main(String[]args)
	{
        Jframe2 frame=new Jframe2();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(50,100,400,500);
        frame.setTitle("this is title");
    }
}    