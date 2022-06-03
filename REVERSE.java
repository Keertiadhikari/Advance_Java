import java.util.ArrayList;
public class REVERSE 
{
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList();
       al.add(12);
       al.add(1);
       al.add(3);
       al.add(3);
       al.add(4);
       al.add(2);
       al.add(5);
       for (int i=0;i<al.size()/2;i++)
{
    Integer t=  al.get(i);   
    al.set(t, al.get(al.size() - i - 1));
    al.set(al.size() - i - 1, t);

}
    
        System.out.println(al);
}

}
