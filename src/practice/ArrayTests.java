package practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayTests {
	ArrayPractice tester = new ArrayPractice();
	
	@Test
	public void checkForUniqueTest() {
		assertFalse(tester.checkForUnique("aabbc"));
		assertTrue(tester.checkForUnique("abc"));
	}
	
	@Test
	public void reverseStringTest() {
		assertEquals("edcba",tester.reverseString("abcde"));
		assertEquals("edacaba",tester.reverseString("abacade"));
		assertEquals("",tester.reverseString(""));
	}
	
	@Test
	public void removeDuplicatesTest() {		
		assertEquals("abcd",tester.removeDuplicates("aabbccd"));
		assertEquals("",tester.removeDuplicates(""));
		assertEquals("a",tester.removeDuplicates("aaaaaaaaaaaaaa"));
	}

	@Test
	public void isAnagramTest() {
		assertTrue(tester.isAnagram("test", "etst"));
		assertFalse(tester.isAnagram("no", "yes"));
		assertTrue(tester.isAnagram("", ""));
	}
}
