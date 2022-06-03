
package gg;

import java.util.*;

public class vector 
{
    public static void main(String[] args) {
        
    
    Vector v = new Vector();
      
      
      v.addElement(1);
      v.addElement(2);
      v.addElement(2);
      v.addElement(null);
      v.addElement(8);
      v.remove(0);
        System.out.println(v.firstElement());
        System.out.println(v.elementAt(0));
      System.out.println("Initial size: " + v.size());
      System.out.println("Initial capacity: " + v.capacity());
      //  System.out.println(v);
      
      Enumeration en = v.elements();
      //System.out.println("\nElements in vector:");
      
      while(en.hasMoreElements())
         System.out.println(en.nextElement());
        
      Iterator it=v.iterator();
      while(it.hasNext())
      {
          System.out.println(it.next());
      
      }
    
      
      
    }
    
}
