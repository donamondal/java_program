//package pkg1;
//
//public class Prime_Number
//{
//	public static boolean is_prime(int num,int[] list)
//	{
//		if(num>2 && num%2==0)
//		{
//			return false;
//		}
//		double sq=Math.sqrt(num);
//		for(int address=0;list[address]<=sq;address++)
//		{
//			if(num%list[address]==0)
//				return false;
//		}
//		return true;
//	}
//
//	public static int[] prime_list(int limit)
//	{	
//		int[] a=new int[limit];
//		int c=0, n=0;
//		
//		while(c<limit) 
//		{
//			n++;
//			if(is_prime(n)) 
//			{
//				a[c] = n;
//				c=c+1;
//			}
//		}
//		return a;
//	}
//	
//	public static void main(String[] args)
//	{
//		long begin = System.currentTimeMillis();	
//		int n=42;
//		boolean prime=is_prime(n);
//		if(prime)
//		{
//			System.out.println("It's a prime number");
//		}
//		else
//		{
//			System.out.println("It's not a prime number");
//		}
//		long stop = System.currentTimeMillis();
//		System.out.println(stop - begin);
//		
//		int l=20;
//		int[] a=prime_list(l);
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]);
//		}
//	}
//}
//
