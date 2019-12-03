package string;

public class StringBuilder {
	
	public static void main(String args[]){
		
		StringBuffer buffer = new StringBuffer();
		System.out.println(buffer.capacity());
		buffer.append("Hello");
		buffer.ensureCapacity(10);
		System.out.println(buffer.capacity());
		buffer.append("Hello Tester How are you?");
		buffer.ensureCapacity(40);
		System.out.println(buffer.capacity());
	}

}
