package pkg1;

public class Combine_greater 
{
	public static void main(String[] args)
	{
		int n=54,t=0;
		int size =(int) Math.log10(n) + 1;
		System.out.println(size);
		int[]a=new int[size];
		
		while(n!=0)
		{
			for(int i=0;i<size;i++)
			{
				t=n%10;
				n=n/10;
				a[i]=t;
			}
		}
		int[] m=Array_Utils.sort_Desc(a);
		int r=0;
		for(int i=0;i<m.length;i++)
		{
			r=r*10+m[i];
		}
		System.out.println("great combination "+r);
		
		
		int temp=0,i=0,j=0, position = 0;
		  for (j = 0; j < a.length-1; j++)
			{
			     for (i = 0; i < a.length - 1; i++) 
					{
						if (a[i] > a[i + 1]) 
						{
							t = a[i];
							a[i] = a[i + 1];
							a[i + 1] = t;
						}
						
						if(j==a.length-2 && a[i] == 0) {
							position = i;
						}
					}
			}
		  
		  int temp1 = a[0];
		  a[0] = a[position + 1];
		  a[position + 1] = temp1;
			
		int num=0;
		for( i=0;i<a.length;i++)
		{
			num=num*10+a[i];
		}
		System.out.println("\nsmallest combination "+num);	
	}
}
