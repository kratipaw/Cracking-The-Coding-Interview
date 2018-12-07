package chapter_10_SortingAndSearching;

import java.util.ArrayList;
import java.util.List;

public class _4_SortedSearchNoSize {

	public static void main(String[] args) {

		List<Integer> listy = new ArrayList<Integer>();
		
		listy.add(4);
		listy.add(5);
		listy.add(7);
		listy.add(9);
		listy.add(14);
		
		int x = 5;
		
		System.out.println("Element " + x + " is at index : " + search(listy, x));
		
	}
	
	//Assume that this list has no size() function to get its last index
	private static int search(List<Integer> listy, int x)
	{
		int index = 1;
		
		//to get the approximate length/size of list
		while(listy.get(index - 1) !=-1 && listy.get(index - 1)<x)
		{
			index = index * 2;
		}
		return binarySearch(listy, x, index/2, index);
	}
	
	private static int binarySearch(List<Integer> listy, int x, int left, int right)
	{
		while(left<right)
		{
			int mid = left + ((right - left)/2);
			
			int midElement = listy.get(mid);
			
			if(midElement>x || midElement==-1)
				right = mid-1;
			else if (midElement<x)
				left = mid+1;
			else
				return mid;
		}
			
		return -1;
	}

}
