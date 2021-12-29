import javax.swing.*;
import javax.swing.event.*;//for change listener
import java.awt.*;

public class sliderproject extends JFrame implements ChangeListener{
    private Container c;
    private JLabel redLabel,greenLabel,blueLabel,privewLabel;//threelabel
    private JSlider redSlider,greenSlider,blueSlider;//slider
    private JTextField redtf,greentf,bluetf;
    private JPanel panel;//for color change show in panel

    sliderproject()//constracter
    {
        b();//method
    }

    //above method description
    public void b()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);
//red
        redLabel=new JLabel("red");//show text 'red'
        redLabel.setBounds(50,50,80,50);
        c.add(redLabel);

        redSlider=new JSlider(0,255,0);//add slider after red text
        redSlider.setBounds(90,50,300,50);
        c.add(redSlider);

        redtf=new JTextField();//text field after slider
        redtf.setHorizontalAlignment(JTextField.CENTER);//txt field er center er theke lekha dekhabe
        redtf.setBounds(400,50,80,40);
        c.add(redtf);

 //green
         greenLabel=new JLabel("green");//show text 'red'
        greenLabel.setBounds(50,100,80,50);
        c.add(greenLabel);

        greenSlider=new JSlider(0,255,0);//add slider after red text
        greenSlider.setBounds(90,110,300,50);
        c.add(greenSlider);

        greentf=new JTextField();//text field after slider
        greentf.setHorizontalAlignment(JTextField.CENTER);//txt field er center er theke lekha dekhabe
        greentf.setBounds(400,110,80,40);
        c.add(greentf);       
        
//blue
        blueLabel=new JLabel("blue");//show text 'red'
        blueLabel.setBounds(50,170,80,50);
        c.add(blueLabel);

        blueSlider=new JSlider(0,255,0);//add slider after red text
        blueSlider.setBounds(90,170,300,50);
        c.add(blueSlider);

        bluetf=new JTextField();//text field after slider
        bluetf.setHorizontalAlignment(JTextField.CENTER);//txt field er center er theke lekha dekhabe
        bluetf.setBounds(400,170,80,40);
        c.add(bluetf);    

//panel to show color
        panel=new JPanel();
        panel.setBounds(550,50,200,160);
        c.add(panel);

 //'preview' txt show
        privewLabel=new JLabel("preview");
        privewLabel.setBounds(630,200,100,50);
        c.add(privewLabel);

//add listener to 3 slider
        redSlider.addChangeListener(this); 
        greenSlider.addChangeListener(this);
        blueSlider.addChangeListener(this);       
    }

//use changelistener
    public void stateChanged(ChangeEvent e){
        //show slider value in textfield
        int redvalue=redSlider.getValue();//redslider theke value gulo nebo
        int greenvalue=greenSlider.getValue();
        int bluevalue=blueSlider.getValue();

        //slider value gulo txtfiele s set korbo
        redtf.setText(""+redvalue);
        greentf.setText(""+greenvalue);
        bluetf.setText(""+bluevalue);
    
//create color
        Color color=new Color(redvalue,greenvalue,bluevalue);//can only pass 3 int value in color
        panel.setBackground(color);
    }
    
public static void main(String[]args)
   {
     sliderproject a=new sliderproject();
     a.setVisible(true);//to visible app
     a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     a.setBounds(100,100,800,350);
     a.setTitle("sliderproject");
    }
}
