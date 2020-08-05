package pkg1;

public class Palindrome 
{

	public static boolean palindrome_num(int[] array) 
	{
		int t=0;
		int y=array.length-1;
		for(int i=0;i<array.length/2;i++)
		{
			if(array[i]==array[y])
			{
				y--;
			}
			else
			{
				return false;
			}
		}
		return true;
	}
	
	
	
	public static void main(String[] args)
	{
		int a[]= {1,5,4,1};
		int b[]= {1,5,4,1};
		int c[]= {1,5,4,1};
		int d[]= {1,5,4,1};
		boolean t=palindrome_num(a);
		System.out.print(t);
	}
}
