package koreait.day09b;

import koreait.day09a.ClassA;

public class ClassAB extends ClassA {			// �ٸ� ��Ű���̹Ƿ� ClassA�� import �ؾ� �Ѵ�.
	// ClassAB Ŭ������ �ʵ�, �޼ҵ带 ��� �޾Ҵ°�? => ClassA�� private, default ���������� ��Ҵ� ��ӹ��� �� ����.
	
	public void test() {	// ClassAA������ test�� ������ �ȴ�. ClassA�� ��ӹ��� ClassAA, ClassA�� ��ӹ��� ClassAB�ϱ�.
//		System.out.println("** name = " + name);		// name �ʵ� ���������ڴ� default : �ٸ� ��Ű������ ����� �� ����.
		title = "momo";		// ��ӹ��� title �ʵ� : �ٸ� ��Ű�������� protected ���������ڷ� �ڽ�Ŭ������ �����.
		System.out.println("title = " + title);
		setName("�ź�");
		System.out.println("name = " + getName());
	}
}
