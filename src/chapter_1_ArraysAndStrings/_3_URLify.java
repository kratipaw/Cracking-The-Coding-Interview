package chapter_1_ArraysAndStrings;

public class _3_URLify {

	public static void main(String[] args) {

		String sample = "Mr John Smith";
		
		System.out.println(urlify(sample, sample.length()));
	}

	public static char[] urlify(String str, int trueLength) {
		
		int spaces = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ')
				spaces++;
		}
		
		int newLength = str.length() + spaces * 2;
		
		char output[] = new char[newLength];
		
		for (int i = str.length() - 1; i >= 0; i--) {
			if(str.charAt(i) == ' ') 
			{
				output[newLength - 1] = '0';
				output[newLength - 2] = '2';
				output[newLength - 3] = '%';
				
				newLength = newLength -3;
			}
			else
			{	
				output[newLength - 1] = str.charAt(i);
				newLength--;
			}
		}
		
		return output;
	}
}
