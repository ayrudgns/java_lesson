package koreait.day07;

import java.util.Random;
import java.util.Scanner;

public class C42_Day07Exam {
	// �ۼ��� : �̰���		// �ʿ���� ������ �迭�� ��������.
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
		
		int[] num1Arr = new int[10];		// ù��° �ǿ����� �迭
		int[] num2Arr = new int[10];		// �ι�° �ǿ����� �迭
		int[] ansArr = new int[10];			// �Է��� �� ���� �迭
		int[] rightAnsArr = new int[10];	// �ùٸ� �� ���� �迭
		
		int o = 0;							// ���� ����
		
		System.out.println("=============================");
		System.out.println("������ ���� 2�ڸ� ���� ���� Ǯ��");
		System.out.println("=============================");
		
		System.out.println("�����մϴ�.");
		for(int i = 0; i < num1Arr.length; i++) {
			int r1 = r.nextInt(90) + 10;		// ���� : 10 ~ 99
			int r2 = r.nextInt(90) + 10;
			System.out.print("���� " + (i + 1) + ". " + r1 + " + " + r2 + " = �� �Է� -> ");
			num1Arr[i] = r1;						// ù��° �ǿ����� �迭 ��ҿ� ����
			num2Arr[i] = r2;						// �ι�° �ǿ����� �迭 ��ҿ� ����
			ansArr[i] = sc.nextInt();				// �Է��� �� �迭�� ����
			rightAnsArr[i] = r1 + r2;				// �ùٸ� �� �迭�� ����	// �̰� ���ְ� r1 + r2�� ���� ��ü�ص� �ǳ�!!
			if (ansArr[i] == rightAnsArr[i]) {		// �Է��� ���� �����̸�
				o++;								// o++
			}
		}	// ���� ��� ����
		System.out.println("=============================");
		System.out.println("ä�� �մϴ�. ���� ���� " + o + " ( " + (o * 10) + " �� )");
		System.out.println("::::::: Ʋ�� ���� ���� ���� :::::::");
		for(int i = 0; i < ansArr.length; i++) {	// ��� ���� 10���� ������.
			if(ansArr[i] != rightAnsArr[i]) {	// �Է��� ��� ������ ���� ������
				System.out.println("���� " + (i + 1) + ". " + num1Arr[i] + " + " + num2Arr[i] + " = " + rightAnsArr[i]);
			}	// Ʋ�� ���� ���
		}	// Ʋ�� ���� ��� ����
	
		sc.close();		// ���α׷� ����
	}

}
