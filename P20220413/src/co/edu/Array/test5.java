package co.edu.Array;

import java.util.Scanner;

public class test5 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int[] scores = new int[5];
		int max = 0;
		int min = 0;
		for (int i = 0; i < scores.length; i++) {
			System.out.println("학생점수를 입력>>>>");
			scores[i] = scn.nextInt();
			max = min = scores[0];
			// 최고점.
			if (scores[i] > max) {
				max = scores[i];
			}

			// 최저점.
			if (scores[i] < min) {
				min = scores[i];

			}
			// 학생중에 최고점, 최저점
			System.out.println("최고점은: " + max + " 최저점은: " + min);
			
			//학생이름, 점수
			//배열, 배열 0 => 학생, 90

		}
	}
}
