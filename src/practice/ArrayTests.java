package practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayTests {

	@Test
	public void removeDuplicatestest() {
		
		Arrays tester = new Arrays();
		
		assertEquals("abcd",tester.removeDuplicates("aabbccd"));
		assertEquals("",tester.removeDuplicates(""));
		assertEquals("a",tester.removeDuplicates("aaaaaaaaaaaaaa"));
	}

}
