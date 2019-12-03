package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveSpecificWordFromString {

	public static void removeWords() {
		String[] commonWords = { "the", "of", "to", "and", "a", "in", "is", "it", "you", "that", "he", "was", "for",
				"on", "are", "with", "as", "i" };
		List<String> wordList = new ArrayList<String>(Arrays.asList(commonWords));
		System.out.println("wordList..>" + wordList + "\n" + wordList.size());

		String s = "a is was with";
		List<String> list = new ArrayList<String>(Arrays.asList(s.split(" ")));
		System.out.println("Remove Words from Lists...." + list);

//		for (int i = 0; i < list.size(); i++) {
//			// Check to see if a sentence word is a common word, if so remove word
//			for (int c = 0; c < wordList.size(); c++) {
//				if (list.get(i).equals(wordList.get(c))) {
//					System.out.println("Removed Characterss.." + list.get(i));
//					list.remove(i);
//				}
//			}
//		}
		
		for (int i = 0; i < list.size(); i++) {
			while (wordList.contains(list.get(i))) {
				wordList.remove(i);
			}
		}
		
		System.out.println("Removed List Now.... " + list);
		System.out.println("Word List..." + wordList.size());
	}

	public static void main(String args[]) {
		removeWords();

	}

}
