package gg;
abstract class a
{
int a1=10;
void disp()
{
    System.out.println("Normal method");
}
abstract void help();
}

class m extends a
{
    void help() 
    {
        System.out.println("In abstract method help");  
    }

    public static void main(String[] args)
    {
     a ob=new m();
     ob.help();
     ob.disp();
    }

}