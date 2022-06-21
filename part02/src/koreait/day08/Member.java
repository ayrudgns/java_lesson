package koreait.day08;

public class Member {
// 작성자 : 이경훈

	private String name;		// 커스텀생성자
	private String email;		// 커스텀생성자
	private int age;			// 기본생성자
	private int level;			// 기본생성자
//*********************************************************
	public Member(String name, String email) {	// name, email 필드 초기화하는 커스텀 생성자
		this.name = name;						// ()안에는 실행할 때 전달받을 인자
		this.email = email;
		// 생성자 메소드 : 타입과 인자갯수를 가지고 구별이 되어야 메소드 오버로딩이 가능하다.
	}
//*********************************************************	
	public Member() {							// 기본생성자
		System.out.println("name, email, age, level 필드는 기본값입니다.");
		System.out.println("name = " + this.name);	// this는 메소드를 실행하는 객체
		System.out.println("age = " + this.age);
	}
//********************************************************
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}	
	
}
