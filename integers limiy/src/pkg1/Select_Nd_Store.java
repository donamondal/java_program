package pkg1;

public class Select_Nd_Store {
	public static void main(String[] args)
	{
		int a[]= {19,1,1,19,32,2,5,42,54,6};
		int bag=180,t=0;
		for(int j=0;j<a.length-1;j++)
		{
			for (int i=0;i<a.length-1;i++)
			{
				if (a[i] > a[i + 1]) 
					{
						t = a[i];
						a[i] = a[i + 1];
						a[i + 1] = t;
					}
			}
		}
		int sum =0;
		for(int i = 0;i<a.length;i++)
			{
			sum+=a[i];
				System.out.println(a[i]+ " " + sum);
			}
		
		int total=0;
		for(int i=0;i<a.length;i++)
		{
			if(total+a[i]<=bag)
				total+=a[i];
			else
				break;
		}
		System.out.println("total element stored " + total);
	}

}
