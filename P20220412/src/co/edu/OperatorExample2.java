package co.edu;

public class OperatorExample2 {
	public static void main(String[] args) {
		// 십진수 10을 2진수 1010.
		int num10 = 10;
		System.out.println(~num10);
		
		boolean isTrue = false;
		isTrue = !isTrue; // (true) false값을부정
		isTrue = !isTrue; //false
		isTrue = !isTrue; // true
		isTrue = !isTrue; // false
		System.out.println(isTrue);
		
		if(num10 > 5) {
			System.out.println("참입니다.");
		} else {
			System.out.println("거짓입니다.");
		}
	}

}
