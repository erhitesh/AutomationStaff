package programmingTest;

public class DifferentWaysToCreateObj implements Cloneable {

	public static void main(String[] args)throws IllegalAccessException, InstantiationException, ClassNotFoundException, CloneNotSupportedException{
		// TODO Auto-generated method stub
		
    //*************************using new keyword*****************
		DifferentWaysToCreateObj doc1 =  new DifferentWaysToCreateObj();
		System.out.println("Doc1..> "+doc1);
		
		
	// *******************************Using clone******************
		DifferentWaysToCreateObj doc2 = new DifferentWaysToCreateObj();
		DifferentWaysToCreateObj clon = (DifferentWaysToCreateObj) doc2.clone();
		System.out.println("Dpc2  >>"+clon);
		
	// ******************************Using Class.forName() ****************
	
//    Class cl = Class.forName("programmingTest.DifferentWaysToCreateObj");
//    DifferentWaysToCreateObj doc3 = (DifferentWaysToCreateObj) cl.newInstance();
//    System.out.println("Doc 3..>"+doc3);
		    DifferentWaysToCreateObj doc3 = (DifferentWaysToCreateObj) Class.forName("programmingTest.DifferentWaysToCreateObj").newInstance();
		    System.out.println("Doc 3..>"+doc3);
   
    
    //********************Using new instance **********************************
		    Object doc4 = DifferentWaysToCreateObj.class.getClassLoader().loadClass("programmingTest.DifferentWaysToCreateObj").newInstance();
                System.out.println("Doc 4..>"+doc4);
    }
}