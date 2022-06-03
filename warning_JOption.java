import javax.swing.*;
public class warning_JOption
{
	JFrame f; 
	warning_JOption()
	{
		f = new JFrame();
		JOptionPane.showMessageDialog(f,"Warning message","alert",JOptionPane.WARNING_MESSAGE);	
	}
	public static void main(String a[])
	{
		new warning_JOption();
	}
}