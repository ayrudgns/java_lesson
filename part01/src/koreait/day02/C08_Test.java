package koreait.day02;

public class C08_Test {
	public static void main(String[] args) {
		// ������ �̿��Ͽ� ����ڰ� ó���� ���� ������ ��.
		int width = 23;		// ����
		int height = 19;	// ����
		int size = width * height;
		System.out.println("[[�簢�� ������ ���� ���ϱ�]]");
		System.out.println("���� : " + width + " cm");
		System.out.println("���� : " + height + " cm");
		System.out.println("���̸� ���߽��ϴ�. -> " + size + " ��");
		System.out.println();
		
		double r = 23.23;		// ������
		double p = 3.14;
		final double PI = 3.14;
		double s = 2*r*PI;		// �ѷ�
		double v = r*r*PI;		// ����
		System.out.println("[[�� ������ ���̿� �ѷ� ���ϱ�]]");
		System.out.printf("%6s%.3f%3s\n", "������ : ", r, " cm");
		System.out.printf("%13s%.3f%2s\n", "�ѷ��� ���߽��ϴ�. -> ", s, " ��");
		System.out.printf("%13s%.3f%2s\n", "���̸� ���߽��ϴ�. -> ", v, " ��");
		
		System.out.println();
		// final �׽�Ʈ
		//		�������� �տ� final Ű���带 ���̸�  ���� ������ �� ����.
		
		final int TEST = 123;		// ���� ������ �� ���� ��� (�ַ� �빮�ڷ� ��)
		System.out.println("TEST = " + TEST);	
//		TEST = 456;		// ���� : final�� �����.
	}

}
