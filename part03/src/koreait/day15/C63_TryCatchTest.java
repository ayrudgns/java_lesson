package koreait.day15;

import java.util.InputMismatchException;

public class C63_TryCatchTest {
	public static void main(String[] args) {
		// try 형식
		try {
			// Exception 가능성이 있는 명령을 작성 ==> 오류가 생기면 catch문으로 간다.
			// 해당 위치에서 변수를 선언하면 try { }의 지역변수가 된다.
			
		} catch (NullPointerException e) {		// 오류 원인에 따른 Exception 종류를 검사한다.
			// NullPointerException일 때만 아래 명령을 처리한다.
			e.printStackTrace();		// 오류를 발생시키는 원인을 출력. (오류를 추적하기 위함.)
										// 즉, 기존 Exception 출력 내용이다.
			
		} catch (InputMismatchException e) {	// catch문은 여러번 쓸 수 있다.
			// InputMismatchException일 때만 아래 명령을 처리한다.
			
		} finally {		// 마지막으로, 최종적으로 : 오류 발생과 상관없이 실행되는 부분
			// 주로 자원을 해제하는 코드를 작성한다. 
			// ex) 스캐너를 가져왔다면 finally에서 해제(sc.close();)
		}
		
		// try 블럭의 명령 또는 catch 블럭의 명령이 끝나면 실행이 계속된다.
	}

}
