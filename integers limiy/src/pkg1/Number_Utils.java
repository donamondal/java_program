package pkg1;

public class Number_Utils 
{
	/**
	 * Counting no. of digits on a number
	 * @param num
	 * @return
	 */
		public static int count_digit(int num)
		{
			int size =(int) Math.log10(num) + 1;
			return size;
		}
		
		/**
		 * REVERSE A NO.
		 * @param n-number
		 * @return
		 */
		public static int reverse(int n)
		{
			int t=0,r=0;
			while(n!=0)
			{
				r=n%10;
				t=t*10+r;
				n=n/10;
			}
			System.out.println(t);
			return t;
		}
		
		/**
		 * CHECK A NUMBER IN PALINDROME OR NOT
		 * @param n=number
		 * @return
		 */
		public static boolean palindrome_num(int n)
		{
			return reverse(n)==n;
		}	
}
