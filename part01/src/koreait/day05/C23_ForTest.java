package koreait.day05;


public class C23_ForTest {		// �ݺ��Ǵ� ��ɵ��� �����ϴ� for���� ����

	public static void main(String[] args) {

		// ��ɹ��� �ݺ�1 : ���� ��¹��� 5�� �ݺ�
		System.out.println("hello!");
		System.out.println("hello!");
		System.out.println("hello!");
		System.out.println("hello!");
		System.out.println("hello!");
		System.out.println();
		
		// ��ɹ��� �ݺ�2 : ���� ��¹������� ���� ������ �����鼭 5�� �ݺ�
		System.out.println("hello!(1)");
		System.out.println("hello!(2)");
		System.out.println("hello!(3)");
		System.out.println("hello!(4)");
		System.out.println("hello!(5)");
		System.out.println();
		
//		for(�����ʱⰪ; �������ǽ�; ������)		// ������ loop counter (�ݺ����� Ƚ���� �����ϴ� ����)		
		for(int i = 0; i < 5; i++)	{		// i�� for() �ȿ��� �����ϸ� for������ ����Ҽ� �ִ�.(for { }�� ��������)
			//i�� 0���� 4���� ����Ǹ鼭 �����Ѵ�.
			System.out.println("��ο� !");		// i = 0 , 0 < 5 �� ==> ��� ���� ==> i++
			System.out.println(i);
			System.out.println("////////");		// i = 1 , 1 < 5 �� ==> ��� ����  ==> i++
		}						// i = 2, 2 < 5 �� ==> ��� ����  ==> i++
								//	:
								// i = 5, 5 < 5 ����  ==> ��� ����  ==> for����
			System.out.println();
			
		// �ٸ� ����
		for(int i = 0; i < 10; i += 2)			//�����?
			System.out.println("hello!!!!!");  
		
		for(int i = 0; i < 0; i++) 			//�����?
			System.out.println("��ο�!!!!!");
		
//		System.out.println();
//		for(int i = 0; i > 0; i++) {		// ���ǽİ� �����Ŀ� for���� �����ϴ� ���� ���� ��� ==> ���ѷ���, ���������ؾ� ��.
//			System.out.println("��ο�~");
//			System.out.println(i);
//			System.out.println("////////");
		
		// �� ��ɹ��� �ݺ�2�� for�� ����غ�����.
		
		for(int i = 0; i < 5; i++) {
			System.out.println("hello!" + "(" + (i + 1) + ")");
		}

	}							
}
