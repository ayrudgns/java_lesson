package koreait.day03;

import java.util.Scanner;

public class C08_KeyInputEx {
	public static void main(String[] args) {
		// ������ �̿��Ͽ� ����ڰ� ó���� ���� ������ ��.
		Scanner sc = new Scanner(System.in);
		
		int width, height;							// ����ڰ� �Է��� ��
		System.out.print("���� ���̸� �Է��ϼ���. -> ");
		width = sc.nextInt();
		System.out.print("���� ���̸� �Է��ϼ���. -> ");
		height = sc.nextInt();
		
		int size = width * height;
		
		System.out.println("[[�簢�� ������ ���� ���ϱ�]]");
		System.out.println("���� : " + width + " cm");
		System.out.println("���� : " + height + " cm");
		System.out.println("���̸� ���߽��ϴ�. -> " + size + " ��");
		System.out.println();
		
		double r;									// ����ڰ� �Է��� ��
		System.out.print("�������� �Է��ϼ���. -> ");
		r = sc.nextDouble();
		
//		double p = 3.14;
		final double PI = 3.14;			// ������
		double s = 2 * r * PI;			// �ѷ�
		double volume = r * r * PI;		// ����
		
		System.out.println("[[�� ������ ���̿� �ѷ� ���ϱ�]]");
		System.out.printf("%6s%.3f%3s\n", "������ : ", r, " cm");
		System.out.printf("%13s%.3f%2s\n", "�ѷ��� ���߽��ϴ�. -> ", s, " ��");
		System.out.printf("%13s%.3f%2s\n", "���̸� ���߽��ϴ�. -> ", volume, " ��");
		
		sc.close();			// Ű����(ǥ���Է���ġ) �ڿ� ��� ����!
		
		System.out.println();
//		 final �׽�Ʈ
//				�������� �տ� final Ű���带 ���̸�  ���� ������ �� ����.
		
		final int TEST = 123;		// ���� ������ �� ���� ��� (�ַ� �빮�ڷ� ��)
		System.out.println("TEST = " + TEST);	
//		TEST = 456;		// ���� : final�� �����.
	}

}
