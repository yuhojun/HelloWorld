package co.edu.loop;

public class Aaa {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=1; i<=5; i++) { //반복문
			sum = sum + 3;
			// i = 1, sum = 3;
			// i = 2,  sum = 6;
			// i = 3, sum = 9;
			// i = 4 sum = 12;
			// i = 5, sum = 15;
		}
		
		
		System.out.println("sum => " + sum);
		
		for(int i = 9; i >=1; i--) {
			System.out.println("3 * "+ i +" = " + (3 * i));
		}
		
		System.out.println("==============");
		
		for(int i = 1; i <= 9; i++) {
			System.out.println("5 * "+ i +" = " + (5 * i));
		}
	
		//System.out.println("3 * 2 = 6");
		//System.out.println("3 * 3 = 9");
		//System.out.println("3 * 4 = 12");
		
		//System.out.println("3 * 9 = 27");
		System.out.println("==============");
		

		for(int i = 2; i <= 10; i+= 2) {
			if (i % 2 == 0) { //더하는 값 i의 수가 짝수일 때만.
			sum = sum + i;
		}
		sum = sum + 2;
		sum = sum + 4;
		sum = sum + 6;
		sum = sum + 8;
		sum = sum + 10;
		
		System.out.println("sum => "+ sum);

		
			
		}
	}
}



