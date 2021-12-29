import javax.swing.*;
import java.awt.*;
import java.awt.event.*;//for action listener

public class jmenudemo extends JFrame implements ActionListener{
    private Container c;
    private JMenuBar menuber;//for manuber
    private JMenu file,edit,help;//for menu
    private JMenuItem item1,item2,item3,item4,item5,item6,item7;//for menu item
    private ImageIcon icon1,icon2;//for use use in manu
    
    jmenudemo()//constracter
    {
        b();//method
    }

    //above method description
    public void b()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        //create image icon and locate file to use image
        icon1=new ImageIcon("C:/Users/sukde/OneDrive/Desktop/java swing/favicon-32x32.png");
        icon2=new ImageIcon("C:/Users/sukde/OneDrive/Desktop/java swing/favicon-32x32.png");


        menuber=new JMenuBar();//create menuber
        this.setJMenuBar(menuber);

        //create menu
        file=new JMenu("file");
        edit=new JMenu("edit");
        help=new JMenu("help");

        //add menu in menuber
        menuber.add(file);
        menuber.add(edit);
        menuber.add(help);



        //create menuitem
        item1=new JMenuItem("new");
        item1.setIcon(icon2);//item1=cut option er sathe icon2 add. which is created above line no.26
        //add keybord shortcut in item1 or new option
        item1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));//CTRL+N PRESS KORLE NEW file OPEN HOBE
                                                     //(vk_n=n              ctrl_mask=crtl ) = ctrl+n   .to use shortcut need to add action listener  to menu suboption then shortcut work         
        item2=new JMenuItem("open");
        item3=new JMenuItem("exit");
        item3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,ActionEvent.CTRL_MASK));//ctrl+e te exit hobe.but exit korar code ta action listener e likthe hobe then it work
        item4=new JMenuItem("cut");
        item4.setIcon(icon1);//item4=cut option er sathe icon1 add. which is created above line no.25
        item5=new JMenuItem("copy");
        item6=new JMenuItem("paste");
        item7=new JMenuItem("select all");

        //add menu in file menu
        file.add(item1);
        file.add(item2);
        file.add(item3);

       //add sub option/menuitem in edit menu
        edit.add(item4);
        edit.addSeparator();//edit manue er item4=cut option er pore separator show korbe
        edit.add(item5);
        edit.add(item6);
        edit.add(item7);
        
        item1.addActionListener(this);//new item er sathe action listener add
        item3.addActionListener(this);//exit item

    }
    @Override//add listener to 'new' item and 'exit' item
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==item1){// understand which item is selected first
            JFrame frame=new JFrame();//'new' click korle new akta frame open hobe
            frame.setVisible(true);
         //   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//main frame/parent theke new frame open hober por child frame close korle parent frame jate close na hoi 
            frame.setBounds(300,100,600,500);
            frame.setTitle("new frame");
        }
        else if(e.getSource()==item3){
            System.exit(0);//exit click korle frame ta close hoe jabe
        }
        
    } 
public static void main(String[]args)
   {
     jmenudemo a=new jmenudemo();
     a.setVisible(true);//to visible app
     a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     a.setBounds(300,100,600,500);
     a.setTitle("jmenudemo");
    }


}
