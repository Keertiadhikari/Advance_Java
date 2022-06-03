import javax.swing.*;  
import java.awt.event.*;  

public class MouseListenerExample implements MouseListener
{
    
JTextField l;  
JFrame f;
    MouseListenerExample()
    {  
        f =new JFrame();
       f.addMouseListener(this);
          
        l=new JTextField("Text Fileld");  
        l.setBounds(20,50,100,20);  
        f.add(l);  
        f.setSize(300,300);  
        f.setLayout(null);  
        f.setVisible(true);  
    }  
    public void mouseClicked(MouseEvent e) {  
        l.setText("Mouse Clicked");  
    }  
    public void mouseEntered(MouseEvent e) {  
        l.setText("Mouse Entered");  
    }  
    public void mouseExited(MouseEvent e) {  
        l.setText("Mouse Exited");  
    }  
    public void mousePressed(MouseEvent e) {  
        l.setText("Mouse Pressed");  
    }  
    public void mouseReleased(MouseEvent e) {  
        l.setText("Mouse Released");  
    }  
public static void main(String[] args) {  
    new MouseListenerExample();  
} 



}
