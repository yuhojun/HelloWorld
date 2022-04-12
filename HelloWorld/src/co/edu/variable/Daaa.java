package co.edu.variable;

import java.util.Scanner;

public class Daaa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cu, money, a1, a2;
		
		System.out.print("현금: ");
		cu = sc.nextInt();
		
		System.out.print("물건 가격: ");
		money = sc.nextInt();
		
		a1 = money * 1/10;
		System.out.println("부가세: " + a1);
		
		a2 = cu - money;
		System.out.println("잔돈: " + a2);
	}
}
	

