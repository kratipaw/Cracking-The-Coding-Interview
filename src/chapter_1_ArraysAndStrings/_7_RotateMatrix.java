package chapter_1_ArraysAndStrings;

public class _7_RotateMatrix {

	public static void main(String[] args) {

		System.out.println("Given 2D array (N*N) is : ");
		int arr[][] = { {1,  2,  3,  4},
                		{7,  8,  9,  10},
                		{13, 14, 15, 16},
                		{5,  6,  11, 12}
              };
		
		print2DArray(arr, 4, 4);
		
		rotateMatrix(arr, 4);
		
		System.out.println("Rotated matrix is : ");
		
		print2DArray(arr, 4, 4);
	}

	/**
	 * Print the given array...
	 */
	private static void print2DArray(int arr[][], int row, int column)
	{
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
	}
	
	private static void rotateMatrix(int arr[][], int n) {
		
		for (int i = 0; i < n/2; i++) {
			int first = i;
			int last = n - 1 - i;
			//loop for every layer and going inside every time. 
			//save one element to temp variable and then do following
			//copying elements (one by one)of one layer like left-side column to top and then top to right and right to bottom and bottom to left
			for (int j = first; j < last; j++) {
				int start = j - first;
				//save top-left element
				int temp  = arr[first][j]; 
				//copy bottom-left to top
				arr[first][j] = arr[last-start][first];
				//copy bottom-right to bottom-left
				arr[last-start][first] = arr[last][last-start];
				//copy top-right to bottom-right
				arr[last][last-start] = arr[j][last];
				//copy the the saved top-left to top-right
				arr[j][last] = temp;
			}
			
		}
	}
}
