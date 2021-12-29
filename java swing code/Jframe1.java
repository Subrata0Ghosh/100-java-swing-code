import javax.swing.*;

class Jframe1 {
	public static void main(String[]args)
	{
       JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// to stop the process
       // frame.setSize(400,300);
       // frame.setLocation(200,50);
        //frame.setLocationRelativeTo(null);
        frame.setBounds(200,50,400,300);//setlocation & setsize combine method
	            //left,toplocation,framewidth,hight
        
        frame.setTitle("frame demo");  
        frame.setResizable(false);//frame can't be resized      
	}

}