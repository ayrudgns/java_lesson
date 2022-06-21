package koreait.day09;

import java.util.Random;
import java.util.Scanner;

public class PracticeRedPen {
// 혼자 해본거!
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int size = 7;		// 문제 수를 따로 선언 및 초기화하여 코드의 수정이 수월하게 함!!
		int max_size = MathProblem.MAX_SIZE;		// size 변수값이 MAX_SIZE를 초과하는지 검사 추가하기.
		
		MathProblem[] problems = new MathProblem[size];
		// 모든 문제를 저장하는 배열 : 타입이 MathProblem이다. 이게 무슨 뜻이지?	==> 질문해보자.
		// 배열의 타입은 MathProblem 객체 참조형 : n1, n2, op, isCorrect
		// MathProblem 클래스 안에 있는 객체들(n1, n2, op, isCorrect)을 참조할 수 있는 타입이다.
		// 참조한다. ==> n1, n2, op, isCorrect 필드를 저장하고 읽어올 수 있다.
		// 22.06.08 질문 + 질문 답 참고하기.
		// problems[i]에 mp의 값을 저장하기 위해서 배열을 만드는 것. 필요할 때는 꺼내올 수 있다.
		// mp를 통해 problems[i]에 값을 저장한다.
	
		int ans;			// 사용자의 답 입력
		int cnt = 0;		// 맞힌 문제 수
		
		System.out.println("=============================");
		System.out.println("   빨간펜 수학 2자리 덧셈 문제 풀기      ");
		System.out.println("=============================");
		System.out.println("시작합니다.");
		
		for(int i = 0; i < size; i++) {
			MathProblem mp = new MathProblem('+');
//			MathProblem mp2 = new MathProblem();		// 기본생성자가 아니므로 이렇게 쓰면 안됨!
			mp.makeProb();		// n1, n2 난수 생성해서 입력받음.
			System.out.print("문제 " + (i + 1) + ". " + mp.problem() + "답 입력 >>> ");
			ans = sc.nextInt();
			if (ans == mp.showAnswer()) {		// 문제를 맞추면
				cnt++;					// 맞춘 문제 수 증가
				mp.setCorrect(true);	// isCorrect == true
			} 
			problems[i] = mp;			// mp 값을 배열에 저장하기.
		}
		System.out.println("=============================");
		System.out.println("채점합니다. 맞은 개수 " + cnt + " ( " + (cnt * 100 / size) + " 점 )");
		System.out.println("::::::: 틀린 문제 정답 보기 :::::::");
		for(int i = 0; i < problems.length; i++) {
			if(!problems[i].isCorrect()) {		// mp.이 아닌 problems[i].으로 쓴다. for문에서 돌린 mp값을 받았으니까.
				System.out.println("문제 " + (i + 1) + ". " + problems[i].problem() + problems[i].showAnswer() );
			}
		}
		
		sc.close();		// 프로그램 종료
	}
}