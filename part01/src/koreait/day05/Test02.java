package koreait.day05;

import java.util.Arrays;
import java.util.Scanner;

public class Test02 {				// ���� ���� �����ϴ°���? ���� 563��
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			System.out.print("������ �Է��ϼ���. >> ");
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		System.out.println();
		System.out.println("===== �������� ���� =====");
		Arrays.toString(arr);
		Arrays.sort(arr);			// �������� �����ϴ� �޼ҵ�
		System.out.println(Arrays.toString(arr));
		
		sc.close();
	}	
}
