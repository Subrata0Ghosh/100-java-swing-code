import javax.swing.*;
import java.awt.*;

public class sliderDemo extends JFrame{
    private Container c;
    private JSlider slider;
    
    sliderDemo()//constracter
    {
        b();//method
    }

    //above method description
    public void b()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        slider=new JSlider(0,20,5);//create slider(minvalue,maxvalue,nove ta kon value te thakbe).bydefault horigental slider
       // slider=new JSlider(JSlider.VERTICAL,0,20,5);//slider for vertical
        slider.setBounds(100,50,300,50);
        slider.setMajorTickSpacing(5);//tickmark betwween the number.big tick
        slider.setMinorTickSpacing(1);//small tick
        slider.setPaintTicks(true);//ticksspace visible korar jonno
        slider.setPaintLabels(true);//number gulo show korar jonno
        c.add(slider);
        
    }
    
public static void main(String[]args)
   {
     sliderDemo a=new sliderDemo();
     a.setVisible(true);//to visible app
     a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     a.setBounds(100,100,600,300);
     a.setTitle("jsliderDemo");
    }
}
