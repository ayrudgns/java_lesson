package koreait.day05;

import java.util.Arrays;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		int min = 0;
		for(int i = 0; i < arr.length; i++) {
			System.out.print("������ �Է��ϼ���. >> ");
			arr[i] = sc.nextInt();
			min = arr[0];
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("�ּڰ� : " + min);
		
		sc.close();
	}
	

}
