package koreait.day08;

import java.util.Calendar;

public class MyClass3Test {
	public static void main(String[] args) {
		
//		MyClass3 my3 = new MyClass3();	// ���� : ������  private �������̱� ����
		MyClass3 my3 = MyClass3.getInstance();		// �̸� ������� ��ü�� ���� (�׻� ������ ��ü)
		my3.test();							// ��ü�� �ν��Ͻ� �޼ҵ�	: ��ü�� 1���� �����.
		MyClass3.staticTest();				// static �޼ҵ�	: ��ü�� ������ �ʴ´�.
		
		// �̸� ������� ��ü�� �������ִ� Calendar Ŭ���� (����)
		Calendar today = Calendar.getInstance();	// Ķ���� Ÿ���� ������ ��. �̸� ������� ��ü�� �������� ��.
		System.out.println(today);
	}

}
