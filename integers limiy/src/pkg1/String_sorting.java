package pkg1;

public class String_sorting 
{
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
	
	
	public static void main(String[] args)
	{
		String[] words= {"START","END","ART","CART","aRTIST"};
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
		for(int i=0;i<words.length;i++)
		{
			System.out.println(words[i]);
		}
	}
}
