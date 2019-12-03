package Test;


import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomStringGen {

	public static void main(String[] args) {
		String domain_name = "@justwink.com";
		String email = RandomStringUtils.randomAlphabetic(5).toLowerCase() + domain_name;
		//RandomStringUtils.randomNumeric(1)
		System.out.println(email);
		Random r = new Random();
		int Low = 1;
		int High = 12;
		int R = r.nextInt(High-Low) + Low;
		System.out.println(r.nextInt(R));
	}

}
