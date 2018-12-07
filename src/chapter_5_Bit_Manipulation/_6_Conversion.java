package chapter_5_Bit_Manipulation;

public class _6_Conversion {

	public static void main(String[] args) 
	{
		System.out.println("Number of bits to flip to convert A to B : " + convertAToB(29, 15));
	}

	private static int convertAToB(int A, int B)
	{
		return countBits(A^B);
	}
	
	private static int countBits(int num)
	{
		int count = 0;
		while(num>0)
		{
			count = count + (num&1);
			num = num>>1;
		}
		
		return count;
	}
}
