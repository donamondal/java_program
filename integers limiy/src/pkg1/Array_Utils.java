package pkg1;

import java.util.Scanner;

public class Array_Utils 
{
	
   
	/**
     * TAKING INPUT OF ARRAY ELEMENTS
     * @return
     */
	public static int[] inputArray()
	{
		int[] array =new int[100];
		int size=0,n=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter elements (you can enter upto 100 elements");
		System.out.println("press 999 if you want to stop entering");
		for(int i=0;i<array.length;i++)
		{
			n= in.nextInt();
			in.close();
			if(n==999)
			{
				break;
			}
			else
			{
				array[i]=n;
				size+=1;
			}
		}
		int[] finalA=duplicate_array(array,size);
		return finalA;
	}
	
	/**
	 * DUPLICATE AN ARRAY
	 * @param real
	 * @param size
	 * @return
	 */
	public static int[] duplicate_array(int[] real,int size)
	{
		int[] duplicate=new int[size];
		copy_array(real,duplicate,size);
		return duplicate;
	}
	
	/**
	 * COPY AN ARRAY
	 * @param source
	 * @param destination
	 * @param size
	 */
	public static void copy_array(int[] source,int[] destination,int size)
	{
		for(int i=0;i<size;i++)
		{
			destination[i]=source[i];
		}
	}
	
	
	/**
	 * REVERSE AN ARRAY
	 * @param array
	 */
	public static void reverse_array(int[] array) 
	{
		int t=0;
		int y=array.length-1;
		for(int i=0;i<array.length/2;i++)
		{
			t = array[i];
			array[i] = array[y];
			array[y] = t;
			y--;
		}
	}
	
	/**
	 *TO CHECK A PERTICULAR ELEMENT IS PRESENT IN AN ARRAY
	 * @param array
	 * @param num
	 * @return
	 */
	public static boolean is_present(int[] array , int num)
	{
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==num)
			{
				return true;
			}
		}
		return false;
	}
	
	/**
	 * TOTAL NO. OF OCCURENCE OF AN ELEMENT IN ARRAY
	 * @param array
	 * @param num
	 * @return
	 */
	public static int total_occurences(int[] array , int num)
	{
		int total=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==num)
			{
				total+=1;
			}
		}
		return total;
	}
	
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
	 * SWAPING USING 3RD VARIABLE 
	 * @param array
	 */
	public static void with3rdVariable(int[] array)
	{
		int temp=0;
		for(int i=0;i<array.length-1;i++)
		{
			temp = array[i];
			array[i] = array[i + 1];
			array[i + 1] = temp;
		}
	}
	
	/**
	 * SWAPING WITHOUT USING 3RD VARIABLE 
	 * @param array
	 */
	public static void no3rdVariable(int[] array)
	{
		for(int i=0;i<array.length-1;i++)
		{
			array[i]=array[i]+array[i+1];
			array[i+1]=array[i]-array[i+1];
			array[i]=array[i]-array[i+1];
		}
	}
	
	/**
	 * SORTING AN ARRAY IN ASCENDING USING BUBBLE SORT
	 * @param array
	 * @return
	 */
	public static int[] bubbleSort_Asc(int[] array)
	{
		int t=0;
	  for (int j = 0; j < array.length- 1; j++)
		{
		     for (int i = 0; i < array.length - 1; i++) 
				{
					if (array[i] > array[i + 1]) 
					{
						t = array[i];
						array[i] = array[i + 1];
						array[i + 1] = t;
					}
				}
			}
	  return array;
	}
	
	/**
	 * SORTING AN ARRAY IN DESCENDING USING BUBBLE SORT
	 * @param a-array
	 * @return
	 */
	public static int[] bubbleSort_Desc(int[] a)
	{
		int t=0;
	  for (int j = 0; j < a.length- 1; j++)
		{
		     for (int i = 0; i < a.length - 1; i++) 
				{
					if (a[i] < a[i + 1]) 
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
	 * SORTING AN ARRAY IN DESCENDING USING SELECTION SORT
	 * @param array
	 * @return
	 */
	public static int[] selectionSort_Asc(int[] array)
	{
		int temp=0;
		for(int o=0;o<array.length;o++)
		{
			for(int i=o+1;i<array.length;i++)
			{
				if(array[o]>array[i])
				{
   					temp=array[i];
   					array[i]=array[o];
   					array[o]=temp;
				}
			}
		}
		return array;
	}
	
	/**
	 * SORTING AN ARRAY IN ASCENDING USING SELECTION SORT
	 * @param array
	 * @return
	 */
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
	 * @param a-array
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
	 * @param a-array
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
	 * @param a-array
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
	 *FINDING THE SUM OF ELEMENTS OF 2D ARRAY	
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
	 * CHECKING AN ARRAY OF NO.S IS PALINDROME OR NOT
	 * @param array
	 * @return
	 */
	public static boolean palindrome_array(int[] array) 
	{
		int y=array.length-1;
		for(int i=0;i<array.length/2;i++)
		{
			if(array[i]==array[y])
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
		
	
	/**
	 *STORING ARRAY ELEMENTS UPTO A LIMIT 
	 * @param a-array
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
	
	/**
	 *SORTING AND STORING ARRAY UPTO A LIMIT
	 * @param a-array
	 * @return
	 */
	public static int limitedstore(int[] a)
	{
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
		return total;
	}

}


