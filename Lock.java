import java.util.*;
import java.util.concurrent.locks.*;
class a1
{
	ReentrantLock l = new ReentrantLock();
	void print_name(String name)	
	{
		l.lock();
		for(int i=0;i<1;i++)
		{
			System.out.println("Hello");
			try{Thread.sleep(2000);}catch(Exception e){}
			System.out.println(" " + name);
		}
		l.unlock();
	}
}
public class Lock extends Thread
{
	a1 ob;
	String name;
	Lock(a1 ob,String name)
	{
		this.ob = ob;
		this.name = name;
	}
	public void run()
	{
		ob.print_name(name);
	}
	public static void main(String[] a)
	{
		a1 ob1 = new a1();
		Lock t1 = new Lock(ob1,"ABC");
		Lock t2 = new Lock(ob1,"FEC");
		Lock t3 = new Lock(ob1,"DEF");
		t1.start();
		t2.start();
		t3.start();
	}
}
	