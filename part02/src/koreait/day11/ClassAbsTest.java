package koreait.day11;

import koreait.day10.Person;

public class ClassAbsTest {
	public static void main(String[] args) {
		
		Person momo = new Person();		// ������. (�Ϲ�Ŭ����)
//		ClassAbs abs = new ClassAbs();	// new ��ü ���� �Ұ���. (�߻�Ŭ����) ==> �߻�޼ҵ带 ���������� �ʾұ� ������.

		ClassAbs abs = new ClassX();		// �θ�Ÿ�� ����	ClassX���� �߻�޼ҵ带 ������������ ������.
		ClassX cls = new ClassX();		// ������ Ŭ����(�ڽ�Ŭ����) Ÿ�� ����	
		System.out.println("�׽�Ʈ ù��° : test �޼ҵ�");
		abs.test();		
		cls.test();
		abs.name = "�����";			// name�� �θ�Ŭ���� �ʵ�
		cls.name = "���";
		abs.print();				// print()�� �θ�Ŭ���� �޼ҵ�
		cls.print();
		System.out.println();
		
		System.out.println("�׽�Ʈ �ι�° : �ڽ� �ʵ� num");
		cls.setNum(23);			// ClassX�� �޼ҵ�. ������ �� ����.
		cls.test();				// �θ�Ŭ���� ClassAbs�� �߻�޼ҵ�. ������ �� ����.
//		abs.setNum();		// ���� : ClassX�� �޼ҵ��� setNum()�� ClassAbs�� �������� abs�� ����Ϸ��� ��.
							//		 �� �ڽ�Ŭ������ �޼ҵ带 �θ�Ŭ������ ���������� ����Ϸ��� �ϴ� ����. �ٿ�ĳ���� �ʿ�.
		cls.good("good");
//		abs.good("good");	// Line 25�� ���� �ƶ�.
		
		ClassX x = (ClassX)abs;			// �ٿ�ĳ����
		x.setNum(100);
		abs.test();
		x.good("good");					// ������. �ٿ�ĳ���� �����ϱ�.
//		x.test();			// abs.test();�� ���� ����� �Ѵ�.
		
	}

}
