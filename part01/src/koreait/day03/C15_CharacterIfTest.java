package koreait.day03;

import java.util.Scanner;

public class C15_CharacterIfTest {
	public static void main(String[] args) {  
		//문자를 분류한다.(ASCII코드 대문자,소문자,숫자,특수기호)

		int ch1;
		Scanner sc = new Scanner(System.in);
		System.out.print("알고싶은 아스키코드 정수값 입력하세요.(32부터 126) -> ");
		
		ch1 = sc.nextInt();
		char ch2 = (char)ch1;		// 입력받은 정수값을 char 로 변환.
		
		// 요구사항 : 정수값에 해당하는 문자와 문자 분류 결과 출력하기.	*** char 타입 데이터는 산술, 관계연산이 가능하다. ***
		if(ch2 >= 'A' && ch2 <= 'Z')  //'A' ~ 'Z' 범위 검사
			System.out.println("분류 : 대문자 , 입력한 아스키코드값 문자 : " + ch2);
		else if(ch2 >= 'a' && ch2 <= 'z')   // 'a' ~ 'z' 범위 검사
			System.out.println("분류 : 소문자 , 입력한 아스키코드값 문자 : " + ch2);
		// 분류 : 숫자 범위를 체크해보세요. 코드값 48 ~ 57
		else if(ch2 >= 48 && ch2 <= 57)
					// 연속적인 범위에 있으므로, else if(ch2 >= '0' && ch2 <= '9')로 처리해도 된다. ==> 이게 더 간단함.
			System.out.println("분류 : 숫자, 입력한 아스키코드값 문자 : " + ch2);	
		// 분류 : 특수기호 , 범위를 체크해보세요. (문자 또는 코드값) 코드값 32 ~ 47, 58 ~ 64, 91 ~ 96, 123 ~ 126
		else if(ch2 >= 32 && ch2 <= 47 || ch2 >= 58 && ch2 <= 64 || ch2 >= 91 && ch2 <= 96 || ch2 >= 123 && ch2 <= 126)
			System.out.println("분류 : 기호 , 입력한 아스키코드값 문자 : " + ch2);
		else // 32 ~ 126 이외의 값에 대해 출력한다.
			System.out.println("분류 : 없음, 알 수 없는 문자 :" + ch2);
		
		sc.close();
	}

}
