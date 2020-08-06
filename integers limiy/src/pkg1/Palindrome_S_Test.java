package pkg1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Palindrome_S_Test
{
	@Test
	void test1() {
		String a = "level";
		assertEquals(true, Palindrome_string.palindrome_string(a));
	}
	
	@Test
	void test2() {
		String a = "levele";
		assertEquals(false, Palindrome_string.palindrome_string(a));
	}
	
	@Test
	void test3() {
		String a = "roor";
		assertEquals(true, Palindrome_string.palindrome_string(a));
	}
	
	@Test
	void test4() {
		String a = "leve";
		assertEquals(false, Palindrome_string.palindrome_string(a));
	}
	
	@Test
	void test5() {
		String a = "levee";
		assertEquals(false, Palindrome_string.palindrome_string(a));
	}
	
	@Test
	void test6() {
		String a = "wevel";
		assertEquals(false, Palindrome_string.palindrome_string(a));
	}
	
	@Test
	void test7() {
		String a = "levwel";
		assertEquals(false, Palindrome_string.palindrome_string(a));
	}
	
	@Test
	void test8() {
		String a = "levvwwvvel";
		assertEquals(true, Palindrome_string.palindrome_string(a));
	}
}
