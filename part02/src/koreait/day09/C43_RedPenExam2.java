package koreait.day09;

import java.util.Random;
import java.util.Scanner;

public class C43_RedPenExam2 {
// C42번을 MathProblem 클래스를 사용하는 것으로 바꾸기 : 연산은 덧셈만.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int size = 5;		// 문제 수를 따로 선언 및 초기화하여 코드의 수정이 수월하게 함!!
		int max_size = MathProblem.MAX_SIZE;		// size 변수값이 MAX_SIZE를 초과하는지 검사 추가하기.
		
		MathProblem[] problems = new MathProblem[size];
		// 모든 문제를 저장하는 배열
		
		// 배열의 타입은 MathProblem 객체 참조형 : n1, n2, op, isCorrect
	
		int ans;
		int cnt = 0;
		
		System.out.println("=============================");
		System.out.println("   빨간펜 수학 2자리 덧셈 문제 풀기      ");
		System.out.println("=============================");
		System.out.println("시작합니다.");
		
		for(int i = 0; i < size; i++) {
			MathProblem temp = new MathProblem('+');		// 곱셈을 하고 싶으면 객체를 변경해주면 됨.
			temp.makeProb();			// n1, n2의 값이 객체의 필드로 난수 생성.
			
			System.out.print("문제 " + (i + 1) + ". " + temp.problem() + " 답 입력 -> ");
//			System.out.print("문제 " + (i + 1) + ". " + temp.getN1() + " + " + temp.getN2() + " = 답 입력 -> ");
			ans = sc.nextInt();
			if(ans == temp.showAnswer()) {		// 정답과 비교, 답을 맞추면 카운트
				cnt++;			// 맞힌 문제 수 카운트
				temp.setCorrect(true);
			}
			problems[i] = temp;		// 이런 ㅅㅂ 여기다 쓰는거 맞네.. Line 44 밑에만 채우는줄.. 하
		}
		System.out.println("=============================");
		System.out.println("채점합니다. 맞은 개수 " + cnt + " ( " + (cnt * 100 / size) + " 점 )");
		System.out.println("::::::: 틀린 문제 정답 보기 :::::::");
		for(int i = 0; i < problems.length; i++) {		
			if(!problems[i].isCorrect()) {		// problems[i].isCorrect()이 거짓이면 !연산으로 인해 참으로 바뀐다.
				System.out.println("문제 " + (i + 1) + ". " + problems[i].problem() + problems[i].showAnswer());
			}
		}	// 틀린 문제 출력 종료

		
		sc.close();		// 프로그램 종료
	}
}
