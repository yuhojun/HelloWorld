package co.edu.Array;

public class test2 {
	public static void main(String[] args) {
		int[] intAry = {10, 20, 30, 40, 50};
		//intAry[1]
		int maxVal = 0;
		int sum = 0;
		for(int i = 0; i<5; i++) {
			System.out.println(intAry[i]);
			if(maxVal < intAry[i]) {
				maxVal = intAry [i];
			}
			sum += intAry[i]; //합계를 구할때
		}
		System.out.println("최대값: " + maxVal);
		System.out.println("합계: " + sum);
		
	}
	

}
