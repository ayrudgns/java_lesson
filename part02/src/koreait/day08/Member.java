package koreait.day08;

public class Member {
// �ۼ��� : �̰���

	private String name;		// Ŀ���һ�����
	private String email;		// Ŀ���һ�����
	private int age;			// �⺻������
	private int level;			// �⺻������
//*********************************************************
	public Member(String name, String email) {	// name, email �ʵ� �ʱ�ȭ�ϴ� Ŀ���� ������
		this.name = name;						// ()�ȿ��� ������ �� ���޹��� ����
		this.email = email;
		// ������ �޼ҵ� : Ÿ�԰� ���ڰ����� ������ ������ �Ǿ�� �޼ҵ� �����ε��� �����ϴ�.
	}
//*********************************************************	
	public Member() {							// �⺻������
		System.out.println("name, email, age, level �ʵ�� �⺻���Դϴ�.");
		System.out.println("name = " + this.name);	// this�� �޼ҵ带 �����ϴ� ��ü
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
