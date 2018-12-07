package chapter_10_SortingAndSearching;

import java.util.Arrays;

public class _3_SearchInRotatedArray {

	public static void main(String[] args) {

		int arr[] = {15, 20, 5, 7, 10, 14};
		
		int x = 15;
		System.out.println("Krati");
		System.out.println("Index of " + x + " is : " + search(arr, 0, arr.length-1, x));
		
	}
	
	public static int search(int arr[], int l, int r, int x)
	{
		int index = -1;
		
		int minIndx = findMinIndex(arr, l, r);
		
		if(arr[minIndx] == x)
			return minIndx;
		
		if(arr[minIndx]<x && x<arr[r])
			index = Arrays.binarySearch(arr, minIndx+1, r, x);
		
		if(arr[minIndx] < x && arr[r] < x)
			index = Arrays.binarySearch(arr, l, minIndx-1, x);
		
		return index;
	}

	
	public static int findMinIndex(int arr[], int l, int r)
    {
        if (r < l)  return arr[0];
 
        if (r == l) return arr[l];
 
        int mid = l + (r - l)/2; 
        
      //min is the only element whose previous element would be greater than it
        if (mid < r && arr[mid+1] < arr[mid])
            return mid+1;
 
        if (mid > l && arr[mid] < arr[mid - 1])
            return mid;
 
        if (arr[r] > arr[mid])
            return findMinIndex(arr, l, mid-1);
        return findMinIndex(arr, mid+1, r);
    }

}
