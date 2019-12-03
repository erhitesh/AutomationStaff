package com.sheet;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.List;

public class generateRandomData {

	public static void main(String[] args) throws IOException {

		System.out.println("Loading Start.....");
		int counter = 101;
		String name = "TTT";
		String email = "@yopmail.com";

		String csvFile = args[0];//"/Users/kiwitech/Desktop/Automation/Email.csv";
		FileWriter writer = new FileWriter(csvFile);

		generateRandomData.writeLine(writer,
				Arrays.asList("firstName", "lastName", "gender", "dob", "username", "mobile", "password", "countryId"));
		for (int i = 1; i < 1101; i++) {
			String firstName = name + counter;
			String lastName = "Test";
			String gender = "Male";
			String dob = "1988-01-05";
			String username = name + counter + email;

			String mobile = "9756256825";
			if (counter >= 1 && counter <= 9)
				mobile = "975625680" + counter;
			else if (counter >= 10 && counter <= 100)
				mobile = "97562568" + counter;
			else if (counter >= 100 && counter <= 1000)
				mobile = "9756256" + counter;
			else if (counter >= 1000 && counter <= 5000)
				mobile = "975625" + counter;

			String password = "Test@123";
			String countryId = "1";

			generateRandomData.writeLine(writer,
					Arrays.asList(firstName, lastName, gender, dob, username, mobile, password, countryId));

			counter++;
		}
		writer.flush();
		writer.close();

	}

	private static final char DEFAULT_SEPARATOR = ',';

	public static void writeLine(Writer w, List<String> values) throws IOException {
		writeLine(w, values, DEFAULT_SEPARATOR, ' ');
	}

	public static void writeLine(Writer w, List<String> values, char separators) throws IOException {
		writeLine(w, values, separators, ' ');
	}

	// https://tools.ietf.org/html/rfc4180
	private static String followCVSformat(String value) {

		String result = value;
		if (result.contains("\"")) {
			result = result.replace("\"", "\"\"");
		}
		return result;

	}

	public static void writeLine(Writer w, List<String> values, char separators, char customQuote) throws IOException {

		boolean first = true;

		// default customQuote is empty

		if (separators == ' ') {
			separators = DEFAULT_SEPARATOR;
		}

		StringBuilder sb = new StringBuilder();
		for (String value : values) {
			if (!first) {
				sb.append(separators);
			}
			if (customQuote == ' ') {
				sb.append(followCVSformat(value));
			} else {
				sb.append(customQuote).append(followCVSformat(value)).append(customQuote);
			}

			first = false;
		}
		sb.append("\n");
		w.append(sb.toString());

	}

}