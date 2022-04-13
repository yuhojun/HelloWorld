package co.edu.dimension;

import java.util.Scanner;

public class StudentExample2 {
	public static void main(String[] args) {
		Scanner scn = nes Scanner(System.in);
		Student s1 = new Student();
		
		System.out.println("학생이름 점수 나이"); //홍길동 80 20
		s1.studName = scn.next();
		s1.score = Integer.parseInt(scn.next());
		s1.age = Integer.parseInt(scn.next());
		
		Student[] students = {new Student[], new Student[], new Student[]}
		students[0].studName = scn.next();
		students[0].score = Integer.parseInt(scn.next());

	}

}
