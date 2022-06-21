package koreait.day12;

public class Member {
	private String name;
	private int age;
	protected boolean valid;
	
	public Member(String name, int age) {		// 생성자!
		this.name = name;
		this.age = age;
	}
	
	// getter 만들기
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Member [name = " + name + ", age = " + age + ", valid = " + valid + "]";
	}
	
	
	
}
