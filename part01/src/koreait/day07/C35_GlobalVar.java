package koreait.day07;

public class C35_GlobalVar {
	/*
	 *  [������ ����� ��ġ�� ����]
	 *  ��������(local variable) : �޼ҵ�, for, if, while ��� {}���� ����� ����. ����� ����� ���� ��� �Ұ���
	 *  ��������(global variable) : Ŭ����{}���� ����� ����
	 *  
	 *  [���������� static ���η� ����]
	 *  �� Ŭ�����̸�.������
	 *  �� ��ü�� ���� ����ϴ� this.������ (�̶� ������ �ν��Ͻ� ����) 
	 *  
	 *  ���������� Ŭ���� �Ǵ� ��ü�� Ư���� ��Ÿ�� �� '�ʵ�(field, �Ǵ� ������Ƽ, property)'��� �θ���.
	 */
	
	int count;			// ��������
	String message;
	static int num;
	static final int TEST = 9999;		// static final�� ���! ������ �� �ʱ�ȭ���� ������ ����.
	static double point;
	
	public static void main(String[] args) {		// static�� ��ü�� �������� �ʰ� �� ��ü�� ���� ��. ** static�� static ������ �����Ѵ�. **
		int num = 10;		// main �޼ҵ忡���� ���
		System.out.println("num = " + num);		// 10
//		System.out.println("message = " + message);		// ���� : static�� �ƴ� ������ ����� �� ����.
//		methodA();	// static�� �ƴ� �޼ҵ�� ���� �߻�
		methodB();
	}
	
	public void methodA() {				// static �޼ҵ尡 �ƴϹǷ� ��ü�� ���� ����ϴ� �޼ҵ�
		int num = 99;		// methodA ������ ���
		System.out.println("num = " + num);		// 99
		System.out.println("message = " + message);		// ���������� ����� message
	}
	
	public static void methodB() {
		int num = 77;		// methodB ������ ���
		// ���������� ���������� �̸��� ���� ���, ���������� �����´�.	(������ ������ ���� �ְ�, ���콺�� �÷����� �� �� �ִ�.)
		System.out.println("num = " + num);		// 77
		System.out.println("num = " + C35_GlobalVar.num);		// Integer.BYTES�� ���� ����
		// ���������� ����� num. static�� ���� Ŭ�����̸�.������ / static�� �ƴ� ���� this.������ 
	}
	
	// *** �߿�! ***
	public void methodC(int count) {
		this.count = count;		// this�� new �������� ������� ��ü�� ��Ī�Ѵ�. methodC �޼ҵ带 �����Ű�� ��ü.
	}
}
