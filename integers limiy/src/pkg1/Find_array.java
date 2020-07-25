package pkg1;

public class Find_array {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };

		int find = 87;
		
		numReturn(a, 5);
		numReturn(a, 3);
		numReturn(a, 9);
		int[] b = {3,6,8,23,25,45,12};
		numReturn(b, 25);
		numReturn(b, 36);
		
		boolean result = numReturn(b, 12);
		
		System.out.println(4 == 5);
		if(result) {
			System.out.println("Present");
		} else {
			System.out.println("Not Present");
		}

	}
	
	public static boolean numReturn(int[] donkey, int find) {
		boolean isPresent = false;
		for (int i = 0; i < donkey.length; i++) {
			if (donkey[i] == find) {
				isPresent = true;
				break;
			}
		}
		
		return isPresent;
	}
}
