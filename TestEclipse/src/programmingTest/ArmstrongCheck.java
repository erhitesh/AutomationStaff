package programmingTest;


public class ArmstrongCheck {

	public static void main(String[] args) {
		System.out.println("***************************Check number is armstrong or not **************"+isArmstronmg(153));
		
		int r, temp, sum = 0, n = 12;
		temp = n;
		while(n > 0){
			r = n % 10;
			sum = sum+(r*r*r);
			n = n / 10;
		}
		if( temp == sum)
			System.out.println("********************Armstrong****************");
		else
			System.out.println("*********************Not Armstrong ***********");
	}
	
	public static boolean isArmstronmg(int n){
		int r, temp, sum = 0, number = n;
		temp = number;
		while(number > 0){
			r = number % 10;
			sum = sum+(r*r*r);
			number = number / 10;
		}
		
		if( temp == sum)
			return true;
		else
			return false;
	}

}
