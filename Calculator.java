import javax.swing.*;
import java.awt.*;  
import java.awt.event.*; 

public class Calculator
{
	public static void main(String a[])
	{
		Cal obj = new Cal();
	}
}
class Cal extends JFrame implements ActionListener
{
	JTextField t1,t2;
	JButton b1,b2,b3,b4;
	//JLabel l;

	public Cal()
	{
		t1 = new JTextField(15);
		t2 = new JTextField(15);
		b1 = new JButton("Add");
		b2 = new JButton("Subtract");
		b3 = new JButton("Multiply");
		b4 = new JButton("Divide");
		//l = new JLabel("Result");

		add(t1);
		add(t2);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		//add(l);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		

		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int num1 = Integer.parseInt(t1.getText());
		int num2 = Integer.parseInt(t2.getText());
		int value =0;
		if(ae.getSource() == b1)
		{
			value = num1 + num2;
			System.out.println("Sum of " + num1 + " and "+ num2 + " is " + value);
		}
		else if(ae.getSource() == b2)
		{
			value = num1 - num2;
			System.out.println("Difference of " + num1 + " and "+ num2 + " is " + value);
		}
		else if(ae.getSource() == b3)
		{
			value = num1 * num2;
			System.out.println("Product of " + num1 + " and "+ num2 + " is " + value);
		}
		else if(ae.getSource() == b4)
		{
			value = num1 / num2;
			System.out.println("Quotient of " + num1 + " and "+ num2 + " is " + value);
		}
		
	}
}


 