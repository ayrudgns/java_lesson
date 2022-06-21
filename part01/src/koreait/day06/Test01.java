package koreait.day06;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[100];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] == -1) {
				System.out.println("" + arr[i - 3] + " " + arr[i - 2] + " " + arr[i - 1]);
			}
		}
		sc.close();
	}
}
 