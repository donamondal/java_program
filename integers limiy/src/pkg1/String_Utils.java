package pkg1;

public class String_Utils 
{
	/**
	 * Finding the smaller string
	 * @param w1
	 * @param w2
	 * @return
	 */
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
	
	/**
	 * Compare whether the 1st string is smaller or greater
	 * @param w1
	 * @param w2
	 * @return
	 */
	public static boolean compare(String w1,String w2)
	{
		w1=w1.toUpperCase();
		w2=w2.toUpperCase();
		
		int s=(w1.length()>w2.length())?w2.length():w1.length();
		for(int i=0;i<s;i++)
		{
			if(w1.charAt(i)>w2.charAt(i))
			{
				return true;
			}
			if(w1.charAt(i)<w2.charAt(i))
			{
				return false;
			}
		}
		return (w1.length()>w2.length())?true:false;
	}
	
	/**
	 * Sorting a string in ascending order
	 * @param words
	 */
	public static void sorting_asc(String[] words)
	{
		String temp;
		for(int i=0;i<words.length-1;i++)
		{
			for(int j=0;j<words.length-1;j++)
			{
				boolean call=compare(words[j],words[j+1]);
				if(call==true)
				{
					temp=words[j+1];
					words[j+1]=words[j];
					words[j]=temp;
				}
			}
		}
	}
	
	/**
	 * Sorting a string in descending order
	 * @param words
	 */
	public static void string_sorting(String[] words)
	{
		String temp;
		for(int i=0;i<words.length-1;i++)
		{
			for(int j=0;j<words.length-1;j++)
			{
				boolean call=compare(words[j],words[j+1]);
				if(call==false)
				{
					temp=words[j+1];
					words[j+1]=words[j];
					words[j]=temp;
				}
			}
		}
	}
	
	/**
	 * CHECKING A STRING IS PALINDROME OR NOT
	 * @param a
	 * @return
	 */
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

	
}
