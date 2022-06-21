package koreait.day05;

import java.util.Arrays;
import java.util.Scanner;

public class Test02 {				// 오잉 쉬벌 어케하는거지? 문제 563번
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			System.out.print("정수를 입력하세요. >> ");
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		System.out.println();
		System.out.println("===== 내림차순 정렬 =====");
		Arrays.toString(arr);
		Arrays.sort(arr);			// 내림차순 정렬하는 메소드
		System.out.println(Arrays.toString(arr));
		
		sc.close();
	}	
}
