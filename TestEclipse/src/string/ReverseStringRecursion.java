package string;

public class ReverseStringRecursion {
	
	public static String getString(String str){
		if (str.length() <=1 || str == null)
			return str;
		return getString(str.substring(1))+ str.charAt(0);
	}
	
	public static void main(String args[]) {
		System.out.println(getString("abc"));
	}

}
