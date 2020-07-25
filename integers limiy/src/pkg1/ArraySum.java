package pkg1;

public class ArraySum {

	public static int sum(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

	public static int sum(int[][] array) {
		int total = 0;
		for (int r = 0; r < array.length; r++) {
			for (int c = 0; c < array[r].length; c++) {
				total += array[r][c];
			}
		}
		return total;
	}

	public static void main(String[] args) {
		int[] a = { 2, 4, 6, 8, 9, 7, 10, 57 };
		int[][] array = { { 3, 56, 5, 45, 34, 7 }, { 34, 78, 67, 46, 75 } };

//		adding 1D array
		int sum = sum(a);
		System.out.println("Sum of 1D array = " + sum);

//		Adding 2D array
		int total = sum(array);
		System.out.println("Sum of 2D array = " + total);

	}
}
