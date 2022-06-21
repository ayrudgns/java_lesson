package koreait.day07;

import java.util.Random;
import java.util.Scanner;

public class C42_Day07Exam2 {
	// �ۼ��� : �̰��� - Ʋ�� ������ ����!, ����Բ� ��������, �̰� �� ���� ��.
	public static void main(String[] args) {
		/*
		 *  1. ���� ������ ���ڸ� �����̴�.
		 *  2. ������ ������ �����.
		 *  3. �׽�Ʈ�� ���� ������ 5���� �ٿ���!
		 *  4. Ŭ���� Ȱ�� X, int �迭�θ�!
		 *  5. ù��° �ǿ����� �迭, �ι�° �ǿ����� �迭, ����� �Է� ���� ���� �迭
		 *  6. ��� ���� 10���� ����? or Ʋ�� ������ ����?
		 */
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int size = 7;			// ���� ���� ���� ���� �� �ʱ�ȭ�Ͽ� �ڵ��� ������ �����ϰ� ��!!
		int o = 0;							// ���� ����
		int ans;							// �Է¹��� ��
		int n1, n2;							// �ǿ����� 1, 2
		int[] x1 = new int[size];			// Ʋ�� ���� �ǿ����� 1 ����
		int[] x2 = new int[size];			// Ʋ�� ���� �ǿ����� 2 ����
		int[] wrongAnsArr = new int[size];	// ���� ���� �迭
		
		System.out.println("=============================");
		System.out.println("������ ���� 2�ڸ� ���� ���� Ǯ��");
		System.out.println("=============================");
		
		System.out.println("�����մϴ�.");
		for(int i = 0; i < size; i++) {
			n1 = r.nextInt(90) + 10;		// ���� : 10 ~ 99
			n2 = r.nextInt(90) + 10;
			System.out.print("���� " + (i + 1) + ". " + n1 + " + " + n2 + " = �� �Է� -> ");
			ans = sc.nextInt();
			if (ans == (n1 + n2)) {		// �Է��� ���� �����̸�
				o++;								// o++ (���� ī��Ʈ)
			} else {								// �����̸�, 3�� �迭�� Ʋ�� ���� ���� �����ϱ�.
				x1[i] = n1;
				x2[i] = n2;
				wrongAnsArr[i] = (n1 + n2);
			}
		}	// ���� ��� ����
		System.out.println("=============================");
		System.out.println("ä���մϴ�. ���� ���� " + o + " ( " + ((o  * 100) / size) + " �� )");
		System.out.println("::::::: Ʋ�� ���� ���� ���� :::::::");
		for(int i = 0; i < size; i++) {	// Ʋ�� ������ �����ϸ�?
			if(wrongAnsArr[i] != 0) { 
				System.out.println("���� " + (i + 1) + ". " + x1[i] + " + " + x2[i] + " = " + (x1[i] + x2[i]));		// Ʋ�� ���� �ùٸ��� ���
			}
		}	// Ʋ�� ���� ��� ����
		sc.close();		// ���α׷� ����
	}

	/*
	 *  ======================= �ǵ�� ==============================
	 *  @@ num1Arr[i],num2Arr[i],rightAnsArr[i] �̰� �Ⱦ��� �Ҽ� �ְڴµ���
	 *      �� int r1���� ��ü, �� int r2�� ��ü, �� (r1 + r2)�� ��ü ����
	 *  @@ num1Arr.length()�� ansArr.length()�� ��ü��.
	 *  
	 */
}
