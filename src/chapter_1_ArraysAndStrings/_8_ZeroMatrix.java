package chapter_1_ArraysAndStrings;

public class _8_ZeroMatrix {

	public static void main(String[] args) {

		System.out.println("Given 2D array is : ");
		int arr[][] = { {1,  0,  3,  4,  5,  6},
                		{7,  8,  9,  10, 11, 12},
                		{13, 14, 15, 16, 0, 18}
              };
		
		print2DArray(arr, 3, 6);
		
		zeroMatrix(arr, 3, 6);
		
		System.out.println("Changed matrix is : ");
		
		print2DArray(arr, 3, 6);
		
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
	
	private static void zeroMatrix(int arr[][], int row, int column) {
		
		boolean zeroRow[] = new boolean[row];
		boolean zeroCol[] = new boolean[column];
		
		for (int i = 0; i < row; i++) 
		{
			for (int j = 0; j < column; j++) 
			{
				if(arr[i][j] == 0) {
					zeroRow[i] = true;
					zeroCol[j] = true;
				}
			}
			
		}
		
		for (int i = 0; i < row; i++) {
			if(zeroRow[i])
			{
				for (int j = 0; j < column; j++) {
					arr[i][j] = 0;
				}
			}
		}
		
		for (int i = 0; i < column; i++) {
			if(zeroCol[i])
			{
				for (int j = 0; j < row; j++) {
					arr[j][i] = 0;
				}
			}
		}
	}
}
