package koreait.day03;

import java.util.Scanner;

public class C13_MaxMinEx {
// �ۼ��� : �̰���
	public static void main(String[] args) {
		// 3���� ���� �Է°� �߿��� ���� ū ���� ����Ѵ�. (�񱳿� ����)
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3, max;
		
		System.out.print("n1�� �Է��ϼ���. -> ");
		n1 = sc.nextInt();
		System.out.print("n2�� �Է��ϼ���. -> ");
		n2 = sc.nextInt();
		System.out.print("n3�� �Է��ϼ���. -> ");
		n3 = sc.nextInt();
		
		if(n1 > n2) {
			max = n1;
		}else {
			max = n2;
		}
		
		if(max < n3) {
			System.out.println("���� max�� " + n3 + "�Դϴ�.");
		}else {
			System.out.println("���� max�� " + max + "�Դϴ�.");
		}
		
	}

}
