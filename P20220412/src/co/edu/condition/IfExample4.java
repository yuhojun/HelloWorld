package co.edu.condition;

public class IfExample4 {
		public static void main(String[] args) {
			// 임의의 값을 생성해주는 Math.random().
		int randomVal = (int) (Math.random() * 100) + 1; //반환값이 double 0 <= 값 < 1
		System.out.println(randomVal);
		// Math.random 소수점 int 정수로 바꿈 및 방을만듬 (방안에) 넣을것~
		// 생성된 값이 1 ~ 50 까지.
		// 생성된 값이 51 ~ 60 까지.
		// 61 ~ 70, 71 ~ 80, 81 ~ 90, 91 ~ 100 범위.
		System.out.println("1 ~ 50");
		int hojun = (int) (Math.random() * 50) +1; //int 만들다 
		System.out.println(hojun);
		
		System.out.println("51 ~ 60");
		int hojun1 = (int) (Math.random() * 51) +10; //int 만들다 
		System.out.println(hojun1);
		
		System.out.println("51 ~ 60");
		int hojun2 = (int) (Math.random() * 10) +51;
		System.out.println(hojun2);
		
		
		System.out.println("생성된 값은 61 ~ 71까지 범위 값.");
		System.out.println("생성된 값은 71 ~ 80까지 범위 값.");
		System.out.println("생성된 값은 81 ~ 90까지 범위 값.");
		System.out.println("생성된 값은 91 ~ 100까지 범위 값.");
		
		
	
		
	
}
}
