
package gg;

import java.util.*;

public class stack 
{
    


public static void main(String[] args)   
{  
//creating an instance of Stack class  
Stack stk= new Stack();  

boolean result = stk.empty();  
System.out.println(result);  
// pushing elements into stack  
stk.push(78);  
stk.push(113);  
stk.push(90);  
stk.push(120);  
//prints elements of the stack  
System.out.println(stk);  
result = stk.empty();  
System.out.println(result); 
stk.pop();
    System.out.println(stk);
    System.out.println(stk.peek());
    System.out.println(stk.search(56));
    
}  



}
