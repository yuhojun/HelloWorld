package co.edu;

public class Student {
	//필드.
	String name;
	String studNo;
	int age;
	double height;
	
	//생성자. => 인스턴스를 만들어줄때 처리할 기능을 정의.
	// 매개값이 없는 생성자를 기본생성자. 필드에 초기값을 생성할때
	public Student() {
		System.out.println("Student() 생성자가 호출되었습니다.");
	}
	
	public Student(String nm, String sn, int ag) { // 생성자는 필드의 값을 지정할때 많이 사용
		name = nm;
		studNo = sn;
		age = ag;
		
	}
	
	// 생성자는 이름, 학번, 나이 채워주는 생성자
	
	//메소드. { 필수 int 점수
	void study() {
		System.out.println(name +"가 공부를 합니다.");
	}
	
	public Student(String name, String studNo, int age, double height) {
		
		this.name = name;  //알트 쉬프트 s
		this.studNo = studNo;
		this.age = age;
		this.height = height;
	}

	void eat() {
		System.out.println(name +"가 식사를 합니다.");
		}
	
	void showInfo() {
		System.out.println("이름은 "+ name + "이고 학번은" + studNo + "이고 나이는 " + age + " 이고 키는 " + height + "입니다.");
	}
 }
