package koreait.day02;

// 자바 프로그래밍 언어에서는 클래스 이름과 파일명이 동일해야 합니다. ==> F2 키로 이름 바꾸기 (단축키)
public class C07_CastingTest {
	public static void main(String[] args) {
		// 대입문 : 오른쪽 값(리터럴)/수식/변수를 왼쪽으로 대입함.
		// 수식에 사용되는 연산은 다음과 같다.
		// 산술연산 : +, -, *, /(나눗셈의 몫), %(나눗셈의 나머지)
		// 산술연산 추가 : ++, --, +=, -=, *=, /=, %=과 같은 축약연산자. (복합대입연산자)
		// 관계연산(비교연산) : ==(동등), !=(같지 않다.), >, <, >=, <=
		// 논리연산 : &&(and, 앰퍼샌드), ||(or, 버티컬 바), !(not, 반대를 뜻함)
		
		// 정수 형식의 연산은 int
		int a = 123, b = 13;
		double c = 10.34;
		
		// 연산에 사용되는 피연산자가 모두 정수인 경우에 결과는 정수
		// 연산에 사용되는 피연산자가 정수, 실수인 경우에 결과는 실수
		//	==> 연산결과를 변수에 저장할 때 데이터 형식을 고려한다.
		
		int isum;
		double dsum;
		
		isum = a + b;
		dsum = a + c;
		System.out.println("a + b = " + isum);
		System.out.println("a + c = " + dsum);
		System.out.println();
		
//		isum = a + c;		// 오류 : 결과가 실수이므로 정수 형식의 변수에 저장할 수 없음.
//		형변환 : 정수 + 실수의 결과를 꼭 정수 변수에 저장해야 한다면, 실수를 정수로 변환해서 연산하면 됨.
//			==> 프로그래머가 결정해서 강제로 형변환, ()안에 변환시킬 형식 작성
		isum = (int)(a + c);
		isum = a + (int)c;	// 변수 c의 실수값을 정수값으로 변환, 그러나 값의 손실 발생
		System.out.println("a + (int)c = " + isum);
		System.out.println();
		
		b = 10;
		System.out.println(" a / b = " + (a/b));	// 정수끼리 나누면 결과는 정수로 나온다.
		System.out.println(" a % b = " + (a%b));	// 정수끼리 나눈 결과의 나머지
		
		System.out.printf("%d / %d = %d\n", a, b, a/b);
		System.out.printf("%d %% %d = %d\n", a, b, a%b);
		System.out.println();
		
//		강제 형변환(casting) 예시 : 정수끼리의 나눗셈 결과를 실수로 구하고 싶은 경우 (실수로 구하는 처리조건일 때)
//					==> 정수 하나를 실수로 변환
		b = 11;
		System.out.println("정수 / 정수 = 실수 형식 값으로 구합니다.");
		System.out.printf("%d / %d = %f\n", a, b, (double)a/b);		// 실수 형식 문자는 %f, 기본 소수점 이하 6자리
		System.out.printf("%d / %d = %.1f\n", a, b, (double)a/b);		// %.1f로 쓰면 소수점 이하 1자리만 나온다.
		// 소수점 자릿수를 줄일 때에는 반올림한 값으로 나온다.
		double test = 12.3456127456789;
		System.out.println("test = " + test);
		System.out.printf("test = %f\n", test);
		System.out.printf("test = %.15f", test);
	}

}
