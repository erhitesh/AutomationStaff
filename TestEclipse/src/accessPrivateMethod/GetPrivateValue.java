package accessPrivateMethod;

public class GetPrivateValue {
 
	Student st = new Student();
	public static void main(String[] args) {
		GetPrivateValue privateValue = new GetPrivateValue();
		privateValue.st.setName("Hitesh");
		System.out.println(privateValue.st.getName());
	}

}
