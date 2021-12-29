import javax.swing.*;

class Tryjfram {
    private ImageIcon icon;

    public void JFrame()
    {
       icon=new ImageIcon(getClass().getResource("favicon-32x32.png")); //imageIcon icon=new imageIcon
       frame.setIconImage(icon.getImage());
    }



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