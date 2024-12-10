package JAVA;

public class printf {

	public static void main(String[] args) {
		// printf() = 	an optional method to control, format, and display text to the console window
		//				two arguments = format string + (object/variable/value)
		//				% [flags] [precision] [width] [conversion-character

		boolean MyBoolean = true;
		char MyChar = '@';
		String MyString = "Bro";
    	int MyInt = 50 ;
		double MyDouble = 1000;
//		
//		//[conversion-character]
//		System.out.printf("%b",MyBoolean);
//		System.out.printf("%c",MyChar);
//		System.out.printf("%s",MyString);
//		System.out.printf("%d",MyInt);
//		System.out.printf("%f",MyDouble);
		
		//[width]
				// minimum number of characters to be written as output
				System.out.printf("Hello %10s",MyString);
				
				//[precision]
				// sets number of digits of precision when outputting floating-point values
				//System.out.printf("You have this much money %.1f",myDouble);
				
				// [flags]
				// adds an effect to output based on the flag added to format specifier
				// - : left-justify
				// + : output a plus ( + ) or minus ( - ) sign for a numeric value
				// 0 : numeric values are zero-padded
				// , : comma grouping separator if numbers > 1000
				
				//System.out.printf("You have this much money %,f",myDouble);
		
	}

}
