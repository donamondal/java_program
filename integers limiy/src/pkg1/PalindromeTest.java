package pkg1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeTest {

	@Test
	void test1() {
		int[] a = {1,2,4,2,4,2};
		assertEquals(false, Palindrome.palindrom(a));
	}

	@Test
	void test2() {
		int[] a = {1,2,4,2};
		assertEquals(false, Palindrome.palindrom(a));
	}
	
	@Test
	void test3() {
		int[] a = {1,2,4,4,2,1};
		assertEquals(true, Palindrome.palindrom(a));
	}
}
