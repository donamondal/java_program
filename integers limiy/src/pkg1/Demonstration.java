package pkg1;

public class Demonstration 
{
	public static int[] demo_array()
	{
		int[] array= {2,3,4,5,6,7,8,9};
		System.out.println(array);
		return array;
	}


	public static void main(String[] args)
	{
		int c[];
		int b[];
		
		int t[]=demo_array();
		System.out.print(t);
			
		int a[]=demo_array();
		System.out.print("\n"+a);
	}
}