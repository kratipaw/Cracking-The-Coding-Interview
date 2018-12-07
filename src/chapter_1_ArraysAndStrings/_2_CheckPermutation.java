package chapter_1_ArraysAndStrings;

import java.util.Arrays;

public class _2_CheckPermutation {

	public static void main(String[] args) {

		String smpl1 = "abcd";
		String smpl2 = "bcde";
		
		System.out.println(checkPermutation(smpl1, smpl2));
		
		System.out.println(checkPermutation_v2(smpl1, smpl2));
	}

	public static boolean checkPermutation(String str1, String str2) {
		
		//Assuming the string to be checked consist of 256 letters of alphabet and also it is case sensitive i.e. e & E are diff
		
		if(str1.length() != str2.length())
			return false;
		
		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for (int i = 0; i < arr2.length; i++) {
			if(arr1[i] != arr2[i])
				return false;
		}
			
		return true;
	}
	
	public static boolean checkPermutation_v2(String str1, String str2) {
		
		if(str1.length() != str2.length())
			return false;
		
		//Assuming the string to be of type extended ASCII with limit of 256 letters and also it is case sensitive i.e. e & E are diff
		int ASCII = 256;
		
		int lookup[] = new int[ASCII];
		
		for (int i = 0; i < lookup.length; i++) {
			lookup[i] = 0;
		}
		
		int A = 'A';
		
		for (int i = 0; i < str1.length(); i++) {
			int c = str1.charAt(i);
			lookup[c - A]++;
		}
		
		for (int i = 0; i < str2.length(); i++) {
			int c = str2.charAt(i);
			lookup[c - A]--;
		}
		
		for (int i = 0; i < lookup.length; i++) {
			if(lookup[i] != 0)
				return false;
		}
		
		return true;
	}
}
