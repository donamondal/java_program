package pkg1;

public class Reverse_array 
{
	public static void reverse_array(int[] array) 
	{
		int t=0;
		int y=array.length-1;
		for(int i=0;i<array.length/2;i++)
		{
			t = array[i];
			array[i] = array[y];
			array[y] = t;
			y--;
		}
	}
	
	
	public static void main(String[] args)
	{
		int[] a= {1,2,3,4,5,6,7,8,9,10};
		int[] b= {1,2,3,4,5,6,7,8,9};
//		a=b;
		reverse_array(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		reverse_array(b);
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	}
	

}
