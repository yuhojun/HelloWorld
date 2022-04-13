package co.edu.dimension;

import java.util.Scanner;

public class test111 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("------------------------------------------");
			System.out.println("선택>");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			// 잘못된 순서를 처리를 하려는 경우에 대해서 메세지 보여주기.
			if(scores == null ) {
				if(selectNo ==2 || selectNo == 3 || selectNo ==4) {
					System.out.println("학생수를 지정하세요.");
					continue;
				}
			}
			if (selectNo == 1) { //학생수 입력.
				System.out.println("학생수> ");
				studentNum = Integer.parseInt(sc.nextLine());
				scores = new int[studentNum];

			} else if (selectNo == 2) { //점수입력
				for(int i = 0; i <scores.length; i++) { //배열 카믄 for
					System.out.println("scores[" + i + "]> "+ scores[i]);
				}
				
			} else if (selectNo == 3) { //점수리스트.
				for(int i = 0; i <scores.length; i++) {
					System.out.println("scores[" + i + "]> ");
					scores[i] = Integer.parseInt(sc.nextLine());
				}	
				} else if (selectNo == 4) { //분석
				int max, sum;
				max = sum = 0;
				for(int i = 0; i < scores.length; i++) {
					sum += scores[i];
					//최고점수 계산
					if (scores[i] > max) {
						max = scores[i];
					
					}
				}
				System.out.println("최고 점수: " + max);
				System.out.printf("평균 점수: %.2f\n ",(double) sum / scores.length);
						
				
			
			
			} else if (selectNo == 5) { //종료
			 run = false;	
			}
			}

      System.out.println("프로그램 종료");
}

 }

