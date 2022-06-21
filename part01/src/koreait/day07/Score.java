package koreait.day07;

import java.util.Scanner;

// C40 번호 생략
public class Score {		// 점수 입력받고, 합계와 평균을 구하고 점수를 각각 알려주는 클래스
	
	int korean;
	int english;
	int science;
	
	void input() {		// 점수 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 >>> ");
		this.korean = sc.nextInt();
		System.out.print("영어 >>> ");
		this.english = sc.nextInt();
		System.out.print("과학 >>> ");
		this.science = sc.nextInt();
		// sc.close() // 완전히 프로그램이 종료될때만 해야함.
	}
	
	int sum() {				// 점수의 합계
		return (korean + english + science);
	}
	
	double avg() {			// 점수의 평균
		return (double)sum() / 3;
	}

	@Override
	public String toString() {
		return "[korean = " + korean + ", english = " + english + ", science = " + science + "]";
	}
	
}
