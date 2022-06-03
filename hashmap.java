import java.util.*;


public class hashmap
{
    
    public static void main(String[] args) {
        HashMap  map=new HashMap();  
  map.put(100,"ABC");  
  map.put(102,"LMN");  
  map.put(108,"XYZ");  
   map.put(108, "BCD");
       map.put(109, null);
       map.put(null, "MMM");
       map.put("ABC",100);
     // System.out.println(map.keySet());
       //System.out.println(map.values());
       //System.out.println(map.get(102));
      
        
       // map.remove(102);
       System.out.println(map);
      
 /*
  for(Map.Entry m:map.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
 
*/
}


}
