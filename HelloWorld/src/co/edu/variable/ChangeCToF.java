package co.edu.variable;

import java.util.Scanner;

public class ChangeCToF {
	public static void main(String[] args) {
		//화씨온도를 입력하면 섭씨 온도를 계산출력, 소수 첫번째 자리까지만 출력
		 Scanner scn = new Scanner(System.in);
		 double c;
		 int f;
		 System.out.println("화씨 온도를 입력>>>");
		 f = scn.nextInt();
		 
		 c = 5/9.0*(f-32); // 정수.
		 System.out.printf("화씨온도 %2d는 섭시온도 %.1f", f, c);
				 
		
	}

}
