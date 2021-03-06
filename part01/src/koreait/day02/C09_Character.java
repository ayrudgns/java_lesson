package koreait.day02;

public class C09_Character {
	public static void main(String[] args) {
	
		char c1 = 'a';
		char c2 = 97;		// 문자 코드값은 정수값.
		// a는 97, A는 65, 대/소문자 32 차이
		System.out.println("c1 = " + c1);		// a
		System.out.println("c2 = " + c2);		// a
		System.out.println();
		
		// 문자코드의 정수값을 출력하려면? -> int로 casting, printf()로 출력
//		System.out.printf("c1= %d\n", c1);	// 오류 : char 형은 %d가 아니다.
		System.out.printf("c1 = %d\n", (int)c1);		//97
		System.out.printf("c2 = %d\n", (int)c2);		//97
		System.out.println();
		
		c1 = (char)(c1 + 1);	// 덧셈 연산 가능, 연산 결과를 대입할 때는 casting 필요함.
		System.out.println("c1 = " + c1);
		
		c1++;		// ++연산은 c1 = c1 + 1, char형에서는 casting이 필요하지 않다. (int 리터럴을 사용한 계산이 아니기 때문)
		System.out.println("c1 = " + c1);
		System.out.println();
		
		// 한글 문자 테스트 : 한글 문자 코드는 10진수값으로 44032 ~ 55203, 16진수(2진수) ac00 ~ d7a3
		char h1 = '가';
		char h2 = 44032;		//
		char h3 = '\uac00';		// \\u는 16진수 유니코드, ac00은 16진수 값
		System.out.println("h1 = " + h1);	
		System.out.println("h2 = " + h2);
		System.out.println("h3 = " + h3);
		
		System.out.printf("h1 = %d\n", (int)h1);	
		System.out.printf("h2 = %d\n", (int)h2);
		System.out.printf("h3 = %d\n", (int)h3);
		
		h1++;
		System.out.println("h1 = " + h1);
		h1++;
		System.out.println("h1 = " + h1);
		System.out.println();
		
		// 한글의 마지막 문자
		char h4 = 55203;		// 10진수 표현 방식
		char h5 = '\ud7a3';		// 16진수 표현 방식
		System.out.println("h4 = " + h4);		// 힣
		System.out.println("h5 = " + h5);		// 힣
		
		h4++;
		System.out.println("h4 = " + h4);	// 해당되는 모양의 문자가 없음==> ? 표시
		h5--;
		System.out.println("h5 = " + h5);	// 힢
		System.out.println();
		System.out.println('H' + 'e' + 'l' + 'l' + 'o' );	// 각 문자코드의 값을 더한 결과
		// Hello를 출력하려면 char의 배열로 처리해야 함.

	}
	
	// char이 모여서 한줄로 나란히 나열되면 ==> 문자열
	// "Hello"는 'H', 'e', 'l', 'l', 'o' 각각의 문자들이 모인 것이다.
	// 문자열은 기본형이 아니고, 문자는 기본형

}
/*	
 * 	데이터 기본형식 : 문자형 char
 * 		문자 데이터를 저장하는 2byte 형식. 정수값 0 ~ 65535 범위 저장도 가능하다.
 * 		컴퓨터에서 다루는 문자는 문자코드로 처리되는데, 코드는 정수값이다.
 *		문자데이터는 ' ' 기호를 사용한다. (' '안에는 문자  1개만 써야함)
 *		
 *		영문자, 숫자, 특수문자는 ASCII(아스키) 코드로 표현된다.
 *		영문자, 숫자, 특수문자 외의 다국어문자는 문자를 처리하는 인코딩 방식에 따라 문자코드값이 다르다.
 *		국제화 인코딩으로, UTF-8 방식을 주로 사용한다.
 *
 *		간 : ㄱ ㅏ ㄴ 
 *		초성, 중성, 종성 각각의 코드값으로 조합하는 조합형
 *		한글에서 나올 수 있는 모든 초성, 중성, 종성의 모든 표현을 만들어서 각각 코드값을 부여하는 완성형.
 */
