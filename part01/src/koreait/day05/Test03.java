package koreait.day05;

import java.util.Arrays;
import java.util.Scanner;

public class Test03 {			// 정올 문제 154번
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double weight;
		double sum = 0;
		double[] arr = new double[6];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("몸무게를 입력하세요. >> ");
			arr[i] = sc.nextDouble();
			sum += arr[i];
		}
		System.out.println(Arrays.toString(arr));
		double avg = sum / arr.length;
		System.out.printf("%.1f", avg);
		
	}

}
