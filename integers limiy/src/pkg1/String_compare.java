package pkg1;

public class String_compare 
{
	
	public static char[] string_compare1(char[] w1,char[] w2)
	{
		int l=(w1.length>w2.length)?w2.length:w1.length;
		for(int i=0; i<l; i++)
		{
			if(w1[i]>w2[i])
			{
				return w2;
			}
			else if(w2[i]>w1[i])
			{
				return w1;
			}
		}
		return (w1.length<w2.length)?w1:w2;
	}
	
	
	public static void main(String[] args)
	{
		char[] w1= {'S','T','A','R','T'};
		char[] w2= {'E','N','D'};
		char[] w3= {'E','N','D','A'};
		char[] c=string_compare1(w2,w3);
		System.out.print(c);
	}	
}
