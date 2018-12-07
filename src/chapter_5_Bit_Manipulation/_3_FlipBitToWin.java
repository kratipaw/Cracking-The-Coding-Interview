package chapter_5_Bit_Manipulation;

public class _3_FlipBitToWin {

	public static void main(String[] args) 
	{
		System.out.println("Longest sequence of 1s by flipping exactly 1 Bit : " + longestSequence(1775));
	}

	private static int longestSequence(int num)
	{
		//Edge case 
		if((~num) == 0)
			return Integer.SIZE;
		
		int maxlength = 1;   //Can have atleast one 1 
		
		int curr = 0;
		int prev = 0;
		
		while(num > 0)
		{
			if((num & 1) == 1)
				curr++;
			else
			{
				if((num & 2) == 2)
					prev = curr;
				else
					prev = 0;
				
				
				curr = 0;
			}
			
			maxlength = Math.max(curr + prev, maxlength);
			
			num = num >> 1;
		}
		
		return maxlength;
	}
}
