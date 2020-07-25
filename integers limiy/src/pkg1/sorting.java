package pkg1;

import java.util.Scanner;

public class sorting {
	
	public static boolean is_sorted(int[] array)
	{    
//		int sort=0;
		for(int i=0;i<array.length-1;i++)
		{
			if(array[i]>array[i+1])
			{
				return false;	
			}
		}
//		if(sort==0)
//		{
//			return 0;
//		}
//		else
//		{
//			return 1;
//		}
		return true;
	}
	
	
	public static void main(String[] arg) {
		int size = 5;
		int[] a = new int[size];

		int[] b = { 1, 3, 5, 7, 9 };
		int[] c = { 9, 7, 5, 3, 4 };
		int[] d = { 2, 6, 4, 9, 1 };

		a = c;
		
		
		boolean sg = is_sorted(c);
		System.out.print(sg);

		//		Scanner in = new Scanner(System.in);
		//		System.out.print("enter " + size + " elements");
		//		for (int i = 0; i < size; i++) {
		//			int s = in.nextInt();
		//			a[i] = s;
		//		}
		
		
		
//		int t,sorted=0;
//		for (int j = 0; j < size - 1; j++)
//		{
//			if(sorted==0) 
//			{
//				System.out.println("Outer loop");
//				for (int i = 0; i < size - 1; i++) 
//				{
//					System.out.println("Inner loop");
//					if (a[i] > a[i + 1]) 
//					{
//						t = a[i];
//						a[i] = a[i + 1];
//						a[i + 1] = t;
//					}
//				}
//			}
//			else 
//			{
//				break;
//			}
//		}
//		for (int i = 0; i < size - 1; i++) 
//		{
//			if (a[i] < a[i + 1]) 
//			{   int temp_sort
//				sorted=0;
//
//				System.out.println("break");
//			}
//		}
//	for(int i = 0;i<size;i++)
//	{
//		System.out.println(a[i]);
//	}
}

}
