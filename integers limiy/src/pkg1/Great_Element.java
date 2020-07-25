package pkg1;

public class Great_Element 
{
	
	public static int maximum(int[] array)
	{
       int t=array[0];
		
		for(int i=0;i<array.length-1;i++)
		{
			if(t<array[i])
			{
				t=array[i];
			}
		}
		return t;
	}
	
	public static int maximum(int[][] a)
	{
		int large=a[0][0];
		 
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				if(large<a[r][c])
				{
					large=a[r][c];
				}
			}
		}
		return large;
	}
	
	public static int smallest(int[] array)
	{
		int temp=0,i=0;
		temp=array[i];
		   for(i=0;i<array.length;i++)
		  {	
             if(temp>array[i])
             {
            	 temp=array[i];
             }
		  }
		return temp;
	}
	
	public static int Smallest(int[][] a)
	{

		int min=0,r=0,c=0;
		min=a[r][c];
		for( r=0;r<a.length;r++)
		{
			for(c=0;c<a[r].length;c++)
			{
				if(min>a[r][c])
				{
					min=a[r][c];
				}
			}
		}
		return min;
	}
	
	
	
	
	public static void main(String[] args)
	{
		int[] array= {99,89,79,12,56,20,35};
		int[][] a= {{22,56,87,120,20,98} ,{1,87,90,100,64,17}};
 
//		finding Greatest number
		int t=maximum(array);
		System.out.println("Greatest element of 1D array "+t);
		
		
//		finding Smallest number
		int temp=smallest(array);
		System.out.println("Smallest element of 1D array "+temp);
		
		
//		finding Greatest number 2d array
		int large=maximum(a);
		System.out.println("\n\nGreatest element of 2D array "+large);
		
		
//		finding smallest number 2d array
		int min=smallest(array);
		System.out.println("Smallest element of 2D array "+min);
		
	}

}
