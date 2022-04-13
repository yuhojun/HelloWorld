package co.edu.Array;

import java.util.Scanner;

public class test8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 주사위 2개를 던짐.
		// 2개의 숫자의 합이 6이 되는 경우
		// 1,15, 2,4, 3,3, 4,2, 5,1
		
		//반복문1~6, 1~6 사용.
		System.out.println("숫자의 합이 6이 되는 조합");
		for (int i = 1; i<=6; i++) {
			for (int j = 1; j<=6; i++)
				if (i +j == 6) {
					System.out.println("(" + i + "," + j + ")");
				}
			
		}
		
	}

}
