import javax.swing.*;

class Jframe3 extends JFrame {
    Jframe3(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(50,100,400,500);
        setTitle("this is title");
    }
    public static void main(String[]args)
	{
        Jframe3 frame=new Jframe3();
        frame.setVisible(true);
    }
} 