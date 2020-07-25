package pkg1;
import java.util.Scanner;

public class Array_2D {
	public static void main(String[] args)
	{   
		int r=0,c=0; 
		int[][] a=new int[3][3];
		Scanner in = new Scanner(System.in);
//		int[][] a = {{1,2,3,4} , {5,6,7,8,9,10} ,{11,12,13}};
		
		
		System.out.println("enter 3*3 element");
		for(r=0;r<a.length;r++)
		{
			for(c=0;c<a[r].length;c++) 
			{
				a[r][c] = in.nextInt();
//				a[r][c]=n;
		
			}
		}
		
		
		for(r=0;r<a.length;r++)
		{
			for(c=0;c<a[r].length;c++) 
			{
				System.out.print(a[r][c]+"\t");
			}
			System.out.print("\n");
		}
	}

}
