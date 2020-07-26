package pkg1;

public class Array_Utils 
{

	
	/**
	 * CHECKING A ARRAY IS SORTED OR NOT
	 * @param array
	 * @return
	 */
	public static boolean is_sorted(int[] array)
	{
		for (int i = 0; i < array.length - 1; i++) 
		{
			if (array[i] > array[i + 1]) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * SORTING AN ARRAY
	 * @param a
	 * @return
	 */
	public static int[] sorting(int[] a)
	{
		int t=0;
	  for (int j = 0; j < a.length- 1; j++)
		{
		     for (int i = 0; i < a.length - 1; i++) 
				{
					if (a[i] > a[i + 1]) 
					{
						t = a[i];
						a[i] = a[i + 1];
						a[i + 1] = t;
					}
				}
			}
	  return a;
	}
		
	/**
	 * FINDING MAX NO. IN A 1D ARRAY
	 * @param array
	 * @return
	 */
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
	
	/**
	 * FINDING MAX NO. IN A 2D ARRAY
	 * @param a
	 * @return
	 */
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
	
	/**
	 *FINDING MIN NO. IN A 1D ARRAY
	 * @param array
	 * @return
	 */
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
	
	/**
	 *FINDING MIN NO. IN A 2D ARRAY
	 * @param a
	 * @return
	 */
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
		
	/**
	 *FINDING THE SUM OF ELEMENTS OF 1D ARRAY 
	 * @param a
	 * @return
	 */
	public static int sum(int[] a) 
	{
		int sum = 0;
		for (int i = 0; i < a.length; i++) 
		{
			sum += a[i];
		}
		return sum;
	}
	
	/**
	 *FINDING THE SUM OF  
	 * @param array
	 * @return
	 */
	public static int sum(int[][] array) 
	{
		int total = 0;
		for (int r = 0; r < array.length; r++) 
		{
			for (int c = 0; c < array[r].length; c++) 
			{
				total += array[r][c];
			}
		}
		return total;
	}
	
	/**
	 *STORING ARRAY ELEMENTS UPTO A LIMIT 
	 * @param a
	 * @return
	 */
	public static int arrayLimit(int[] a)
	{
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
			total = 0;
			for(int i=0;i<a.length;i++)
			{ 
				if((total + a[i]) <= bag)
					total += a[i];
				else
					break;
			}
		return total;	
	}

}	