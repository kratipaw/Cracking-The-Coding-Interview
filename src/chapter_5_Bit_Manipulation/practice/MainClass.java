package chapter_5_Bit_Manipulation.practice;

public class MainClass {

	public MainClass() {
	}
	
	public static void main(String[] args) {

		MainClass main = new MainClass();
		
//		System.out.println("Arthmetic Shift ---------------");
//		System.out.println(main.repeatedArthmeticShift(13, 1));
//		System.out.println(main.repeatedArthmeticShift(-6, 1));;
		
		//System.out.println("Logical Shift -----------------");
//		System.out.println(main.repeatedLogicalShift(13, 1));
		System.out.println(main.repeatedLogicalShift(-20, 2));
		
		System.out.println("Divide 49 by 7 : " + main.divisonWOMod(49, 7));
		
	}

	public int repeatedArthmeticShift(int x, int count)
	{
		for (int i = 0; i < count; i++) {
			x >>= 1;
		}
		
		return x;
	}
	
	public int repeatedLogicalShift(int x, int count)
	{
		for (int i = 0; i < count; i++) {
			System.out.println(x);
			x >>>= 1;
		}
		
//		System.out.println(x);
		
		return x;
	}
	
	private int divisonWOMod(int dividend, int divisor)
	{
		int quot = 0;
		
		while(dividend>=divisor)
		{
			dividend = dividend - divisor;
			
			quot++;
		}
		
		return quot;
	}
	
	private int divisonWOMod_Bit(int dividend, int divisor)
	{
		return 0;
	}
}
