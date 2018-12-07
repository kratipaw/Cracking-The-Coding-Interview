package chapter_1_ArraysAndStrings;

public class _4_PalindromePermutation {

	public static void main(String[] args) {

		String sample = "abac";
		
		System.out.println(paliPermutation(sample));
	}

	public static boolean paliPermutation(String str) {
		
		//Assuming the string to be of type extended ASCII with limit of 256 letters and also it is case sensitive i.e. e & E are diff
		
		int lookup[] = new int[256];
		
		for (int i = 0; i < lookup.length; i++) {
			lookup[i] = 0;
		}
		
		int A = 'A';
		
		for (int i = 0; i < str.length(); i++) {
			int c = str.charAt(i);
			lookup[c - A]++;
		}
		
		int count = 0;
		
		for (int i = 0; i < lookup.length; i++) {
			if(lookup[i] % 2 != 0)
				count++;
			if(count > 1)
				return false;
		}
		
		return true;
	}
}
