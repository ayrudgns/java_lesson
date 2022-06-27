package koreait.etc;

import java.util.Scanner;

public class BinaryTest2 {
	public static void main(String[] args) {
		
		int n10 = 123;		// 10진수 표기
		int n16 = 0xa41c;	// 16진수 표기, 0x로 시작한다.
		int n2 = 0b1010010000011100;	// 2진수 표기, 0b로 시작한다.
		
		System.out.println("1. 변수를 그대로 출력하기");
		System.out.println("10진수 리터럴 123 : " + n10);	// 정수값 출력은 format의 지정이 없는 경우
		System.out.println("16진수 리터럴 0xa41c : " + n16);	// 10진수로 출력된다.
		System.out.println("2진수 리터럴 0b1010010000011100 : " + n2);
		System.out.println();
		
		System.out.println("2. format 지정하여 16진수 출력하기");
		System.out.println(String.format("16진수 리터럴 0xa41c : %x", n16));	// 16진수 형식 %x
		System.out.println(String.format("2진수 리터럴 0b1010010000011100 : %x", n2));
		System.out.println(String.format("10진수 리터럴 42012 : %x", 42012));
		// 결론 : 10진수 42012, n16과 n2 변수값이 메모리에 저장될 때는 모두 동일한 0, 1 표현값이다.
		System.out.println();
		
		System.out.println("3. -1의 2진수, 16진수 표현 확인하기");
		System.out.printf("-1은 16진수 : %x\n", -1);
		System.out.println("-1은 2진수 : " + Integer.toBinaryString(-1));
		System.out.println();
		
		System.out.println("4. 입력한 2진수 또는 16진수 값을 10진수 값으로 바꾸기");
		Scanner sc = new Scanner(System.in);
		System.out.print("2진수 값 입력 >>> ");
		String t2 = sc.nextLine();
		System.out.print("16진수 값 입력 >>> ");
		String t16 = sc.nextLine();
		
		// 지금까지는 주로 Integer.parseInt(s)로 표현했고, 의미는 s 문자열이 10진수 표현이라는 의미이다.
		System.out.println(String.format("2진수 %s는 10진수 %d입니다.", 
				t2, Integer.parseInt(t2, 2)));			// t2는 2진수이다. (알려줌) => 메소드 결과는 정수값
		System.out.println(String.format("16진수 %s는 10진수 %d입니다.", 
				t16, Integer.parseInt(t16, 16)));		// t16은 16진수이다. (알려줌) => 메소드 결과는 정수값
				// 음수는 (-)기호를 써서 절댓값을 넘지 않는 범위 내에서 문자열을 입력해야 한다.
				// 최대 음수 입력값은 -7fffffff
	
	}

}
/*
 *  <<요약>>
 *  n은 2(Binary), 8(Octal), 16(Hex)가 가능하다.
 *  n진법 문자열 -> 10진법 정수값 변환 : Integer.parseInt(문자열, n)
 *  10진법 정수값 -> n진법 문자열 : Integer.toBinaryString 메소드, toOctalString 메소드, toHexString 메소드
 *  
 *  format에서 %d는 10진수, %x는 16진수, %o는 8진수, 2진수는 포맷 형식이 없다.
 *  
 *  2진수의 비트 연산 : &, |, ^, ~, >>, << 등등... 간단한 test
 *  
 */
