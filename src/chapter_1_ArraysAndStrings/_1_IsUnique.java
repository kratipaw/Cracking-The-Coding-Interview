package chapter_1_ArraysAndStrings;

public class _1_IsUnique {

	public static void main(String[] args) {

		String sample = "abEdf";
		
		System.out.println(isUnique(sample));
	}
	
	public static boolean isUnique(String string) {
		
		//Assuming the string to be of type extended ASCII with limit of 256 letters and also it is case sensitive i.e. e & E are diff
		if(string.length() > 256)
			return false;
		
		int lookup[] = new int[256];

		for (int i = 0; i < lookup.length; i++) {
			lookup[i] = 0;
		}
		
		int A = 'A';
		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			if(lookup[c - A] == 0)
			{
				lookup[c - A]++;
			}
			else
				return false;
		}
		
		return true;
	}

}
