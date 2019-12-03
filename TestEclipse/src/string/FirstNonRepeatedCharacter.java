package string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatedCharacter {

	public static char getFirstNonRepeatedChar(String str) {
		Character chars = null;
		Map<Character, Integer> counts = new LinkedHashMap<Character, Integer>(str.length());
		for (char c : str.toCharArray())
			counts.put(c, counts.containsKey(c) ? counts.get(c) + 1 : 1);
		for (Entry<Character, Integer> entry : counts.entrySet()) {
			if (entry.getValue() == 1)
				chars = entry.getKey();
		}
		
		return chars;
	}

	public static void main(String[] args) {
		char ch = getFirstNonRepeatedChar("tweetyyr");
		System.out.println(ch);
	}

}
