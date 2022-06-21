package koreait.day05;

import java.util.Scanner;

public class C25_WhileTest {
	public static void main(String[] args) {
		
		// ��
//			for(int i = 0; i < 5; i++) {
//				System.out.println("hello!" + "(" + (i + 1) + ")");
//			}

		
		// while�� ����		==>	�ַ� ���ѷ��� ������ ��.
		// loop counter ���� ���� & �ʱⰪ
		int j = 0;
		while (j < 5) {			// ���ǽ�
				System.out.println("hello!" + "(" + (j + 1) + ")");
				j++;			// ������ ���ֱ�. �������� ������ ���ѷ���..
		}
		System.out.println();
		
		//	���� : 	for���� 1���� 100���� ���ϴ� �������� ���� ������� �� �� ����.
		//		  	while���� ���� �������� ���� ������ ������� �� �� ����.
		//			�ݺ����� �Բ� ����ϴ� ��ɹ� : break, continue(continue ���� ��ɵ��� �������� �ʰ� �ݺ��� ó������ ���ư�)

		
		int k = 0;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է��� ������ ��� ���ϴ� �����Դϴ�. (����� -1�� �Է��ϼ���.)");		// ���� 1
		while (k != -1) {			// k�� -1�� �ƴ� ���� �ݺ��Ͽ� �����Ѵ�.
			System.out.print("���� �Է� >>> ");
			k = sc.nextInt();
			if (k != -1) {
				sum += k;		// sum = sum + k;
			}
		}																			// �̰� �� ���δ�.
		
		System.out.println("sum = " + sum);
		System.out.println();
		
		sum = 0;
		k = 0;
		System.out.println("�Է��� ������ ��� ���ϴ� �����Դϴ�. [ver.2.0] (����� -1 �Է�)");		// ���� 2
		
		do {					// do-while�� Ȱ��
			sum += k;
			System.out.print("���� �Է� >>> ");
			k = sc.nextInt();
		} while (k != -1);		// ������ �ڿ��� �˻��ϴ� ��ɹ��̴�.						// �̰� ���� ���� ��
		System.out.println("sum = " + sum);
		System.out.println();
		
		sum = 0;
		System.out.println("�Է��� ������ ��� ���ϴ� �����Դϴ�. [ver.2.1] (����� -1 �Է�)");		// ���� 2.1
		
		while (true) {
			System.out.print("���� �Է� >>> ");
			k = sc.nextInt();
			
			if(k == -1) {
				break;			// �׻� ���� ��, Ż��(����)���ǰ� break�� ����ϱ�.
			} else {
				sum += k;
			}
		}
		System.out.println("sum = " + sum);
		System.out.println();
		
		sum = 0;
		System.out.println("�Է��� ������ ��� ���ϴ� �����Դϴ�. [ver.2.2] (����� -1 �Է�)");		// ���� 2.2
		boolean isState = true;
		
		while (isState) {
			System.out.print("���� �Է� >>> ");
			k = sc.nextInt();
			
			if(k == -1) {
				isState = false;			// boolean ������ Ȱ����. ���� ���ǰ��� �� boolean �������� false�� �մϴ�.
			} else {
				sum += k;
			}
		}
		System.out.println("sum = " + sum);
		System.out.println();
		
		//	���� ����� ������ �ڵ尡 ���ݾ� �ٸ���.
		
		sum = 0;
		// continue ���� : �Էµ� ���� 10�� ����̸� sum�� ������ �ʰ� �ٽ� �Է¹ޱ�.
		System.out.println("[[continue �����ϱ�]]");
		while (true) {
			System.out.print("���� �Է� >>> ");
			k = sc.nextInt();
			
			if(k == -1) {
				break;			// �׻� ���� ��, Ż��(����)���ǰ� break�� ����ϱ�.
			} else {
				if ((k % 10) == 0) {
					continue;	// �־��� ������ ���̸� �ٽ� ó������ ���ư���. ��, sum += k�� ������� �ʰ� �ٽ� �Է¹���.
				}
				sum += k;
			}
		}
		System.out.println("sum = " + sum);
		
		sc.close();
	}

}
