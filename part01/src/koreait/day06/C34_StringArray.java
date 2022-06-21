package koreait.day06;

import java.util.Scanner;

public class C34_StringArray {
	public static void main(String[] args) {
		String message = "hi java!";		// message는 참조형 변수
		
		String[] engKey = {"continue", "break", "public", "static", "dynamic"};
		
		// int, double, char 배열에서는 요소를 나타내는 nums[2], carr1[2], point[2]
		//											ㄴ 얘네들은 기본형 데이터 타입이다.
		// engKey 뿐만 아니라 engKey[2]도 String 참조형 타입
		
		for(int i = 0; i < engKey.length; i++) {
			System.out.println(engKey[i]);		// engKey[i]는 String 참조형
		}
		System.out.println();
		
		String[] koreans = new String[5];		// 배열 요소의 값이 기본형 데이터 저장이 아닌 참조값이다.
		for(int i = 0; i < koreans.length; i++) {
			System.out.println(koreans[i]);		// 기본 초기값은 null ==> 아무것도 참조하지 않은 상태
		}
		System.out.println();
		
		System.out.println("1. engKey 배열 요소값이 참조하는 문자열의 길이");
		for(int i = 0; i < engKey.length; i++) {
			System.out.println(engKey[i] + ":" + engKey[i].length());		// engKey[i]는 String 참조형
		}
		
		koreans[0] = "계속하다";
		koreans[1] = "멈추다";
		koreans[2] = "공용의";
		
		System.out.println();
		System.out.println("2. koreans 배열 요소값이 참조하는 문자열의 길이");
		for(int i = 0; i < koreans.length; i++) {
			if(koreans[i] != null) {	// *** 참조할 요소가 없으면 출력 안한다. ***
				System.out.println(koreans[i] + ":" + koreans[i].length());
			}
		// 참조하고 있는 객체가 없을 때 메소드나 필드를 참조하면 오류 발생 : koreans[3], koreans[4]는 null 참조
		}
		
//		String temp = null;
//		System.out.println(temp.length());		// 오류 : 참조할 것 없음.
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.print("static 뜻? >>> ");
		koreans[3] = sc.nextLine();
		System.out.print("dynamic 뜻? >>> ");
		koreans[4] = sc.nextLine();
		System.out.println();
		System.out.println("3. 모두 입력된 koreans 배열 확인");
		for(int i = 0; i < koreans.length; i++) {
				System.out.println(koreans[i]);
		}
		System.out.println();
		System.out.println("4. 문자열 배열에서 비교하기");
		// 사용자가 입력한 영어 단어가 engKey 배열 인덱스 몇번인지?
		System.out.print("찾을 단어는? >>> ");
		String find = sc.nextLine();
/*		
		int index = -1;
		
		for(int i = 0; i < engKey.length; i++) {	// 순차적으로 참조하는 문자열 비교
			if(find.equals(engKey[i])) {		// 일치하는 단어를 찾으면 for문 종료.
				index = i;
				break;
			}
		}
		System.out.println("찾은 단어 위치 : " + index);
		if(index == -1) {
			System.out.println("찾는 단어가 engKey에 없습니다.");
		} else {
			System.out.println("한글 뜻 : " + koreans[index]);
		}
*/
		
		int i;					// 인덱스를 사용하지 않고 해결하기
		for(i = 0; i < engKey.length; i++) {
			if(find.equals(engKey[i])) {
				break;		// i = 0 ~ engKey.length - 1
			}
		}
		// break로 for를 중단하지 않고 for를 모두 실행했을 때, 같은 문자열이 배열 engKey에 없다.
		
		System.out.println("찾은 단어 위치 : " + i);
		if(i == engKey.length) {
			System.out.println("찾는 단어가 engKey에 없습니다.");
		} else {
			System.out.println("한글 뜻 : " + koreans[i]);
		}
	}

}
