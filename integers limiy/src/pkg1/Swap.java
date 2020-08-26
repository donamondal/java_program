package pkg1;

public class Swap 
{
	public static void with3rdVariable(int[] array)
	{
		int temp=0;
		for(int i=0;i<array.length-1;i++)
		{
			temp = array[i];
			array[i] = array[i + 1];
			array[i + 1] = temp;
		}
	}
	
	public static void no3rdVariable(int[] array)
	{
		for(int i=0;i<array.length-1;i++)
		{
			array[i]=array[i]+array[i+1];
			array[i+1]=array[i]-array[i+1];
			array[i]=array[i]-array[i+1];
		}
	}
	
	public static void with3rdVariable(int n1,int n2)
	{
		int temp=0;
		temp=n1;
		n1=n2;
		n2=temp;
	}
	
	public static void no3rdVariable(int  n1,int n2)
	{
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
	}
	
	public static void main(String[] args)
	{
		int[] a= {3,5};
		no3rdVariable(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"\t");
		}
		int n=5;
		int m=6;
		no3rdVariable(n,m);
		System.out.print("\n"+n+"\t"+m);
	}
}
 