package string;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;

public class StringOperations {
	
	/**
	 * This method is used to reverse the
	 * @throws IOException 
	 */
	public static void reverseString() throws IOException{
      String original, reverse = "";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String for reverse..");
		original = br.readLine();
		for(int i = original.length() - 1 ; i >= 0 ; i--)
			reverse = reverse + original.charAt(i);
		System.out.println("Reverse string is... "+reverse);	
	}
	
	public static void countVowel() throws IOException{
		String str;
		int vowels = 0, digits = 0, blanks = 0, consonants = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String for counts for vowels, digits, blanks");
		str = br.readLine();
		
		for(int i = 0; i < str.length(); i++){
			char ch = str.charAt(i);
			if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
				vowels++;
			}
			
			else if (Character.isDigit(ch)) { 
				digits++;
			}
			
			else if (Character.isWhitespace(ch)) { //Character.isWhitespace(ch)
				blanks++;	
			}
			
			else if (Character.isLetter(ch)) {	
				consonants++;
			}	
		}
		System.out.println("****************************Vowels count are******************"+vowels);
		System.out.println("****************************Digits count are******************"+digits);
		System.out.println("****************************Blanks count are******************"+blanks);
		System.out.println("****************************Consonants count are******************"+consonants);
	}
	
	
	public static void removeDuplicateCharacterFromString() throws IOException{
		String str = "";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String");
		str = br.readLine().toLowerCase();
		char[] chars = str.toCharArray();
		Set<Character> charset = new LinkedHashSet<Character>();
		for(char ch: chars){
			charset.add(ch);
		}
		StringBuffer buffer = new StringBuffer();
		for(Character character: charset){
			buffer.append(character);
		}
		System.out.println("Duplicate characters are"+buffer);
	}
	
	public static boolean isVowels() throws IOException{
		String str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string from which you want to check wheather it is vowel or not.");
		str = br.readLine();
		for(int i = 0; i < str.length(); i++){
			char ch = str.charAt(i);
			if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
				System.out.println("Vowel");
				return true;	
			}
		}
		System.out.println("String does not have any vowel ..");
		return false;
	}
	
	public static void main(String args[]) throws IOException{
		
		reverseString();
		countVowel();
		removeDuplicateCharacterFromString();
		isVowels();
     }
}
