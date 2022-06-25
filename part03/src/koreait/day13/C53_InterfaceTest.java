package koreait.day13;

public class C53_InterfaceTest {
	public static void main(String[] args) {
		MyClassX x1 = new MyClassX();
		MyClassY y1 = new MyClassY();
		MyClassZ z1 = new MyClassZ();
		
		InterfaceA x2 = new MyClassX();
		InterfaceB y2 = new MyClassY();
		InterfaceA z2 = new MyClassZ();
		InterfaceB z3 = new MyClassZ();
//****************************************************
		// ���� Ÿ�Կ� ���� �޼ҵ� ����	(���� ����ü)	: z1, z2, z3�� � �޼ҵ带 ������ �� �ִ���?
		z1.methodA();		
		z1.methodB(23);	
		z1.methodD("z1����D");
		z1.name("z1����");
		// z1�� InterfaceA, InterfaceB�� �� �� ������ ����ü MyClassZ��
		// ���� ���� Ÿ���̹Ƿ� ������ 1�� ����.
		System.out.println();
		
		z2.methodA();
		z2.methodB(1);
		z2.methodD("z2����D");
//		z2.name("z2����");			// ���� : InterfaceB�� �߻�޼ҵ�� ������ �� ����.
		// z2�� ��ü�� MyClassZ�� ���������� ���� ������ InterfaceA Ÿ���̹Ƿ�
		// InterfaceB�� �߻�޼ҵ带 ������ �� ����.
		System.out.println();
		
//		z3.methodA();				// ���� : InterfaceA�� �߻�޼ҵ�� ������ �� ����.
//		z3.methodB();		
//		z3.methodD();	
		z3.name("nana");
		// z3�� ��ü�� MyClassZ������ ���� ������ InterfaceB Ÿ���̹Ƿ�
		// InterfaceA�� �߻�޼ҵ带 ������ �� ����.
		
//****************************************************
		// ĳ����(���� �Ǵ� ���� Ÿ�� ��ȯ) : "���� ����ü"�� �������̽� Ÿ�� ĳ����
		//		�� MyClassZ�� InterfaceA�� InterfaceB Ÿ������ ��� ������ �����ϴ�.
//		InterfaceB ib = z2;			// Type mismatch
		InterfaceB ib = (InterfaceB) z2;			// ����̸� ���ϻ���̶� �Ұ����� �۾��ε� interface�� ���߱����̶� ������.
		ib.name("z2����");	// ĳ���� ������ Line 26 ���� ����.
		
//		InterfaceA ia = z3;			// Type mismatch
		InterfaceA ia = (InterfaceA) z3;
		ia.methodA();		// ĳ���� ������ Line 30 ~ 32 ���� ����
		System.out.println();
//****************************************************
		// ������ ������ ����
		iAmethod(x2);
//		iAmethod(y1);		// ���� : ���ڷ� �����ؾ� �ϴ� y1�� InterfaceA�� ����ü�� �ƴϱ� �����̴�.
		iAmethod(x1);
		iAmethod(z1);
		iAmethod(z2);
//		iAmethod(z3);		// ���� : ���� z3�� ���� Ÿ���� InterfaceB�̱� ������ ����.
		System.out.println();
		
		iBmethod(y1);
//		iBmethod(x1);		// ���� : ���ڷ� �����ؾ� �ϴ� x1�� InterfaceB�� ����ü�� �ƴϱ� �����̴�.
		iBmethod(y2);
		iBmethod(z1);
//		iBmethod(z2);		// ���� : ���� z2�� ���� Ÿ���� InterfaceA�̱� ������ ����.
		iBmethod(z3);
	}
	
//****************************************************
	// ������ ������ ���� : �޼ҵ��� ���� Ÿ���� Interface
	public static void iAmethod(InterfaceA ia) {	// InterfaceA ����ü�� ��� ���ڷ� ���޹��� �� �ִ�.
		ia.methodA();
	}
	
	public static void iBmethod(InterfaceB ib) {	// InterfaceB ����ü�� ��� ���ڷ� ���޹��� �� �ִ�.
		System.out.println(ib.name("momo"));
	}

}
