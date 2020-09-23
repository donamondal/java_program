package pkg1;

public class Factorial 
{
	public static int factorial(int num)
	{
		int r=1;
		for (int i=num;i>=2;i--)
		{
			r*=i;
		}
		return r;
	}

	
	public static void main(String[] args)
	{
		int n=4;
		int r=factorial(n);
		System.out.print("Factorial= " + r);
	}
	
}
