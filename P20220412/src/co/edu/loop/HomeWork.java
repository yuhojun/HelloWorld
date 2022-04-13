package co.edu.loop;

import java.util.Random;
import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
				
	    Random a = new Random();
		int randomNumber = a.nextInt(7);
		
		if (number == randomNumber) {
			System.out.println("입력값은 " + number);
			System.out.println("랜덤숫자는 " + randomNumber);
			System.out.println("정답입니다");
		}else {
		System.out.println("입력값은 " + number);
		System.out.println("랜덤숫자는 " + randomNumber);
		System.out.println("틀렸습니다");
		
		}						

		
	}

}
