package koreait.day08;

public class MyClass2 {
	private int age;
	private String name;
	
	// Ŀ���һ����� ���� ���� : ������ �޼ҵ� �̸��� �ݵ�� �� Ŭ������ �̸��� �����ϰ�, �� ���� Ÿ���� ���� ����
	//										  �� ���������ڴ� 4���� ��� ���� // ���� ���ô� �⺻ package ������. 
	//					���� : �ʵ� �ʱ�ȭ! ����� �Ǵ� �ٸ� ���ɹ��� ���� �����ϴ�.
	
	MyClass2(String name) {
		this.name = name;		// setter �޼ҵ�� ���� ��������(�ʵ�)���� �ʱ�ȭ.
	}								// ���ڷ� ���޹��� name�� Ŭ������ �������ش�.
	
	// �⺻�����ڸ� ���� �����غ���
	MyClass2() {
		
	}
	// ���� : Ŀ���һ����ڸ� �����ϰ� �⺻�����ڸ� ������� �ʴ� ��찡 ����. (���� : Scanner Ŭ����)
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {		// setter�� �����ڷ� ����ϰ�, getter�� �ִ� ����
		return name;				// => �����ڿ��� �ʱ�ȭ�� ���� ������ �� ����.
	}
}
/*
	������ �޼ҵ� (���ϰ��� ���� , ���ڴ� ���� ���� �ִ� �޼ҵ�) - constructor
	-> ������ �޼ҵ� �������� ��ü�� ���������.	Random r = 	new Random(); ���� Random()�� ������ �޼ҵ��̰�,
	-> �⺻������ : ���ڰ� ���� ������ ������					��ü�� ����� ���� ����Ǵ� �޼ҵ��̴�.
	-> Ŀ���һ����� : �ʵ尪 �ʱ�ȭ�� ���ؼ� ���ڰ� �ִ� ������ ������
*/