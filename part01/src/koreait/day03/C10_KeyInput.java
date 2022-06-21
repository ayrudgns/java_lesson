package koreait.day03;

import java.util.Scanner;

public class C10_KeyInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			// 키보드 입력을 위한 변수 선언 : 표준 입력으로 Scanner 객체를 만들고 변수 sc가 참조한다.
			// sc는 변수명. 기본형 변수가 아닌 클래스 타입의 변수이다. (참조형 변수)
			// new 연산으로 만드는 객체의 클래스 이름과 같은 이름으로 변수를 선언한다.
			
		int data;
		
		System.out.print("정수값을 입력하세요. -> ");		// 입력안내 메시지
		data = sc.nextInt();	// 사용자로부터 키보드로 값을 입력받고, 그 값을 정수로 변환하여 data 변수에 저장.
								// 사용자가 숫자만 입력하지 않았을 때에는 정수로 변환하지 못하고 오류 발생.
		System.out.println("입력된 값은 " + data + " 입니다.");
		System.out.println();
		
		double point;
		System.out.print("실수값을 입력하세요. -> ");
		
		point = sc.nextDouble();
		System.out.println("입력된 값은 " + point + " 입니다.");
		
	}

}

/*
 * 	표준 출력 : System.out		(out은 System 클래스의 정적인 필드, 메소드로 println()을 가진다.)
 *  표준 입력 : System.in     	-> in은 System 클래스의 동적인 필드
 *  						-> Scanner 클래스를 이용해서 입력값을 특정 기본형식으로 변환시켜주는 기능 사용.
 * 						 	-> 기본 패키지의 클래스가  아니므로 import 가 필요하다.	
 * 						* 참고 : 기본 패키지 java.lang은 import 없이 사용한다.
 * 
 * 	import 단축키는 ctrl + shift + o ==> 한꺼번에 import 할 수 있음.	
 * 
 */
