package koreait.day09;

import java.util.Random;
import java.util.Scanner;

public class C42_RedPenExam {
	// 7일차 C42_Day07Exam 풀이
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int size = 5;		// 문제 수를 따로 선언 및 초기화하여 코드의 수정이 수월하게 함!!
		int[] x1 = new int[10];				// 틀린 문제 피연산자 1 저장할 배열
		int[] x2 = new int[10];				// 틀린 문제 피연산자 2 저장할 배열
		int[] no = new int[10];				// 틀린 문제 번호 저장
		int n1, n2, ans;
		int cnt = 0;
		
		System.out.println("=============================");
		System.out.println("   빨간펜 수학 2자리 덧셈 문제 풀기      ");
		System.out.println("=============================");
		System.out.println("시작합니다.");
		
		for(int i = 0; i < size; i++) {
			n1 = r.nextInt(89) + 11;			// 범위 11 ~ 99
			n2 = r.nextInt(89) + 11;
			System.out.print("문제 " + (i + 1) + ". " + n1 + " + " + n2 + " = 답 입력 -> ");
			ans = sc.nextInt();
			if(ans != (n1 + n2)) {		// 3개 배열에 틀린 문제 내용 저장하기
				x1[cnt] = n1;
				x2[cnt] = n2;
				no[cnt] = i + 1;
				cnt++;			// 틀린 문제 수 카운트
			}
		}
		System.out.println("=============================");
		System.out.println("채점합니다. 맞은 개수 " + (size - cnt) + " ( " + ((size - cnt) * 100 / size) + " 점 )");
		System.out.println("::::::: 틀린 문제 정답 보기 :::::::");
		for(int i = 0; i < cnt; i++) {
				System.out.println("문제 " + (i + 1) + ". " + x1[i] + " + " + x2[i] + " = " + (x1[i] + x2[i]));
		}	// 틀린 문제 출력 종료
		sc.close();		// 프로그램 종료
	}
}
