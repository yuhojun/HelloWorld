package co.edu.Array;

public class test3 {
	public static void main(String[] args) {
		int[] intAry = { 78, 83, 88, 92, 63 };
		// 배열의 요소들에 합을 구하는 코드작성 변수=sum선언 (for)
		// double avg 평균 sum값을 갯수만큼 나누다 1,3,5 합
		int maxVal = 0;
		int cnt = 0;
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < intAry.length; i++) {
			System.out.println(intAry[i]);
			if (intAry[i] % 2 == 0) {
				sum += intAry[i];
				cnt++;  // 몇번실행됬는지 알기위해서 
			}

		}
		avg = 1.0 * sum / cnt;
		System.out.println("평균: " + sum);
		System.out.println("합계: " + avg);
		//홀수
		for (int i = 0; i < 5; i+=2) {
		}
     
	}

}
