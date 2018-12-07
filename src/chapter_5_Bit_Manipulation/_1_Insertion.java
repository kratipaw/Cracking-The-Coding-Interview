package chapter_5_Bit_Manipulation;

public class _1_Insertion {

	public static void main(String[] args) {

		int M = 2;
		int N = 22;
		
		int i = 1;
		int j = 2;
		
		System.out.println(insertMintoN(M, N, i, j));
	}

	private static int insertMintoN(int M, int N, int i, int j)
	{
		// modify N and shift it to left with zeros from location i
		// First Modified N : make zeros from j to i digits, so that when we 
		// OR it with above modified N then we will obtain the required result.
		
		int right = (1 << i) -1;    // will create a sequence of 00001111 i.e. 0 from MSB till ith location
		
		int left = (~0) << (j+1);   // Will create a sequence of 11000000 i.e 1 from MSB till jth location
		
		int withZero = right | left;  // Will combine above two sequence and have 000.. from j to i i.e. 11001111
		
		int N_modified = N & withZero;  // Will modifiy N to have 0 from i to j
		
		int M_modified = M << i;   // WIll modify M to start at i and have 0 from ith till 0th bit
		
		return M_modified | N_modified;  // N will have M inserted into it from jth location to ith location
		
		
	}
}
