package co.edu.Array;

public class test4 {
	public static void main(String[] args) {
		int[] intAry = new int[5];
		for (int i = 0; i < intAry.length; i++) {
			System.out.println(intAry[i]);
			int randomVal = (int) (Math.random() * 30) + 1; // int형 값 1 ~ 30 범위의 임의 값설정
			intAry[i] = randomVal; 
		}
		// 반복문 활용. 임의의 값 5개 저장.
		
		// 23, 12, 27, 22, 6
		// 15보다 큰 값만 합계 => 평균.sum
	}

}
