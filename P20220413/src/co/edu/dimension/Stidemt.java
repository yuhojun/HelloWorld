package co.edu.dimension;

import java.util.Scanner;

public class Stidemt {
	// 학생이름, 점수
	Student s1 = new Student(); // 학생이름을 점수를 저장할수있는 개체
	s1.studName="홍길동";s1.score=80;

	Student s2 = new Student();s2.studName="김길동";s2.score=75;

	Student s3 = new Student();s3.studName="김히동";s3.score=82;

	Student[] students = { s1, s2, s3 };

	Scanner scn = new Scanner(System.in);System.out.println("학생이름 입력>> ");
	String searchName = scn.nextLine();

	for(
	int i = 0;i<students.length;i++)
	{
    	if (students[i])
    
}
}
