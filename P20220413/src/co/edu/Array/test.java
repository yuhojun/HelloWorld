package co.edu.Array;

public class test {
	public static void main(String[] args) {
		// 학생의 점수 30명.
		int score1 = 80;
		//....
		int score30 = 78;
		
		// 여러개의 같은 유형의 값을 저장.
		int[] intAry = new int[30]; //정수 int 30개 담을 공간생선 정수를 담을수있는 배열
		
		intAry[0] = 30;
		intAry[4] = 40;
		intAry[29] = 55;
		
		System.out.println(intAry[0]);
		System.out.println(intAry[1]);
		
		
		double[] dblAry = new double[10];//double 저장공간 10개선언.
		//(0.01)
		String[] strAry = new String[5]; //공간만 선언하면 참조변수는 nu11.
		System.out.println(strAry[0]);
		
		int[] otherAry = {10, 20, 30, 40}; //초기값을 설정 (참조값 otherAry)
		int[] theotherAry = {10, 20, 30, 40}; //초기값을 설정 (참조값 otherAry)
		System.out.println(otherAry[0]); //정수값(진짜값)
		
		if(otherAry[0] == theotherAry[0]) { //배열일 경우
			System.out.println("same");
		} else {
			System.out.println("diff");
			
		}
	}

}
