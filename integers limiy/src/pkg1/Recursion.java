package pkg1;

public class Recursion 
{
	public static void printno(int n)
	{
		if(n==0)
		{
			return;
		}
		System.out.println(n);
		printno(n-1);
	}
	
	public static void addno(int n,int r)
	{
		if(r>n)
		{
			return;
		}
		System.out.println(r);
		addno(n,r+1);
	}

	public static void add_natural_no(int limit,int start,int store)
	{
		if(start>limit)
		{
			return;
		}
		System.out.println(store);
		start=start+1;
		add_natural_no(limit,start,store+start);
	}
	
	public static void main(String[] args)
	{
		int n=10,r=1,s=1;
		add_natural_no(n,r,s);
	}
	
}
