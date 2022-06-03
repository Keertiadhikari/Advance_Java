import java.util.*;

public class arraylistdemo implements Comparable<arraylistdemo>
{

    String Name;
    int age;
    
    public arraylistdemo(String Name,int age) 
    {
    this.Name=Name;
    this.age=age;
    
    }

   
    public static void main(String[] args)
    {
   
       ArrayList <arraylistdemo> al=new ArrayList<arraylistdemo>();
     
       al.add(new arraylistdemo("ABC", 12));
        al.add(new arraylistdemo("ABC12", 10));
        al.add(new arraylistdemo("ABC11", 10));
             al.add(new arraylistdemo("ZZz", 1));
             al.add(new arraylistdemo("ZZz", 11));
  Collections.sort(al);
   
  for(arraylistdemo c : al)
        {
            System.out.println(c.Name+" "+c.age);
          
        }
     
    }

    public int compareTo(arraylistdemo o) 
    {
        
       if(this.age <o.age)
       {  
           return -1;
       }
        else if (this.age>o.age)
        {
       return 1;
        }
            else{
            return 0;}
    }

   

}
