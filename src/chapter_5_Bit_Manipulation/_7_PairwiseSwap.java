package chapter_5_Bit_Manipulation;

public class _7_PairwiseSwap {

	public static void main(String[] args) {

		System.out.println(Integer.toBinaryString(50));
		System.out.println(Integer.toBinaryString(49));
		System.out.println(swapOddEvenBits(50));
	}

	private static long swapOddEvenBits(int num)
	{
		String strEven = "10101010010101010101010101010101";
		
		String strOdd  = "01010101001010101010101010101010";
		
		long nOdd = Long.parseLong(strOdd, 2);
		long nEven = Long.parseLong(strEven, 2);
		
		long even = (nEven & num) << 1;
		long odd = (nOdd & num) >> 1; 
		
		return ((even) | (odd));
	}
}
