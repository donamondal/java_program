package pkg1;
import java.util.Scanner;

public class Total_Occurences 
{
	public static boolean is_present(int[] array , int num)
	{
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==num)
			{
				return true;
			}
		}
		return false;
	}
	
	public static int total_occurences(int[] array , int num)
	{
		int total=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==num)
			{
				total+=1;
			}
		}
		return total;
	}
	
	public static void main(String[] args)
	{
		int[] a= new int[10];
		int n=0;
		Scanner in =new Scanner(System.in);
		System.out.println("Enter 10 array elements");
		for(int i=0;i<a.length;i++)
			{
				a[i]=in.nextInt();
			}
		System.out.println("Enter element to be found");
		n=in.nextInt();
		boolean present=is_present(a,n);
		System.out.print(present +" it's present");
		int total=total_occurences(a,n);
		System.out.print("Total number of " + n +" = "+ total);
	}
	
}
