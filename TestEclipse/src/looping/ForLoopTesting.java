package looping;

public class ForLoopTesting {
/* 
	public static void forLoopTesting1(){
		for(int i =2; i < 6; i++){
			i = i - 2;
			System.out.println(i);
		}
		System.out.println(i);
	}
	*/
	
	
	public static void forLoopTesting2(){
		int i;
		for( i = 2; i < 6; i++){
			i = i - 1;
			System.out.println(i);  // print infinite loop of 1
		}
		System.out.println(i); // it will print nothing
	}
	
	public static void forLoopTesting3(){
		int i;
		for( i = 2; i < 10; i++){
			i = i + 2;
			if(i < 9){
				break;
			}
		}
		for(int j = 2; j < 4; j++){
			i = i + 2;
		}
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		//forLoopTesting2();
		forLoopTesting3();
		
	}

}
