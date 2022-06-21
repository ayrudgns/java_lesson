package koreait.day03;

import java.util.Scanner;

public class C13_MaxMinEx02 {
// 작성자 : 소스코드 받아온거
	public static void main(String[] args) {
		// 3개의 정수 입력값 중에서 가장 큰 값과 가장 작은 값을 출력한다. (비교와 결정)
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3, max, min;
		
		System.out.print("n1을 입력하세요. -> ");
		n1 = sc.nextInt();
		System.out.print("n2을 입력하세요. -> ");
		n2 = sc.nextInt();
		System.out.print("n3을 입력하세요. -> ");
		n3 = sc.nextInt();
		System.out.println("n1 = " + n1 + ", n2 = " + n2 + ", n3 = " + n3);
		
		// n1, n2, n3 중에서 최댓값, 최솟값 각각 구하기
		if(n1 > n2) {
			max = n1;
			min = n2;
		}else {
			max = n2;
			min = n1;
		}
		
		if(max < n3) max = n3;	// 임시 max 값보다 남은 1개인 n3이 더 클때만.
		
		if(min > n3) min = n3;	// 임시 min 값보다 남은 1개인 n3이 더 작을때만.

		System.out.println("최종 max는 " + max + ", 최종 min은 " + min + "입니다.");

	}

}
