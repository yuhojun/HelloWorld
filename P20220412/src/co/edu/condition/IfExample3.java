package co.edu.condition;

public class IfExample3 {
	public static void main(String[] args) {
		// 중첩 구문.
		// 90점이상 A 80점이상 B 70점이상 C 그외 F
		int score = 81;
		
		if (score >= 90) {
			if (score >= 95) {
				System.out.println("A+학점.");
			} else {
			System.out.println("A.");
			}
		} else if (score >= 80) {
			System.out.println("B.");
		} else if (score >= 70) {
			System.out.println("C.");
		} else {
			
			System.out.println("F학점");
		}
	      
 		
				
				
				
				
	}

}
