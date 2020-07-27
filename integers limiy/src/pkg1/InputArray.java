package pkg1;
import java.util.Scanner;

public class InputArray 
{	
	
	public static int[] duplicate_array(int[] real,int size)
	{
		int[] duplicate=new int[size];
		copy_array(real,duplicate,size);
		return duplicate;
	}
	
	public static void copy_array(int[] source,int[] destination,int size)
	{
		for(int i=0;i<size;i++)
		{
			destination[i]=source[i];
		}
	}
	
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
		int[] finalA=duplicate_array(array,size);
		return finalA;
	}
	
	public static void main(String[] args)
	{
		int t[]=inputArray();	
		System.out.println("entered array\n");
		for(int i=0;i<t.length;i++)
		{
			System.out.println(t[i]);
		}
		
		
	}
}

	
