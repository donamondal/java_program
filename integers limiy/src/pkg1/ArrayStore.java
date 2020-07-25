package pkg1;

public class ArrayStore {
	
	public static void main(String[] args)
	{
		int[] a = {1,56,1,54,2,6,3,64,23,35};
		int bag=123,total=0;
		for(int i=0;i<a.length;i++)
		{ 
			int b=total;
			total+=a[i];
			if(total==bag)
			{
				break;
			}
			else if(total>bag)
			{
				total=b;
 			    break;
			}
		}
		System.out.println("total element stored " + total);
		
		total = 0;
		for(int i=0;i<a.length;i++)
		{ 
			if((total + a[i]) <= bag)
				total += a[i];
			else
				break;
		}
		System.out.println("total element stored " + total);
	}
}
