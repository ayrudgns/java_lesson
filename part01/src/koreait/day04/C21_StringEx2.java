package koreait.day04;

import java.util.Scanner;

public class C21_StringEx2 {
// 작성자 : 이경훈 ==>> 답안을 받고서 수정해보기.
	public static void main(String[] args) {
		/*  
		 * 구글 이메일 계정을 체크하는 기능 구현 
		 *  1. @ 기호가 1개 포함되어야 합니다.	(메시지 : 이메일 형식이 아닙니다.)
		 *  		ㄴ indexof 가 -1이 아니고 indexof 와 lastIndexof 가 같은 값인가?
		 *  
		 *  2. 1번이 참일 때 @ 뒤에는 gmail.com 이어야 합니다. (메시지 : 도메인 이름이 틀립니다.)
		 *  		ㄴ '@' 의 indexof 를 구해서 그 뒤부터 끝까지 substring 추출한 문자열을 equals 비교
		 *  
		 *  3. 2번이 참일 때 @ 앞까지의 문자열(계정이름)만 추출합니다.
		 *  		ㄴ '@' 의 indexof 를 구해서 처음 부터 '@' 이전 까지의 문자열 substring 저장
		 *  
		 *  4. 3번의 계정이름은 6글자 이상이어야 합니다.
		 *  		ㄴ 3번의 문자열이 length() 값 6인지 비교
		 *  
		 *  5. 3번의 계정이름에는 특수기호 $,%가 포함되면 안됩니다. 
		 *   		ㄴ indexof('$') , indexof('%') 가 모두 -1이 아니면 허용안하는 기호 포함
		 */

		
		Scanner sc = new Scanner(System.in);
		String email;
		boolean isValid = true;
		
		System.out.print("사용할 이메일을 입력하세요. >>> ");
		email = sc.nextLine();			// 키보드 입력을 문자열로 처리한다.
		
		int sub = email.indexOf('@');
		String domain = email.substring(sub + 1, email.length());
		// 입력받은 email이 처리조건 1, 2, 4, 5에 해당하지 않으면 메시지 출력하고 isValid 변수를 false로 한다.	-> isValid 출력
		
		if (sub == email.lastIndexOf('@') && sub != -1)  {
			String id = email.substring(0, sub);
			System.out.println(id);
			if (domain.equals("gmail.com")) {
				if(id.length() >= 6) {
					if (!(id.indexOf('$') == -1 && id.indexOf('%') == -1)) {
						System.out.println("$, %는 사용할 수 없는 기호입니다.");
						isValid = false;
					}
				} else {
					System.out.println("계정 이름은 6글자 이상이어야 합니다.");
					isValid = false;
				}
			} else {
				System.out.println("도메인 형식이 틀립니다.");
				isValid = false;
			}
		} else {
			System.out.println("올바른 이메일 형식이 아닙니다.");
			isValid = false;
		}
		
		System.out.println("이메일 검증 결과 : " + isValid);
		sc.close();
	}

}
