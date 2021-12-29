import javax.swing.*;

class try {
	public static void main(String[]args)
	{
       JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// to stop the process
        frame.setBounds(200,50,400,300);
        frame.setTitle("frame demo");  
        frame.setResizable(false);//frame can't be resized      
	}

}