package koreait.day03;

import java.util.Scanner;

public class C14_IfElseif {
	public static void main(String[] args) {
		// if(���ǽ�1) { ... } else if(���ǽ�2) { ... } else if(���ǽ�3) { ... } ~ else
		
		/*
		 * 	����!	���� ���θ� �����ø�
		 * 			���� ������ �ݾ��� 	10���� �̻��̸� ������ ���űݾ���	10%		0.1
		 * 			���� ������ �ݾ���	7���� �̻��̸� 					9%		0.09	
		 * 							4����						7%		0.07
		 * 							�� ���ϴ�						3%		0.03
		 */
		
		Scanner sc = new Scanner(System.in);
		int money;		// ������ : % �����ϸ� ������� �Ǽ� -> ������ ��ȯ.
		int pay;		// ���űݾ�
		double rate;	// ������
		
		System.out.print("���� �ݾ��� >>> ");
		pay = sc.nextInt();
		
		if(pay >= 100000) {
			rate = 0.1;
		} else if(pay >= 70000) {
			rate = 0.09;
		} else if(pay >= 40000) {
			rate = 0.07;
		} else {
			rate = 0.03;
		}

		money = (int)(pay * rate);		// ���� ���� �ݺ��� �ʿ� ����.
				
		System.out.printf("����! ���� �����Ͻ� �ݾ��� ������ %d�� �Դϴ�.\n", money);
		System.out.printf("�̺�Ʈ �Ⱓ ������ %d %% ����Ǿ����ϴ�.", (int)(rate * 100));
		
		sc.close();
		
//		if(pay >= 100000)
//			rate = 0.1;
//			money = (int)(pay * rate);	// ���� ���� �ݺ��� �ʿ� ����! ==> ���� �Ѱ�.
//		} else if(pay >= 70000) {
//			rate = 0.09;
//			money = (int)(pay * rate);
//		} else if(pay >= 40000) {
//			rate = 0.07;
//			money = (int)(pay * rate);
//		} else {
//			rate = 0.03;
//			money = (int)(pay * rate);
//		}

		
	}

}
