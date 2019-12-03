package programmingTest;

public class Operators {
	
	
	public void preAndPostIncrement(){
		int k = 1;
		k++;
		System.out.println("Value of k..> "+k);
		++k;
		System.out.println("Value of k..> "+k);
		System.out.println("Value of k..> "+ ++k);
		System.out.println("Value of k..> "+k++); 
		System.out.println("Value of k..> "+k);
		System.out.println("..........................***post***..............................");
		int j = 4;
		System.out.println("Value of j..> "+j);
		int m = j++;
		System.out.println("Value of j..> "+j);
		System.out.println("Value of m..> "+m);
		System.out.println("..........................***pre***..............................");
		int n = 7;
		int l = ++n;
		
		System.out.println("Value of l "+l);
		
	    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		int a = 3, b = 7;
	int result = a < b ? a : b;
	System.out.println(result);
	
	Operators op = new Operators();
	op.preAndPostIncrement();
			
	}

}
