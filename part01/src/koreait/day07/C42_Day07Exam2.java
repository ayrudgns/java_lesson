package koreait.day07;

import java.util.Random;
import java.util.Scanner;

public class C42_Day07Exam2 {
	// 작성자 : 이경훈 - 틀린 문제만 저장!, 강사님께 수정받음, 이게 더 나은 듯.
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
		
		int size = 7;			// 문제 수를 따로 선언 및 초기화하여 코드의 수정이 수월하게 함!!
		int o = 0;							// 맞은 개수
		int ans;							// 입력받은 답
		int n1, n2;							// 피연산자 1, 2
		int[] x1 = new int[size];			// 틀린 문제 피연산자 1 저장
		int[] x2 = new int[size];			// 틀린 문제 피연산자 2 저장
		int[] wrongAnsArr = new int[size];	// 오답 저장 배열
		
		System.out.println("=============================");
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("=============================");
		
		System.out.println("시작합니다.");
		for(int i = 0; i < size; i++) {
			n1 = r.nextInt(90) + 10;		// 범위 : 10 ~ 99
			n2 = r.nextInt(90) + 10;
			System.out.print("문제 " + (i + 1) + ". " + n1 + " + " + n2 + " = 답 입력 -> ");
			ans = sc.nextInt();
			if (ans == (n1 + n2)) {		// 입력한 답이 정답이면
				o++;								// o++ (정답 카운트)
			} else {								// 오답이면, 3개 배열에 틀린 문제 내용 저장하기.
				x1[i] = n1;
				x2[i] = n2;
				wrongAnsArr[i] = (n1 + n2);
			}
		}	// 문제 출력 종료
		System.out.println("=============================");
		System.out.println("채점합니다. 맞은 개수 " + o + " ( " + ((o  * 100) / size) + " 점 )");
		System.out.println("::::::: 틀린 문제 정답 보기 :::::::");
		for(int i = 0; i < size; i++) {	// 틀린 문제만 저장하면?
			if(wrongAnsArr[i] != 0) { 
				System.out.println("문제 " + (i + 1) + ". " + x1[i] + " + " + x2[i] + " = " + (x1[i] + x2[i]));		// 틀린 문제 올바르게 출력
			}
		}	// 틀린 문제 출력 종료
		sc.close();		// 프로그램 종료
	}

	/*
	 *  ======================= 피드백 ==============================
	 *  @@ num1Arr[i],num2Arr[i],rightAnsArr[i] 이거 안쓰고 할수 있겠는데요
	 *      ㄴ int r1으로 대체, ㄴ int r2로 대체, ㄴ (r1 + r2)로 대체 가능
	 *  @@ num1Arr.length()도 ansArr.length()로 대체함.
	 *  
	 */
}
