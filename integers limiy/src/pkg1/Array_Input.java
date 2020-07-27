package pkg1;
import java.util.Scanner;

public class Array_Input 
{
	public static int[] arrayinput()
	{
		int[] a=new int[10];
		Scanner in = new Scanner(System.in);
		System.out.println("enter array elements\n");
		for(int i=0;i<a.length;i++) 
		{
			a[i]= in.nextInt();
		}
		System.out.println("entered array\n");
		for(int i=0;i<a.length;i++) 
		{
			System.out.println(a[i]);
		}
		return a;
	}
	
	public static void main(String[] args)
	{
		
		int t[]=arrayinput();
		for(int i=0;i<t.length;i++)
		{
			System.out.println(t[i]);
		}
//		int n=0;
//		int[] array=new int[n];
//		System.out.println("enter array limt\n");
//		n = in.nextInt();
//		System.out.println("enter array elements\n");
//		for(int i=0;i<array.length;i++) 
//		{
//			array[i]= in.nextInt();
//		}
//		System.out.println("entered array\n");
//		for(int i=0;i<array.length;i++) 
//		{
//			System.out.println(array[i]);
//		}
	}
}
