import javax.swing.JOptionPane;

class inputDialog1{             
	public static void main(String[]args)
	{
	  String f_name=JOptionPane.showInputDialog(null,"enter your 1st name:","1st name",2);//take input from user
      String l_name=JOptionPane.showInputDialog(null,"enter your 2nd name:","2nd name",3);//take input from user
      String name=f_name+" "+l_name;
      JOptionPane.showMessageDialog(null,"welcome to swing: "+name);
      
	}

}