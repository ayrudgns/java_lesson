package koreait.day05;

import java.util.Arrays;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		int min = 0;
		for(int i = 0; i < arr.length; i++) {
			System.out.print("정수를 입력하세요. >> ");
			arr[i] = sc.nextInt();
			min = arr[0];
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("최솟값 : " + min);
		
		sc.close();
	}
	

}
