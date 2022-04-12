package co.edu.condition;

public class IfExample {
	public static void main(String[] args) {
		int score = 85;
		
		// 90점보다 크면 a, 80보다 크면 b, 70보다 크면 c, 나머지 f
		if(score >= 90) {
			System.out.println("A학점.");
		} else if (score >= 80) {
				System.out.println("B학점.");
			} else if(score >= 70) {
					System.out.println("C학점.");
				} else {
				System.out.println("F학점.");
			}
	}
}		
	


