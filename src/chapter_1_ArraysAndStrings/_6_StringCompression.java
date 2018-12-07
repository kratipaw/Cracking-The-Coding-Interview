package chapter_1_ArraysAndStrings;

public class _6_StringCompression {

	public static void main(String[] args) {

		String sample = "aabcccccaaa"; 
		
		System.out.println(getCompressedString(sample));
	}

	public static String getCompressedString(String str) {
		
		StringBuilder compressed = new StringBuilder(str.length());
		int count = 1;
		compressed.append(str.charAt(0));
		for (int i = 1; i < str.length(); i++) {
			if(str.charAt(i) == str.charAt(i-1)) 
			{
				count++;
			}
			else 
			{
				compressed.append(count);
				compressed.append(str.charAt(i));
				count = 1;
			}
			
		}
		compressed.append(count);
		return compressed.length() < str.length() ? compressed.toString() : str;
	}
}
