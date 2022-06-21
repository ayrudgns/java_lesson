package koreait.day09;

import java.util.Random;

public class MathProblem {
	// 인스턴스 필드 : static이 아닌 형식, 객체가 생성될 때마다 다른 값을 갖는다.
	private int n1;
	private int n2;
	private char op;		// 연산자 ( +, -, *, /, % )
	private boolean isCorrect;		// 사용자가 입력한 답이 정답인지 여부 확인, 정답일 때 true
	// isCorrect 필드 대신 ans 필드를 추가해서 사용자가 입력한 답을 저장하면 사용자가 입력한 오답 출력 가능.
	
	// static 필드
	public static final int MAX_SIZE = 20;			// 문제의 최대 개수는 20개.
	
	
	// ############################## 메소드 #############################
	public MathProblem (char op) {
		this.op = op;			// 인자로 전달받은 값이 연산자.
	}
	
	/*
	 *  !! 참고 !!
	 *  static 메소드는 인스턴스 필드값과 무관하게 동작하는 메소드이다. (객체와 연관된 동작이 아니다.)
	 *  인스턴스 메소드는 인스턴스 필드값과 관련되어 동작하는 메소드이다.
	 */
	
	public void makeProb() { 	// 사칙연산 종류별로 적절한 난수 생성하기 -> 문제를 만들어 준다.
								// 인스턴스 메소드 : 객체가 매번 다르게 나오기 때문에, 인스턴스를 만드는 메소드
		Random r = new Random();
		int max1 = 0, min1 = 0, max2 = 0, min2 = 0;
		switch (op) {
		case '+':				// op값이 '+'일 때
			max1 = 99; max2 = 99; min1 = 11; min2 = 11;	// n1, n2 모두 11 ~ 99
			break;						
		case '-':				// op값이 '-'일 때
			max1 = 99; max2 = 49; min1 = 50; min2 = 11;	// n1은 50 ~ 99, n2는 11 ~ 49
			break;										// 항상 n1 > n2 이므로 뺄셈 결과가 음수가 나오지 않는다.
		case '*':				// op값이 '*'일 때
			max1 = 77; max2 = 29; min1 = 11; min2 = 11;	// n1은 11 ~ 77, n2는 11 ~ 29
			break;										// n1 > n2, 곱셈 과정을 쉽게 하기 위하여 n2를 작게 함.
		case '/':				// op값이 '/'일 때
			max1 = 99; max2 = 29; min1 = 41; min2 = 11;	// n1은 41 ~ 99, n2는 11 ~ 29
			break;										// n1 > n2, 나눗셈 과정을 쉽게 하기 위하여 n2를 작게 함.

		}
		n1 = r.nextInt(max1 - min1 + 1) + min1;			// 난수 범위 : min1 ~ max1
		n2 = r.nextInt(max2 - min2 + 1) + min2;			// 난수 범위 : min2 ~ max2
	}
	
	public int showAnswer() {		// n1, n2, op 필드값을 가져와서 정답을 계산하여 반환한다.
									// 마찬가지로 인스턴스 메소드.
		int result = 0;
	
		switch (op) {
		case '+':
			result = n1 + n2;
			break;
		case '-':
			result = n1 - n2;
			break;
		case '*':
			result = n1 * n2;
			break;
		case '/':
			result= n1 / n2;
			break;
		}
		
		return result;
	}
	
	public String problem() {			// 정답을 리턴하는 인스턴스 메소드.
		return (n1 + " " + op + " " + n2 + " = ");
	}									// 출력하는 메소드를 잘 쓰지 않는 이유는
										// 출력하는 코드가 불편해질 수도 있기 때문.
										// 따라서 기능만 하는 메소드를 만드는 것이 좋다.

	
	// getter, setter 만들기 ( 현재 클래스에서 setter는 생략 가능, 메소드가 대체하니까 )
	
	public boolean isCorrect() {
		return isCorrect;
	}

	public void setCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}

	public int getN1() {
		return n1;
	}

	public int getN2() {
		return n2;
	}

	public char getOp() {
		return op;
	}

	


}
