import javax.swing.*;
import java.awt.*;
import java.awt.event.*;//keylistener

public class vowelcounter extends JFrame{
    private Container c;
    private JLabel promtlabel,vowellabel,alabel,elabel,ilabel,olabel,ulabel;
    private JTextArea ta;
    private JScrollPane scroll;

    //to show total nuber of vowel
    int totalVowel=0;//total vowel initiali 0 set korlam condition e use korar nonno
    int letter_a=0;//total a letter 0 ta initiali nicchi
    int letter_e=0;
    int letter_i=0;
    int letter_o=0;
    int letter_u=0;

    vowelcounter()//constracter
    {
        b();//method
    }

    //above method description
    public void b()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        promtlabel=new JLabel();
        promtlabel.setText("enter any vowel:");
        promtlabel.setBounds(10,20,100,30);
        c.add(promtlabel);

        ta=new JTextArea();
        ta.setLineWrap(true);//chack textarea video
        ta.setWrapStyleWord(true);
        scroll=new JScrollPane(ta);//scroll er moddhe text area ta nia ashachi
        scroll.setBounds(110,20,450,100);
        c.add(scroll);

        vowellabel=new JLabel();//to print 'total no of vowel' txt
        vowellabel.setBounds(110,150,150,30);
        c.add(vowellabel);

        alabel=new JLabel();//to print no of a
        alabel.setBounds(110,190,150,30);
        c.add(alabel);

        elabel=new JLabel();//to print no of e
        elabel.setBounds(110,230,250,30);
        c.add(elabel);

        ilabel=new JLabel();//to print no of i
        ilabel.setBounds(110,270,250,30);
        c.add(ilabel);

        olabel=new JLabel();//to print no of o
        olabel.setBounds(110,310,250,30);
        c.add(olabel);

        ulabel=new JLabel();//to print no of u
        ulabel.setBounds(110,350,250,30);
        c.add(ulabel);
        
        //add keylistener with text area
        ta.addKeyListener(new KeyListener(){//keylistener
            public void keyTyped(KeyEvent e)//keyTyped not used here
            {
                //ta.append("keytyped:"+e.getKeyChar()+"\n");
            }
            public void keyPressed(KeyEvent e)//keyPressed
            {
              if(e.getSource()==ta){//text area te user kono input diache kina seta chack korar jonno

                if(e.VK_A==e.getKeyCode())//a er sathe getkeycode match hoi.vk constant
                {
                    letter_a++;             //tahole letter and total vowel barbe
                    totalVowel++;
                }
                if(e.VK_E==e.getKeyCode())//e er sathe getkeycode match hoi
                {
                    letter_e++;             //tahole letter and total vowel barbe
                    totalVowel++;
                }
                if(e.VK_I==e.getKeyCode())//i er sathe getkeycode match hoi
                {
                    letter_i++;             //tahole letter and total vowel barbe
                    totalVowel++;
                }
                if(e.VK_O==e.getKeyCode())//o er sathe getkeycode match hoi
                {
                    letter_o++;             //tahole letter and total vowel barbe
                    totalVowel++;
                }
                if(e.VK_U==e.getKeyCode())//u er sathe getkeycode match hoi
                {
                    letter_u++;             //tahole letter and total vowel barbe
                    totalVowel++;
                }
                
                //total no of vowel,a,e,i,o,u total no. print
                vowellabel.setText("total no. of vowels:"+totalVowel);
                alabel.setText("total no. of a:"+letter_a);//letter a er moddhe je a er no ta ache seta print korbe
                elabel.setText("total no. of e:"+letter_e);
                ilabel.setText("total no. of i:"+letter_i);//letter i er moddhe je a er no ta ache seta print korbe
                olabel.setText("total no. of o:"+letter_o);
                ulabel.setText("total no. of u:"+letter_u);
                
              }  
            }

            public void keyReleased(KeyEvent e)//keyReleased not any use here
            {
               // ta.append("keyreleased:"+e.getKeyChar()+"\n");
            }
        });
    }

   
public static void main(String[]args)
   {
     vowelcounter a=new vowelcounter();
     a.setVisible(true);//to visible app
     a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     a.setBounds(100,100,600,500);
     a.setTitle("vowel counter");
    }
}
