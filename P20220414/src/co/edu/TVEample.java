package co.edu;

public class TVEample {
	public static void main(String[] args) {
		int num = 10;
		String str = "Hello";
		
		Television tv = new Television(); //tv변수 값을 담아두는 공간을만들어줌
		tv.company = "삼성";
		tv.color = "검은색";
		tv.price = 300000;
		tv.model = "30Inch";
		tv.turnOn(); //괄호가있는건 메소드
		tv.changeChanel(10);
		tv.turnOff();
		
		
		Television tv1 = new Television();
		tv.company = "삼성";
		tv.color = "검은색";
		tv.price = 300000;
		tv.model = "30Inch";
	
		System.out.println(tv == tv1);
		System.out.println(tv);
		System.out.println(tv1);
		
		Student stud1 = new Student();
		stud1.name = "홍길동";
		stud1.studNo = "22-1234567";
		stud1.age = 20;
		stud1.height = 174.5;
		
		Student stud2 = new Student();
		stud2.name = "이순신";
		stud2.studNo = "22-326567";
		stud2.age = 27;
		stud2.height = 190.2;
		
		Student stud3 = new Student("황화경","22-876456",25);
		stud3.age = 25;
		stud3.height = 163.5;
		
		Student stud4 = new Student("유호준","22-495456",29);
		stud4.age = 29;
		stud4.height = 180.2;
		
		
		stud1.study();
		stud2.study();
		
		stud3.showInfo();
		stud4.showInfo();
					
	}

}
