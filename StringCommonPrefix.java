/*Question 2: Using FlowLayout Manager, write a program that meets the following requirements (see figure below):
•	Create a frame and set its layout to FlowLayout
•	Create 2 panels and add them to the frame.
•	Each panel contains three buttons. The panel uses FlowLayout. */




import javax.swing.*;
import java.awt.*;

class FrameAccInstructions
{
	JFrame f ;
	FrameAccInstructions()
	{
		f = new JFrame();	
		f.setLayout(new FlowLayout());
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		
		p1.setLayout(new FlowLayout());
		p2.setLayout(new FlowLayout());

		p1.add(new JButton("Button 1"));
		p1.add(new JButton("Button 2"));
		p1.add(new JButton("Button 3"));

		p2.add(new JButton("Button 4"));
		p2.add(new JButton("Button 5"));
		p2.add(new JButton("Button 6"));

		f.add(p1);
		f.add(p2);
		
		f.setVisible(true);
		f.setSize(400,600);

	}
	
	public static void main(String a[])
	{
		new FrameAccInstructions();
	}
}