package programmingTest;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println(asPalindrome("Hih"));
	}
	
	
	public static void checkNumberPalindrome(){
		int r, temp, n = 454, sum = 0;
		temp = n;		
		while( n > 0){
			r = n % 10;
			sum = (sum*10)+r;
			n = n/10;
		}
			if( temp == sum)
				System.out.println("Palindrom number"+sum);
			else
				System.out.println("Not Palindrome");
		
	}
	
	public static boolean isPalindrome(int number){
		int r, temp, sum = 0;
		temp = number;
		while(number > 0){
			r = number % 10;
			sum = (sum*10)+r;
			number = number/10;
		}
		if(temp == sum)
			return true;
		else
			return false;
	}
	
	public static String asPalindrome(String str){
		String original, reverse = "";
		
		original = str.toLowerCase();
		
		for (int i = original.length()-1; i >=0; i--){
			reverse = reverse +original.charAt(i);
		}
		
		if (reverse.equalsIgnoreCase(str))
			return "String palindrome..>"+reverse;
		else 
			return "String not palindrome..>"+reverse;
	}

}
