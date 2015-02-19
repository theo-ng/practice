package practice;

import java.util.Arrays;

public class ArrayPractice {

	public Boolean checkForUnique(String str) {
		boolean[] chars = new boolean[256];
		String upper = str.toUpperCase();
		int size = upper.length();
		
		for(int i=0; i<size; i++) {
			int val = str.charAt(i);
			if (chars[val]) 
				return false;
			chars[val] = true;
		}
		return true;
	}
	
	public String reverseString(String str) {
		if (str == null)
			return null;
		
		return new StringBuilder(str).reverse().toString();
	}
	
	public String removeDuplicates(String str) {
		
		boolean seen[] = new boolean[256];
		StringBuilder sb = new StringBuilder(seen.length);
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if (!seen[ch]) {
				seen[ch] = true;
				sb.append(ch);
			}
		}
		return sb.toString();
	}
	
	
	public Boolean isAnagram(String s, String t) {
		char[] s1 = s.replaceAll("[\\s]", "").toCharArray();
		char[] s2 = t.replaceAll("[\\s]", "").toCharArray();
		
		Arrays.sort(s1);
		Arrays.sort(s2);
		
		return Arrays.equals(s1, s2);
	}
}
