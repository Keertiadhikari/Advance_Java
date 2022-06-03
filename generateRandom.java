import java.util.*;
import java.util.Random;
public class generateRandom
{
	public static void main(String args[])
	{
		// Generating random doubles and storing them in arrayList
		ArrayList<Integer> nums = new ArrayList<Integer>();
		Random rand = new Random();	
		for(int i=0;i<10;i++)
		{
			int ele = rand.nextInt(100);
			nums.add(ele);
		}
		System.out.println("List of generated random numbers is -> " + nums);
		Collections.sort(nums);
		System.out.println("List of generated random numbers after sorting is -> " + nums);
		ArrayList<Integer> newList = new ArrayList<Integer>();
		for (int element : nums) 
		{
            			if (!newList.contains(element))
			{
                			newList.add(element);
            			}
        		}
		System.out.println("Sorted list of generated random numbers after deleting duplicates is -> " + newList);
	}
}
