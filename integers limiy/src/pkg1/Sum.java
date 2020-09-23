package pkg1;

public class Sum 
{
	public static int sum_of_digit(int num)
	{
		int r=0;
		while(num!=0)
		{
			r+=num%10;
			num=num/10;
			
		}
		return r;
	}
	
	public static int sum_of_naturalNo_Byformula(int num)
	{
		int r=num*(num+1)/2;
		return r;
	}
	
	public static int sum_of_Nnatural_no(int num)
	{
		int r=0;
		for(int i=0;i<=num;i++)
		{
			r+=i;
		}
		return r;
	}
	
	public static int sum_within_range(int n1,int n2)
	{
		int r=0;
		for(int i=n1;i<=n2;i++)
		{
			r+=i;
		}
		return r;
	}
	
	public static void main(String[] args)
	{
		int n=555222;
		int r=sum_of_digit(n);
		System.out.println("Sum of digits= "+r);
		
		int ntrl=10000;
		int res=sum_of_naturalNo_Byformula(ntrl);
		System.out.println("Sum of natural no.s= "+ res);
		
		int n1=1,n2=10000;
		int rs=sum_within_range(n1,n2);
		System.out.println("Sum of natural no.s within range= "+ rs);
	}
}
