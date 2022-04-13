package co.edu.Array;

import java.util.Scanner;

public class test6 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String[] names = new String[3]; //학생이름
		int[] scores = new int[3]; // 학생점수.
		
		for(int i = 0; i < names.length; i++) {
			System.out.println("학생이름 입력>>>");
			names[i] = scn.nextLine();
			
			System.out.println("학생점수 입력>>>");
			scores[i] = scn.nextInt(); //사용자가 50치면 딱 그것만 가져옴
			scn.nextLine();
			
			//홍길동, 김길동, 박길동
			// 40, 50, 60
		}
		
		System.out.println("조회할 학생이름 입력>>>");
		String searchName = scn.nextLine();
		for(int i=0; i<names.length; i++) {
			if(names[i].equals(searchName)) {
				System.out.println(searchName + "의 점수는" + scores[i]);
			}
		}
		System.out.println("프로그램 종료.");
	}

}
