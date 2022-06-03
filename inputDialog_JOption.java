import javax.swing.*;
public class inputDialog_JOption
{
	JFrame f; 
	inputDialog_JOption()
	{
		f = new JFrame();
		String name = JOptionPane.showInputDialog(f,"Enter Name");	
	}
	public static void main(String a[])
	{
		new inputDialog_JOption();
	}
}