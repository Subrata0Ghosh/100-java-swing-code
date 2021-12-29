import javax.swing.*;
import java.awt.*;
import java.awt.event.*;//action listener

public class slideshowDemo extends JFrame implements ActionListener{
    private Container c;
    private JPanel jp;//inisialize jpanel
    private JButton btn1,btn2;//inisialize btn
    private ImageIcon icon;//for use image
    private JLabel label;
    private CardLayout cl;

    slideshowDemo()//constracter
    {
        b();//method
        showImage();//method
    }

    //class e image nia asha
    public void showImage(){
        String[] name={"logo2.png","logo3.png","logo4.png"};
        for(String n:name){
            icon=new ImageIcon("C:/Users/sukde/OneDrive/Desktop/java swing/"+n);//image location set
            //resizeing image
            Image img=icon.getImage();//img variable e icon ta store korchi
            Image newImage=img.getScaledInstance(jp.getWidth(),jp.getHeight(),Image.SCALE_SMOOTH);//resize jpanel wize
            icon=new ImageIcon(newImage);//convert to icon/pass 'newimage' in to icon  

            label=new JLabel(icon);
            jp.add(label);
        }
       

    }

    //above method description
    public void b()
    {
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);

        cl=new CardLayout();//create cardlayout to set image to card layout

        jp=new JPanel(cl);//create jpanel.and add cardlayout to jpanel
        jp.setBounds(10,10,560,380);
        c.add(jp);
        
        btn1=new JButton("< previous");//create btn1
        btn1.setBounds(10,400,100,50);
        c.add(btn1);

        btn2=new JButton("next >");//create button 2
        btn2.setBounds(470,400,100,50);
        c.add(btn2);

//add btn to action listener
        btn1.addActionListener(this);
        btn2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btn1){//kon btn e user click koreche seta peber jonno
            cl.previous(jp);//previous btn e user click korle previous image show hobe
        }
        if(e.getSource()==btn2){
            cl.next(jp);//next btn e user click korle next image show hobe
        }
        
    }

public static void main(String[]args)
   {
     slideshowDemo a=new slideshowDemo();
     a.setVisible(true);//to visible app
     a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     a.setBounds(100,100,600,500);
     a.setTitle("slideshow");
    }
}
