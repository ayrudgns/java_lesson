package koreait.day06;

import java.util.Random;

public class C30_RandomTest {
	// ������ �߻���Ű�� Random Ŭ������ �޼ҵ带 �׽�Ʈ
	public static void main(String[] args) {
		Random r = new Random();		// Random Ŭ������ ��ü ���� ( new ������ �̿� ), r�� ��������
		
		System.out.println("1. ������ ������ 10�� ���");
		for(int i = 0; i < 10; i++) {
			int inum = r.nextInt();		// int ���� ������ ������(����)�� �����.
			System.out.println(inum);
		}
		
		System.out.println();
		System.out.println("2. ������ ������ 10�� ��� - bound(��谪) ����.");
		for(int i = 0; i < 10; i++) {
			int inum = r.nextInt(100);		// 0 <= ���� < 100 ������ �������� �����.
			System.out.println(inum);		// r.nextInt(A) ==> 0���� (A-1)������ �����̴�.
		}
		// ��谪�� ����� ����Ѵ�.
		System.out.println();
		
		// 1 <= ���� < 101 ������ �������� ������ �Ѵٸ�?
		System.out.println("3. Ư�� ������ ������ 10�� ��� - bound�� �̿��� ����");
		for(int i = 0; i < 10; i++) {
			int inum = r.nextInt(100) + 1;		// 1 <= ���� < 101 ������ �������� �����.
			System.out.println(inum);
		}
		System.out.println();
		
		// n���� ũ�ų� ���� m���� ���� ���� ���� : r.nextInt(m - n) + n
		System.out.println("4. 2 ~ 45 ������ ������ ���� 10�� ���");	// n = 2, m = 46
		for(int i = 0; i < 10; i++) {
			int inum = r.nextInt(44) + 2;		// 2 <= ���� < 46
			System.out.println(inum);
		}
	}

}
