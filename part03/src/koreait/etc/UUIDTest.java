package koreait.etc;

import java.util.UUID;

public class UUIDTest {
// 참고 : https://ko.wikipedia.org/wiki/%EB%B2%94%EC%9A%A9_%EA%B3%A0%EC%9C%A0_%EC%8B%9D%EB%B3%84%EC%9E%90
// 참고 : http://daplus.net/java-java%EC%97%90%EC%84%9C-uuid-%EB%AC%B8%EC%9E%90%EC%97%B4%EC%9D%84-%EC%83%9D%EC%84%B1%ED%95%98%EB%8A%94-%ED%9A%A8%EC%9C%A8%EC%A0%81%EC%9D%B8-%EB%B0%A9%EB%B2%95-%EB%8C%80%EC%8B%9C%EC%97%86/
	public static void main(String[] args) {
		String uuid;
		
		System.out.println("1. UUID 10개 만들기");
		for(int i = 0; i < 10; i++) {
		// 16진수 32자리 + 하이픈 기호 4개로 만들어지는 랜덤 문자열
			uuid = UUID.randomUUID().toString();
			System.out.println((i + 1) + "번째 uuid = " + uuid);
		}
		System.out.println();
		
		System.out.println("2. UUID 하이픈 빼고 10개 만들기");
		for(int i = 0; i < 10; i++) {
			uuid = UUID.randomUUID().toString();
			System.out.println((i + 1) + "번째 uuid = " + uuid.replace("-", ""));
		}
		System.out.println();
		
		System.out.println("3. UUID 12자리까지만 10개 만들기");
		for(int i = 0; i < 10; i++) {
			uuid = UUID.randomUUID().toString();
			System.out.println((i + 1) + "번쨰 uuid = " + uuid.replace("-", "").substring(0, 12));
		}
		System.out.println();

		/*
		 *  내일은?
		 *  내일은 외부 Library 사용
		 *  
		 *  git 토큰값 : 토큰 인증
		 *  웹사이트에서 회원가입 시 비밀번호를 설정한다. (password 인증)
		 *  설정한 비밀번호는 서버에서 어떻게 관리될까?
		 *  ==> 해싱 함수(Hash function, 복호화가 안되는 함수)를 이용해서 문자열에 대한 식별값을 만들고 저장한다.
		 *  ==> 비밀번호 1234에 대한 해싱함수 값 저장. 로그인 1234
		 *  ==> 대표적인 해시 함수 : sha256 알고리즘
		 *  (서버에서 직접 구현 : MessageDigest 클래스 사용)
		 *  
		 *  암호화 : 평문 ~> 암호문, 복호화 : 암호문 ~> 평문 (공개 key와 개인 key를 이용)
		 * 
		 */
		
	}
}
