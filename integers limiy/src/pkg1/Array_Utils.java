package pkg1;

public class Array_Utils 
{

	public static boolean is_sorted(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1]) {
				return false;
			}
		}
		return true;
	}

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
	
}	