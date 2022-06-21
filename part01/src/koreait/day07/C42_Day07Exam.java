package koreait.day07;

import java.util.Random;
import java.util.Scanner;

public class C42_Day07Exam {
	// 작성자 : 이경훈		// 필요없는 변수나 배열은 지워보자.
	public static void main(String[] args) {
		/*
		 *  1. 덧셈 문제는 두자리 덧셈이다.
		 *  2. 문제는 난수로 만든다.
		 *  3. 테스트할 때는 문제를 5개로 줄여서!
		 *  4. 클래스 활용 X, int 배열로만!
		 *  5. 첫번째 피연산자 배열, 두번째 피연산자 배열, 사용자 입력 정답 저장 배열
		 *  6. 모든 문제 10개를 저장? or 틀린 문제만 저장?
		 */
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int[] num1Arr = new int[10];		// 첫번째 피연산자 배열
		int[] num2Arr = new int[10];		// 두번째 피연산자 배열
		int[] ansArr = new int[10];			// 입력한 답 저장 배열
		int[] rightAnsArr = new int[10];	// 올바른 답 저장 배열
		
		int o = 0;							// 맞은 개수
		
		System.out.println("=============================");
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("=============================");
		
		System.out.println("시작합니다.");
		for(int i = 0; i < num1Arr.length; i++) {
			int r1 = r.nextInt(90) + 10;		// 범위 : 10 ~ 99
			int r2 = r.nextInt(90) + 10;
			System.out.print("문제 " + (i + 1) + ". " + r1 + " + " + r2 + " = 답 입력 -> ");
			num1Arr[i] = r1;						// 첫번째 피연산자 배열 요소에 저장
			num2Arr[i] = r2;						// 두번째 피연산자 배열 요소에 저장
			ansArr[i] = sc.nextInt();				// 입력한 답 배열로 저장
			rightAnsArr[i] = r1 + r2;				// 올바른 답 배열로 저장	// 이거 없애고 r1 + r2로 전부 대체해도 되네!!
			if (ansArr[i] == rightAnsArr[i]) {		// 입력한 답이 정답이면
				o++;								// o++
			}
		}	// 문제 출력 종료
		System.out.println("=============================");
		System.out.println("채점 합니다. 맞은 갯수 " + o + " ( " + (o * 10) + " 점 )");
		System.out.println("::::::: 틀린 문제 정답 보기 :::::::");
		for(int i = 0; i < ansArr.length; i++) {	// 모든 문제 10개를 저장함.
			if(ansArr[i] != rightAnsArr[i]) {	// 입력한 답과 정답이 같지 않으면
				System.out.println("문제 " + (i + 1) + ". " + num1Arr[i] + " + " + num2Arr[i] + " = " + rightAnsArr[i]);
			}	// 틀린 문제 출력
		}	// 틀린 문제 출력 종료
	
		sc.close();		// 프로그램 종료
	}

}
