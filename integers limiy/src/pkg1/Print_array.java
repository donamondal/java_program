package pkg1;

import java.util.Scanner;

public class Print_array {
	public static void main(String[] args) {
		int size=5;
		int[] a = new int[size];
		Scanner in = new Scanner(System.in);
		System.out.print("enter " + size + " elements");
		for (int i = 0; i < size; i++) {
			int s = in.nextInt();
			a[i] = s;
		}
		for (int i = 0; i < size; i++) {
			System.out.println(a[i]);
		}

		System.out.print("enter element to be edited");
		int n = in.nextInt();
//		for (int i = 0; i < size; i++) {
//			if (a[i] == n) {
//				System.out.print("enter new element");
//				int m = in.nextInt();
//				a[i] = m;
//			}
//			}
//           for (int i = 0; i < size; i++) {
//			System.out.println(a[i]);
//		}
		int v=0;
           for (int i = 0; i < size; i++) {
        	   //if (a[i] != n) {
        		   if(a[i]==n)
        		   {   v=a[i];
        			   System.out.print("elemen");
			}
        		   else {
        			   System.out.print("element does not exit");
        		   }
        	   //System.out.print("element does not exit");
           }
   			
}
}

