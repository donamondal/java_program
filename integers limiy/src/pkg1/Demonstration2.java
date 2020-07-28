package pkg1;

public class Demonstration2 
{
	public static void b(int[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			array[i]+=1;
		}
	}
	
	public static void v(int var)
	{
		var+=1;
	}
	
	
	public static void main(String[] args)
	{
//		CALL BY REFFERENCE
		int[] a= {2,3,4,5,6,7};
		b(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
//		CALL BY VALUE
		int n=10;
		v(n);
		System.out.print("\n"+n);
	}

}
