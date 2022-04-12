package co.edu.variable;

import java.util.Scanner;

public class Daaa1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int O, A, B, C, D;
		
		System.out.print("오렌지의 개수를 입력하시오: ");
		O = sc.nextInt();
		
		A = O / 10;
		B = O % 10;
		C = O / 5;
		D = O % 5;
				
		System.out.print(A + "박스가 필요하고" + B + "개가 남습니다." + C + "박스가 필요하고"+ D + "개가 남습니다.");

}
}