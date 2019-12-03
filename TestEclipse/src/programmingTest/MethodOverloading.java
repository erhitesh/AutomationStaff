package programmingTest;

public class MethodOverloading {
	
	public void Add(int a, int b){
		System.out.println("Addintion of a & b integer..>"+ (a+b));
		
	}
	
	public void Add(int a, float b){
		System.out.println("Addition of a & b double"+ (a+b));
	}

	public static void main(String[] args) {
		MethodOverloading mod = new MethodOverloading();
		mod.Add(10, 12);

	}

}
