package system;

public class SystemOperation {

	public static void main(String[] args) {
		System.out.println("Environment.."+System.getenv("windir"));
		System.out.println("Environment.."+System.getenv());
		System.out.println(System.getenv("os"));
		System.out.println(System.getProperty("user.dir"));
	}
}
