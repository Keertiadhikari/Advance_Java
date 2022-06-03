import java.util.*;
class Factorial extends Thread
{
	public void run()
	{
		int res=1;
 		System.out.println("Enter number for factorial");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
 		for(int i = 1; i <= n; i++)
 		{
 			res = res*i;  
  		}
		System.out.println("Factorial is : " + res);
	}
}
class evodd extends Thread
{
	public void run()
	{
		int n;
 		System.out.println("Enter number for even or odd");
		Scanner sc1 = new Scanner(System.in);
		int m = sc1.nextInt();
		 if((m%2) == 0)
		{
			System.out.println("Even");  
		}
		else
		{
			System.out.println("Odd"); 
		}
	}
}
public class ThreadEx 
{
	public static void main(String[] args) 
	{
		Factorial f1 = new Factorial();
  		f1.start(); // Execution of first thread is started.
 
		evodd e1 = new evodd();
		 e1.start(); // Execution of second thread is started.
	}
}