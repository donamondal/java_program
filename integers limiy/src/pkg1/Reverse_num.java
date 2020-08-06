package pkg1;

public class Reverse_num 
{
	public static int reverse(int n)
	{
		int t=0,r=0;
		while(n!=0)
		{
			r=n%10;
			t=t*10+r;
			n=n/10;
		}
		System.out.println(t);
		return t;
	}
	
	public static boolean palindrome_num(int n)
	{
		return reverse(n)==n;
	}
	
	public static void main(String[] args)
	{
		int n=-1221;
		boolean t=palindrome_num(n);
		System.out.print("\n"+t);
	}
}
