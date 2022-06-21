package koreait.day03;

import java.util.Scanner;

public class C08_KeyInputEx {
	public static void main(String[] args) {
		// 변수를 이용하여 사용자가 처리할 값을 지정해 줌.
		Scanner sc = new Scanner(System.in);
		
		int width, height;							// 사용자가 입력할 값
		System.out.print("가로 길이를 입력하세요. -> ");
		width = sc.nextInt();
		System.out.print("세로 길이를 입력하세요. -> ");
		height = sc.nextInt();
		
		int size = width * height;
		
		System.out.println("[[사각형 도형의 넓이 구하기]]");
		System.out.println("가로 : " + width + " cm");
		System.out.println("세로 : " + height + " cm");
		System.out.println("넓이를 구했습니다. -> " + size + " ㎠");
		System.out.println();
		
		double r;									// 사용자가 입력할 값
		System.out.print("반지름을 입력하세요. -> ");
		r = sc.nextDouble();
		
//		double p = 3.14;
		final double PI = 3.14;			// 원주율
		double s = 2 * r * PI;			// 둘레
		double volume = r * r * PI;		// 넓이
		
		System.out.println("[[원 도형의 넓이와 둘레 구하기]]");
		System.out.printf("%6s%.3f%3s\n", "반지름 : ", r, " cm");
		System.out.printf("%13s%.3f%2s\n", "둘레를 구했습니다. -> ", s, " ㎝");
		System.out.printf("%13s%.3f%2s\n", "넓이를 구했습니다. -> ", volume, " ㎠");
		
		sc.close();			// 키보드(표준입력장치) 자원 사용 해제!
		
		System.out.println();
//		 final 테스트
//				변수선언 앞에 final 키워드를 붙이면  값을 변경할 수 없다.
		
		final int TEST = 123;		// 값을 변경할 수 없는 상수 (주로 대문자로 씀)
		System.out.println("TEST = " + TEST);	
//		TEST = 456;		// 오류 : final로 선언됨.
	}

}
