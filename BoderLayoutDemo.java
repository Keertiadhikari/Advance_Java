import javax.swing.*;
import java.awt.*;

class BorderLayoutDemo
{
	BorderLayoutDemo()
  	{
      		JFrame f = new JFrame();
    		JButton b1 = new JButton("North");
    		JButton b2 = new JButton("West");
    		JButton b3 = new JButton("East");
    		JButton b4 = new JButton("South");
    		JButton b5 = new JButton("Center");

     		f.setLayout(new BorderLayout());
		//f.setLayout(new BorderLayout(20,15);  //setting vertical(15) and horizontal gap(20) 
     		f.add(b1, BorderLayout.NORTH);
     		f.add(b4, BorderLayout.SOUTH);
     		f.add(b3, BorderLayout.EAST);
     		f.add(b2, BorderLayout.WEST);
     		f.add(b5, BorderLayout.CENTER);

     		f.setSize(500,300);
     		f.setVisible(true);
  	}

  	public static void main(String[] args)
	{
     		BorderLayoutDemo m = new BorderLayoutDemo();
  	}
}