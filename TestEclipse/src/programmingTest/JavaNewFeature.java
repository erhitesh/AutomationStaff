package programmingTest;

public class JavaNewFeature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String month[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		int count = 1;
		for(String month_value:month){
			count += 1;
			if(count == 3)
			System.out.println("Month Value..>"+month_value);
		
			}
		}
	}
