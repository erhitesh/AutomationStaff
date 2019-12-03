package com.EqualsHashCode;

public class EqualshashCode {
	
	public static void main(String args[]) {
		EqualshashCode code1 = new EqualshashCode();
		EqualshashCode code2 = new EqualshashCode();
		
		String str1 = new String("Hitesh");
		String str2 = new String("Hitesh1");
		
		String str3 = "Hitesh";
		
//		if (!code1.equals(code2) )
//			System.out.println("Hashcode for first object.."+code1.hashCode()+"\n"+"HashCode for seco Objects.."+code2.hashCode());
//		if (code1.equals(code1))
//			System.out.println("Hashcode for equal objects...First Obj.."+code1.hashCode()+"\n"+"Second Obj.."+code1.hashCode());
		if (str1.equals(str2))
			System.out.println("First..."+str1.hashCode()+"\n"+"Seconds.."+str2.hashCode());
//		if (str1.equals(str2))
//			System.out.println("Hashcode for first object.."+code1.hashCode()+"\n"+"HashCode for seco Objects.."+code2.hashCode());
		else if (code1.equals(code1))
			System.out.println("Hashcode for equal objects...First Obj.."+code1.hashCode()+"\n"+"Second Obj.."+code1.hashCode());
		
		
		
		if (str1.equals(str3))
			System.out.println("HashCode Integer Value..."+str1.hashCode()+"\n"+str3.hashCode());
	}
	
	

}
