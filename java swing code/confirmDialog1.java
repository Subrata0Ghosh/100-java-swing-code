import javax.swing.JOptionPane;

class confirmDialog1{             
	public static void main(String[]args)
	{
       int choice= JOptionPane.showConfirmDialog(null,"you want to quit?","wait..",JOptionPane.YES_NO_CANCEL_OPTION);
       if(choice==JOptionPane.YES_OPTION)
       {
            System.out.println("you coosed YES.");
            System.exit(0);
       }
       else
       {
            System.out.println("you coosed NO.");
       }
    }
}    