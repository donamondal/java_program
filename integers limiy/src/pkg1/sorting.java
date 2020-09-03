package pkg1;

public class sorting 
{
	public static int[] selectionSort_Desc(int[] array)
	{
		int temp=0;
		for(int o=0;o<array.length;o++)
		{
			for(int i=o+1;i<array.length;i++)
			{
				if(array[o]<array[i])
				{
   					temp=array[i];
   					array[i]=array[o];
   					array[o]=temp;
				}
			}
		}
		return array;
	}
	
	
	
	public static void main(String[] args)
	{
		int[] a= {6,5,4,3,2,1};
		int[] ar=selectionSort_Desc(a);
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]);
		}
	}
}	