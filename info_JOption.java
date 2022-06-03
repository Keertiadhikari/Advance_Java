import javax.swing.*;
public class info_JOption
{
	JFrame f; 
	info_JOption()
	{
		f = new JFrame();
		JOptionPane.showMessageDialog(f,"Info message");	
	}
	public static void main(String a[])
	{
		new info_JOption();
	}
}