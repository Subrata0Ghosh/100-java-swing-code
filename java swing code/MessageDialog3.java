import javax.swing.JOptionPane; //showMessageDialog
import javax.swing.ImageIcon;
class MessageDialog3{
    public static void main(String[]args)
    {
        ImageIcon icon=new ImageIcon("favicon-32x32.png");
        JOptionPane.showMessageDialog(null,"enter correct password","warning",2,icon);//5 parameter
    }
}