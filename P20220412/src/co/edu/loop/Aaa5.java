package co.edu.loop;

import java.util.Scanner;

public class Aaa5 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//Math.random()의 생성범위 1~10까지가 되도록. => randomVal
		//사용자의 입력값을 담는 변수 userVal.
		
		//while구문을 사용해서 임의의 값이랑 입력값이 같으면 종료.
		// 사용자가 값 비교 랜덤값이랑 비교... 입력한 랜덤 크다, 작다.
		// 랜덤이 만들어준 값을 맞추는 게임.
		
		
		int randomVal = (int) (Math.random() * 10) + 1;
		int userVal;
		boolean isTrue =true;
	
		while (isTrue) {
			System.out.println("값을 입력>>>> ");
			 userVal = scn.nextInt();
			if (randomVal == userVal) {
				System.out.println("정답입니다.");
			 break;
			}
			if (randomVal > userVal)
				System.out.println("크다");
			
		} else
	    		
		
		
	}

}
