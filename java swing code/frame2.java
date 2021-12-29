import javax.swing.*;

class frame2 extends JFrame {
	public static void main(String[]args)
	{
        frame2 frame=new frame2();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(50,100,400,500);
        frame.setTitle("this is title");
    }
}    