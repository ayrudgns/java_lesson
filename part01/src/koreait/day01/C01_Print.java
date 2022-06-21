package koreait.day01;

public class C01_Print {
	// 프로그램 실행을 위한 필수 메소드 : main 메소드
	public static void main(String[] args) {
		
		System.out.println();	// 화면에 출력하는 기능
		System.out.println("하이!! ");	// 문자열 데이터 (큰따옴표만 사용)
		System.out.println(3.14);		// 실수 데이터
		System.out.println(100);		// 정수 데이터
		System.out.println(34 + 567);	// 수식 (덧셈)
		System.out.println(true);		// 논리 데이터 (boolean)
		System.out.println("하이 !!" + " 자바야~");	// 문자열의 + 기능 ==> "연결기능"
		System.out.println("나는 " + 23 + "세 입니다.");	// 문자열 + 정수 ==> "연결기능"
		// 문자열이 하나라도 있으면 +는 연결기능을 한다.
		
		// println은 줄바꿈 O, print는 줄바꿈 X
	}
}

// 단축키
//	1) ctrl + 스페이스바 : 단축키 모음
//	2) ctrl + alt + 위/아래 방향키 : 복사
//	3) ctrl + d : 해당 줄 삭제 (한줄삭제)
//	4) ctrl + / : 해당 줄 주석처리