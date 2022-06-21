package koreait.day15;

import java.util.Scanner;


// Throwable 클래스의 하위 클래스 : Error, Exception
// Error : 개발 중인 프로그램 외부의 문제. 시스템 상의 오류. (HW(하드웨어), OS(운영체제, Operating System), JVM, ...)
// Exception : 개발 중인 프로그램과 관련된 문제. 종류 다양~
public class C62_ExceptionTest {
/*
 * Exception 요약 : 문법 오류가 아닌 실행하면서 발생하는 오류 (발생가능성을 고려해서 프로그래밍해야 한다.)
 * -> 원인에 따라 다른 이름 XXXXException이 발생하고, 이들은 Exception 클래스의 자식 클래스이다.
 * -> Exception이 실행 중에 발생하면 그 이후는?..... 프로그램이 그 시점부터 중단됨. 
 * 따라서, Exception을 예상하고 프로그램이 중단되지 않도록 프로그램 구현을 해야한다.
 */
	public static void main(String[] args) {
		
//		int a = 4.1;	// 문법오류
		
// Exception 예시 1 : java.lang.NullPointerException (객체 참조가 null이면 메소드를 실행할 수 없다.)
//		String message = null;
//		char temp = message.charAt(0);		// message 문자열에서 첫번째 글자(0번 인덱스) 1개 가져오기.
		
		
// Exception 예시 2 : java.lang.ArrayIndexOutOfBoundsException (인덱스 범위 조심!!)
//		int[] nums = new int[5];		// 배열 선언 : 요소 5개
//		nums[5] = 100;
		
// Exception 예시 3 : java.util.InputMismatchException (시키는 대로 입력해 임마)
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력 >>> ");
//		int a = sc.nextInt();			// 키보드 입력을 정수로 변환해서 변수에 저장 
//		System.out.println("당신이 입력한 값 : " + a);
		
// Exception 예시 4 : java.lang.NumberFormatException (숫자 외에 다른 문자를 입력하면 Exception 발생)
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력 >>> ");
//		int n = Integer.parseInt(sc.nextLine());
//		System.out.println("당신이 입력한 값 : " + n);

		
	}

}


