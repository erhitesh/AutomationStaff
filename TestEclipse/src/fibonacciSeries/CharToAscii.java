package fibonacciSeries;

public class CharToAscii {
	
	public static void charToAscii(){
		char c = 'a';
		int result = c;
		System.out.println(result);
	}
	
	public static void asciiToChar(){
		int a = 98;
		char result = (char) a;
		System.out.println(result);
	}
	
	public static void intToString(){
		int a = 10;
		String value1 = String.valueOf(a);//Integer.toString(a);
		String value2 = Integer.toString(a);
		System.out.println("String value "+value1+" "+value2);
	}
	
	public static void stringToInt(){
		String name = "10";
		int value1 = Integer.parseInt(name);
		int value2 = Integer.valueOf(name);
		System.out.println("Int value "+value1+" "+value2);
		
	}
	
	public static void main(String args[]){
		charToAscii();
		asciiToChar();
		intToString();
		stringToInt();
		
	}

}
