package chapter_5_Bit_Manipulation;

public class _5_Debugger {

	public static void main(String[] args) {

		System.out.println(debug(16));
	}

	private static boolean debug(int n)
	{
		return ((n & (n-1)) == 0);
	}
}
