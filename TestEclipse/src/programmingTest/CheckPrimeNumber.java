package programmingTest;

public class CheckPrimeNumber {
	
	public static boolean isPrime(int number){
		for(int i = 2; i<= number/2; i++){
			if(number % i == 0){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("*********************Checking Prime number or Not******************");
		System.out.println("Enter the number>............."+isPrime(2));

	}

}
