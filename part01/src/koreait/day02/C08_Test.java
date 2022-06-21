package koreait.day02;

public class C08_Test {
	public static void main(String[] args) {
		// 변수를 이용하여 사용자가 처리할 값을 지정해 줌.
		int width = 23;		// 가로
		int height = 19;	// 세로
		int size = width * height;
		System.out.println("[[사각형 도형의 넓이 구하기]]");
		System.out.println("가로 : " + width + " cm");
		System.out.println("세로 : " + height + " cm");
		System.out.println("넓이를 구했습니다. -> " + size + " ㎠");
		System.out.println();
		
		double r = 23.23;		// 반지름
		double p = 3.14;
		final double PI = 3.14;
		double s = 2*r*PI;		// 둘레
		double v = r*r*PI;		// 넓이
		System.out.println("[[원 도형의 넓이와 둘레 구하기]]");
		System.out.printf("%6s%.3f%3s\n", "반지름 : ", r, " cm");
		System.out.printf("%13s%.3f%2s\n", "둘레를 구했습니다. -> ", s, " ㎝");
		System.out.printf("%13s%.3f%2s\n", "넓이를 구했습니다. -> ", v, " ㎠");
		
		System.out.println();
		// final 테스트
		//		변수선언 앞에 final 키워드를 붙이면  값을 변경할 수 없다.
		
		final int TEST = 123;		// 값을 변경할 수 없는 상수 (주로 대문자로 씀)
		System.out.println("TEST = " + TEST);	
//		TEST = 456;		// 오류 : final로 선언됨.
	}

}
