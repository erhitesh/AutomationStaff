package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternPro {

	public static void main(String[] args) {
	
		String name = "Ude BilBef ikre";
		Pattern pattern = Pattern.compile("[a-zA-Z0-9.]*");
		Matcher matcher = pattern.matcher(name);
		System.out.println(matcher.find());
	}

}
