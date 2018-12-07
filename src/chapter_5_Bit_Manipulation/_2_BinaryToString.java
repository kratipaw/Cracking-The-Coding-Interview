package chapter_5_Bit_Manipulation;

public class _2_BinaryToString {

	public static void main(String[] args) {

		System.out.println("Binary representation of given number : " + Integer.toBinaryString(10));
		
		System.out.println("Binary representation of given number : " + printBinary(10));
		
		System.out.println("Binary representation of a given number : " + printBinary(0.625));
	}
	
	private static String printBinary(int number)
	{
		StringBuilder binary = new StringBuilder("");
		
		while(number > 0)
		{
			int num = number%2;
			binary.append(num);
			number = (number/2);
		}
		
		return binary.reverse().toString();
	}
	
	private static String printBinary(double number)
	{
		if(number > 1 || number < 0)
			return "ERROR";
		
		StringBuilder binary = new StringBuilder("");
		binary.append(".");
		
		while(number > 0)
		{
			if(binary.length() >=32)
				return "ERROR";
			
			double i = number * 2;
			
			if(i >= 1)
			{
				binary.append(1);
				number = i - 1;
			}
			else
			{
				binary.append(0);
				number = i;
			}
		}
		
		return binary.toString();
	}
}
