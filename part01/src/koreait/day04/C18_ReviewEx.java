package koreait.day04;

import java.util.Scanner;

public class C18_ReviewEx {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String best;			// Ư�������� ������ ����
		int korean, english, science, max;
		
		System.out.println("[[���� ���� : ��հ� ���� ���ϱ�]]");
		System.out.println("������ �Է��ϼ���.");
		System.out.print("���� -> ");
		korean = sc.nextInt();
		System.out.print("���� -> ");
		english = sc.nextInt();
		System.out.print("���� -> ");
		science = sc.nextInt();
		System.out.println();
		
		int sum = korean + english + science;
		double avg = (double)(korean + english + science) / 3;
		
		System.out.println(">> ó���Ǿ����ϴ�.");
		System.out.println("���� : " + sum);
		System.out.printf("��� : %d (%.2f) , ����� : 3\n", (int)avg, avg);
		
//		if (korean > english) {
//			if (korean > science) {
//				best = "����";
//			} else { 
//				best = "����";
//			}
//		} else {
//			if (english > science) {
//				best = "����";
//			} else { 
//				best = "����";
//			}
//		}							// ���� �Ѱ� ==> max ������ �Ƚ���. ������ �Ű��� �ȽἭ..
		
		if (korean > english) {
			max = korean;
			best = "����";
		} else {
			best = "����";
			max = english;
		}
		
		if (max < science) {
			best = "����";
			max = science;
		}							// �̰� �� �����ϴ�.
		
		System.out.printf("�� �л��� Ư������� . %s (%d��) . �Դϴ�.", best, max);
		
		sc.close();
	}

}
