package koreait.day05;

import java.util.Scanner;

public class C24_StarPrint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int star;
		System.out.println("[[영화감상 후기]]");
		System.out.print("평점을 몇 점 주시겠습니까? (1~5) >>> ");
		star = sc.nextInt();
		
		System.out.println("방법 1");
		for(int i = 0; i < star; i++) {
			System.out.print("★");	
		}
		System.out.println();
		System.out.println();
		
		System.out.println("방법 2");
		for(int i = 0; i < star; i++) {
			System.out.print("★");
		}
		for(int j = 0; j < 5 - star; j++) {
			System.out.print("☆");		// 5 - star
		}
		System.out.println();
		System.out.println();
		
		System.out.println("방법 2_");
		for(int i = 0; i < 5; i++) {
			if(i < star) {
				System.out.print("★");
			} else {
				System.out.print("☆");
			}
		}	
		System.out.println();
		System.out.println();
		
		System.out.println("방법 2__");
		int k = 0;			// loop counter 변수가 main 메소드의 지역변수
		for (k = 0; k < star; k++) {		// star = 3;
			System.out.print("★");
		}
//		System.out.println("k = " + k);		// k = 3; 위의 for문이 종료됨.
		for (; k < 5; k++) {		// k의 값은 얼마부터 시작하는가? ==> k == star에서 시작함.
			System.out.print("☆");
		}
				
	}

}
