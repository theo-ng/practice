package practice;

public class Arrays {

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
	
}
