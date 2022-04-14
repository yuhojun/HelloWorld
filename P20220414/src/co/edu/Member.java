package co.edu;

public class Member {
	// 필드 => 회원아이디, 회원이름, 회원연락처, 회원나이.
	private String memberId;
	private String memberName;
	private String memberPhone;
	private int memberAge; // -값이 들어가면 안됨
	
	
	
	
	//생성자
	public Member(String memberId, String memberName, String memberPhone, int memberAge) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.memberPhone = memberPhone;
		this.memberAge = memberAge;
	}
	//메소드
	void setMemberId(String memberId ) { //필드이름 변수이름 같이
		this.memberId = memberId;
	}
	
	String getMemberId() { //get 쓰면 무조건 return (데이터 가지고 오는거)
		return memberId; 
	}
	
	void setMemberAge(int age) { 
		if(age < 0) {
		memberAge = 10;
	}else {
		memberAge = age;
	}
	}
	public String getMemberName() {
		return memberName;
	}


	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}


	public String getMemberPhone() {
		return memberPhone;
	}


	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}


	int getMemberAge(){
		return memberAge;
	}
	void showInfo() {
		System.out.printf("회원이름%4s \n 연락처 %13s\n 나이 %2d \n", memberName, memberPhone, memberAge);
	}
}
