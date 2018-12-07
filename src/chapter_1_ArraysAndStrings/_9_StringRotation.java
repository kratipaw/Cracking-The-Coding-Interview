package chapter_1_ArraysAndStrings;

public class _9_StringRotation {

	public static void main(String[] args) {

		String sample = "waterbottle";
		
		String rotated = "erbottlelat";
		
		System.out.println(isRotation(sample, rotated));
		
	}

	private static boolean isRotation(String s1, String s2) {
		
		if(s1.length() != s2.length())
			return false;
		
		String combine = s1 + s1;
		
		boolean ans = combine.contains(s2);
		
		return ans;
	}
}
