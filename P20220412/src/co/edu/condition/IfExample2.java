package co.edu.condition;

public class IfExample2 {
	public static void main(String[] args) {
		int num = 12;
		
		// 2의 배수인지 3의 배수인지 2,3의 공통배수인지 체크
		if ((num % 2 == 0) && (num % 3 == 0)) {  //and 연산자
			System.out.println(num + "은2, 3의 공통배수");
		} else if (num % 2 == 0) {
			System.out.println(num + "은 2의 배수");
		} else if (num % 3 == 0) {
			System.out.println(num + "은 3의 배수");
		} else {
			System.out.println(num + "은 2, 3의 배수가 아님.");
		}
	}

}
