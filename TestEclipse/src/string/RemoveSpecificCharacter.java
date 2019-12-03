package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveSpecificCharacter {

	public static String remove(String word, char charToRemove) {
		StringBuffer sb = new StringBuffer();
		char[] letters = word.toCharArray();
		for (char c : letters) {
			if (c != charToRemove)
				sb.append(c);
		}
		return sb.toString();
	}

	public static void main(String[] args) throws IOException {
		System.out.println("Enter the string");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(remove(br.readLine().toLowerCase(), 'e'));
	}

}
