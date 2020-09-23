package pkg1;

public class Fibonacci 
	{
		public static int[] fibonacci_series(int limit)
		{
			int[] a=new int[20];
			int i=0,j=1,n=0;
			a[0]=i;
			a[1]=j;
			for(int e=2;a[e]<=limit;e++)
			{
				n=i+j;
				if(n>limit) 
				{
					return a;
				}
				a[e]=n;
				i=j;
				j=a[e];
			}
		    return a; 
		}
		public static void main(String[] args)
		{
			int n=13;
			int fib[]=fibonacci_series(n);
			for(int i=0;i<fib.length;i++)
			{
				System.out.println(fib[i]);
			}
		}
	}
