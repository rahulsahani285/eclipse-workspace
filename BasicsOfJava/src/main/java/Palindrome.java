
public class Palindrome {
	static String ReverseString = "";

	public static void stringPalindrom(String str) {
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.println(i);
			ReverseString = ReverseString + str.charAt(i);
		}
		System.out.println(ReverseString.equalsIgnoreCase(str));
	}

	public static void numberPalindrom(int number) {
		int temp=number;
		int remainder=0;
		while(number>=0)
		{
      remainder=remainder*10 + number%10;
    
      number=number/10;
    
		}
		 if(remainder==temp)
	     {
	    	 System.out.println("The given number is palindrome");
	     }
	     else
	     {
	    	 System.out.println("not palindrome");
	     }
	}

	public static void main(String[] args) {
		//stringPalindrom("moreerom");
		numberPalindrom(0110);
	}

}
