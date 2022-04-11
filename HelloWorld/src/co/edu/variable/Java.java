package co.edu.variable;

import java.util.Scanner;

public class Java {
	public static void main(String[] args) {
		//점수를 세개입력. (합, 평균, 고득점=>합은 230 평균은 76.67 최고점은 90점입니다.
		Scanner scn = new Scanner(System.in);
		int num1, num2, num3, maxValue, sum;
		double avg;
		
		System.out.println("점수를 입력하세요>>> ");
		num1 = scn.nextInt();
		System.out.println("점수를 입력하세요>>> ");
		num2 = scn.nextInt();
		System.out.println("점수를 입력하세요>>> ");
		num3 = scn.nextInt();
		
		sum = num1 + num2 + num3;
		avg = sum / 3.0;
		
		maxValue = 0;
		if (num1 > num2) {
			maxValue = num1;
		} else {
		     maxValue = num2;
		}
		if (maxValue < num3) {
			maxValue = num3;
			
		}
		System.out.println("합은 %3d이고 평균은 %.2f이고 최고점은 %3d점 입니다, maxValue, sum");
	}

}
