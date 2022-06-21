package koreait.day16;

import java.util.Scanner;

public class C69_MyExceptionTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요. >>> ");
		try {
			int age = Integer.parseInt(sc.nextLine());
			if (age < 0 || age > 100) {
				throw new AgeException("나이의 범위는 0 ~ 100 입니다.");	// 메세지를 바꾸고, 클래스에서 추가적인 동작이 있을 때
//				throw new Exception("나이의 범위는 0 ~ 100 입니다.");  // 메세지만 바꿀 때
			}
			// throw는 지정된 Exception을 발생시킨다.
			
			if (age == 0) {
				throw new NullPointerException();
			}
			System.out.println("당신의 나이는 " + age + "세 맞습니까?");
		} catch (NumberFormatException e) {
			System.out.println("나이 입력은 숫자로만 하세요!!");
		} catch (Exception e) {
			System.out.println("사용자 실행 오류 : " + e.getMessage());
		}

	}
}	// 클래스 끝

// 사용자가 커스텀한 Exception 만들기. Exception 상속
class AgeException extends Exception {

	// Serializable 인터페이스와 관련된 값. => 임의로 값을 주면 됨.
	private static final long serialVersionUID = 1L;
	
	// 사용자가 임의로 메세지를 만들 수 있다.
	public AgeException(String message) {
		super(message);				// Exception의 message 필드를 설정함.
	}
	
}
