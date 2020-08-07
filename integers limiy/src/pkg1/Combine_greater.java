package pkg1;

public class Combine_greater 
{
	public static void main(String[] args)
	{
		int n=76859,t=0;
		int[]a=new int[5];
		while(n!=0)
		{
			for(int i=0;i<5;i++)
			{
				t=n%10;
				n=n/10;
				a[i]=t;
//    			System.out.print(a[i]);
			}
		}
		int[] m=Array_Utils.sort_Desc(a);
		int r=0;
		for(int i=0;i<m.length;i++)
		{
			r=r*10+m[i];
		}
		System.out.print(r);
	}
}
