package koreait.day02;

// ���� : Variable
public class C05_IntegerVar {
	public static void main(String[] args) {		// main �޼ҵ� ����
/*	
 * 	1. main �޼ҵ� �ȿ����� ����ϴ� ���������� �����մϴ�.
 *	2. �⺻�� (primitive) ������ Ÿ�� :
 * 		�������� byte, short, int, long Ű����(������ ������ �ܾ�)
 */
		byte n1;		// byte ������ �����͸� ������ ����. �̸��� n1
		short n2;
		int n3;
		long n4;		// ������ ���� (���������� ����)

		// ������ �����ϸ鼭 �ʱⰪ �ο� (����� ���ÿ� �ʱ�ȭ)
		byte m1 = 100;
		short m2 = 100;
		int m3 = 100;
		long m4 = 100;
		
		int currentNo;	// �������� ���� ����Ǵ� ���� ���� �ľ��� �� �ִ� �ܾ�� ����� ���� ����.
		
//		System.out.println(n1);		// ���� : ���� ���� ���� (�ʱ�ȭ���� ����, �ʱⰪ�� ����)
		System.out.println(m1);
		
		// ���� ����(=), ���Թ� ==> ��ȣ�� �������� �������� ���ʿ� �����Ѵ�.
		n1 = 123;		// 123�� 4����Ʈ ���ͷ�(int), byte�� short�� ������ ���ͷ� ǥ�� ����� ����.
						// ���� ���� ��ġ�� ���� ��� �ڵ����� 1����Ʈ �Ǵ� 2����Ʈ�� ũ�Ⱑ �ٲ�� �����.
//		n1 = 999;		// ���� : 127���� ū �� (byte ���� ��)
		n2 = 29999;
//		n2 = -40000;	// ���� : -32768���� ���� �� (short ���� ��)
		n3 = 123456789;
//		n3 = 1234567890123;	// ���� : 2147473647���� ū �� (int ���� ��)
//		n4 = 1234567890123;	// ���� : 1234567890123 ���ͷ��� int ���ͷ��̹Ƿ� ǥ�� ����, �׳� ���� ���ͷ��̰� ���ͷ��� int��.
		n4 = 123;			// ���� �ƴ� : 123 ���ͷ��� int ���ͷ� ǥ�� ���� ���� �ֱ� �����̴�.
		n4 = 1234567890123L;	// long ���ͷ� ǥ�� : L �Ǵ� l�� �������� ����.
		// �����ܰ� ������
		
		System.out.println("���� n1 = " + n1);
		System.out.println("���� n2 = " + n2);
		System.out.printf("���� %s = %d \n", "n3", n3);
		System.out.printf("���� %s = %d \n", "n4", n4);

	}	// main �޼ҵ� ��	==> ��������� ���������� ����� �����ϴ�.
	// ���Թ� �Ǵ� ���ͷ� ǥ�ÿ��� ���� ������ �Ѿ�� overflow(�����÷ο�)
}
/*
 *	���� : �޸𸮿� ����� �� �߿��� ������ �� �ִ� �����͸� ���մϴ�.
 *		������ ���α׷��� ����Ǵ� ���ȿ� �ӽ÷� ����ϴ� �޸� �����Դϴ�.
 *		�����Ͱ� ����� �޸𸮿� �����ϱ� ���ؼ� ������(�ĺ���, �ߺ��Ǵ� �̸� ��� �Ұ���)�� �ο��մϴ�.
 *    	������ �����Ѵ�. (�������� ������ ������ �����ϴ� ��.) -> �޸𸮿� ������ �Ҵ� �˴ϴ�.
 *    	������ ���� : ������ ������ ���� ��Ģ
 */
