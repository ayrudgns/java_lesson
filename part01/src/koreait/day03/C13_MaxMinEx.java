package koreait.day03;

import java.util.Scanner;

public class C13_MaxMinEx {
// 작성자 : 이경훈
	public static void main(String[] args) {
		// 3개의 정수 입력값 중에서 가장 큰 값을 출력한다. (비교와 결정)
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3, max;
		
		System.out.print("n1을 입력하세요. -> ");
		n1 = sc.nextInt();
		System.out.print("n2을 입력하세요. -> ");
		n2 = sc.nextInt();
		System.out.print("n3을 입력하세요. -> ");
		n3 = sc.nextInt();
		
		if(n1 > n2) {
			max = n1;
		}else {
			max = n2;
		}
		
		if(max < n3) {
			System.out.println("최종 max는 " + n3 + "입니다.");
		}else {
			System.out.println("최종 max는 " + max + "입니다.");
		}
		
	}

}
