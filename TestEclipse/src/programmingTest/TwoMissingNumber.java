package programmingTest;

public class TwoMissingNumber {
	
	int sn, sa =0, sum = 0;
	int pn = 1, pa = 1;
	int a, b;
	
	public int [] missingNumber(int arr[], int number ){		
		sn = (number*(number+1)/2);
		System.out.println("Sum of Number.."+sn);
		for (int i = 0; i < arr.length; i++){
			sa += arr[i];
		}
		System.out.println("Sum of array.."+sa);
		int s = sn - sa;
		System.out.println("Sum"+s);
		
		
		for (int i = 1; i <=number; i++)
			pn = pn*i;
		
		System.out.println("Number product"+pn);
		
		for (int i = 0; i < arr.length; i++){
			pa = pa*arr[i];
		}
		System.out.println("Array product"+pa);
		
		int p = pn/pa;
		System.out.println("product"+p);
		
		int diff = (int) Math.sqrt(s*s-4*p);
		
		a = (s + diff)/2;
		b = s-a;
		
		int result[] = {a, b};
		
		return result;
		
	}
	
	
	public static void main(String args[]){
		int a[] = {1,3,5};
		
		TwoMissingNumber miss = new TwoMissingNumber();
		int [] result = miss.missingNumber(a, 5);
		
		System.out.println("Missing number are..."+result[0]+" "+result[1]);
		
	}

}
