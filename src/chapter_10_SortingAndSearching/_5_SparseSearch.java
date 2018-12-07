package chapter_10_SortingAndSearching;

public class _5_SparseSearch {

	public static void main(String[] args) {

		String arr[] = {"at", "", "", "ball", "", "", "", "cat", "", "dad", "", ""};
		
		String string = "ball";
		
		System.out.println("Given string is at index : " + sparseSearch(arr, string));
	}

	private static int sparseSearch(String arr[], String string)
	{
		if(arr.length==0 || string.isEmpty() || string == "")
			return -1;
		
		return search(arr, string, 0, arr.length-1);
	}
	
	private static int search(String arr[], String string, int first, int last)
	{
		int mid = first + ((last-first)/2);
		
		if(arr[mid].isEmpty())
		{
			int right = mid + 1;
			int left = mid - 1;
			
			while(true)
			{
				if(right>last && left< first)
					return -1;
				else if (right<=last && !arr[right].isEmpty())
				{
					mid = right;
					break;
				}
				else if (left>=first && !arr[left].isEmpty())
				{
					mid = left;
					break;
				}
				right++;
				left--;
			}
			
			System.out.println(arr[mid]);
			
			if(arr[mid].equals(string))
				return mid;
			else if(arr[mid].compareTo(string)<0)
				return search(arr, string, mid+1, last);
			else if (arr[mid].compareTo(string)>0)
				return search(arr, string, first, mid-1);
		}
		
		return -1;
	}
}
