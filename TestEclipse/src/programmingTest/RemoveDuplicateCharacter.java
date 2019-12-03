package programmingTest;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacter {
	
	public static void main(String args[]){
		
		String name = "HiteshBhardwaj";
		char[] chars = name.toLowerCase().toCharArray();
		Set<Character> character = new LinkedHashSet<Character>();
		for(char c: chars){
			character.add(c);
		}
		  StringBuffer buffer = new StringBuffer();
		  for(Character ch: character){
			  buffer.append(ch);
		  }
			System.out.println(buffer);
	}

}
