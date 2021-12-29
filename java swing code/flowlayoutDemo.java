import javax.swing.*;
import java.awt.*;

public class flowlayoutDemo extends JFrame{
    private Container c;
    private JButton btn[];//button name er array diclear
    private FlowLayout flayout;//diclear flowlayout

    flowlayoutDemo()//constracter
    {
        b();//method
    }

    //above method description
    public void b()
    {
        c=this.getContentPane();
       // flayout=new FlowLayout();//by defalt flowlayout align center hoi.to change use below code

     flayout=new FlowLayout(FlowLayout.LEFT);   //create flowlayout.//by defalt flowlayout align center hoi.BUT 'left'kore dile left e button print hobe
      //  flayout=new FlowLayout(FlowLayout.LEFT,10,15);//horigental gap=10px,vertical gap=15px
        flayout.setHgap(10);
        flayout.setVgap(20); //type2

        c.setLayout(flayout);//set flowlayout as layout
        c.setBackground(Color.ORANGE);
        
        //create btn array
        btn=new JButton[9];
        for (int i=0;i<9;i++){//used loop to make btn
        btn[i]=new JButton(""+(i+1));//btn print hober somoi button er number e print hobe 1 theke
        //by defalt flowlayout align center hoi.
        c.add(btn[i]);//add btn to container
        }
    }
   
public static void main(String[]args)
   {
     flowlayoutDemo a=new flowlayoutDemo();
     a.setVisible(true);//to visible app
     a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     a.setBounds(100,100,350,400);
     a.setTitle("flow layoutDemo");
    }
}
