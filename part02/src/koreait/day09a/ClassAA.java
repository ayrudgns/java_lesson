package koreait.day09a;

public class ClassAA extends ClassA {	// super(�θ�)Ŭ������ ClassA

	double point;		// ClassAA�� �ʵ�
	
	// ClassAA�� �ν��Ͻ� �޼ҵ�
	// name �ʵ带 ��ӹ��� ������, ���⼭ ������ ���� �ƴϴ�. ==> ������ ���� �ʴ� ������ ClassA�� ��ӹ޾ұ� ����.
	void test() {
		setName("����");	// name�� �Է¹޴´�.
		System.out.println("ClassAA�� �ν��Ͻ� �޼ҵ� test�� name = " + name);
	}
}

// ������ ������ ���� �׽�Ʈ�� �� ���� �ִ�. ��, public Ŭ������ ���� ���Ͽ��� 1����.

