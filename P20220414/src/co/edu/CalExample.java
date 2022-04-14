package co.edu;

public class CalExample {
	public static void main(String[] args) {
		Calculator cl = new Calculator();
		
		cl.printPI();
		cl.getArea(2.4);
		System.out.println();
		
		int result = cl.sum(30, 23);
		System.out.println("두수의 합: " + result);
		double resultl = cl.sum(23.4, 30);
		
		resultl =cl.getTriangleArea(24, 15.5); 
		//삼각형의 너비는 345.6 입니다.
		
		int[] intAry = {10, 20, 30, 40};
		result = cl.sum(intAry);
		System.out.println("배열의 합: " + result);
		
		resultl = cl.average(10, 20, 25);
		System.out.println("평균:" + resultl);
		
		resultl = cl.average(10, 20, 30, 40, 22, 55, 60);
		System.out.println("평균:" + resultl);
	}

}
