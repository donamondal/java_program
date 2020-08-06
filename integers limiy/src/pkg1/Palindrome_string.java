package pkg1;

public class Palindrome_string 
{
	public static boolean palindrome_string(String a) 
	{
		int y=a.length()-1;
		for(int i=0;i<a.length()/2;i++)
		{
			if(a.charAt(i)==a.charAt(y))
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
		String s = "levele"; 
		boolean t=palindrome_string(s);
		System.out.print(t);
	}
}

