package pkg1;

public class Greatest_no 
{
	public static int find_greatest(int n1,int n2,int n3)
	{
		if(n1>=n2 && n1>=n3)
		{
			return n1;
		}
		else if(n2>=n1 && n2>=n3)
		{
			return n2;
		}
		else
		{
			return n3;
		}
	}
	
	public static int find_smallest(int n1,int n2,int n3)
	{
		if(n1<=n2 && n1<=n3)
		{
			return n1;
		}
		else if(n2<=n1 && n2<=n3)
		{
			return n2;
		}
		else
		{
			return n3;
		}
	}

	public static int find_greatest(int n1,int n2)
	{
		return(n1>=n2)?n1:n2;
	}

	public static int find_smallest(int n1,int n2)
	{
		return(n1<=n2)?n1:n2;
	}
	public static void main(String[] args)
	{
		int a=65,b=6;
		int r=find_smallest(a,b);
		System.out.print("Smnallest number= "+r);
	}
}	