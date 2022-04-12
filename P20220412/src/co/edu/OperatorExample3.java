package co.edu;

public class OperatorExample3 {
	public static void main(String[] args) {
		// 비교연산자, 논리연산자
		int num1 = 10;
		int num2 = 20;
		
		if(num1 == num2) {
			System.out.println("두수는 같습니다.");
		}
		
		if(num1 != num2) 
			System.out.println("두수는 같지 않습니다.");
		
		if(num1 >= num2) {
			System.out.println(num1 + "이 " + num2 + "보다 큽니다.");
		}
		
		if((++num1 % 2 ==0) || (num2++ % 2 == 0)) { //둘 다 참이면 실행하겠다
		} else {
			System.out.println("두수가 다 홀수입니다.");
		}
		System.out.println(num1 + ", "+ num2);
		
		if((++num1 % 2 ==0) & (num2++ % 2 == 0)) { // 하나는 앞에 상관없이둘다 결과값추출
			System.out.println("두수는 짝수."); 
		} else {
			System.out.println("두수가 짝수는 아닙니다.");
		}
		System.out.println(num1 + ", "+ num2);
		
		System.out.println("end of prog");
	}

}
