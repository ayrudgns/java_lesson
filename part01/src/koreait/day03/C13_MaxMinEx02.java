package koreait.day03;

import java.util.Scanner;

public class C13_MaxMinEx02 {
// �ۼ��� : �ҽ��ڵ� �޾ƿ°�
	public static void main(String[] args) {
		// 3���� ���� �Է°� �߿��� ���� ū ���� ���� ���� ���� ����Ѵ�. (�񱳿� ����)
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3, max, min;
		
		System.out.print("n1�� �Է��ϼ���. -> ");
		n1 = sc.nextInt();
		System.out.print("n2�� �Է��ϼ���. -> ");
		n2 = sc.nextInt();
		System.out.print("n3�� �Է��ϼ���. -> ");
		n3 = sc.nextInt();
		System.out.println("n1 = " + n1 + ", n2 = " + n2 + ", n3 = " + n3);
		
		// n1, n2, n3 �߿��� �ִ�, �ּڰ� ���� ���ϱ�
		if(n1 > n2) {
			max = n1;
			min = n2;
		}else {
			max = n2;
			min = n1;
		}
		
		if(max < n3) max = n3;	// �ӽ� max ������ ���� 1���� n3�� �� Ŭ����.
		
		if(min > n3) min = n3;	// �ӽ� min ������ ���� 1���� n3�� �� ��������.

		System.out.println("���� max�� " + max + ", ���� min�� " + min + "�Դϴ�.");

	}

}
