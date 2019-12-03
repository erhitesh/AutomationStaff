package testSelenium;

class Student {
	
	private String userName = "";
	
	public String getName() {
		return userName;
	}
	
	public void setName(String userName) {
		this.userName = userName;
	}
}

public class EncapsulationTest {

	public static void main(String args[]) {
		Student student = new Student();
		student.setName("Hitesh");
		System.out.println(student.getName());
	}
}
