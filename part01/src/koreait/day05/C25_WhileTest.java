package koreait.day05;

import java.util.Scanner;

public class C25_WhileTest {
	public static void main(String[] args) {
		
		// 비교
//			for(int i = 0; i < 5; i++) {
//				System.out.println("hello!" + "(" + (i + 1) + ")");
//			}

		
		// while문 형식		==>	주로 무한루프 돌릴때 씀.
		// loop counter 변수 선언 & 초기값
		int j = 0;
		while (j < 5) {			// 조건식
				System.out.println("hello!" + "(" + (j + 1) + ")");
				j++;			// 증감식 써주기. 증감식이 없으면 무한루프..
		}
		System.out.println();
		
		//	예시 : 	for문은 1부터 100까지 더하는 연속적인 값을 대상으로 할 때 적합.
		//		  	while문은 아직 정해지지 않은 값들을 대상으로 할 때 적합.
		//			반복문과 함께 사용하는 명령문 : break, continue(continue 뒤의 명령들을 실행하지 않고 반복의 처음으로 돌아감)

		
		int k = 0;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("입력한 정수를 모두 더하는 계산기입니다. (종료는 -1을 입력하세요.)");		// 버전 1
		while (k != -1) {			// k가 -1이 아닌 동안 반복하여 실행한다.
			System.out.print("정수 입력 >>> ");
			k = sc.nextInt();
			if (k != -1) {
				sum += k;		// sum = sum + k;
			}
		}																			// 이건 좀 별로다.
		
		System.out.println("sum = " + sum);
		System.out.println();
		
		sum = 0;
		k = 0;
		System.out.println("입력한 정수를 모두 더하는 계산기입니다. [ver.2.0] (종료는 -1 입력)");		// 버전 2
		
		do {					// do-while문 활용
			sum += k;
			System.out.print("정수 입력 >>> ");
			k = sc.nextInt();
		} while (k != -1);		// 조건을 뒤에서 검사하는 명령문이다.						// 이게 제일 나은 듯
		System.out.println("sum = " + sum);
		System.out.println();
		
		sum = 0;
		System.out.println("입력한 정수를 모두 더하는 계산기입니다. [ver.2.1] (종료는 -1 입력)");		// 버전 2.1
		
		while (true) {
			System.out.print("정수 입력 >>> ");
			k = sc.nextInt();
			
			if(k == -1) {
				break;			// 항상 참일 때, 탈출(종료)조건과 break문 사용하기.
			} else {
				sum += k;
			}
		}
		System.out.println("sum = " + sum);
		System.out.println();
		
		sum = 0;
		System.out.println("입력한 정수를 모두 더하는 계산기입니다. [ver.2.2] (종료는 -1 입력)");		// 버전 2.2
		boolean isState = true;
		
		while (isState) {
			System.out.print("정수 입력 >>> ");
			k = sc.nextInt();
			
			if(k == -1) {
				isState = false;			// boolean 변수를 활용함. 종료 조건값일 때 boolean 변수값을 false로 합니다.
			} else {
				sum += k;
			}
		}
		System.out.println("sum = " + sum);
		System.out.println();
		
		//	같은 기능을 하지만 코드가 조금씩 다르다.
		
		sum = 0;
		// continue 연습 : 입력된 값이 10의 배수이면 sum에 더하지 않고 다시 입력받기.
		System.out.println("[[continue 연습하기]]");
		while (true) {
			System.out.print("정수 입력 >>> ");
			k = sc.nextInt();
			
			if(k == -1) {
				break;			// 항상 참일 때, 탈출(종료)조건과 break문 사용하기.
			} else {
				if ((k % 10) == 0) {
					continue;	// 주어진 조건이 참이면 다시 처음으로 돌아가기. 즉, sum += k가 실행되지 않고 다시 입력받음.
				}
				sum += k;
			}
		}
		System.out.println("sum = " + sum);
		
		sc.close();
	}

}
