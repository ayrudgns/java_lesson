package koreait.day15;

import java.util.Scanner;

public class C64_TryCatchEx1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
//			String message = null;
//			int cnt = message.length();
			
			System.out.print("정수 입력 >>> ");
//			int n = sc.nextInt();		// 123을 입력했을 때와 abc 입력했을 때의 결과 비교해보기
			int n = Integer.parseInt(sc.nextLine());
			System.out.println("당신이 입력한 값 : " + n);
			
//		} catch (Exception e) {	// 오류 원인에 따른 Exception 종류를 검사한다.
//		} catch (NullPointerException e) {	// NullPointerException 아니라서 검사 못함~
		} catch (NullPointerException | NumberFormatException e) {	// '|' 기호는 bit 단위로 or 연산 실행
																	// Why? Exception은 비트값으로 설정되어 있기 때문.
			// 발생한 오류 정보를 Exception 객체로 관리하고, 이에 대한 참조변수는 e이다.
			System.out.println("오류 발생 : " + e.getMessage());
			System.out.println("사용자 기능에 문제가 발생했습니다.");
		} finally {
			sc.close();
		}
		
		System.out.println("프로그램 종료");
	}

}
