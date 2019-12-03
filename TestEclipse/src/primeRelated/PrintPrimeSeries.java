package primeRelated;

public class PrintPrimeSeries {
	
	public static void main(String args[]){
		int p, n = 1000, counrt = 0;
		for(int i = 2; i < n; i++){
			p = 0;
			for(int j = 2; j < i; j++){
				if(i % j == 0)
					p = 1;
			}
			if(p==0){
				counrt++;
			//System.out.print("Prime Number series..> ");
			if(counrt <=100){
				System.out.println(i);
			}
			
			}
		}
	}

}
