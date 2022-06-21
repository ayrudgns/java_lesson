package koreait.day04;

public class C19_MethodTest {
	
	// main �޼ҵ� : ������ ������. ���α׷� ������ ���ؼ� �� �ʿ��� �޼ҵ�. static
	public static void main(String[] args) {
		
		System.out.println("�޼ҵ带 ���� �����ؼ� ����غ���.");
		System.out.println("���α׷��� main �޼ҵ��� ��ɹ��� ������� �����Ѵ�.");
		System.out.println("�߰��� �޼ҵ� ȣ���� ������ �޼ҵ尡 ���ǵ� ������ ���� ��� �̵��Ѵ�.");
		System.out.println("1.");
		methodA();		// �޼ҵ� ȣ�� (����), �ʿ��� �� ȣ���Ѵ�. (�ش� �޼ҵ� ��ŭ�� �ڵ尡 ���̿� ���Դٰ� �����ϸ� ����!)
		System.out.println("�޼ҵ��� ������ ����Ǹ� �ٽ� main �޼ҵ�� ��� ���ƿ´�.");
						// ��, main���� �����ϴٰ� �޼ҵ带 ������ �ش� �޼ҵ带 �����Ϸ� ���ٰ� �ٽ� main������ ���ƿͼ� ���� ������.
		System.out.println();
		
		System.out.println("2.");
		methodB(11, 33);		// ** 11�� 33�� �޼ҵ� ���࿡ �ʿ��� ����. **
		methodB(929, 121);
//		methodB(929, 12.1);		// ���� : 12.1�� 12�� �ڵ�����ȯ X (8byte�� 4byte�� ���� �� ����!, double -> int X)
								// �Ű����� ���� ����
		System.out.println();
		
		System.out.println("3.");
		methodC(929, 12.1);
		methodC(929, 121);		// ���� �ƴ� : 121�� 121.0���� �ڵ�����ȯ (4byte�� 8byte�� ��� �� ������!, int -> double O)
		System.out.println();
		
		System.out.println("4.");
		methodD();				// ��ȯ���� �ִ� �޼ҵ�������, main �޼ҵ忡�� ��ȯ���� �������� ����.
		System.out.println("return = " + methodD());		// ��ȯ���� �޾Ƽ� ����ϴ� ����
		int temp = methodD();	// ��ȯ���� �޾Ƽ� ������ �����ϴ� ���� : ������ ���İ� ��ȯ���� ������ �ݵ�� ���ƾ� �Ѵ�.
		System.out.println("return = " + temp);
		System.out.println();
		
		System.out.println("5.");
		// ���� ���ù� �����
		System.out.println("return = " + methodE(3, 12.1));
		double tmp = methodE(3, 12.1);
		System.out.println("return = " + tmp);
		System.out.println();
		
		System.out.println("6.");
		System.out.println(methodF('i', 4));	// methodF �����غ���.
		char ch = 'a';
		int val = 3;
		ch = methodF(ch, val);		// �޼ҵ� ���ڷ� ����� ���� ������ �����ϱ�
		System.out.println("return = " + ch);
	}	
	
		 /*	
		  * String Ŭ������ �޼ҵ� �����ϱ� ���ؼ� ���� �޼ҵ��� ������ ��������.
		  *
		  * �޼ҵ��� �ֿ� ��� :
		  * 	��ȯ��(���� �߿�!), ����(argument) �Ǵ� �Ű�����(parameter), �޼ҵ� �̸�, public �Ǵ� static ���� ����
		  * 		�� ��ȯ�� : �޼ҵ��� ������ �Ϸ�Ǹ� ������� �����
		  * 		�� ����(�Ű�����) : �޼ҵ� ������ ���ؼ� �ʿ��� ������ (���İ� ������ ���� �ʿ�), ������ ������ ������ �پ��ϴ�.
		  *			�� �޼ҵ� �̸� : �ĺ���
		  * 		�� public : ����������(����������), static : ������ ���
		  */

	
		// static�� main���� ������ �޼ҵ�� �����ϰ� static�̾�� �Ѵ�. (��������)
		// �޼ҵ� ����(����)
		public static void methodA() {
			System.out.println("## ù��° �޼ҵ� ���� �����Դϴ�. ##");
		}
		
		public static void methodB(int a, int b) {	// ** int a, int b�� ������ ���� ���޹޴� �Ű�����(��������) **
			System.out.println("## �ι�° �޼ҵ� ���� �����Դϴ�. ##");
			System.out.println("���޹��� �� : a = " + a + ", b = " + b);
		}
		
		public static void methodC(int a, double b) {		// void�� ��ȯ��(return��)�� ��� ��!
			System.out.println("## ����° �޼ҵ� ���� �����Դϴ�. ##");
			System.out.println("���޹��� �� : a = " + a + ", b = " + b);
		}
		
		public static int methodD() {		// ��ȯ���� �ִ� ���� : ��ȯ���� int ������, return�� �ݵ�� �ʿ���!
			System.out.println("## �׹�° �޼ҵ� ���� �����Դϴ�. ##");
			return 999;
		}
		
		public static double methodE(int a, double b) {
			System.out.println("## �ټ���° �޼ҵ� ���� �����Դϴ�. ##");
			return a + b;		// ���ڷ� ���޹��� ������ �����ϰ� ó������� ��ȯ(return)�Ѵ�.
		}
		
		public static char methodF(char a, int b) {
			System.out.println("## ������° �޼ҵ� ���� �����Դϴ�. ##");
			return (char)(a + b);		// ���� �Ѱ�.
		}

	}
