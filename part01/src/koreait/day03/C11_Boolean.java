package koreait.day03;

import java.util.Scanner;

public class C11_Boolean {
	public static void main(String[] args) {
		boolean result;
		result = 10 > 5;
		System.out.println("10 > 5의 결과 : " + result);
		
		System.out.println("9 != 9의 결과 : " + (9 != 9));			//  값이 뻔한데 뭐하러 물어봐?라는 의미의 노란줄
		System.out.println("9 == 9의 결과 : " + (9 == 9));			//  값이 뻔한데 뭐하러 물어봐?라는 의미의 노란줄
		System.out.println();
		
		System.out.println("---논리연산 결과 확인하기 : and---");
		System.out.println(" true and true = " + (true && true));		// true
		System.out.println(" true and false = " + (true && false));		// false
		System.out.println(" false and true = " + (false && true));		// false
		System.out.println(" false and false = " + (false && false));	// false
		// Dead code : 18, 19 Line의 첫번째 값이 false이므로 두번째 값은 볼 필요도 없다.	==> 이미 결과는 정해졌다.
		System.out.println();
		System.out.println("---논리연산 결과 확인하기 : or---");
		System.out.println(" true or true = " + (true || true));		// true
		System.out.println(" true or false = " + (true || false));		// true
		System.out.println(" false or true = " + (false || true));		// true
		System.out.println(" false or false = " + (false || false));	// false
		// Dead code : 23, 24 Line의 첫번째 값이 true이므로 두번째 값은 볼 필요도 없다.	==> 이미 결과는 정해졌다.
		System.out.println();
		System.out.println("---논리연산 결과 확인하기 : not---");
		System.out.println(" not true = " + !true);		// true 값을 반대(not)값으로 바꿈, false
		System.out.println(" not false = " + !false);	// true
		System.out.println();
		
		int korean, math;		// 국어점수, 수학점수
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 입력 -> ");
		korean = sc.nextInt();
		System.out.print("수학 점수 입력 -> ");
		math = sc.nextInt();
		
		// 국어점수와 수학점수가 모두 80점 이상인가? (and)	=> 모범학생
		System.out.println("모범학생 ? " + (korean >= 80 && math >= 80));
		
		// 국어점수 또는 수학점수 중에 90점 이상이 있는가? (or)	=> 특기학생
		System.out.println("특기학생 ? " + (korean >= 90 || math >= 90));
		
		// Quiz. 국어점수가 20 ~ 80이 아닌 학생들은 ? => 특이한 학생 ( not 연산을 이용 )
		System.out.println("특이한 학생 ? " + !(korean >= 20 && korean <= 80));
		
		sc.close();
	}

}

/*
 * 	데이터의 기본 형식 : boolean은 true 또는 false 의 값을 갖는 형식이다. (Boolean 래퍼클래스 존재함.)
 * 
 * 	관계연산 : == (동등, 같다), != (같지 않다), >, < ,>=, <= 연산의 결과값은 boolean 형식
 * 	논리연산 : &&(and, 앰퍼샌드), ||(or, 버티컬 바), !(not, 반대를 뜻함) 연산의 결과값은 boolean 형식
 * 
 * 	참고 : if, for 에서 필요한 조건식에 관계연산이 사용된다.
 */
 