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
		 * Finding greatest among 3no.s
		 * @param n1
		 * @param n2
		 * @param n3
		 * @return
		 */
		public static int find_greatest(int n1,int n2,int n3)
		{
			if(n1>=n2 && n1>=n3)
			{
				return n1;
			}
			else if(n2>=n1 && n2>=n3)
			{
				return n2;
			}
			else
			{
				return n3;
			}
		}
		
		/**
		 * Finding smallest among 3no.s
		 * @param n1
		 * @param n2
		 * @param n3
		 * @return
		 */
		public static int find_smallest(int n1,int n2,int n3)
		{
			if(n1<=n2 && n1<=n3)
			{
				return n1;
			}
			else if(n2<=n1 && n2<=n3)
			{
				return n2;
			}
			else
			{
				return n3;
			}
		}
		
		/**
		 * Finding greatest among 2no.s
		 * @param n1
		 * @param n2
		 * @return
		 */
		public static int find_greatest(int n1,int n2)
		{
			return(n1>=n2)?n1:n2;
		}

		/**
		 * Finding smallest among 2no.s
		 * @param n1
		 * @param n2
		 * @return
		 */
		public static int find_smallest(int n1,int n2)
		{
			return(n1<=n2)?n1:n2;
		}
		
		/**
		 * Sum of digits in a given no.
		 * @param num
		 * @return
		 */
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
		
		/**
		 * Sum of N natural numbers
		 * @param num
		 * @return
		 */
		public static int sum_of_Nnatural_no(int num)
		{
			int r=0;
			for(int i=0;i<=num;i++)
			{
				r+=i;
			}
			return r;
		}
		
		/**
		 * Sum of N natural numbers by formula
		 * @param num
		 * @return
		 */
		public static int sum_of_naturalNo_Byformula(int num)
		{
			int r=num*(num+1)/2;
			return r;
		}
		
		/**
		 * Sum of natural no.s within a given range
		 * @param n1
		 * @param n2
		 * @return
		 */
		public static int sum_within_range(int n1,int n2)
		{
			int r=0;
			for(int i=n1;i<=n2;i++)
			{
				r+=i;
			}
			return r;
		}
		
		/**
		 * Factorial of a number
		 * @param num
		 * @return
		 */
		public static int factorial(int num)
		{
			int r=1;
			for (int i=num;i>=2;i--)
			{
				r*=i;
			}
			return r;
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
		
		/**
		 * Calculating fibonacci series
		 * @param limit
		 * @return
		 */
		public static int[] fibonacci_series(int limit)
		{
			int[] a=new int[20];
			int i=0,j=1,n=0;
			a[0]=i;
			a[1]=j;
			for(int e=2;a[e]<=limit;e++)
			{
				n=i+j;
				if(n>limit) 
				{
					return a;
				}
				a[e]=n;
				i=j;
				j=a[e];
			}
		    return a; 
		}  
}
