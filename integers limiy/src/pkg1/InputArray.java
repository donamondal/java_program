package pkg1;
import java.util.Scanner;

public class InputArray 
{	
	
	public static int[] inputArray()
	{
		int[] array =new int[100];
		int size=0,n=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter elements (you can enter upto 100 elements)");
		System.out.println("press 999 if you want to stop entering");
		for(int i=0;i<array.length;i++)
		{
			n= in.nextInt();
			if(n==999)
			{
				break;
			}
			else
			{
				array[i]=n;
				size+=1;
			}
		}	
		return array;
	}
	
	public static void main(String[] args)
	{
		int t[]=inputArray();	
		System.out.println("entered array\n");
		System.out.println(t);
	}
}

	
