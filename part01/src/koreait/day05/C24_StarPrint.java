package koreait.day05;

import java.util.Scanner;

public class C24_StarPrint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int star;
		System.out.println("[[��ȭ���� �ı�]]");
		System.out.print("������ �� �� �ֽðڽ��ϱ�? (1~5) >>> ");
		star = sc.nextInt();
		
		System.out.println("��� 1");
		for(int i = 0; i < star; i++) {
			System.out.print("��");	
		}
		System.out.println();
		System.out.println();
		
		System.out.println("��� 2");
		for(int i = 0; i < star; i++) {
			System.out.print("��");
		}
		for(int j = 0; j < 5 - star; j++) {
			System.out.print("��");		// 5 - star
		}
		System.out.println();
		System.out.println();
		
		System.out.println("��� 2_");
		for(int i = 0; i < 5; i++) {
			if(i < star) {
				System.out.print("��");
			} else {
				System.out.print("��");
			}
		}	
		System.out.println();
		System.out.println();
		
		System.out.println("��� 2__");
		int k = 0;			// loop counter ������ main �޼ҵ��� ��������
		for (k = 0; k < star; k++) {		// star = 3;
			System.out.print("��");
		}
//		System.out.println("k = " + k);		// k = 3; ���� for���� �����.
		for (; k < 5; k++) {		// k�� ���� �󸶺��� �����ϴ°�? ==> k == star���� ������.
			System.out.print("��");
		}
				
	}

}
