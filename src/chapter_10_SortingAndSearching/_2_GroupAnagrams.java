package chapter_10_SortingAndSearching;

import java.util.Arrays;
import java.util.Comparator;

public class _2_GroupAnagrams implements Comparator<String>{

	public static void main(String[] args) {

		String arr[] = {"ab", "xyz", "cd", "ba", "yzx", "pqr"};
		
		Arrays.sort(arr, new _2_GroupAnagrams());
		
		printArray(arr);
		
	}

	public static void printArray(String arr[]) {
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "   ");
		}
		System.out.println();
	}
	
	public String sortChars(String string)
	{
		char str[] = string.toCharArray();
		
		Arrays.sort(str);
		
		return new String(str);
	}
	
	@Override
	public int compare(String o1, String o2) {
		return sortChars(o1).compareTo(sortChars(o2));
	}

}
