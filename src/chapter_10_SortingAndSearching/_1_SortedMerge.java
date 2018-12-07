package chapter_10_SortingAndSearching;

public class _1_SortedMerge {

	public static void main(String[] args) {

		int arr1[] = new int[10];
		
		arr1[0] = 4;
		arr1[1] = 7;
		arr1[2] = 9;
		arr1[3] = 11;
		arr1[4] = 15;
		
		printArray(arr1);
		
		int arr2[] = {2, 5, 8, 10, 19};
		
		printArray(arr2);
		
		merge(arr1, arr2, 5, 5);

	}
	
	
	private static void printArray(int arr[])
	{
		System.out.println("Given array is  : " );
		
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i] + "   ");
		}
		
		System.out.println();
	}
	
	private static void merge(int arr1[], int arr2[], int arr1Elements, int arr2Elements )
	{
		int len1 = arr1.length;
		
		int res[] = new int[len1];
		
		int i=0, j=0, k=0;
		
		while(i<arr1Elements && j<arr2Elements)
		{
			if(arr1[i]<arr2[j])
			{
				res[k] = arr1[i];
				i++;
			}
		else if(arr1[i]> arr2[j])
			{
				res[k] = arr2[j];
				j++;
			}
			else
			{
				res[k] = arr1[i];
				i++;
				j++;
			}
			
			k++;
		}
		
		while(i<arr1Elements)
		{
			res[k] = arr1[i];
			i++;
			k++;
		}
		
		while(j<arr2Elements)
		{
			res[k] = arr2[j];
			j++;
			k++;
		}
		
		printArray(res);
	}

}
