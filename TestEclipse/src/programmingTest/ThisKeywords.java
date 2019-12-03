/**
   1) this keyword can be used to refer current class instance variable.
   2) this() can be used to invoke current class constructor.
   3) this keyword can be used to invoke current class method (implicitly)
   4) this can be passed as an argument in the method call.
   5) this can be passed as argument in the constructor call.
   6) this keyword can also be used to return the current class instance.
    
    */
package programmingTest;

public class ThisKeywords {
    
	int i;
	String Name;
	int j = 15;
	
	public ThisKeywords(String Name){
	 /**
	  * call this constructor inside another constructor called constructor chaining..
	  * Call this constructor in another constructor by using "this" keywords in another constructor this must be the first statement in another constructor.
	  * Otherwise error is thrown ...>  Constructor call must be the first statement in a constructor
	  */
		
		System.out.println("This is default constructor...");
		this.Name = Name;
	}
	
	public ThisKeywords(int i, String Name) {
		// TODO Auto-generated constructor stub
		// output nothing...
		this(Name);


		
		// Use this keyword..
		this.i = i;
		this.Name = Name;
	}
	
	public void getValue(){
		System.out.println("Value of I.. >"+i+" Vallue Of Name..> "+Name);
		int j =20;
		System.out.println("Vlaue of J..> "+j);
		// to get the value of j which is outside the method use this keyword
		System.out.println("Value of j using this keywords.."+ this.j);
	}
	
	
	public void callMethodByThis(){
		/**
		 * To call method inside another method use "this.methodname" but not force 
		 * Because it is implicit done by java compiler..
		 */
		this.getValue();
		//this.getValue();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		ThisKeywords thi = new ThisKeywords(10, "Hitesh");
		//thi.getValue();
		thi.callMethodByThis();
		thi.callMethodByThis();
	}

}
