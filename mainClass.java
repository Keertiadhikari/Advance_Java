

import java.util.Date;
class GeometricObject
{

    private String color="white";
    private Date dateCreated;
  GeometricObject(Date d, String c) 
  {
      color=c;
      dateCreated=d;
      System.out.println(dateCreated); 
      System.out.println(color);
  
  }

    
    
    
}

class RightangleTriangle extends GeometricObject
{
 int baze=3;
 int hite=5;

 RightangleTriangle()
    {
        super(new Date(), "Blue");
        
    
    }
    RightangleTriangle(int b, int h)
    {
     super(new Date(), "Blue");
       baze=b;
       hite=h;
    
    }

    public int getBaze() {
        return baze;
    }

    public void setBaze(int baze) {
        this.baze = baze;
    }

    public int getHite() {
        return hite;
    }

    public void setHite(int hite) {
        this.hite = hite;
    }

    
    
 void printData()
 {
     System.out.println("Base is  " +baze);
     System.out.println("Height is  " +hite);
 
 
 }
    void getArea()
    {
    
   
    
        System.out.println(baze*hite*0.5);
    }
    
    
}


class mainClass
{
    public static void main(String[] args)
    {
        RightangleTriangle t1=new RightangleTriangle();
        
     t1.setBaze(12);
        t1.setHite(10);
        
        System.out.println(t1.getBaze()); 
        System.out.println(t1.getHite());
        t1.getArea();
        t1.printData();
    }

}