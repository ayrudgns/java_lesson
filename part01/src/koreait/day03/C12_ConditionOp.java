package koreait.day03;

import java.util.Scanner;

public class C12_ConditionOp {
	// ���ǽ��� ����� ���� ����� �����ϴ� ���ǿ����� : (���ǽ� ? ��/���� T : ��/���� F) => ���׿�����
	public static void main(String[] args) {
		
		int korean, math;		// ��������, ��������
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� �Է� -> ");
		korean = sc.nextInt();
		System.out.print("���� ���� �Է� -> ");
		math = sc.nextInt();
		
		// ���������� ���������� ��� 80�� �̻��ΰ�? (and)	=> ����л�
		System.out.println("����л� ? " + ((korean >= 80 && math >= 80)? "�½��ϴ�." : "�ƴմϴ�."));
		
		// if : ó���� ����� �����ϴ� ���ǹ�
		//	{	}�� ��ɹ� ���(block)�̰� �������� ��ɵ��� ���δ� ������ �ϴ� ��ȣ�̴�.
	
		if(korean >= 80 && math >= 80) {	
			// ���ǽ��� ���� �� �����ϴ� ��ɵ�
			System.out.println("�½��ϴ�.");
		}else {
			// ���ǽ��� ������ �� �����ϴ� ��ɵ�
			System.out.println("�ƴմϴ�.");
		}
		
//		System.out.println("Ư���л� ? " + (korean >= 90 || math >= 90));
//		{	} �ȿ� ���� ����� 1���� ���� ������ �� �ִ�.	
		if(korean >= 90 || math >= 90)
			System.out.println("�½��ϴ�.");
		else
			System.out.println("�ƴմϴ�.");

		// ���α׷��� ó�����ǿ��� else { }�� �ش��ϴ� ������ ������ �ۼ����� �ʴ´�.
		if(!(korean >= 20 && korean <= 80))
			System.out.println("ǥ������ ���� ū �����Դϴ�.");
	}

}
