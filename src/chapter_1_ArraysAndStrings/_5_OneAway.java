package chapter_1_ArraysAndStrings;

public class _5_OneAway {

	public static void main(String[] args) {

		String sample1 = "pale";
		String sampl2 = "bale";
		
		System.out.println(oneEditPair(sample1, sampl2));
	}

	public static boolean oneEditPair(String str1, String str2) {
		
		int count = 0;
		
		if(Math.abs(str1.length() - str2.length()) == 1)
			return true;
		else if (Math.abs(str1.length() - str2.length()) > 1)
			return false;
		
		//Assuming the string to be of type extended ASCII with limit of 256 letters and also it is case sensitive i.e. e & E are diff
		int lookup[] = new int[256];
		
		for (int i = 0; i < lookup.length; i++) {
			lookup[i] = 0;
		}
		
		int A = 'A';
		
		for (int j = 0; j < str1.length(); j++) {
			int c = str1.charAt(j);
			lookup[c - A]++;
		}
		
		for (int j = 0; j < str2.length(); j++) {
			int c = str2.charAt(j);
			lookup[c - A]--;
			if(lookup[c -  A] < 0)
				count++;
			if(count >1)
				return false;
		}
		
		return true;
	}
}
